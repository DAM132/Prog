/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Comunidad {
    private String ncomu;
    private String [] provi;

    public Comunidad(String ncomu, int numc) {
        Scanner in= new Scanner(System.in);
        this.ncomu = ncomu;
        provi= new String[numc];
        for (int i = 0; i < provi.length; i++) {
            System.out.println("Dime el nombre de la provincia");
            provi[i]=in.next();
        }
        
    }
    
    public void mostrar(){
        System.out.println(ncomu.toUpperCase());
        for (int i = provi.length-1; i >=0; i--) {
            if(provi[i].length()>3){
              System.out.println(provi[i].substring(0, 4));  
            }
            else{
                System.out.println(provi[i]);
            }
            
            
        }
    }
    public void Sorteo(){
        
        Random r= new Random(provi.length-1);
        int aleatorio=r.nextInt();
        System.out.println(aleatorio);
        System.out.println(provi[aleatorio]);
    }
    
    public int buscar(String aprovi){
        int aux = -1;
        for (int i = 0; i < provi.length-1&&aprovi.equalsIgnoreCase("aprovi")==false; i++) {
            
            if(aprovi.equalsIgnoreCase(provi[i])){
                aux=i+1;
            }
                
            
            }
        return aux;
            
        }
    
    
}
