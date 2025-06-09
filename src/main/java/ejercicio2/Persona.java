package ejercicio2;

import java.time.LocalDate;

public class Persona {
    private final FormatoFecha formatoFecha;
    private LocalDate fechaNacimiento;

    public Persona (LocalDate fechaNacimiento, FormatoFecha formatoFecha) {
        this.fechaNacimiento = fechaNacimiento;
        this.formatoFecha = formatoFecha;
    }
    public String fechaNacimiento() {
        return formatoFecha.fecha(this.fechaNacimiento);
    }
}
