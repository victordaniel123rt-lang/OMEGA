package dgtic.core.INBRH26250514;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class INRH01ATM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double aguinaldo = 13000;
        double st = 0;

        int t = sc.nextInt();

        if (t > 0) {
            for(int i = 1; i <= t; i++){
                double m = sc.nextDouble();
                st = st + m;
            }

            System.out.println(aguinaldo - st);
        }
    }
}
