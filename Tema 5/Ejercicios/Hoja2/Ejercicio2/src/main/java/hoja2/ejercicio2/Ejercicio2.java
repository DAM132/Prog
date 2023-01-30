/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author Ginés
 */
public class Ejercicio2 {

    public static void main(String[] args) {
Articulo [] a= new Articulo[10];

       
        for (int i = 0; i < 5; i++) {
            a[i]= new Perecedero(1, 2018+i, i, i+100, "descripcion"+i);
        }
        
        
        for (int i = 5; i < a.length; i++) {
            a[i]=new EnPromocion(1, i, i+100, "descripcion"+i);
        }
        
        
        System.out.println("En promoción");
        for (int i = 0; i < a.length; i++) {
            if(a[i] instanceof EnPromocion){
                System.out.println(a[i].toString());
            }
                
            
        }
        System.out.println("Perecedero");
           for (int i = 0; i < a.length; i++) {
            if(a[i] instanceof Perecedero){
                System.out.println(a[i].toString());
            }
                
            
        }
           System.out.println("Caducidad");
           LocalDate fhoy= LocalDate.now();
           for (int i = 0; i < a.length; i++) {
                if(a[i] instanceof Perecedero){
                       Perecedero pereAux = (Perecedero) a[i];
                  if(pereAux.getAno()<fhoy.getYear()){
                      System.out.println("Producto caducado el año pasado " +pereAux.toString());
                    
                }
                  else if(pereAux.getMes()<=fhoy.getMonthValue() && pereAux.getAno() == fhoy.getYear()){
                      System.out.println("Producto caducado de este año" +pereAux.toString());
                  }
                }
                
            
        }
           
           
           System.out.println("Mayor descuento");
          
                
            
        
           
          int pos=-1;
           for (int i = 0; i < a.length; i++) {
                if(a[i] instanceof EnPromocion){
                    int aux=Integer.MIN_VALUE;
                       EnPromocion promoaux = (EnPromocion) a[i];
                  if(promoaux.getDes()>aux){
                      aux=promoaux.getDes();
                      pos=i;
                  }
                  
                  
                }
               
            
        }
         
     System.out.println(a[pos].toString());   
    }
}
