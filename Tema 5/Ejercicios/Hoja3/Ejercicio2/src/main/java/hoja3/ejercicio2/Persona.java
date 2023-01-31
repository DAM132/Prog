/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public abstract class Persona {
    protected String dni,nombre,direccion;

    public Persona() {
        Scanner in= new Scanner(System.in);
        do{
            System.out.println("Introduce el dni");
            dni=in.nextLine();
        }
        while(!dni.matches("[0-9]{8}[A-Z]{1}"));
        
        System.out.println("Dime el nombre");
       nombre=in.nextLine();
        System.out.println("Dime la direccion");
        direccion=in.nextLine();
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public String mostrar() {
        return "Persona{" + ", nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    
}
