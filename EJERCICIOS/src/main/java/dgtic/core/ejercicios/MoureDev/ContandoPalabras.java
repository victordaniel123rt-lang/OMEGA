package dgtic.core.ejercicios.MoureDev;

import java.util.*;

public class ContandoPalabras {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas palabras vas a ingresar: ");
        int n = sc.nextInt();
        sc.nextLine();
        String clave ="";
        Map<String, ArrayList<String>> arreglos = new HashMap<>();
        String[] palabras = new String[n];
        for(int i=0; i<n; i++){
            palabras[i] = sc.nextLine();
            clave=palabras[i].toLowerCase();
            if(arreglos.containsKey(clave)){
                arreglos.get(clave).add(palabras[i]);
            }else{
                ArrayList<String> lista = new ArrayList<>();
                lista.add(palabras[i]);
                arreglos.put(clave,lista);
            }

        }
        for(String key : arreglos.keySet()){
            System.out.println("La palabra " + key + " se repite " + arreglos.get(key).size() + " veces");
        }

    }
}
