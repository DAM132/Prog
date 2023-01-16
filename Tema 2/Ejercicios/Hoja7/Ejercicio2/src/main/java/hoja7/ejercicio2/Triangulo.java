/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio2;

/**
 *
 * @author gines
 */
public class Triangulo {
    int lado1,lado2,lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public boolean esIsosceles(){
    boolean resul=false;
    if(lado1==lado2||lado2==lado3||lado3==lado1){
        resul=true;
    }
    return resul;
}
    
      public boolean esEquil(){
    boolean resul=false;
    if(lado1==lado2&&lado2==lado3){
        resul=true;
    }
    return resul;
}
      
         public boolean esRectangulo(){
    boolean resul=false;
    if(lado1!=lado2&&lado2!=lado3){
        resul=true;
    }
    return resul;
}
         public int perimetro(){
             int p;
             p=lado1+lado2+lado3;
             return p;
         }
}
