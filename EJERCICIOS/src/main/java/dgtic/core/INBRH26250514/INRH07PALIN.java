package dgtic.core.INBRH26250514;

import java.util.Arrays;
import java.util.Scanner;

public class INRH07PALIN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine().toLowerCase().replaceAll("\\s","");
        char[] p = palabra.toCharArray();
        int t = p.length;
        char[] n = new char[t];
        for(int i=0; i<p.length; i++){
            n[i]=p[t-1];
            t--;
        }
        String junto = Arrays.toString(p);
        String nuevo = Arrays.toString(n);
        if(junto.equals(nuevo)){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
