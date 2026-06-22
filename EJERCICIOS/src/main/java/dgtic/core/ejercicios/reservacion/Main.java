package dgtic.core.ejercicios.reservacion;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Reserva> reservas = new ArrayList<>();
        String solicitante1= "Pedro";
        String fecha = "12-06-2026";
        String inicio = "10:00";
        String fin = "11:00";
        String nombre = "Sala A";
        LocalTime horaInicio = LocalTime.parse(inicio);
        LocalTime horaFin = LocalTime.parse(fin);
        Reserva uno = new Reserva(fecha,horaFin,horaInicio,nombre,solicitante1);
        String solicitante2= "Victor";
        String fecha2 = "12-06-2026";
        String inicio2 = "12:00";
        String fin2 = "13:00";
        String nombre2 = "Sala A";
        LocalTime horaInicio2 = LocalTime.parse(inicio2);
        LocalTime horaFin2 = LocalTime.parse(fin2);
        Reserva dos = new Reserva(fecha2,horaFin2,horaInicio2,nombre2,solicitante2);
        reservas.add(uno);
        reservas.add(dos);
        System.out.println("Ingresa la reserva: ");
        System.out.println("Quien la solicita: ");
        String sol = sc.nextLine();
        System.out.println("Fecha");
        String fech = sc.nextLine();
        System.out.println("Hora inicio: ");
        String ini = sc.nextLine();
        LocalTime start = LocalTime.parse(ini);
        System.out.println("Hora fin: ");
        String fi= sc.nextLine();
        LocalTime fil = LocalTime.parse(fi);
        System.out.println("Nombre: ");
        String name = sc.nextLine();
        Reserva ingresada = new Reserva(fech,fil, start,name,sol);
        boolean r = puedeReservarse(ingresada,reservas);
        if(r == true){
            System.out.println("Permitida");
        }else{
            System.out.println("No permitida");
        }
    }


    static boolean puedeReservarse(
            Reserva nuevaReserva,
            List<Reserva> reservasExistentes) {

        for (Reserva r : reservasExistentes) {

            boolean traslape =
                    r.getHoraInicio().isBefore(nuevaReserva.getHoraFin())
                            && nuevaReserva.getHoraInicio().isBefore(r.getHoraFin());

            if (traslape) {
                return false;
            }
        }

        return true;
    }

}
