package dgtic.core.Omega;

import java.util.Scanner;

public class Inverso {
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     String palabra = sc.nextLine();
     String invertida = "";
     for(int i =palabra.length()-1; i>=0; i--){
         invertida += palabra.charAt(i);

     }
     System.out.println(invertida);
 }
}
