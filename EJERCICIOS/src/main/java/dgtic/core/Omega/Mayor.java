package dgtic.core.Omega;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Mayor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] partes = entrada.split(",");
        Integer[] numeros = new Integer[partes.length];
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i].trim());
        }
        Arrays.sort(numeros, Collections.reverseOrder());
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(",");
            }
        }
    }
}
