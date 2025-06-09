package ejercicio1;

public class GranBuenosAires extends Localidad{

    public static final int COSTO_ENVIO_PARA_COLECTIVO_SUR = 1500;
    public static final int COSTO_ENVIO_CORREO_ARGENTINO = 800;
    public static final int DISTANCIA_CAPITAL_FEDERAL = 20;

    public GranBuenosAires(String nombre) {
        super("Gran Buenos Aires");
    }

    @Override
    protected double costoEnvioColectivoSur() {
        return COSTO_ENVIO_PARA_COLECTIVO_SUR;
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



