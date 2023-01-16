/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author gines
 */
public class Fondo {
   private double c,i;
   private int n;

    public Fondo(double c, double i, int n) {
        this.c = c;
        this.i = i;
        this.n = n;
    }
   
   public void Evolucion(){
       int i = 0;
       double cfinal;
       while(i<=n){    
       cfinal=c*i*n;
       i++;
       System.out.println("El capital final del año "+i +" es " +cfinal);
       
       }
   }
}
