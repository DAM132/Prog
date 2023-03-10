/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio3;

import java.util.Objects;

/**
 *
 * @author Ginés
 */
public class Personas implements Comparable<Personas> {
    private String nombre,apellido,dni;

    public Personas() {
        nombre=claseTeclado.esNombre("Dime el nombre");
        apellido=claseTeclado.esNombre("Dime el apellido");
        dni= claseTeclado.tecladoDni("Dime el dni");
    }

    public Personas(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }

    @Override
    public int compareTo(Personas o) {
       if(nombre.compareTo(o.nombre) == 0){
           return apellido.compareTo(o.apellido);
       }
        return nombre.compareTo(o.nombre);
       
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personas other = (Personas) obj;
        return Objects.equals(this.dni, other.dni);
    }
    
    
}
