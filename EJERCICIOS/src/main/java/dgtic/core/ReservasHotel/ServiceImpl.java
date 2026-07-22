package dgtic.core.ReservasHotel;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service{
    List<Habitacion> habitaciones = new ArrayList<>();
    for(int i =1; i<=10; i++){
        habitaciones.add(new Habitacion(101+i));
    }


    @Override
    public void reservar(String numero) {

    }

    @Override
    public void cancelar(String numero) {

    }

    @Override
    public void mantenimiento(String numero) {

    }

    @Override
    public void habilitar(String numero) {

    }

    @Override
    public void consultar() {

    }

    @Override
    public void disponibles() {

    }
}
