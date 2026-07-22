package dgtic.core.estacionamiento;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        String placa  = "";
        Estacionamiento estacionamiento = new EstacionamientoImpl();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Registrar entrada");
            System.out.println("2. Registrar salida");
            System.out.println("3. Buscar vehículo");
            System.out.println("4. Mostrar estacionados");
            System.out.println("5. Mostrar estadísticas");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa la placa de tu unidad: ");
                     placa  = sc.nextLine();
                    System.out.println("Ingresa el tipo de vehículo: ");
                    String kind = sc.nextLine();
                    Tipo tipo = Tipo.valueOf(kind);
                    System.out.println("Hora de entrada: ");
                    String horaEntrada = sc.nextLine();
                    LocalTime entrada = LocalTime.parse(horaEntrada);
                    estacionamiento.registrarEntrada(placa,tipo,entrada);
                    break;
                case 2:
                    System.out.println("Ingresa la placa de tu unidad: ");
                    placa  = sc.nextLine();
                    System.out.println("Hora de salida: ");
                    String salida = sc.nextLine();
                    LocalTime horaSalida = LocalTime.parse(salida);
                    estacionamiento.registrarSalida(placa,horaSalida);
                    break;

                case 3:
                    System.out.println("Ingresa la placa de tu unidad: ");
                    placa  = sc.nextLine();
                    estacionamiento.consultarVehiculo(placa);
                    break;
                case 4:
                    estacionamiento.mostrarVehiculos();
                    break;
                case 5:
                    estacionamiento.mostrarIngresos();
                    break;
            }
        }while(opcion  != 6);
    }

}
