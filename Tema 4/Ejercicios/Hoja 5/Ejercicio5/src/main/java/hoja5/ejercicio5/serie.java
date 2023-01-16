/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class serie {
    private double [] array;
    private char signo;

    public serie(char signo) {
        this.signo = signo;
        Scanner in= new Scanner(System.in);
        System.out.println("Dime el nº de elementos");
        int num= in.nextInt();
        array=new double[num];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime el valor a asignar en la posicion" +(i+1)+ "");
            array[i]=in.nextDouble();
        }
    }
    
    public double resultado(){
        double aux=0;
        if(signo=='+')
        for (int i = 0; i < array.length; i++) {
            aux+=array[i];
        }
        
        else if(signo=='*'){
            aux=1;
        
            
            for (int i = 0; i < array.length; i++) {
                aux*=array[i];
                
            }
        }
        else
            System.out.println("Te has equivocado");
        return aux;
        
    }
    
}
