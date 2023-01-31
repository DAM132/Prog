/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author Ginés
 */
public abstract class Figura {
    protected int radio,altura;

    public Figura(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;
    }
    
    public abstract double area();
    
   public abstract double volumen();

    public int getRadio() {
        return radio;
    }

    public int getAltura() {
        return altura;
    }
}
