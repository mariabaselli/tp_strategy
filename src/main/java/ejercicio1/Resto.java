package ejercicio1;

public class Resto extends Localidad{

    public static final int COSTO_ENVIO_COLECTIVO_SUR = 3000;
    public static final int COSTO_ENVIO_CORREO_ARGENTINO = 800;
    public static final int DISTANCIA_CAPITAL_FEDERAL = 1000;

    public Resto(String nombre) {
        super("Resto");
    }

    @Override
    protected double costoEnvioColectivoSur() {
        return COSTO_ENVIO_COLECTIVO_SUR;
    }

    @Override
    protected double costoEnvioCorreoArgentino() {
        return COSTO_ENVIO_CORREO_ARGENTINO;
    }

    @Override
    protected double distanciaACapitalFederal() {
        return DISTANCIA_CAPITAL_FEDERAL;
    }
    }


