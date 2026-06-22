package dgtic.core.ejercicios.Salas;

public class Sala {

    public int id;
    public int capacidad;

    public Sala(int capacidad, int id) {
        this.capacidad = capacidad;
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "capacidad=" + capacidad +
                ", id='" + id + '\'' +
                '}';
    }
}
