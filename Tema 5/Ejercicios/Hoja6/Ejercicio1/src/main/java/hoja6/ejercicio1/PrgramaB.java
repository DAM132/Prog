/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

/**
 *
 * @author Ginés
 */
public class PrgramaB {
    
    public static void main(String[] args){
        DeDos d= new DeDos();
        Detres t= new Detres();
        Series s;
    s=d;
       
        for (int i = 0; i < 5; i++) {
            System.out.println("El valor de Dedos es " + s.getSiguiente());
        }
        
        s=t;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("El valor de DeTres es" + s.getSiguiente());
        }
    
       Series.nombreInterfaz();

    }
    
}
