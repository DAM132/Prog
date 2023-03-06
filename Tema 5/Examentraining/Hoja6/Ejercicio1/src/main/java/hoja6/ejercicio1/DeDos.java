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
    
    private int valor, anterior;

    public  DeDos() {
       this.reiniciar();
    }

    
    
    @Override
    public int getSiguiente() {
        anterior=+2;
        return  valor=+2;
    }
    
    public int getAnterior(){
        
        return anterior;
        
    }

    @Override
    public void reiniciar() {
        this.valor = Series.INICIO;
        this.anterior = Series.INICIO-2;
    }

    @Override
    public void setComenzar(int x) {
         this.valor = x;
        this.anterior = x-2;
        
    }
    
    
    
}
