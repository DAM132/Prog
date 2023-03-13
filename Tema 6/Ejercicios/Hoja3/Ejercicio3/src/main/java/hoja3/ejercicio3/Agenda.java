/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Ginés
 */
public class Agenda {
private ArrayList<Personas> agenda;
    
    
    public Agenda() {
        agenda= new ArrayList();
    }
    
    
    public void addPersona (Personas persona){
        if(agenda.add(persona))
            System.out.println("Insertado correctamente");
        else
            System.out.println("No ha sido posible insertar la persona en la agenda");
    }
    
    public void borrarPersona(String dni){
        
        
       Iterator iterator = agenda.iterator();
       boolean encontrado=false;
       
       while(iterator.hasNext() && !encontrado){
           Personas aux= (Personas) iterator.next();
           if(aux.getDni().compareTo(dni)==0){
               iterator.remove();
               System.out.println("Persona eliminada");
               encontrado=true;
           }
       }
       if(!encontrado){
           System.out.println("La persona no se ha encontrado con este dni");
       }
    }
    
    public void mostrarAgenda(){
        if(agenda.isEmpty())
            System.out.println("No hay personas en la agenda");
        else{
            Collections.sort(agenda);
        
        for (Personas personas : agenda) {
            System.out.println(personas);
            }
        }
    }
    
    
    public void buscarAgenda(String dni){
           Iterator iterator = agenda.iterator();
       boolean encontrado=false;
       
       while(iterator.hasNext() && !encontrado){
           Personas aux= (Personas) iterator.next();
           if(aux.getDni().compareTo(dni)==0){
              
               System.out.println(aux.toString());
               encontrado=true;
           }
       }
       if(!encontrado){
           System.out.println("La persona no se ha encontrado con este dni");
       }
    }
   
     public void modificarAgenda(Personas p){
           Iterator iterator = agenda.iterator();
       boolean encontrado=false;
       
       while(iterator.hasNext() && !encontrado){
           Personas aux= (Personas) iterator.next();
           if(aux.equals(p)){
               p.setNombre(claseTeclado.esNombre("Dime un nombre"));
               
           }
       }
       if(!encontrado){
           System.out.println("La persona no se ha encontrado con este dni");
       }
    }
    
    
    
}
