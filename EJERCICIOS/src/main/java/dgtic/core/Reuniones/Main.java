package dgtic.core.Reuniones;

import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Reunion> reuniones = new ArrayList<>();
        System.out.println("Numero de reuniones a ingresar: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el nombre de la reunion: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la hora de inicio: ");
            String inicio = sc.nextLine();
            LocalTime horaInicio = LocalTime.parse(inicio);
            System.out.println("Ingrese la hora de fin: ");
            String fin = sc.nextLine();
            LocalTime horaFin = LocalTime.parse(fin);
            Reunion reunion = new Reunion(horaFin, horaInicio, nombre);
            reuniones.add(reunion);
        }
        calcularTraslapos(reuniones);

    }

    public static void calcularTraslapos(List<Reunion> lista){
        for(int i = 0; i < lista.size(); i++){

            Reunion actual = lista.get(i);

            for(int j = i + 1; j < lista.size(); j++){

                Reunion otra = lista.get(j);

                if(actual.getInicio().isBefore(otra.getFin())
                        && otra.getInicio().isBefore(actual.getFin())){

                    System.out.println(
                            actual.getNombre() +
                                    " se traslapa con " +
                                    otra.getNombre()
                    );
                }
            }
        }
    }


}