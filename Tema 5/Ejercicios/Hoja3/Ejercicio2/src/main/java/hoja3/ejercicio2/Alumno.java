/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Alumno extends Persona {
    private int [] notas;

    public Alumno(int n) {
          super();       
          notas= new int [n];
        Scanner in= new Scanner(System.in);
        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Dime la nota");
            notas[i]=in.nextInt();
        }

      
        
        
    }

   @Override

    public String mostrar() {
        return super.mostrar() +"Dni" +super.getDni()+ "Alumno{" + "notas=" + Arrays.stream(notas).sum()/notas.length + '}';
    } 


 
    
    
   
}
