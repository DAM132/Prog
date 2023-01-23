/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio3;

/**
 *
 * @author Ginés
 */
public class AparatoElectrico {
    
    private static double consumoTotal =0;
   

    public static double getConsumoTotal() {
        return consumoTotal;
    }
    
    private boolean encendido;
    private double potencia;

    public AparatoElectrico(double potencia) {
        encendido = false;
        this.potencia = potencia;
    }
 
    public void enciende() {
        if (!encendido) {
            encendido = true;
            consumoTotal += potencia;
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            consumoTotal -= potencia;
          }
      }
        
    
    
}
