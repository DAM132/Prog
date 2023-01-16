/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

/**
 *
 * @author gines
 */
public class Rectangulo {
    
    private int largo,ancho;

    public Rectangulo() {
    }

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public int areaRec(){
        int resul;
        resul=ancho*largo;
        return resul;
    }
    
    public double diagonal(){
        double resul;
        resul= Math.sqrt((ancho*ancho)+(largo*largo));
        return resul;
    }
    
    
    
}
