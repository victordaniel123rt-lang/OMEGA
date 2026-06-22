package dgtic.core.banco;

import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<String, List<Cliente>> clientes = new HashMap<>();
        List<Cliente> ordenados = new ArrayList<>();
        System.out.println("Cuentos clientes vas a ingresar: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int j=1; j<=n; j++){
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Hora de llegada");
            String hora = sc.nextLine();
            LocalTime horaLLegada = LocalTime.parse(hora);
            System.out.println("Tipo: ");
            String tipo = sc.nextLine().toLowerCase();
            Cliente cliente = new Cliente(horaLLegada,nombre,tipo);
            if(clientes.containsKey(tipo)){
                clientes.get(tipo).add(cliente);
            }else {
                List<Cliente> lista = new ArrayList<>();
                lista.add(cliente);
                clientes.put(tipo, lista);
            }
        }
        List<Cliente> preferentes = clientes.get("preferente");
        List<Cliente> normal= clientes.get("normal");
        Ordenar(preferentes,ordenados);
        Ordenar(normal,ordenados);
        for(Cliente cliente: ordenados){
            System.out.println(cliente.getHoraLLegada() + " ->" + cliente.getNombre());
        }
    }


    public static void Ordenar(List<Cliente> lista, List<Cliente> ordenados){
        if(lista!=null){
            while(!lista.isEmpty()){
                Cliente primero = lista.get(0);
                for(int j = 1; j<lista.size(); j++){
                    Cliente otro = lista.get(j);
                    if(otro.getHoraLLegada().isBefore(primero.getHoraLLegada())) primero = otro;
                }

                ordenados.add(primero);
                lista.remove(primero);
            }




        }
    }





}
