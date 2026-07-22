package dgtic.core.ReservasHotel;

public interface Service {
    void reservar(String numero);
    void cancelar(String numero);
    void mantenimiento(String numero);
    void habilitar(String numero);
    void consultar();
    void disponibles();
}
