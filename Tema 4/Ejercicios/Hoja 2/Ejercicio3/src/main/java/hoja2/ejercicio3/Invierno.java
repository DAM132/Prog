/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Invierno {
    private double [] temp;

    public Invierno(int n) {
        Scanner in= new Scanner(System.in);
        temp = new double[n];
        for (int i = 0; i < n; i++) {
          

        System.out.println("Dime las temperaturas");
        temp[i]=in.nextDouble();
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
public double tempMedia(){
    double aux=0;
    for (int i = 0; i < temp.length; i++) {
        aux+=temp[i];
        
    }
    
   
        
    return aux/temp.length;
}

double
}
