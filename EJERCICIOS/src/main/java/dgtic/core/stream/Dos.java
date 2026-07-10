package dgtic.core.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//En este ejercicio el objetivo es contar cuantas veces se repite una palabra en la lista.
public class Dos {
    public static void main(String[] args){
        List<String> palabras = Arrays.asList("java", "python", "java", "c", "python", "java");
        Map<String,Long> numeros = palabras.stream().collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
        ));
        System.out.print(numeros);
    }
}
