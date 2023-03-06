/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.time.LocalDate;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Ginés
 */
public class Persona {
    private String nombre;
    private LocalDate fnac;
    private String dni;

    public Persona() {
       Scanner in= new Scanner(System.in);

          boolean auxnombre = false;
          boolean auxdni = false;
          boolean auxfnac = false;
          
        // esto comprueba el nombre
       
    while(auxnombre==false){
           

        System.out.println("Dime nombre");
        try {

            nombre = in.nextLine();
            if (Pattern.matches("[A-Z][a-zA-Z]*", nombre)) {
                auxnombre = true;
            } else {
                System.out.println("No cumple el formato");
            }

        } catch (InputMismatchException e) {
            System.out.println("Debe ser un texto");
        }

     
    }
    
    //esto comprueba el dni
    
    while(auxdni==false){
           

        System.out.println("Dime DNI");
        try {

            nombre = in.nextLine();
            if (Pattern.matches("[0-9]{7,8}[A-Za-z]", dni)) {
                auxdni = true;
            } else {
                System.out.println("No cumple el formato");
            }

        } catch (InputMismatchException e) {
            System.out.println("Debe ser un texto");
        }

     
    }
    
    
      while(auxfnac==false){
           

        System.out.println("Dime Fnac");
        try {

           
            if (Pattern.matches("[0-9]{7,8}[A-Za-z]", dni)) {
                auxdni = true;
            } else {
                System.out.println("No cumple el formato");
            }

        } catch (InputMismatchException e) {
            System.out.println("Debe ser un texto");
        }

     
    }
    }
    
    
    
    
}
