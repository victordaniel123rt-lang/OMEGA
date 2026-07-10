package dgtic.core.stream;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//En el siguiente ejercicio el objetivo es obtener los 3 números más grandes de una lista
public class Uno {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(10, 45, 2, 89, 33, 76, 1);
        List<Integer> mayores = numeros.stream().sorted().skip(4).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.print(mayores);
    }
}
