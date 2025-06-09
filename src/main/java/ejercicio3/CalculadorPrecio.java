package ejercicio3;

public interface CalculadorPrecio {
    double impuestos ();
    double descuento (double precio);
    boolean envioGratis (double precio);
}
