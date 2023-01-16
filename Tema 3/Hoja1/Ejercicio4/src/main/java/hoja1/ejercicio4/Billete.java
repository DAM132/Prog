/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio4;

/**
 *
 * @author gines
 */
public class Billete {
    private int distancia, dias;

    public Billete(int distancia, int dias) {
        this.distancia = distancia;
        this.dias = dias;
    }
    
    public double importe(){
        double imp=distancia*0.6;
        if(distancia>7&&distancia>800){
            imp=imp*0.7;
           
                    }
        return imp;
    }
    
}
