/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Personas implements Comparable<Personas> {
    private String nombre;
    private String apellidos;
    private String dni;

    public Personas(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + '}';
    }

    @Override
    public int compareTo(Personas o) {


        return this.dni.compareToIgnoreCase(o.dni);


    }
    
    
    
    
    
    
}
