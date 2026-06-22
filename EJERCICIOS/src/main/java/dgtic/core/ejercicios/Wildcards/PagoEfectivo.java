package dgtic.core.ejercicios.Wildcards;

public class PagoEfectivo extends Pago{
    @Override
    public void procesar() {
        System.out.println("Pago en efectivo");
    }
}
