package org.example;

import java.util.List;

public class ColectivoSur implements Envio{
    @Override
    public double costoEnvio(Localidad ubicacion, List<Producto> productos) {
        return  ubicacion.precioColectivoSur(productos);
    }
}
