package dgtic.core.Omega;

import java.util.Scanner;

public class FIBONACCI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=0, b=1, c;
        int n = sc.nextInt();
        if(n>0 && n<20){
            System.out.print(b + " ");
            for(int i = 1; i<n; i++){
                c=a+b;
                System.out.print(c +" ");
                a=b;
                b=c;
            }
        }

    }
}
