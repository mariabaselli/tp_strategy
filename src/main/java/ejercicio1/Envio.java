package ejercicio1;

import java.util.List;

public interface Envio {
    double costoEnvio(Localidad ubicacion, List<Producto> producto);
}
