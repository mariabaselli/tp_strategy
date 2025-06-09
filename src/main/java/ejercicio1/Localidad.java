package ejercicio1;

import java.util.List;

public abstract class Localidad {
    private String nombre;

    public Localidad(String nombre) {
        this.nombre = nombre;
    }

    public final double precioColectivoSur(List<Producto> productos){
        double adicionalPeso=0.0;
        double sumaPeso=0.0;
        for (Producto p : productos) {
            sumaPeso+= p.peso();
        }
        if (sumaPeso>5.0 && sumaPeso<30) {
            adicionalPeso=500;
        }
        if (sumaPeso>30.0) {
            adicionalPeso = 2000;
        }
        return costoEnvioColectivoSur() + adicionalPeso;

    }

    protected abstract double costoEnvioColectivoSur();

    public double precioCorreoArgentino(List<Producto> producto) {
        return costoEnvioCorreoArgentino() + distanciaACapitalFederal();
    }

    protected abstract double  costoEnvioCorreoArgentino();

    protected abstract double distanciaACapitalFederal();
}
