package dgtic.core.Omega;

import java.util.Scanner;

public class Sandia {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=1 && a<=100 && a%2==0 && a!=2){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }
    }
}
