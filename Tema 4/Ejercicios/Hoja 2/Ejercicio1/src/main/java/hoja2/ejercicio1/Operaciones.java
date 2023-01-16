/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Operaciones {
    private int [] num;
   

    public Operaciones() {
         num = new int [5];
        Scanner in= new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
             System.out.println("Dime un numero posicion" +i);
             num[i]=in.nextInt();
        }
       
    }
    
    public void Mult(){
        int aux;
        for (int i = 0; i < num.length; i++) {
            aux=num[i]*2;
            num[i]=aux;
  
        }
    }
    
    public void Mostrar(){
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            
        }
    }
   
    public int Suma(){
        int suma = 0;
        for (int i = 0; i < num.length; i++) {
            if(i%2!=0){
                suma=+num[i];
            }
        }
        return suma;
    }
    
}
