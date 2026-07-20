package dgtic.core.estacionamiento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
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
            switch (opcion){
                case 1:
                    System.out.println("Ingresa la placa de tu unidad: ");
                    String placa  = sc.nextLine();
                    System.out.println("");
            }

        }while(opcion  != 6);
    }

}
