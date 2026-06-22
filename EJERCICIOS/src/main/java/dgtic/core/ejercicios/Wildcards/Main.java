package dgtic.core.ejercicios.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<PagoTarjeta> tarjetas = new ArrayList<>();
        List<Pago> nueva = new ArrayList<>();
//        agregarPagos(nueva);        // ✔
//        procesarPagos(tarjetas);    // ✔
//        copiar(tarjetas, nueva);
//        System.out.println();
//        procesarPagos(nueva);


        List<Pago> pagos = List.of(
                new PagoTarjeta(),
                new PagoEfectivo(),
                new PagoTarjeta()
        );

        long count = pagos.stream()
                .filter(p -> p instanceof PagoTarjeta)
                .count();
        System.out.println(count);

        String resultado = pagos.stream()
                .filter(p -> p instanceof PagoTarjeta)
                .map(p -> p.getClass().getSimpleName())
                .toList()
                .toString();

        System.out.println(resultado);


    }


    public static void procesarPagos(List<? extends Pago> lista){
        for(Pago p : lista){
            p.procesar();
        }
    }

    public static void agregarPagos(List<? super Pago > lista){
        lista.add(new PagoTarjeta());
        lista.add(new PagoEfectivo());
    }

    public static void copiar(List<? extends Pago> origen,
                              List<? super Pago> destino){
        for(Pago tipo : origen){
            destino.add(tipo);
        }
    }




}
