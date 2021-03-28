public class CuentaCorriente {

    private double saldo;
    private String numeroCuenta;
    private String alias;

    public CuentaCorriente(double saldo, String numeroCuenta, String alias) {
        this.saldo = saldo;
        this.numeroCuenta= numeroCuenta;
        this.alias=alias;
    }
    public CuentaCorriente(){

    }

    public CuentaCorriente (CuentaCorriente cuentaCorriente){
      this.saldo= cuentaCorriente.getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void ingreso (double ing){
        this.saldo+=ing;
    }

    public void egreso (double ing){
        this.saldo-=ing;
    }

    public void reintegro (double ing){
        this.ingreso(ing);
    }

    public void tranferencia (double monto){
        this.egreso(monto);
    }

}
