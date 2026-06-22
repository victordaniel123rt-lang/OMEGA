package dgtic.core.Omega;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long factor=1;
        for(int i=1; i<=a; i++){
            factor *= i;
        }
        System.out.println(factor);

    }
}
