/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciavehiculo;

/**
 *
 * @author Nuria
 */
public class Coche extends Vehiculo {
    private int gasolina;

    public Coche() {
    }
    
     public Coche(int kmh,int g){
        super(kmh);
        gasolina=g;
        
    }
    
     @Override
    public void acelerar(double kmh){
        super.acelerar(kmh);
        gasolina=(int)(gasolina*0.9);
    }
}
