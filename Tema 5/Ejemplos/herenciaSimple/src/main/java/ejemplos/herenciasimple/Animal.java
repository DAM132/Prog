/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.herenciasimple;

/**
 *
 * @author Nuria
 */
public class Animal {
    protected String nombre;
    protected String especie;
    protected int tamanio;

    public Animal(String nombre, String especie, int tamanio) {
        this.nombre = nombre;
        this.especie = especie;
        this.tamanio = tamanio;
    }

    public void comer(){
        System.out.println("Como como un animal");
    }
    
    public void respirar(){
        System.out.println("Respiro como un animal");
    }
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", especie=" + especie + ", tamanio=" + tamanio + '}';
    }
    
    
}
