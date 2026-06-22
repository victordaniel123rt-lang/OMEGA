package dgtic.core.ejercicios.Salas;

import java.time.LocalTime;

public class Solicitud {
    public String nombre;
    public int numero;
    public String inicio;
    public String fin;


    public Solicitud(String fin, String inicio, String nombre, int numero) {
        this.fin = fin;
        this.inicio = inicio;
        this.nombre = nombre;
        this.numero = numero;
    }


    public String getFin() {
        return fin;
    }

    public String getInicio() {
        return inicio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }
}
