/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Encargado extends Empleado {

    public Encargado(double sueldo) {
        super(sueldo);
    }
    
@Override

    public double getSueldo() {
        return super.getSueldo()*0.1+super.getSueldo();
    }


    
    
}
