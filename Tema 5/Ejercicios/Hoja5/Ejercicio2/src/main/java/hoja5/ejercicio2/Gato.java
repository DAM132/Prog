/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Gato extends Mamifero implements Domestico, Felino{
    protected String nombre;

    public Gato(String nombre, String raza, String alimento, int npatas) {
        super(raza, alimento, npatas);
        this.nombre = nombre;
    }

    
        @Override
    public String obedecer() {
      
        return "obedece,miau";
    }

    @Override
    public String arañar() {
         return "soy un gato, araño miauuuu";
    }
    
    
    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + super.toString()+'}';
    }

    
    
}
