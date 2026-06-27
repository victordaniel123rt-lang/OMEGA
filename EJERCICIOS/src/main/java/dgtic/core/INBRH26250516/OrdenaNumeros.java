package dgtic.core.INBRH26250516;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenaNumeros {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lista = br.readLine();
        List<Integer> numeros = new ArrayList<>();
        List<Integer> ordenados = new ArrayList<>();
        char[] l = lista.toCharArray();
        int n = l.length;
        for (int i = 0; i < n; i++) {
            String num = String.valueOf(l[i]);
            int m = Integer.parseInt(num);
            numeros.add(m);
            i++;
        }

        if(numeros!=null){
            while (!numeros.isEmpty()) {
                int mayor = numeros.get(0);
                int indiceMayor = 0;
                for (int i = 0; i < numeros.size(); i++) {
                    int otro = numeros.get(i);
                    if (otro > mayor) {mayor=otro; indiceMayor = i;}
                }
                ordenados.add(mayor);
                numeros.remove(indiceMayor);
            }
        }

        String resultado = ordenados.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(resultado);
    }

    }
