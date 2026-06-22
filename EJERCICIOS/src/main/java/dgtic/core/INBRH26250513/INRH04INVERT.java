package dgtic.core.INBRH26250513;

import java.util.Scanner;

public class INRH04INVERT {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        int n = palabra.length();
        char[] p =palabra.toCharArray();
        char[] nuevo = new char[p.length];
        for(int i =0; i<p.length; i++){
           nuevo[i]=p[n-1];
           n--;
        }
        String reves = new String(nuevo);
        System.out.println(reves);
    }
}
