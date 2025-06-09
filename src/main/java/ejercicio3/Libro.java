package ejercicio3;

public class Libro implements CalculadorPrecio{

    public static final double IMPUESTOS = 0.1;
    public static final double DESCUENTOS = 0.1;
    public static final boolean ENVIO = false;

    @Override
    public double impuestos() {
        return IMPUESTOS;
    }

    @Override
    public double descuento(double precio) {
        return DESCUENTOS;
    }

    @Override
    public boolean envioGratis(double precio) {
        return ENVIO;
    }
}
