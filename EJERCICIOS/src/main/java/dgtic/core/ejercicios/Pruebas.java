package dgtic.core.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pruebas {
    public static void main(String args[]){
        Map<String, ArrayList<String>> agenda = new HashMap<>();

        // 2. Crear los ArrayLists individuales
        ArrayList<String> telefonosJuan = new ArrayList<>();
        telefonosJuan.add("555-1234");
        telefonosJuan.add("555-5678");

        ArrayList<String> telefonosAna = new ArrayList<>();
        telefonosAna.add("555-9999");

        // 3. Poner los ArrayLists dentro del HashMap [1]
        agenda.put("Juan", telefonosJuan);
        agenda.put("Ana", telefonosAna);

        // 4. Imprimir el mapa
        System.out.println(agenda);


    }
}
