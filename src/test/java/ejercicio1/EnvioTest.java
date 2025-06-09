package ejercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnvioTest {

    @Test

    public void testEnvioColectivoSur() {
        Calculador calculador = new Calculador(new ColectivoSur());
        Carrito carrito = new Carrito(calculador);
        Localidad ubicacion = new CapitalFederal();
        Cliente cliente = new Cliente ("Maria", carrito,ubicacion) ;
        Producto producto = new Producto("Laptop", 1500.00, 5.0);
        carrito.agregarProducto(producto);
        assertEquals (2500, cliente.pagar(), 0.1);
    }

    @Test
    public void testEnvioCorreoArgentino() {
        Calculador calculador = new Calculador(new CorreoArgentino());
        Carrito carrito = new Carrito(calculador);
        Localidad ubicacion = new CapitalFederal();
        Cliente cliente = new Cliente ("Maria", carrito,ubicacion) ;
        Producto producto = new Producto("Laptop", 1500.00, 5.0);
        carrito.agregarProducto(producto);
        assertEquals (2000, cliente.pagar(), 0.1);

    }
}
