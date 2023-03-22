/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Ginés
 */
public class Jugador implements Comparable<Jugador> {
    
    private String nombre;
    private float estatura;
    

    public Jugador(String nombre, float estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
 
    }
    
   

    
   
    
    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

   

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", estatura=" + estatura + '}';
    }
    
    
    

    @Override
    public int compareTo(Jugador o) {
        
        return Float.compare(this.estatura, o.estatura);
    }
    
    
}
