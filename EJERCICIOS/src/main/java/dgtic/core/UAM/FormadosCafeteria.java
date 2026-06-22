package dgtic.core.UAM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.*;

public class FormadosCafeteria {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Queue<String> alumnos = new LinkedList<>();
        Queue<String> trabajadores = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            String evento = br.readLine();

            if (evento.equals("ATIENDE")) {

                if (!trabajadores.isEmpty()) {
                    System.out.println(trabajadores.poll());
                } else {
                    System.out.println(alumnos.poll());
                }

            } else if (evento.startsWith("LLEGA ALUMNO")) {

                String nombre = evento.substring(13);
                alumnos.offer(nombre);

            } else if (evento.startsWith("LLEGA TRABAJADOR")) {

                String nombre = evento.substring(17);
                trabajadores.offer(nombre);
            }
        }

        br.close();
    }
}