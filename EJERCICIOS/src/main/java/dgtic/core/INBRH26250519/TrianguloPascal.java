package dgtic.core.INBRH26250519;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        List<Long> sumas = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            long sumaTotal = 0;
            for (int j = m; j <= n; j++) {
                sumaTotal += (1L << j);
            }

            sumas.add(sumaTotal);
        }
        sc.close();
        for(long h : sumas){
            System.out.println(h);
        }
    }
}
