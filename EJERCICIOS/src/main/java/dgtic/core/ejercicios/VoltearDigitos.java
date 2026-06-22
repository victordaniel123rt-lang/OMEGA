package dgtic.core.ejercicios;


import java.util.Scanner;

public class VoltearDigitos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = (int)Math.floor(Math.log10(n))+1;
         int[] arreglo = new int[m];
         for(int i =0; i<m; i++){
             arreglo[i]=n%10;
             n=(int)Math.floor(n/10);
         }
         for(int j = 0; j<m; j++){
             System.out.print(arreglo[j]);
         }
    }
}
