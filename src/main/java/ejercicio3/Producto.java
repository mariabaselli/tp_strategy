package ejercicio3;

class Producto {
    public CalculadorPrecio tipo;
    public double precio;
    public Producto(CalculadorPrecio tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }
    public double precioFinal() {
        double impuestos = tipo.impuestos();
        double descuentos = tipo.descuento(this.precio);
        boolean envioGratis = tipo.envioGratis(this.precio);
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
}
