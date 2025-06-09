package ejercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(1990, 5, 15);
        Persona p1 = new Persona (fechaNacimiento, new FormatoCorto());
        System.out.println(p1.fechaNacimiento());
    }
}
