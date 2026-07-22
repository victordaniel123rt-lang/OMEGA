package dgtic.core.ReservasHotel;

public class Habitacion {

    private Integer numero;
    private Estado estado;


    public Habitacion(Integer numero) {
        this.estado = Estado.LIBRE;
        this.numero = numero;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
