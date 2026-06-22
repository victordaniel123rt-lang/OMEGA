package dgtic.core.Omega;

import java.util.Scanner;

public class General {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt(); int b= sc.nextInt(); int c=sc.nextInt();

        if(a>-20000 && a<20000 && b>-20000 && b<20000 && c>-20000 && c<20000){
            double raiz = Math.sqrt(b*b-4*a*c);
            double x1=(-b+raiz)/(2*a);
            double x2=(-b-raiz)/(2*a);
            System.out.print((int)x1 + " " + (int)x2);
        }

    }
}
