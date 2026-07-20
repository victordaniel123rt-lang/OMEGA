package dgtic.core.estacionamiento;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static dgtic.core.estacionamiento.Tipo.*;


public class EstacionamientoImpl implements Estacionamiento{
    List<Auto> lista = new ArrayList<>();
    double totalRecaudado;
    int autosAtendidos;
    int fuera;

    @Override
    public String registrarEntrada(String placa, Tipo tipo, LocalTime horaEntrada) {
       boolean existe = lista.stream().anyMatch(auto ->auto.getPlaca().equals(placa));
       if(!existe){
           Auto auto = new Auto(horaEntrada, null,placa,tipo);
           lista.add(auto);
           autosAtendidos++;
           return "El auto se ha registrado de manera exitosa, puedes estacionarte";
       }else{
            return "La placa del vehículo ingresado ya se encuentra registrada";
       }

    }

    @Override
    public void registrarSalida(String placa, LocalTime horaSalida) {
        double total = 0;
        Optional<Auto> vehiculo = lista.stream().filter(auto->auto.getPlaca().equals(placa)).findFirst();
        if(vehiculo.isPresent()){
            Auto auto = vehiculo.get();
            Duration duracion = Duration.between(auto.getHoraEntrada(),horaSalida);
            long horas = duracion.toHours();
            long minutosRestantes = duracion.toMinutes() % 60;
            long horasRedondeadas = horas;
            if (minutosRestantes >= 30) {
                horasRedondeadas++;
            }
            if(auto.getTipo().equals(AUTO)){
                total = horasRedondeadas*25;
            }else if(auto.getTipo().equals(MOTO)){
                total = horasRedondeadas*15;
            }else if(auto.getTipo().equals(CAMIONETA)){
                total = 35*horasRedondeadas;
            }
            System.out.println("Tiempo: "+ horasRedondeadas  + " horas. El total a pagar es: " + total + " Gracias por tu visita");
            totalRecaudado = totalRecaudado + total;
            fuera++;
            lista.remove(auto);
        }else{
            System.out.println("No se encontró ningún vehículo con la placa introducida");
        }

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
    public void mostrarVehiculos() {
        for(Auto auto: lista){
            System.out.println(auto.getPlaca());
            System.out.println(auto.getTipo());
            System.out.println(auto.getHoraEntrada());
        }
    }

    @Override
    public void mostrarIngresos() {
        double promedio = totalRecaudado/fuera;
        System.out.println("Total recaudado: " + totalRecaudado);
        System.out.println("Vehículos atendidos: " + autosAtendidos);
        System.out.println("Promedio cobrado: " + promedio);
    }










}
