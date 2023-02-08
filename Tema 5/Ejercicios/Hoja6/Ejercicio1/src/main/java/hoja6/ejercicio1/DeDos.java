/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

/**
 *
 * @author Ginés
 */
public class DeDos implements Series {
    
    protected int valor,anterior;

    public DeDos() {
        valor=INICIO;
        anterior=valor-2;
    }

    
    
    @Override
    public int getSiguiente() {
        anterior=valor;
        valor+=2;
        return valor;
    }

    @Override
    public void reiniciar() {
        valor=0;
        anterior=valor-2;
    }

    @Override
    public void setComenzar(int x) {
        valor=x;
        anterior=valor-2;
    }
    
    public int getAnterior(){
        
        return anterior;
        
    }
    
    
}
