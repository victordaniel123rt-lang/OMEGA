package dgtic.core.cotizador.model;

public class Cliente {
    private String nombre;
    private String tipo;
    private Double monto;
    private Integer antiguedad;
    public Cliente(Integer antiguedad, Double monto, String nombre, String tipo) {
        this.antiguedad = antiguedad;
        this.monto = monto;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
