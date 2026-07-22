package dgtic.core.ReservasHotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
         Service service = new ServiceImpl();
         Scanner sc = new Scanner(System.in);

         while(sc.hasNextLine()){
             String linea = sc.nextLine().trim();
             if (linea.isEmpty() || linea.equalsIgnoreCase("FIN")) break;

             String[] partes  = linea.split(" ");
             String comando = partes[0].toUpperCase();
             if(comando.equals("CONSULTAR")){
                 service.consultar();
                 continue;
             }
             int numeroHabitacion = Integer.parseInt(partes[1]);

             switch (comando){
                 case "RESERVAR":
                     service.reservar(numeroHabitacion);
                     break;
                 case "CANCELAR":
                     service.cancelar(numeroHabitacion);
                     break;
                 case "MANTENIMIENTO":
                     service.mantenimiento(numeroHabitacion);
                     break;
                 case "HABILITAR":
                     service.habilitar(numeroHabitacion);
                     break;
                 default:
                     System.out.println("Comando no reconocido: " + comando);

             }



         }




    }

    }
