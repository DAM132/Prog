/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio3;

import java.util.Arrays;

/**
 *
 * @author Ginés
 */
public class Agenda {
    protected int contador;
    protected  Contacto [] c;

    public Agenda(int n) {
        c= new Contacto[n];
        contador=0;
         
    }
    
    public void insertar(Contacto d){
       if(contador>c.length){
           c[contador]=d;
       }
       contador++;
    }
    
    public Contacto[] buscar(String n){
           int nEncontrados=0;
        Contacto[] devuelve;
      
        for (int i = 0; i < contador; i++) {
            if (c[i].getNombre().equalsIgnoreCase(n)){
                nEncontrados++;
            }
        }
        devuelve = new Contacto[nEncontrados];
        int j=0;
        for (int i = 0; i < contador; i++) {
            if(c[i].getNombre().equalsIgnoreCase(n)){
               devuelve[j]=c[i];
               j++;
             
            }
           
          
        }
        return devuelve;
        
     
    }
    
     public Contacto[] buscar(Contacto n){
           int nEncontrados=0;
        Contacto[] devuelve;
      
        for (int i = 0; i < contador; i++) {
            if (c[i].equals(n)){
                nEncontrados++;
            }
        }
        devuelve = new Contacto[nEncontrados];
        int j=0;
        for (int i = 0; i < contador; i++) {
            if(c[i].equals(n)){
               devuelve[j]=c[i];
               j++;
             
            }
           
          
        }
        return devuelve;
        
     
    }
    
   public boolean  eliminar(String n){
       boolean aux=false;
       for (int i = 0; i < contador; i++) {
           
            if(c[i].getNombre().equalsIgnoreCase(n)){
                aux=true;
                
                for (int j = i; j < contador-1; j++) {
                    c[j]=c[j+1];
                    
                }
                contador--;
                i--;
                
            }
               
            
        }
        return aux;
   }

    @Override
    public String toString() {
        return "Agenda{" + "contador=" + contador + ", c=" + Arrays.toString(c) + '}';
    }
    
    public void ordenar(){
       Arrays.sort(c,0,contador);
       
    }
   
   
    
}
