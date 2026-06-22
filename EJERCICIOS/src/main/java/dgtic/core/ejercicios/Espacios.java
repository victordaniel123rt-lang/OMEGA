package dgtic.core.ejercicios;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Espacios {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");
        Map<String, ArrayList<Integer>> lugares = new HashMap<>();
        for(int i =0; i<palabras.length; i++){
            String palabra = palabras[i].toLowerCase().replaceAll("[^a-záéíóúñ]", "");;
            if(lugares.containsKey(palabra)){
                lugares.get(palabra).add(i+1);
            }else {
                ArrayList<Integer> uno = new ArrayList<>();
                uno.add(i+1);
                lugares.put(palabra,uno);
            }
        }

        for(String key : lugares.keySet()){
            System.out.println("La palabra " + key + " aparece en las posiciones: " + lugares.get(key));
        }
    }
}
