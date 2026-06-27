package dgtic.core.INBRH26250516;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Ordena2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lista = br.readLine();

        if (lista == null || lista.trim().isEmpty()) {
            System.out.println("");
            return;
        }

        // 1. Convertimos la cadena en un array separando por comas
        String resultado = Arrays.stream(lista.split(","))
                .map(String::trim)                 // Quitamos espacios extra si los hay (ej. " 5 " -> "5")
                .filter(s -> !s.isEmpty())         // Evitamos errores si hay comas consecutivas ",,"
                .map(Integer::parseInt)            // Convertimos cada texto a número entero
                .sorted(Comparator.reverseOrder()) // Ordenamos de MAYOR a MENOR
                .map(String::valueOf)              // Volvemos a convertir a texto para unirlo
                .collect(Collectors.joining(",")); // Los unimos separados por comas

        System.out.println(resultado);
    }
}