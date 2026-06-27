package dgtic.core.INBRH26250515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class INRH02FIBO {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int contador = 1;
        //System.out.println(contador);
        for(int i=0; i<n; i++) {
            contador = contador + i;
            System.out.print(contador+" ");
        }


    }
}
