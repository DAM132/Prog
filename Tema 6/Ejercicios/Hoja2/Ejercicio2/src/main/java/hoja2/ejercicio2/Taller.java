/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Ginés
 */
public class Taller {
    private LinkedList <FichaVehiculo> Enespera,reparados,finalizados;

    public Taller() {
        Enespera= new LinkedList<>();
        reparados= new LinkedList<>();
        finalizados= new LinkedList<>();
    }
    
    
    public void insertarVehiculo(FichaVehiculo v){
        v.setFentrada(LocalDateTime.now());
        Enespera.addLast(v);
            }
    
    public void repararVehiculo(String m){
        boolean aux=false;
       Iterator <FichaVehiculo> i= Enespera.iterator();
  
       while(i.hasNext()){
                FichaVehiculo f= i.next();
           if(f.getMatricula().equalsIgnoreCase(m)){
               f.setFreparacion(LocalDateTime.now());
               reparados.addLast(f);
               i.remove();
               System.out.println("Se ha movido correctamente ");
               aux=true;
              
           }
           
           
       }
       
       if(!aux){
           System.out.println("Coche no encontrado");
       }
        
    }
    
    
    public void darSalidaVehiculo(String m){
        boolean aux=false;
       Iterator <FichaVehiculo> i= reparados.iterator();
  
       while(i.hasNext()){
                FichaVehiculo f= i.next();
           if(f.getMatricula().equalsIgnoreCase(m)){
               f.setFsalida(LocalDateTime.now());
               finalizados.addLast(f);
               i.remove();
               System.out.println("Se ha movido correctamente ");
               aux=true;
              
           }
           
           
       }
       
       if(!aux){
           System.out.println("Coche no encontrado");
       }
        
    }
    
    public String mostrarEstado(){
        
        String cadena="En Espera";
        
        for (FichaVehiculo f : Enespera) {
            cadena+=f.toString();
        }
       
        cadena+= "\nEn Reparación ";
          for (FichaVehiculo f : reparados) {
            cadena+=f.toString();
        }
          cadena+= "\nFinalizados";
            for (FichaVehiculo f : finalizados) {
            cadena+=f.toString();
        }
        
        return cadena;
        
    }
    
}
