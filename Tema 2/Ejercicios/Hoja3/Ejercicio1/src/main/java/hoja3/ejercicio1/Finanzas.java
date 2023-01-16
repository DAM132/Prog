/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author Gines
 */
public class Finanzas {
    
   private double cambio;
   
    public Finanzas(){
        cambio=1.36;
        }
    
    public Finanzas(double cambio){
        this.cambio =cambio;
       }
    
    public double eurosToDolares(double euros){
        double dolares=euros*cambio;
        return dolares;
        }
    public double dolaresToEuros(double dolares){
       double euros=dolares/cambio;
       return euros;
    }

}
