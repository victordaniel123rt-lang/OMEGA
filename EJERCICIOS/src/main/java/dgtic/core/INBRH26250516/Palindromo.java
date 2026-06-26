package dgtic.core.INBRH26250516;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String palabra = br.readLine().trim().replaceAll("\\s","").toLowerCase();
        char[] charArray = palabra.toCharArray();
        int l = charArray.length;
        char[] otro = new char[l];
        for(int i=0; i<charArray.length; i++){
            otro[l-1]=charArray[i];
            l--;
        }
        String nuevo = new String(otro);

        if(nuevo.equals(palabra)){
            System.out.println("SI");
        }else{
            System.out.println("No");
        }


    }

}
