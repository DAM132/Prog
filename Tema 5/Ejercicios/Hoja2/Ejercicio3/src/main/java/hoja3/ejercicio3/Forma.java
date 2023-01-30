/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio3;

/**
 *
 * @author Ginés
 */
public  abstract class Forma {
    protected String id;
    
    
    
    @Override
    public abstract String toString();
    
    public void identidad(){
        System.out.println("Identificador " + id);
    }
}

