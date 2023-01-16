/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Triatlon {
    private int dorsal;
    private String nombre;
    private int [] punt;

    public Triatlon(int dorsal, String nombre, int i) {
        Scanner in=new Scanner(System.in);
        punt = new int [i];
        this.dorsal = dorsal;
        this.nombre = nombre;
        for (int j = 0; j < punt.length; j++) {
            
            System.out.println("Dime las puntaciones");
            punt[j]=in.nextInt();
            
        }
    }

    public Triatlon() {
       Scanner in= new Scanner(System.in);
        System.out.println("¿Cual es el dorsal?");
        dorsal=in.nextInt();
        System.out.println("¿Cual es el nombre?");
        nombre=in.next();
        System.out.println("Numero de pruebas?");
        punt= new int[in.nextInt()];
        
        for (int i = 0; i < punt.length; i++) {
            System.out.println("Dime las puntuaciones");
            punt[i]=in.nextInt();
 
        }
    }
    
    public int pMedia(){
        int aux = 0;
        
        for (int numeros:punt) {
            aux+=numeros;
        }
        
        return aux/punt.length;
    }
    
    public boolean esSeleccionado(){
        boolean aux=false;
        
        for (int i = 0; i < punt.length&&!aux; i++) {
            if(punt[i]>10)
            aux=true;
        }
        return aux;
    }
    
    public String mostrar(){
      String aux = "Dorsal= " + dorsal +"nombre= " + nombre;
      aux=aux+"puntos: ";
        for (int i : punt) {
            aux+=i+", ";
        } 
         aux=aux.substring(0, aux.length()-2);
        aux+="media=" + pMedia();
       
        
        return  aux;
        
    

}
    
}

