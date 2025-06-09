package ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoCorto implements FormatoFecha{
    @Override
    public String fecha(LocalDate fechaNacimiento) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaNacimiento.format(formato);
    }
}
