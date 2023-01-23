/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Pajaro {
    private String color;
    private int edad;
    private static int numPajaros=0;

    public Pajaro() {
        nuevopajaro();
    }

    public Pajaro(String color, int edad) {
        this.color = color;
        this.edad = edad;
    }
private  static void nuevopajaro(){
    numPajaros++;
    
}
    public static void muestraPajaro() {
        System.out.println("Numero de pajaros creados : "+ numPajaros);
    }
    
    
}

