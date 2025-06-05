package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;
    private Calculador calculador;

    public Carrito(Calculador calculador) {
        this.productos = new ArrayList<>();
        this.calculador= calculador;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularPrecio(Localidad ubicacion) {
        return calculador.calcularPrecio(productos, ubicacion);
    }
}
