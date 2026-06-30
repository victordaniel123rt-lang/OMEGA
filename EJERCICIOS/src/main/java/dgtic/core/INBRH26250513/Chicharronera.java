package dgtic.core.INBRH26250513;

import java.util.Scanner;

public class Chicharronera {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a=  sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

   if(a<20000 && a>-20000 && b<20000 && b>-20000 && c<20000 && c>-20000){
       double  sol1=0, sol2=0;
       double d = (b*b)-4*(a*c);
       if(d>=0 && a!=0){
           double raiz= Math.sqrt(d);
           sol1= (-b + raiz) /(2*a);
           sol2= (-b - raiz) /(2*a);

           int x1 = (int)Math.round(sol1);
           int x2 = (int)Math.round(sol2);

           System.out.print(x1 + " " + x2);
        }
      }
    }
}
