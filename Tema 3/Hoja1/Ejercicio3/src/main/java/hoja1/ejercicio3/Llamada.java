/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio3;

/**
 *
 * @author gines
 */
public class Llamada {
    private int duracion;

    public Llamada() {
        duracion=0;
    }
    
    public double apagar(int min, int seg){
        double aux=0;
      
        duracion= min*60+seg;
        if(duracion<=60&&duracion>0){
           aux=0.25;
        }
        
        else if (duracion>60){
            aux=0.25+((duracion-60)/10*0.1);
        
    }
        
        return aux;
        
    } 
    
}
