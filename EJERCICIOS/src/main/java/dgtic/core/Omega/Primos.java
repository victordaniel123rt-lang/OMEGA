package dgtic.core.Omega;

import java.util.Scanner;

public class Primos {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0 && n<=1000000){
            if(n!=2 && n%2==0 || n%3==0 || n==1  || n%5==0 && n!=5 || n%7==0  && n!=7){
                System.out.println("NO");
            }else{
                System.out.println("SI");
            }
        }

    }
}
