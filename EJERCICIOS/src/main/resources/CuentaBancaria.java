package dgtic.core;


public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void Depositar(double monto){
        if(monto>0){
            saldo=+monto;
            System.out.println("Retiro exitoso, tu saldo actual es: " + saldo);

        }
        else {
            System.out.println("No puedes ingresar montos negativos");
        }
    }

    public void retirar(double monto){
        double saldoActual=saldo-monto;
        if(saldoActual>0){
            System.out.println("No puedes tener saldo negativo, tu saldo actual es: " + saldo);
        }
        else {
            System.out.println("Retiro exitoso");
        }
    }


    public double getSaldo() {
        return saldo;
    }
}
