/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Cono extends Figura {
    
    public Cono(int radio, int altura) {
        super(radio, altura);
    }

    @Override
    public double area() {
       
        return  Math.PI*Math.pow(radio, 2);
    }

    @Override
    public double volumen() {
        
        return 1/3*altura*Math.PI*Math.pow(radio, 2);
        
    }
    
    
    
    
    
}
