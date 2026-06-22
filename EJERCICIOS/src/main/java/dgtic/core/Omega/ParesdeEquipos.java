package dgtic.core.Omega;

import java.util.Scanner;

public class ParesdeEquipos {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); int d = sc.nextInt();
            int x =a+c; int y=b+d; int z=b+c; int w=a+d; int r=b+a; int s=c+d;
            int t=Math.abs(x-y); int v=Math.abs(z-w); int h=Math.abs(r-s);

           int m =Math.min(t,v);
           int j=Math.min(m,h);
            System.out.println(j);
        }
}
