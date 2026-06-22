package dgtic.core.ejercicios;

import java.util.Scanner;



public class RespuestasCorrectas {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de respuestas correctas: ");
        int n = sc.nextInt();
        System.out.println("Número de respuestas incorrectas: ");
        int m = sc.nextInt();
        System.out.println("Número de respuestas en blanco: ");
        int r = sc.nextInt();
        int total = (n*4)+(m*(-1));
        System.out.println("El puntaje final es: " + total);


    }


}
