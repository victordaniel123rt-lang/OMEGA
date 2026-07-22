package dgtic.core.ReservasHotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServiceImpl implements Service{

List<Habitacion> habitaciones = List.of(new Habitacion(101), new Habitacion(102), new Habitacion(103), new Habitacion(104),
        new Habitacion(105), new Habitacion(106), new Habitacion(107), new Habitacion(108), new Habitacion(109));

    @Override
    public void reservar(int numero) {
        Optional<Habitacion> optional = habitaciones.stream().filter(h->h.getNumero().equals(numero)).findFirst();
        if(optional.isPresent()){
            Habitacion habitacion = optional.get();
            if(habitacion.getEstado().equals(Estado.OCUPADA)) {
                System.out.println("ERROR, la habitación solicitada se encuentra ocupada en este momento");
            } else if (habitacion.getEstado().equals(Estado.MANTENIMIENTO)) {
                System.out.println("ERROR, la habitación solicitada se encuentra en mantenimiento");
            }
            habitacion.setEstado(Estado.OCUPADA);
            System.out.println("Habitación " + habitacion.getNumero() + " reservada.");
        }else {
            System.out.println("No existe la habitación con el número proporcionado");
        }
    }

    @Override
    public void cancelar(int numero) {
        Optional<Habitacion> optional = habitaciones.stream().filter(h->h.getNumero().equals(numero)).findFirst();
        if(optional.isPresent()){
            Habitacion habitacion = optional.get();
            if(habitacion.getEstado().equals(Estado.LIBRE)) {
                System.out.println("ERROR, la habitación solicitada se encuentra LIBRE en este momento");
            } else if (habitacion.getEstado().equals(Estado.MANTENIMIENTO)) {
                System.out.println("ERROR, la habitación solicitada se encuentra en mantenimiento");
            }
            habitacion.setEstado(Estado.LIBRE);
            System.out.println("Reserva inválida.");
        }else {
            System.out.println("No existe la habitación con el número proporcionado");
        }
    }

    @Override
    public void mantenimiento(int numero) {
        Optional<Habitacion> optional = habitaciones.stream().filter(h->h.getNumero().equals(numero)).findFirst();
        if(optional.isPresent()){
            Habitacion habitacion = optional.get();
            if(habitacion.getEstado().equals(Estado.OCUPADA)) {
                System.out.println("ERROR, la habitación solicitada se encuentra ocupada en este momento");
            } else if (habitacion.getEstado().equals(Estado.MANTENIMIENTO)) {
                System.out.println("ERROR, la habitación solicitada ya se encuentra en mantenimiento");
            }
            habitacion.setEstado(Estado.MANTENIMIENTO);
            System.out.println("Habitación " + habitacion.getNumero() + " enviada a mantenimiento.");
        }else {
            System.out.println("No existe la habitación con el número proporcionado");
        }
    }

    @Override
    public void habilitar(int numero) {
        Optional<Habitacion> optional = habitaciones.stream().filter(h->h.getNumero().equals(numero)).findFirst();
        if(optional.isPresent()){
            Habitacion habitacion = optional.get();
            if(habitacion.getEstado().equals(Estado.LIBRE)) {
                System.out.println("ERROR, la habitación solicitada ya se encuentra habilitada");
            }
            habitacion.setEstado(Estado.LIBRE);
            System.out.println("La habitación fue habilitada correctamente");
        }else {
            System.out.println("No existe la habitación con el número proporcionado");
        }
    }

    @Override
    public void consultar() {
        for(Habitacion h : habitaciones){
            System.out.println("Habitación " + h.getNumero() + " -> " + h.getEstado());
        }
    }

    @Override
    public void disponibles() {
        List<Habitacion> libres = habitaciones.stream().filter(h->h.getEstado().equals(Estado.LIBRE)).toList();
        for(Habitacion h : libres){
            System.out.println(h.getNumero());
        }
    }
}
