package dgtic.core.INBRH26250515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class TABLERO2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();

        if (linea == null || linea.trim().isEmpty()) return;


        String[] partes = linea.trim().toLowerCase().split("\\s+");
        if (partes.length < 2) return;

        char letra = partes[0].charAt(0);
        int numero = Integer.parseInt(partes[1]);

        if (letra >= 'a' && letra <= 'h' && numero >= 1 && numero <= 8) {


            int columna = (letra - 'a') + 1;


            if ((columna + numero) % 2 == 0) {
                System.out.println("NEGRO");
            } else {
                System.out.println("BLANCO");
            }
        }

    }
}