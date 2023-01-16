/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Alumno {
    
    private String nombre;
    private int [] notas;

    public Alumno() {
        Scanner in= new Scanner(System.in);
      notas= new int[5];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Dime la nota nº" +(i+1));
            notas[i]=in.nextInt();
        }
        
    }
    
    public int menor(){
        Arrays.sort(notas);
        return notas[0];
        
    }
    
   public int mayor(){
       Arrays.sort(notas);
        return notas[notas.length-1];
   } 
   
   public void ponerACero(){
       Arrays.fill(notas, 0);
   }
    

  public int buscar(int nota){
           
                 Arrays.sort(notas);

        return Arrays.binarySearch(notas, nota);
      }
  
  public int[] tresMejores(){
             Arrays.sort(notas);

        return Arrays.copyOfRange(notas, 2,5);
      
  }
  
  
  } 


    

