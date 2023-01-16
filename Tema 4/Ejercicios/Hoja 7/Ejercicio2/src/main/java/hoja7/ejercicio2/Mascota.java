/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author gines
 */
public class Mascota {
    private String nombre;
    private LocalDate fechanac;

    public Mascota(String nombre, int y, int m,int d) {
        this.nombre = nombre;
        fechanac= LocalDate.of(y, m, d);
    }
    
  public int getedad(){
        return Period.between(fechanac, LocalDate.now()).getYears();
      
  }

    @Override
    public String toString() {
        //otra forma de poner la fecha
//                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy").withLocale(new Locale("es","ES"));
//es indirente poner dtf.formar que fechanac.format
        return "\nMascota " + "nombre " + nombre +" "+ "Fechanac " + dtf.format(fechanac);
        

    }
    
 
    
    
}
