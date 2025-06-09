package ejercicio1;

public class CapitalFederal extends Localidad {

    public static final double COSTO_ENVIO_COLECTIVO_SUR = 1000;
    public static final double COSTO_ENVIO_CORREO_ARGENTINO = 500;
    public static final double DISTANCIA_CAPITAL_FEDERAL= 0.0;

    public CapitalFederal() {
        super("Capital Federal");
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
