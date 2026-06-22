package dgtic.core.Sumas;

import java.util.Scanner;

import static java.lang.Math.log10;

public class SumaDeDigitos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int suma=0;
        int d = (int) Math.floor(log10(numero)+1);
        int[] digitos = new int[d];
        for(int i=0; i<d; i++){
            int t = numero%10;
            digitos[i] = t;
            numero =numero/10;
        }
        for(int j = 0; j<d; j++){
         suma = suma + digitos[j];
        }
        System.out.println(suma);
    }
}
