package dgtic.core.ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String palabra=sc.nextLine();
        String nueva=palabra.toLowerCase().replaceAll(" ","");
        String[] arreglo1= new String[nueva.length()];
        String[] arreglo2 = new String[nueva.length()];
        for(int i =0; i<=nueva.length()-1; i++){
            arreglo1[i]= String.valueOf(nueva.charAt(i));
        }
        for(int j=0; j<=nueva.length()-1; j++){
            arreglo2[j]=arreglo1[(nueva.length()-1)-j];
        }
        if(Arrays.equals(arreglo1,arreglo2)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }


    }
}
