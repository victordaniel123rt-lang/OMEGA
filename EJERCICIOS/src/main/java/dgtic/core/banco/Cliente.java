package dgtic.core.banco;

import java.time.LocalTime;

public class Cliente {
    public String nombre;
    public LocalTime horaLLegada;
    public String tipo;


    public Cliente(LocalTime horaLLegada, String nombre, String tipo) {
        this.horaLLegada = horaLLegada;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public LocalTime getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(LocalTime horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
