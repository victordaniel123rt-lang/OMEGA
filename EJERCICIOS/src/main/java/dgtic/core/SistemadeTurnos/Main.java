package dgtic.core.SistemadeTurnos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Cliente>> clientes = new HashMap<>();
        System.out.println("Número de clientes a ingresar: ");
        int n = sc.nextInt();
        sc.nextLine();
        int k = 1;
        List<String> odenados = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String nombre = sc.nextLine();
            String horaTexto = sc.nextLine();
            LocalTime hora = LocalTime.parse(horaTexto);
            String prioridad = sc.nextLine().toLowerCase();
            Cliente cliente = new Cliente(hora, nombre, prioridad);
            if (clientes.containsKey(prioridad)) {
                clientes.get(prioridad).add(cliente);
            } else {
                List<Cliente> lista = new ArrayList<>();
                lista.add(cliente);
                clientes.put(prioridad, lista);
            }
        }
        List<Cliente> alta = clientes.get("alta");
        List<Cliente> media = clientes.get("media");
        List<Cliente> baja = clientes.get("baja");
        ordenarClientes(alta, odenados);
        ordenarClientes(media, odenados);
        ordenarClientes(baja, odenados);


        for (String orden : odenados) {
            System.out.println(k + ". " + orden);
            k++;
        }

    }

    public static void ordenarClientes(List<Cliente> lista, List<String> ordenados) {
        String minimo = "";
        if (lista != null) {
            while (!lista.isEmpty()) {
                Cliente primero = lista.get(0);
                minimo = primero.getNombre();
                for (Cliente c : lista) {
                    LocalTime t1 = primero.getHora();
                    LocalTime t2 = c.getHora();
                    if (t2.isBefore(t1)) {
                        primero = c;
                        minimo = c.getNombre();
                    } else if (t2.equals(t1)) {
                        if (c.getNombre().compareTo(primero.getNombre()) < 0) {
                            primero = c;
                            minimo = c.getNombre();
                        }
                    }
                }
                ordenados.add(minimo);
                lista.remove(primero);
            }
        }
    }
}