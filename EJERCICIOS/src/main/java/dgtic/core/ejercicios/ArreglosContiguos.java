package dgtic.core.ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArreglosContiguos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, int[]> subarreglos = new HashMap<>();
        int target = 7;
        int s=0;
        System.out.println("¿Cantidad de números?");
        int n = sc.nextInt();
        int[] arreglo = new int[n];

        // Captura
        for(int i = 0; i < n; i++){
            arreglo[i] = sc.nextInt();
        }

        // Lógica correcta
        for(int inicio = 0; inicio < n; inicio++){
            int suma = 0;

            for(int fin = inicio; fin < n; fin++){
                suma += arreglo[fin];
                if(suma == target){
                    int tamaño = fin - inicio + 1;
                    int[] subarreglo = new int[tamaño];

                    for(int i = 0; i < tamaño; i++){
                        subarreglo[i] = arreglo[inicio + i];
                    }

                    subarreglos.put(inicio, subarreglo);
                }

                if(suma > target){
                    break;
                }
            }
        }

        for(Map.Entry<Integer, int[]> entry : subarreglos.entrySet()){
            System.out.println(entry.getKey() + "=" + Arrays.toString(entry.getValue()));
        }
    }

}
