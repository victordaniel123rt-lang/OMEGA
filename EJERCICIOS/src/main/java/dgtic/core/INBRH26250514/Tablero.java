package dgtic.core.INBRH26250514;

import java.util.Objects;
import java.util.Scanner;

public class Tablero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String letra = sc.nextLine().replaceAll("\\s","");
        String l = String.valueOf(letra.charAt(0));
        String n = String.valueOf(letra.charAt(1));
        int num = Integer.parseInt(n);
        if (Objects.equals(l, "a") && num % 2 == 0|| Objects.equals(l, "c")
                && num % 2 == 0 || Objects.equals(l, "e") && num % 2 == 0 || Objects.equals(l, "g") && num % 2 == 0) {
            System.out.print("BLANCO");
        } else {
            System.out.print("NEGRO");
        }

    }
}
