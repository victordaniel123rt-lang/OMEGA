package dgtic.core.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Obtener los strings más largos de una lista (longitud máxima)
public class Nueve {
    public static void main(String[] args){
        List<String> palabras = Arrays.asList("sol", "luna", "estrella", "mar");
        String mayor = palabras.stream().sorted(Comparator.comparingInt(String::length)).sorted().findFirst().get();
        System.out.println(mayor);
    }
}
