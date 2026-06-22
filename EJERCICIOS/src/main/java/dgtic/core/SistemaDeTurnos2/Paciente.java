package dgtic.core.SistemaDeTurnos2;

import java.time.LocalTime;

public class Paciente {
    private String nombre;
    private LocalTime horaLlegada;
    private String prioridad;

    public Paciente(LocalTime horaLlegada, String nombre, String prioridad) {
        this.horaLlegada = horaLlegada;
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

}
