package dgtic.core.Omega;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String palabra = sc.nextLine();
        palabra = palabra.replaceAll("\\s+", "").toLowerCase();
        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}
