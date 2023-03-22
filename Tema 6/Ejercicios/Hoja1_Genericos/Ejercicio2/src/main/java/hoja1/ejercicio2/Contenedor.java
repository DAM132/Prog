/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

import java.util.Arrays;

/**
 *
 * @author Ginés
 * @param <T>
 */
public class Contenedor<T> implements Pila<T> {
    
     private T objeto []; //se inicializa a null, contenedor vacio
     
        public Contenedor(T[] objetos) {
       
        this.objeto=objetos;
       
    }
        
        


    @Override
    public void Apilar(T nuevo) {
    objeto= Arrays.copyOf(objeto,objeto.length+1);
 
// desplazamos una posicion
System.arraycopy(objeto, 0, objeto, 1, objeto.length-1);
//guardamos el objeto en la pos 0

objeto[0]=nuevo;
    }

    @Override
    public T Desapilar() {
        T aux = null;
       if(objeto.length>0){
          aux=objeto[0];
       //el -1 lo hace por defecto
       //conclusion: copia el array desde la posicion 1 y le quita un elemento al final como los substring
    
       objeto= Arrays.copyOfRange(objeto, 1, objeto.length);
       
       }
       
       
        return aux;
     
      
        
      

    }
          

   
}
