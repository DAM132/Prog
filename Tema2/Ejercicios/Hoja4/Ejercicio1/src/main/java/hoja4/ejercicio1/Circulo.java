/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio1;

/**
 *
 * @author Gines
 */
public class Circulo {

    private float radio;
    private float diametro;
    public Circulo(float radio) {
        this.radio = radio;
        diametro=this.radio*2;
    }

    public Circulo() {
        radio=0;
        diametro=0;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
        diametro=this.radio*2;
    }

    public float getDiametro() {
        return diametro;
    }

 
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }


 
}
