package dgtic.core.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//En el presente ejercicio se busca concatenar los nombres en una sola cadena separados por una coma
public class Cinco {
    public static void main(String[] args){
        List<String> nombres = Arrays.asList("Ana", "Luis", "Pedro");
        String concatenado = nombres.stream().collect(Collectors.joining(","));
        System.out.print(concatenado);
    }

}
