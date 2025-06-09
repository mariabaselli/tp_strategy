package ejercicio2;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class CumpleañosTest {

    @Test
    public void fechaCumpleaañosFormatoCorto() {
        LocalDate fechaNacimiento = LocalDate.of(1990, 5, 15);
        Persona p1 = new Persona (fechaNacimiento, new FormatoCorto());
        assertEquals("15/05/1990", p1.fechaNacimiento());
    }

    @Test
    public void fechaCumpleaañosFormatoLarga() {
        LocalDate fechaNacimiento = LocalDate.of(1990, 5, 15);
        Persona p1 = new Persona (fechaNacimiento, new FormatoLargo());
        assertEquals("15 de mayo de 1990", p1.fechaNacimiento());
    }
}
