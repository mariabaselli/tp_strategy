package org.example;

import java.util.List;

public class Calculador {

    private Envio envio;

    public Calculador(Envio envio) {
        this.envio = envio;
    }

    public double calcularPrecio(List<Producto> productos, Localidad ubicacion)  {
        var costoTotal = 0.0;
        for (Producto p: productos) {
            costoTotal += p.obtenerPrecio();
        }
        costoTotal+= envio.costoEnvio(ubicacion, productos);
        return costoTotal;
    }
}
