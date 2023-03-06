/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hoja6.ejercicio1;

/**
 *
 * @author Ginés
 */
public interface Series {
    
    public static final int INICIO=0;
    
    public int getSiguiente();
    
    
    public void reiniciar();
    
    public void setComenzar(int x);
    
    public default void nombreInterfaz(){
        System.out.println("El nombre de esta interfaz es series");
    }
    
    
    public default void mostrarInicio(){
        System.out.println("Este es el valor de inicio "
                + "mostrado desde la interfaz series" + INICIO);
    }
    
}
