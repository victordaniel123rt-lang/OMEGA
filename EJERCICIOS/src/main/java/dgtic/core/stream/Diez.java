package dgtic.core.stream;

import java.util.Arrays;
import java.util.List;

public class Diez {
    public static void main(String[] args){
        List<String> datos = Arrays.asList("hola", "", null, "adiós", " ");
        List<String> vacios = datos.stream().filter(p->p!=null && !p.equals("")).toList();
        System.out.print(vacios);
    }
}
