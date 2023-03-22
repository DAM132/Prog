/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Ginés
 */
public class Agenda {
    
    private TreeSet<Personas> agenda;

    public Agenda() {
        
        agenda=new TreeSet();
    }
    
    
    public boolean añadir(Personas add){
        
        return agenda.add(add);
        
    }
    
    public boolean borrarPersona(Personas aux){
        boolean salida=false;
        Iterator <Personas>it= agenda.iterator();
        
        while(it.hasNext()&&!salida){
            if(it.next().getDni().equalsIgnoreCase(aux.getDni()))
                it.remove();
            salida=true;
        }
        return salida;
    }
    
    
    public String mostrarAgenda(){
        String cadena="";
        
        for (Personas personas : agenda) {
            cadena+=personas.toString()+"\n";
        }
        return cadena;
        
    }
    
    public Personas buscar(String dni){
        Personas aux=null;
        
        for (Personas personas : agenda) {
            if(personas.getDni().equalsIgnoreCase(dni))
                aux=personas;
        }
        
        
        return aux;
        
    }
    
    
    public boolean modicarPersona(String vdni,String ndni){
        boolean salida=false;
        Iterator <Personas>it= agenda.iterator();
        
        while(it.hasNext()&&!salida){
            Personas aux= it.next();
            
            if(aux.getDni().equalsIgnoreCase(vdni))
                
           aux.setDni(ndni);
            salida=true;
        }
        return salida;
    }
    
}
