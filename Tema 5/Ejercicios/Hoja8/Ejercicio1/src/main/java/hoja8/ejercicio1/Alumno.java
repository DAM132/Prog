/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Alumno {
    
    String nombre;
    int [] notas;
   

    public Alumno(int a) throws Exception {
        notas= new int [a];
        System.out.println("Dime un nombre");
        nombre= nombre();
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Dime la nota" +(i+1));
            notas[i]=esEntero();
        }
    }
    
    public static String nombre(){
        Scanner in= new Scanner(System.in);
        return in.nextLine();
        
    }
    
    
       public static int esEntero() throws Exception {
Scanner in= new Scanner(System.in);
        int  numEntero = 0;
        boolean aux = false;
        
        

        do {
            try {
                System.out.println("Dime un numero");
                numEntero = in.nextInt();
                
                if(numEntero>10||numEntero<0){
                    
                    throw new Exception("Numero entre 1 y 10 ");
                }
                
             
                aux = true;

            } catch (InputMismatchException exc) {
                System.out.println("Tiene que ser un numero entero champion =)");
                in.nextLine();

            }
               catch(Exception e){
                        System.out.println(e.getMessage());
                        }

        } while (!aux);

        return numEntero;

     }

    public String mostrar() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + Arrays.toString(notas) + '}';
    }
    
       
       
    

 
    
}

 