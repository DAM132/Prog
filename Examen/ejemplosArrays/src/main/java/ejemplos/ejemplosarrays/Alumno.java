package ejemplos.ejemplosarrays;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author cic
 */
public class Alumno {

    private String nombre;
    private String apellidos;
    private double nota;
    private LocalDate fechaNacimiento;

    /**
     * los parámetros son:
     *
     * @param nombre
     * @param apellidos
     * @param nota
     * @param fechaNacimiento
     */
    public Alumno(String nombre, String apellidos, double nota, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota = nota;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Nos muestra por pantalla la información del alumno
     */
    public void print() {

        DateTimeFormatter fechaFormato =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
          System.out.printf("\nAlumno:\n\tNombre= %s \n\tApellidos= %s \n\tnota= %,.2f \n\tfechaNacimiento= %s",nombre,apellidos,nota,fechaNacimiento.format(fechaFormato));
    }
}
