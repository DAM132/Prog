/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Ginés
 */
public class validaDatos {
    
      public  LocalDate Esfecha(){
       LocalDate fecha = null;
       int dia, mes,anno;
        boolean aux = false;
       while(!aux){
           
   
       try{

           dia=esEntero("Dime un día");
      
           mes=esEntero("Dime un mes");
           
           anno=esEntero("Dime un año");
           
           fecha=LocalDate.of(anno, mes, dia);
           aux=true;
       }catch(DateTimeException e){
           System.out.println("Debe ser una fecha!");
       }
           }
        
        return fecha;
        
    }
    
    public static int esEntero(String mensaje){
      
        boolean aux = false;
        int i = 0;
       
    
           
     
        Scanner in= new Scanner(System.in);
        
             while (!aux) {
            try {
                System.out.println(mensaje);
                i = in.nextInt();
                aux = true;
               
            } catch (InputMismatchException e) {
                System.out.println("Debe ser un numero");
                 in.next();
            }

        }
 
     
        
        return i;
           }
        
            
    

    
    
    public static String EsTexto(){
       boolean aux = false;
        String i = "";
       
    while(aux==false){
           
     
        Scanner in= new Scanner(System.in);
        System.out.println("Dime texto");
        try{  
            
     i= in.nextLine();
     aux=true;
        }catch(InputMismatchException e){
            System.out.println("Debe ser un texto");
        }
        }
        return i;
            
    }
    
    
    public static boolean EsBoolean(){
           char i = 'f';
        boolean aux = false;
     Scanner in= new Scanner(System.in);   
    while(aux==false){
           
        System.out.println("Dime un char");
       String input = in.next();
        if (input.length() > 1) {
            throw new IllegalArgumentException("Please enter single character.");
        }
        char choice = input.charAt(0);
        
        if(choice=='s')
            aux=true;
        else
            aux=false;
        
            
    }
       
        return aux;
    }
    
    public static double Esdecimal(){
           boolean aux = false;
        double i = 0;
       
    while(aux==false){
           
     
        Scanner in= new Scanner(System.in);
        System.out.println("Dime el numero decimal");
        try{  
            
     i= in.nextDouble();
     aux=true;
        }catch(InputMismatchException e){
            System.out.println("Debe ser un decumal");
        }
        }
        return i;
        
        
    }
    
    public  String esNombre(String texto){
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
    
    

   static final Pattern REGEXP = Pattern.compile("[0-9]{8}[A-Z]");
  private  final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
  private  final String[] INVALIDOS = new String[] { "00000000T", "00000001R", "99999999R" };

  public  boolean validarDNI(String dni) {
    return Arrays.binarySearch(INVALIDOS, dni) < 0 // (1)
	    && REGEXP.matcher(dni).matches() // (2)
        && dni.charAt(8) == DIGITO_CONTROL.charAt(Integer.parseInt(dni.substring(0, 8)) % 23); // (3)
    }
  




    
}
