package dgtic.core.Fila;

public class Cliente {
    public String nombre;
    public String tipo;
    public String hora;
    public int tickets;

    public Cliente() {
    }

    public Cliente(String hora, String nombre, int tickets, String tipo) {
        this.hora = hora;
        this.nombre = nombre;
        this.tickets = tickets;
        this.tipo = tipo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "hora='" + hora + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
