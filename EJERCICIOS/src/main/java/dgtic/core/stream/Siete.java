package dgtic.core.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Separar los números en pares e impares en un Map
public class Siete {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<String,List<Integer>> pares = numeros.stream().collect(Collectors.groupingBy(
                n->(n%2==0)? "Par" : "Impar"
        ));

        System.out.print(pares);


    }
}
