package dgtic.core.SistemaDeTurnos2;


import dgtic.core.cotizador.model.Cliente;

import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class Min {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Paciente> uno = new ArrayList<>();
        List<Paciente> dos = new ArrayList<>();
        List<Paciente> tres = new ArrayList<>();
        List<Long> mins = new ArrayList<>();
        List<Paciente> ordenados = new ArrayList<>();
        Map<String, List<Paciente>> prioridades = new HashMap<>();
        System.out.println("Numero de pacientes a ingresar: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int k =1; k<=n; k++){
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("hora de llegada: ");
            String hora = sc.nextLine();
            LocalTime horaLlegada = LocalTime.parse(hora);
            System.out.println("Prioridad: ");
            String prioridad = sc.nextLine().toLowerCase();
            Paciente paciente = new Paciente(horaLlegada,nombre,prioridad);
            if(prioridades.containsKey(paciente.getPrioridad())){
                prioridades.get(paciente.getPrioridad()).add(paciente);
            }else{
                List<Paciente> lista = new ArrayList<>();
                lista.add(paciente);
                prioridades.put(paciente.getPrioridad(),lista);
            }
        }
        uno = prioridades.get("1");
        dos = prioridades.get("2");
        tres = prioridades.get("3");
        ordenar(uno,ordenados);
        ordenar(dos,ordenados);
        ordenar(tres,ordenados);

        System.out.println("Nombre: " + " " + "Hora de llegada" + " " + "Prioridad");
        for(Paciente p : ordenados){
            if(p.getPrioridad().equals("1")) {
                System.out.println(p.getNombre() + "     " + p.getHoraLlegada() + "      " + "Urgente");
            }else if(p.getPrioridad().equals("2")) {
                System.out.println(p.getNombre() + "     " + p.getHoraLlegada() + "      " + "Normal");
            }else{
                System.out.println(p.getNombre() + "     " + p.getHoraLlegada() + "      " + "Bajo");
            }
        }
        System.out.println();
        LocalTime horaAtencion = ordenados.get(0).getHoraLlegada();

        for(int l = 0; l<ordenados.size(); l++) {
            System.out.println(ordenados.get(l).getNombre() + " " + " Sera atendido a las: " + horaAtencion);
            horaAtencion = horaAtencion.plusMinutes(20);
            if(l!=ordenados.size()-1) horaAtencion = horaAtencion.isAfter(ordenados.get(l+1).getHoraLlegada())? horaAtencion : ordenados.get(l+1).getHoraLlegada();
            else break;
        }


    }

    public static void ordenar(List<Paciente> lista, List<Paciente> ordenado){
 if(lista!=null){
     while(!lista.isEmpty()){
         Paciente primero = lista.get(0);
         for(int i=0; i<lista.size(); i++){
             Paciente otro = lista.get(i);
             if(otro.getHoraLlegada().isBefore(primero.getHoraLlegada())){
                 primero=otro;
             }
         }
         ordenado.add(primero);
         lista.remove(primero);

        }
        }
    }







}
