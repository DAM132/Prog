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
public class Vehiculo {
    protected double velocidad;

    public Vehiculo() {
    }
    
    public Vehiculo(double kmh){
        velocidad=kmh;
    }
    public void acelerar(double kmh){
        velocidad=velocidad+kmh;
    }
}
