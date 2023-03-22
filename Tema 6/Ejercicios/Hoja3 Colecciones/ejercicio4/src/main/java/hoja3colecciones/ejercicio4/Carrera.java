/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3colecciones.ejercicio4;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author DAM103
 */
public class Carrera {
    private Set<Atleta> atletas;

    public Carrera() {
        //no permite duplicados el linkedhashset
        this.atletas = new LinkedHashSet();
    }
    
    public void añadir(Atleta a){
        if(atletas.add(a)){
            System.out.println("articulo insertado");   
        }else{
            System.out.println("articulo no insertado");
        }
    }
    public double tiempoMedio(){
        double tiempo=0;
        for (Atleta a : atletas) {
            tiempo+=a.getTiempo();
        }
        return tiempo/atletas.size();
    }
    public void darLaVuelta(){
        //una linkedlist es una pila 
        LinkedList<Atleta> pila=new LinkedList<>();
        pila.addAll(atletas);
        atletas.clear();
        while(!pila.isEmpty()){
            atletas.add(pila.pollLast());
            
           //segunda forma
           Collections.reverse(pila);
        }
    }
    
    public String mostrar(){
        String cadena="";
        for (Atleta atleta : atletas) {
            cadena+=atleta.toString()+"\n";
        }
        return cadena;
    }
}
