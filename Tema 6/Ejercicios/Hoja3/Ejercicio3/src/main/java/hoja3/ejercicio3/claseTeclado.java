/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Ginés
 */
public class claseTeclado {
    
    
     public static String esNombre(String texto){
      Scanner in= new Scanner(System.in);
        boolean auxnombre= false;
          String nombre = "";
        // esto comprueba el nombre
       
    while(!auxnombre){
           

            System.out.println(texto);
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
        
        return nombre;
    }

    private static final Pattern REGEXP = Pattern.compile("[0-9]{8}[A-Z]");

    private static final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
    //los fija ministerio interior como no validos
    private static final String[] INVALIDOS = new String[]{"00000000T", "00000001R", "99999999R"};

    public static String tecladoDni(String m) {

        String dni;
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un dni");
        dni = in.nextLine().toUpperCase();
        while (!(Arrays.binarySearch(INVALIDOS, dni) < 0 // (1)
	    && REGEXP.matcher(dni).matches() // (2)
        && dni.charAt(8) == DIGITO_CONTROL.charAt(Integer.parseInt(dni.substring(0, 8)) % 23))){
          System.out.println("Dime un dni valido");
           dni=in.nextLine();
      }
        return dni;
      
  }     

    
    
    
}
