package dgtic.core.Reuniones;

import java.time.LocalTime;

public class Reunion {
    public String nombre;
    public LocalTime inicio;
    public LocalTime fin;


    public Reunion(LocalTime fin, LocalTime inicio, String nombre) {
        this.fin = fin;
        this.inicio = inicio;
        this.nombre = nombre;
    }


    public LocalTime getFin() {
        return fin;
    }

    public void setFin(LocalTime fin) {
        this.fin = fin;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Reunion{" +
                "fin=" + fin +
                ", nombre='" + nombre + '\'' +
                ", inicio=" + inicio +
                '}';
    }
}
