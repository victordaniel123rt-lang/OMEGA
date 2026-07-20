package dgtic.core.estacionamiento;

import java.time.LocalTime;

public class Auto {

    private String placa;
    private Tipo tipo;
    private LocalTime HoraEntrada;
    private LocalTime HoraSalida;

    public Auto() {
    }

    public Auto(LocalTime horaEntrada, LocalTime horaSalida, String placa, Tipo tipo) {
        HoraEntrada = horaEntrada;
        HoraSalida = horaSalida;
        this.placa = placa;
        this.tipo = tipo;
    }

    public LocalTime getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        HoraEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        HoraSalida = horaSalida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
