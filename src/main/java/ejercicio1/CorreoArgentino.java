package ejercicio1;

import java.util.List;

public class CorreoArgentino implements Envio{
    @Override
    public double costoEnvio(Localidad ubicacion, List<Producto> producto) {
        return ubicacion.precioCorreoArgentino(producto);
    }
}
