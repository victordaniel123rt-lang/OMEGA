package dgtic.core.Omega;

import java.util.Scanner;

public class Xorinacci {


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=0, b=0,c=0, j=0;
        int t=sc.nextInt();
        if(t>=1 && t<=Math.pow(10,5)){
            int[] arrego= new int[t];
            for(int i=0; i<t; i++){
                a=sc.nextInt();
                b=sc.nextInt();
                c= sc.nextInt();
                if(a>=0 && b>=0 && c>=0 && a<=Math.pow(10,9) && b<=Math.pow(10,9) && c<=Math.pow(10,9)){
                    j=xor(c,a,b);
                    arrego[i]=j;
                }
            }
            for(int k=0; k<t; k++){
                System.out.println(arrego[k]);
            }
        }
    }
    public static int xor(int n, int a, int b){
        if(n==0){
            return a;
        }else if(n==1){
            return b;
        }else {
            return xor(n-1,a,b)^xor(n-2,a,b);
        }

    }

}
