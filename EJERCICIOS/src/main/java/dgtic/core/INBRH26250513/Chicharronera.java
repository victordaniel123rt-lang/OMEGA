package dgtic.core.INBRH26250513;

import java.util.Scanner;
//Esta es la buena  <-----
//Como nota para los siguientes ejercicios los limites en los parametros no se deben de considerar ni siquiera en los condicionales
//No van a aparecer.
public class Chicharronera {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();


        double d = (b * b) - 4 * (a * c);


        double raiz = Math.sqrt(d);


        double sol1 = (-b + raiz) / (2 * a);
        double sol2 = (-b - raiz) / (2 * a);

        System.out.print(sol1 + " " + sol2);
    }
}