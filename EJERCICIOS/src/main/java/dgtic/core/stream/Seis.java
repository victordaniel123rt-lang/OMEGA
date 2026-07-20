package dgtic.core.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filtrar los strings que empiecen con una vocal y devolverlos en mayúsculas
public class Seis {
    public static void main(String[] args){
        List<String> palabras = Arrays.asList("elefante", "tigre", "iguana", "oso", "mono");
        List<String> vocales = palabras.stream().map(String::toUpperCase).filter(p -> p!=null && !p.isEmpty() && p.matches("^[aeiouAEIOUáéíóúÁÉÍÓÚ].*")).collect(Collectors.toList());
        System.out.print(vocales);
    }
}
