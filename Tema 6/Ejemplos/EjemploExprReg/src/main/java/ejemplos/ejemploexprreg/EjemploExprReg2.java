/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.ejemploexprreg;

import java.util.regex.Pattern;

/**
 *
 * @author Nuria
 */
public class EjemploExprReg2 {
     public static void main(String[] args){
        String nombre;
        nombre="Programacion";
        if(nombre.matches("[A-Z][a-zA-Z]*")){
            System.out.println("Nombre correcto");
        }else{
            System.out.println("No cumple el formato.");
        }
        
        if(Pattern.matches("[A-Z][a-zA-Z]*", nombre)){
            System.out.println("Nombre correcto");
        }else{
            System.out.println("No cumple el formato");
        }
    }
}
