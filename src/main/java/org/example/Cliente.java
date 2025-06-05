package org.example;

public class Cliente {
    private String nombre;
    private Carrito carrito;
    private Localidad ubicacion;

    public Cliente(String nombre, Carrito carrito, Localidad ubicacion) {
        this.nombre = nombre;
        this.carrito = carrito;
        this.ubicacion = ubicacion;
    }

    public double pagar() {
       return carrito.calcularPrecio(ubicacion);
    }
}
