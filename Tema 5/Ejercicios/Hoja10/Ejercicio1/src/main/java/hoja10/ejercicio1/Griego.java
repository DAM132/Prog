/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Griego extends Guerrero {

    public Griego(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }

    @Override
    public boolean retirarse() {
       boolean  aux=false;
        if(super.isHerido()==true&&super.isHerido()==false){
            aux=true;
        }
        return aux;
        
    }
    
    
    
}
