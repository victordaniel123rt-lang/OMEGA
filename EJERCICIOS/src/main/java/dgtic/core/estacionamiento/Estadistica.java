package dgtic.core.estacionamiento;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static dgtic.core.estacionamiento.Tipo.*;

public class Estadistica implements Estacionamiento{
    List<Auto> lista = new ArrayList<>();

    @Override
    public String registrarEntrada(String placa, Tipo tipo, LocalTime horaEntrada) {
       boolean existe = lista.stream().anyMatch(auto ->auto.getPlaca().equals(placa));
       if(existe){
           System.out.println("La placa del vehículo ingresado ya se encuentra registrada");
       }
       Auto auto = new Auto(horaEntrada, null,placa,tipo);
       lista.add(auto);

        return "El auto se ha registrado de manera exitosa, puedes estacionarte";
    }

    @Override
    public String registrarSalida(String placa, LocalTime horaSalida) {
        double total = 0;
        Optional<Auto> vehiculo = lista.stream().filter(auto->auto.getPlaca().equals(placa)).findFirst();
        if(vehiculo.isPresent()){
            Auto auto = vehiculo.get();
            Duration duracion = Duration.between(auto.getHoraEntrada(),horaSalida);
            long horas = duracion.toHours();
            if(auto.getTipo().equals(AUTO)){
                total = horas*25;
            }else if(auto.getTipo().equals(MOTO)){
                total = horas*15;
            }else if(auto.getTipo().equals(CAMIONETA)){
                total = 35*horas;
            }
            lista.remove(auto);
        }else{
            System.out.println("No se encontró ningún vehículo con la placa introducida");
        }
        return "Tiempo: "+ 2  + " horas. El total a pagar es: " + total + " Gracias por tu visita";
    }

    @Override
    public void consultarVehiculo(String placa) {
        Optional<Auto> vehiculo = lista.stream().filter(auto->auto.getPlaca().equals(placa)).findFirst();
        if(vehiculo.isPresent()){
            Auto auto = vehiculo.get();
            Duration duracion = Duration.between(auto.getHoraEntrada(),LocalTime.now());
            long tiempo = duracion.toHours();
            System.out.println("Placa: " + auto.getPlaca());
            System.out.println("Tipo: " + auto.getTipo());
            System.out.println("Hora entrada: " + auto.getHoraEntrada());
            System.out.println("Tiempo transcurrido: " + tiempo);
        }else {
            System.out.println("No se encontro ningún vehículo con la placa introducida ");
        }
    }

    @Override
    public List<Auto> mostrarVehiculos() {
        return lista;
    }

    @Override
    public List<String> mostrarIngresos() {
        return List.of();
    }
}
