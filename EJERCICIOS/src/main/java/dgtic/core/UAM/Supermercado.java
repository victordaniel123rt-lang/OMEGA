package dgtic.core.UAM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Supermercado {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<String> clientes = new LinkedList<>();
        for(int i=0; i<n; i++){
            String evento = br.readLine();

            if(evento.equals("ATIENDE")){
                if(!clientes.isEmpty()){
                    System.out.println(clientes.poll());
                }
            } else if (evento.startsWith("LLEGA")) {
                String nombre = evento.substring(6);
                clientes.offer(nombre);
            }
        }
        br.close();
    }
}
