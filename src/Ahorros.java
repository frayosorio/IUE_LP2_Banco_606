public class Ahorros extends Cuenta {
    private double tasaInteres = 0.02;

    public Ahorros(String numero, String titular, double saldo) {
        super(numero, titular, saldo);

    }

    @Override
    public boolean retirar(double cantidad) {
        if (getSaldo() >= cantidad) {
            setSaldo(getSaldo() - cantidad);
            return true;
        }
        return false;
    }

    public void aplicarIntereses() {
        setSaldo(getSaldo() * (1 + tasaInteres));
    }

}
