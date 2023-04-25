/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio2;

import java.io.Serializable;

/**
 *
 * @author DAM132
 */
public class Persona implements Serializable {
    
    private String nombre,telefono,direccion;
    private int cp;

    public Persona() {
    }

    public Persona(String nombre, String telefono, String direccion, int cp) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cp = cp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Factura{" + "nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", cp=" + cp + '}';
    }

    
    
    
}
