package dgtic.core.INBRH26250513;

import java.util.Scanner;

public class INRH08FACTO {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int factorial =1;
  if(numero<=15){
      for(int i =1; i<=numero; i++){
          factorial = factorial*i;
      }
      System.out.println(factorial);
  }
    }
    }
