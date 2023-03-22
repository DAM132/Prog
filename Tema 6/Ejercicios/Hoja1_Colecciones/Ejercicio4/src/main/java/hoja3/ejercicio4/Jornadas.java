/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ginés
 */
public class Jornadas {
private ArrayList<Partidos> a;
    
    public Jornadas() {
        a= new ArrayList (); 
        
    }
    
      public void add(Partidos p) {
       
        a.add(p);
    }
    
    public void numeroAlmacenados(){
        System.out.println(a.size());
    } 
    
    public void mostrarJornada(){
        for (Partidos partidos : a) {
            System.out.println(partidos.toString());
        }
    }
    
    public void eliminarPartidos(){
        Iterator t= a.iterator();
       
        
       while(t.hasNext()){
           Partidos aux= (Partidos) t.next();
           if(aux.getGolesloc()==aux.getGolesvis()){
           t.remove();
       }
           
       }
           
    }
}
