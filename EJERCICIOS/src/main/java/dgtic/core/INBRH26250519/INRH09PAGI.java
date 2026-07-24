package dgtic.core.INBRH26250519;

import java.util.Scanner;
import java.util.StringJoiner;

public class INRH09PAGI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        int tamano = sc.nextInt();
        int pagina = sc.nextInt();

        if (n <= 0 || tamano <= 0 || pagina <= 0) {
            System.out.println("INVALIDA");
            return;
        }
        long inicio = (long) (pagina - 1) * tamano;

        if (inicio >= n) {
            System.out.println("INVALIDA");
            return;
        }
        long fin = Math.min(inicio + tamano, n);

        StringJoiner sj = new StringJoiner(",");
        for (long i = inicio + 1; i <= fin; i++) {
            sj.add(String.valueOf(i));
        }

        System.out.println(sj.toString());
        sc.close();
    }
}