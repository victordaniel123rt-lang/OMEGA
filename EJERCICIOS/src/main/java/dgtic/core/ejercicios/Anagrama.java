package dgtic.core.ejercicios;

import java.util.*;

public class Anagrama {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número de cadenas que vas a escribir: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arreglo = new String[n];
        String[] arreglo2 = new String[n];
        Map<String, ArrayList<String>> anagramas = new HashMap<>();
        for(int i=0; i<n; i++){
            arreglo[i] = sc.nextLine();
        }
        for(int j =0; j<n; j++){
            char[] cadena = arreglo[j].toCharArray();
            Arrays.sort(cadena);
            String ordenado = new String(cadena);

            if (anagramas.containsKey(ordenado)) {
                anagramas.get(ordenado).add(arreglo[j]);
            } else {
                ArrayList<String> lista = new ArrayList<>();
                lista.add(arreglo[j]);
               anagramas.put(ordenado,lista);
            }
            
        }

        System.out.println(anagramas);
    }

}
