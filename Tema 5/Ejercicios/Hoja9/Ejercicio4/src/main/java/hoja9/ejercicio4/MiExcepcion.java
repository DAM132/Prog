/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja9.ejercicio4;

/**
 *
 * @author Ginés
 */
public class MiExcepcion extends Exception{


   
    public MiExcepcion(String error) {
       super(error);
    }

    
    
    
    
   
    public String getError() {
        return super.toString();
    }
    
    
    
}
