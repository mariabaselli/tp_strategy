package ejercicio3;

public class Medicina implements CalculadorPrecio {
    @Override
    public double impuestos() {
        return 0;
    }

    @Override
    public double descuento(double precio) {
        var descuentos= 0.0;
        if (precio > 50) {
            descuentos = 0.1;
        }
        else {
            descuentos = 0.05;
        }
        return descuentos;
    }

    @Override
    public boolean envioGratis(double precio) {
        var envioGratis = false;
        if (precio > 200) {
            envioGratis = true;
        }
        return envioGratis;
    }
}
