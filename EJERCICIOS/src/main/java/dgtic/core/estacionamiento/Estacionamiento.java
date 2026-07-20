package dgtic.core.estacionamiento;

import java.time.LocalTime;
import java.util.List;

public interface Estacionamiento  {

    String registrarEntrada(String placa, Tipo tipo, LocalTime horaEntrada);
    void registrarSalida(String placa, LocalTime horaSalida);
    void consultarVehiculo(String placa);
    void mostrarVehiculos();
    List<String> mostrarIngresos();

}
