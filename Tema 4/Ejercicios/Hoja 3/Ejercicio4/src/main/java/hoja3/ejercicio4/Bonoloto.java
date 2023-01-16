/*;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio4;

import java.util.Random;

/**
 *
 * @author Ginés
 */
public class Bonoloto {
    private int [] numale= new int [6];

    public Bonoloto() {
        Random r= new Random();
       
        for (int i = 0; i < numale.length; i++) {
            int aux;
            aux=r.nextInt(49)+1;
            numale[i]=aux;
            
           while(numale[i]==aux){
               for (int j = 0; j < numale.length; j++) {
            aux=r.nextInt(49)+1;
                  numale[i]=aux; 
                   
               }
           }
            
        }
    }
    public String mostrar(){
          String cadena="";
        for (int i = 0; i < numale.length; i++) {
          
            
            cadena+=numale[i]+" ";
            
        }
        return cadena;
        
    }
   
    
}
