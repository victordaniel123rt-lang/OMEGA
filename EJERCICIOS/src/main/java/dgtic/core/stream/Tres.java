package dgtic.core.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//En este ejercicio se pretende obtener una lista sin duplicados y después ordenarla en orden alfabetico.
public class Tres {
    public static void main(String[] args){
        List<String> nombres = Arrays.asList("Carlos", "Ana", "Pedro", "Ana", "Carlos");
        List<String> ordenados = nombres.stream().sorted().distinct().collect(Collectors.toList());
        System.out.print(ordenados) ;
    }
}
