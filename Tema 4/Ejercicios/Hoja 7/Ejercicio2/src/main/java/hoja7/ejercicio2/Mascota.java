/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gines
 */
public class Mascota {
    private String nombre;
    private LocalDate fechanac;

    public Mascota(String nombre, int year, int m,int d) {
        this.nombre = nombre;
        fechanac= LocalDate.of(year, m, d);
    }
    
  public int getedad(){
        return Period.between(fechanac, LocalDate.now()).getYears();
      
  }

    @Override
    public String toString() {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "\nMascota " + "nombre " + nombre + "\nFechanac " + dtf.format(fechanac);
    }
    
 
    
    
}
