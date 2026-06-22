package dgtic.core.ejercicios.MoureDev;

import java.util.List;

public class ElFamosoFizzBuzz {
    public static void main(String args[]){
        List<Integer> numeros = List.of(1,2,3,4,5);

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
