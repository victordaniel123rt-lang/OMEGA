package dgtic.core.estacionamiento;

import java.time.LocalTime;
import java.util.List;

public interface Estacionamiento  {

    String registrarEntrada(String placa, Tipo tipo, LocalTime horaEntrada);
    String registrarSalida(String placa, LocalTime horaSalida);
    void consultarVehiculo(String placa);
    List<Auto> mostrarVehiculos();
    List<String> mostrarIngresos();

}
