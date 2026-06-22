package dgtic.core.ejercicios.Wildcards;

public class PagoTarjeta extends Pago{
    @Override
    public void procesar() {
        System.out.println("Pago con tarjeta");
    }

    @Override
    public String toString() {
        return "PagoTarjeta";
    }
}
