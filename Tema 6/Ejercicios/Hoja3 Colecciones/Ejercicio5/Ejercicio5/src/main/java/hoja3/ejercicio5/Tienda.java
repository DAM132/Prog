/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Ginés
 */
public class Tienda  {
    
private LinkedHashSet <Publicacion>publi;  

    public Tienda() {
        publi= new LinkedHashSet();
    }
    
    
    public boolean insertarPublicacion(Publicacion i){
        
    return publi.add(i);
        
    }
    
    public void borrarPublicacion(String autor,String titulo){
        Iterator <Publicacion> i= publi.iterator();
        while (i.hasNext()) {
               Publicacion aux=i.next();
               if(aux.getAutor().equals(autor)&&aux.getTitulo().equals(titulo)){
                   i.remove();
               }
            
        }
    }
    
    
   public String mostrar(){
       String aux="";
       for (Publicacion publicacion : publi) {
           aux+=publicacion.toString()+"\n";
       }
    return aux;
   } 
   
   public Disco mayor(){
      Disco mayor= null;
       int duracion= Integer.MIN_VALUE;
       
        for (Publicacion publicacion : publi) {
            if(publicacion instanceof Disco disco){
                if(disco.getDuracionMinutos()>duracion){
                    mayor=disco;
                    duracion=disco.getDuracionMinutos();
                }
            }
           
       }
    return mayor;
            
        }
   
   
   public List<Libro> novedades(){
       List <Libro> novedadesLibros= new ArrayList();
       
       for (Publicacion publicacion : publi)  {
           if(publicacion instanceof Libro libro){
               if(libro.getNumPag()>400 && libro.getFecha().getMonthValue()== LocalDate.now().getMonthValue() && libro.getFecha().getYear()== LocalDate.now().getYear())
                   novedadesLibros.add(libro);
       }
           
       }
    return novedadesLibros;
       
   }
       
       
  
   
}
