package entidades;

public class Producto {

    private String tipo;
    private int cantidad;
    private int precio;

    public Producto(){

    }

    public Producto(String tipo, int cantidad, int precio) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
