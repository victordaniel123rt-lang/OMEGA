package dgtic.core.ejercicios.SistemaPedidos;

public class Producto {
    String producto;
    double precio;
    int cantidad;

    double calcularSubTotal(){
        return precio*cantidad;
    }

    public Producto( String producto, double precio, int cantidad) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}
