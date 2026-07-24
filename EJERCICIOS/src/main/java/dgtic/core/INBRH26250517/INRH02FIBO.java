package dgtic.core.INBRH26250517;

import java.util.Scanner;

public class INRH02FIBO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0, b=1, c;
        System.out.print(b+ " ");
        for(int i =1; i<n; i++){
            c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;

        }
    }
}
