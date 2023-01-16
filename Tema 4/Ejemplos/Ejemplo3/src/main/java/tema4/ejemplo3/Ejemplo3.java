/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema4.ejemplo3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Ginés
 */
public class Ejemplo3 {

    public static void main(String[] args) {

        
LocalDate fechaInicio = LocalDate.of(2022, 10, 10);
LocalDate fechaFin = fechaInicio.plus(Period.ofDays(500)); 
int diffDays = Period.between(fechaInicio, fechaFin).getDays();
int diffMonths =Period.between(fechaInicio, fechaFin).getMonths();
int diffYears =Period.between(fechaInicio, fechaFin).getYears();
System.out.println("Años: "+diffYears+" Meses: "+diffMonths+" Dias: "+diffDays); 
long aux=ChronoUnit.DAYS.between(fechaInicio, fechaFin);
System.out.println("Dias entre dos fechas: "+aux);

        }
}
