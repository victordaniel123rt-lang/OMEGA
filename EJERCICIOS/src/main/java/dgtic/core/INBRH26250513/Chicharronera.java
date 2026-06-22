package dgtic.core.INBRH26250513;

import java.util.Scanner;

public class Chicharronera {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

   if(a<20000 && a>-20000 && b<20000 && b>-20000 && c<20000 && c>-20000){
       double  sol1=0, sol2=0;
       int d = (b*b)-4*(a*c);
       if(d>=0 && a!=0){
           double raiz= Math.sqrt(d);
           sol1= (-b + raiz) /(2*a);
           sol2= (-b - raiz) /(2*a);

           int x1 = (int)Math.round(sol1);
           int x2 = (int)Math.round(sol2);

           int mayor = Math.max(x1,x2);
           int menor = Math.min(x1,x2);
           System.out.println((int)mayor + " " + menor);
        }
      }
    }
}
