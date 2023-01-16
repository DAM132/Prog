/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Vectores {
    private int [] num;
    

    public  Vectores() {
        num = new int[5]; // preguntar a nuria
        for (int i = 0; i < 5; i++) {
            Scanner in= new Scanner(System.in);
            System.out.println("Dime el num asignado a la pos" +(i+1));
            num[i]=in.nextInt();
           
        }
    }
    
    
    
 public int Menor(){
     int aux=Integer.MAX_VALUE;
     for (int i = 0; i < num.length; i++) {
         if(num[i]<aux){
             aux=num[i];
         }
         
     }
    
     return aux;
 }
 
 public int Mayor(){
    int aux=Integer.MIN_VALUE;
     for (int i = 0; i < num.length; i++) {
         if(num[i]>aux){
             aux=num[i];
         }
         
     }
    
     return aux;
  
 }
 
 public int Media(){
     int aux=0;
     for (int i = 0; i < num.length; i++) {
         aux+=num[i];
         
     }
     return aux/num.length;
 }
  
    
}
