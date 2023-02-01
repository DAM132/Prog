/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

import java.util.Arrays;

/**
 *
 * @author Ginés
 */
public class Plantilla {
    protected int cont=0;
    private Empleado e[];

    public Plantilla() {
 
        e= new Empleado[10];
    }
    
    public void insertarEmpleado(Empleado e1){
        e[1]=e1;
        
    }

    @Override
    public String toString() {
        return "Plantilla{" + "e=" + Arrays.toString(e) + '}';
    }
    
   
    
    
}
