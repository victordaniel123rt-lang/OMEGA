package dgtic.core.ReservasHotel;

public interface Service {
    void reservar(int numero);
    void cancelar(int numero);
    void mantenimiento(int numero);
    void habilitar(int numero);
    void consultar();
    void disponibles();
}
