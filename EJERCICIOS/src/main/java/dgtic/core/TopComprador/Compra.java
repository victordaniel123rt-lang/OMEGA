package dgtic.core.TopComprador;

public class Compra {
    private String usuario;
    private int monto;

    public Compra(int monto, String usuario) {
        this.monto = monto;
        this.usuario = usuario;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "monto=" + monto +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
