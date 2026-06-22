package dgtic.core.ejercicios.Salas;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Salas :");
        int n = sc.nextInt();
        System.out.println("solicitudes");
        int m = sc.nextInt();
        List<Sala> salas = new ArrayList<>();
        List<Solicitud> solicitudes = new ArrayList<>();
        for(int i=1; i<=n; i++){
            int id = sc.nextInt();
            int capacidad = sc.nextInt();
            Sala sala = new Sala(capacidad,id);
            salas.add(sala);
        }
        for(int j=1; j<=m; j++){
            String nombre = sc.nextLine();
            sc.nextLine();
            int numero = sc.nextInt();
            sc.nextLine();
            String inicio =sc.nextLine();
            String fin =sc.nextLine();
            Solicitud solicitud = new Solicitud(inicio,fin,nombre,numero);
            solicitudes.add(solicitud);
        }

        for(Sala sala : salas){
            System.out.println("Sala :" + sala.getId() + " capacidad : " + sala.getCapacidad());
        }

        for(Solicitud solicitud : solicitudes){
            System.out.println("nombre: " + solicitud.getNombre());
        }



    }

}
