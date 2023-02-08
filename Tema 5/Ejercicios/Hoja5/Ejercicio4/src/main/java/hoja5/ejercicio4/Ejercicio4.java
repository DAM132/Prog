/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja5.ejercicio4;

/**
 *
 * @author Ginés
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        
Instrumento i;



Flauta f= new Flauta();

//al estar sobreescrito en el hijo ya sabe directamente al sacar la i que tiene que ir a flauta
i=f;

i.tocarnota("SI");

//al estar sobreescrito en el hijo ya sabe directamente al sacar la i que tiene que ir a Piano
Piano p = new Piano();

i=p;

i.tocarnota("LA");
    
    
        }
}
