package dgtic.core.SistemadeTurnos;

import java.time.LocalTime;

public class Cliente {

    public String nombre;
    public LocalTime hora;
    public String prioridad;

    public Cliente(LocalTime hora, String nombre, String prioridad) {
        this.hora = hora;
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
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
