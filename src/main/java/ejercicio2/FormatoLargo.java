package ejercicio2;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoLargo implements FormatoFecha{
    @Override
    public String fecha(LocalDate fechaNacimiento) {
      DateTimeFormatter formato = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
      return fechaNacimiento.format(formato);
    }
}
