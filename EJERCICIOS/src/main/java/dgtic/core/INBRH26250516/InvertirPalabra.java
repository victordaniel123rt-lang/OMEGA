package dgtic.core.INBRH26250516;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InvertirPalabra {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String palabra = br.readLine();
        char[] pal = palabra.toCharArray();
        int n = pal.length;
        char[] otro = new char[n];
        for(int i =0; i<pal.length; i++){
            otro[n-1] = pal[i];
            n--;
        }
        String nuevo = new String(otro);
        System.out.print(nuevo);

    }
}
