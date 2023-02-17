/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1b;

import hoja10.ejercicio1.Griego;
import hoja10.ejercicio1.Guerrero;
import java.util.Arrays;

/**
 *
 * @author Ginés
 */
public class Caballo implements PuedeMontarse {
    protected int capacidad, ocupacion;
    protected Guerrero [] ocupantes ;

    public Caballo(Guerrero[] ocupantes) {
        int cont=0;
        for (int i = 0; i < ocupantes.length; i++) {
            
            if(ocupantes[i] instanceof Griego){
                cont++;
            }
            else{
                capacidad=100;
            }
            
        }
        capacidad=cont;
    }

    public Caballo(Guerrero ocupantes, int capacidad) {
        
      if(ocupantes instanceof Griego)
        this.capacidad = capacidad;
      else
          this.capacidad=0;
    }
    
    public void  ordenar(){
        
        Arrays.sort(ocupantes,0,ocupacion-1);
    }
    
    
    public int buscar(String nombre){
        int aux=-1;
        ordenar();
        
        for (int i = 0; i < ocupantes.length; i++) {
            if(ocupantes[i].getNombre().equalsIgnoreCase(nombre)){
                i=aux;
            }
        }
        
        
        return aux;
       
    }

    @Override
    public int montar(Guerrero g) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void desmontar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
 }


