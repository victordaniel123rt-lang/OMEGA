package dgtic.core.ejercicios.reservacion;

import java.time.LocalTime;

public class Reserva {
    public String solicitante;
    public String fecha;
    public LocalTime HoraInicio;
    public LocalTime HoraFin;
    public String nombre;


    public Reserva(String fecha, LocalTime horaFin, LocalTime horaInicio, String nombre, String solicitante) {
        this.fecha = fecha;
        HoraFin = horaFin;
        HoraInicio = horaInicio;
        this.nombre = nombre;
        this.solicitante = solicitante;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        HoraFin = horaFin;
    }

    public LocalTime getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        HoraInicio = horaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }
}
