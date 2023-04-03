/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *
 * @author Ginés
 */
public class Persona implements Identificable {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    

    @Override
    public LinkedHashMap<String, String> listaObjeto() {
         LinkedHashMap<String, String> aux;
         aux = new LinkedHashMap();
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
           
           aux.put("\nnombre ", nombre);
           aux.put("\napellido ", apellidos);
        aux.put("\nfechanacimiento ", fechaNacimiento.format(formatter));
        
        
         
         
         
        return aux;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
}
