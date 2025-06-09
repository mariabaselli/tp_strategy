package ejercicio1;

public class Producto {
    private double precio;
    private String descripcion;
    private double peso;


    public Producto(String descripcion, double precio, double peso) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.peso=peso;
    }

    public double obtenerPrecio() {
        return this.precio;
    }

    public double peso() {
        return this.peso;
    }
}
