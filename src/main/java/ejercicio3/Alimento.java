package ejercicio3;

public class Alimento implements CalculadorPrecio{

    public static final double IMPUESTOS = 0.05;

    @Override
    public double impuestos() {
        return IMPUESTOS;
    }

    @Override
    public double descuento(double precio) {
        var descuento=0.0;
        if (precio > 100) {
            descuento = 0.15;
        }
        return descuento;    }

    @Override
    public boolean envioGratis(double precio) {
        var envioGratis=false;
        if (precio > 200) {
            envioGratis = true;
        }
        return envioGratis;
    }
}
