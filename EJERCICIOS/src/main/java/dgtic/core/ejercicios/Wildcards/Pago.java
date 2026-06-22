package dgtic.core.ejercicios.Wildcards;

import java.util.List;

abstract class Pago {
    public void procesar(){
        System.out.println("Procesando pago generico");
    }





    public static void copiar(List<? extends Pago> origen,
        List<? super Pago> destino){
        for(Pago tipo : origen){
            destino.add(tipo);
        }
    }

}
