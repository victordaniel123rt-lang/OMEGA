package dgtic.core.Fila;

import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, List<Cliente>> clientes = new HashMap<>();
        List<Cliente> ordenados = new ArrayList<>();
        int total = 0;
        int k=1;
        System.out.print("Número de clientes a introducir: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Tipo: ");
            String tipo = sc.nextLine().toLowerCase();
            System.out.print("Hora: ");
            String hora = sc.nextLine();
            System.out.print("Tickets: ");
            int tickets = sc.nextInt();
            sc.nextLine();
            Cliente cliente = new Cliente(hora, nombre, tickets, tipo);
            if(clientes.containsKey(tipo)) {
                clientes.get(tipo).add(cliente);
            } else {
                List<Cliente> lista2 = new ArrayList<>();
                lista2.add(cliente);
                clientes.put(tipo, lista2);
            }
        }
        List<Cliente> vip = clientes.get("vip");
if(vip!=null){
    while(!vip.isEmpty()){
        Cliente menor = vip.get(0);
        for(Cliente c : vip){
            LocalTime t1 = LocalTime.parse(menor.getHora());
            LocalTime t2 = LocalTime.parse(c.getHora());
            if(t2.isBefore(t1)) menor =c;
        }
        ordenados.add(menor);
        vip.remove(menor);
    }
}

        List<Cliente> normal = clientes.get("normal");
        if(normal!=null){
            while(!normal.isEmpty()){
                Cliente menor = normal.get(0);
                for(Cliente t : normal){

                    LocalTime t1 = LocalTime.parse(menor.getHora());
                    LocalTime t2 = LocalTime.parse(t.getHora());

                    if(t2.isBefore(t1)) menor =t;
                }

                ordenados.add(menor);
                normal.remove(menor);
            }
        }

        for(Cliente o : ordenados){

            System.out.println(k + ". " + o.getNombre());
            k++;
        }

        for(Cliente l : ordenados){

           total = total+l.tickets;
        }
        double resu = (double) total /10;
        System.out.println("Total tickets: " + total);
        System.out.println("Capacidad = 10 tickets/hora");
        System.out.println("Resultado");
        System.out.println(resu + " horas");

    }

}

