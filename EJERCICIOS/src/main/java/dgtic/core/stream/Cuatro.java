package dgtic.core.stream;

import java.util.Arrays;
import java.util.List;
//En este ejercicio se pretende obtener el segundo número más pequeño de una lista
public class Cuatro {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(8, 3, 10, 1, 6);
        int pequeño = numeros.stream().sorted().skip(1).findFirst().get();
        System.out.println(pequeño);
    }
}
