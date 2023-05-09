package Ejercicio2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAM132
 */
public class Pacientes {
    private String dni,nombre,telefono;

    public Pacientes(String dni, String nombre, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Pacientes() {    
    }
    
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    @Override
    public String toString() {
        return "Pacientes{" + "dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
    
    
}
