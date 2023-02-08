/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Detres implements Series{
    protected int valor;

    public Detres() {
        valor=INICIO;
    }

    @Override
    public int getSiguiente() {
       valor+=3;
        return valor ;
        
    }

    @Override
    public void reiniciar() {
valor=0;
    }

    @Override
    public void setComenzar(int x) {
valor=x;
    }
    
    
}
