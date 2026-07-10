package dgtic.core.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Agrupar palabras por su primera letra
public class Ocho {
    public static void main(String[] args){
        List<String> palabras = Arrays.asList("perro", "pato", "gato", "gallo", "rana");
        Map<Character,List<String>> resultado = palabras.stream().collect(Collectors.groupingBy(
                p->p.charAt(0)
        ));
        System.out.print(resultado);
    }
}
