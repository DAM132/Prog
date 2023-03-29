/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package teclado.claseteclado;

import static java.awt.PageAttributes.MediaType.B;
import static java.lang.System.in;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ginés
 */
public class ClaseTeclado {

    public static void main(String[] args) {
        System.out.println(dnivalidator("test"));

    }

    public static LocalDate Esfecha(){
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
        
            
    

    
    
    public static String EsTexto(String t){
       boolean aux = false;
        String i = "";
       
    while(aux==false){
           
     
        Scanner in= new Scanner(System.in);
        System.out.println(t);
        try{  
            
     i= in.nextLine();
     aux=true;
        }catch(InputMismatchException e){
            System.out.println("Debe ser un texto");
        }
        }
        return i;
            
    }
    
    
    public static boolean EsBoolean(String m) {
           char c = ' ';
           
        boolean aux = false;
        boolean aux1= false;
     Scanner in= new Scanner(System.in);   
    while(!aux1){
         
        
        System.out.println(m);
      try{
          
              c=in.next().charAt(0);
       
       
        
        if(c=='s'|| c=='S'){
              aux=true;
        aux1=true;
        }

          
        
        else if(c=='n'|| c=='N'){
               aux=false;
                aux1=true;
        }
            
         
       
            
        else {
                 throw new Exception("test");
        }
        
      }
      catch(Exception e){
          System.out.println(e.getMessage());
      }
       
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
    
    
    public String Dni(String m){
         String dniIntroducido = null;
        Scanner in = new Scanner(System.in);
        Pattern patron = Pattern.compile("[0-9]{7}");
        System.out.print("Introduce un DNI correcto: ");
        dniIntroducido = in.nextLine();
        System.out.println("Dime la Letra");
        String dniletra=in.nextLine();
        Matcher mat = patron.matcher(dniIntroducido);
        while(!mat.matches()){
           System.out.println("El DNI introducido es incorrecto, por favor introduzca un DNI válido.");
           System.out.print("Introduce un DNI correcto: ");
           dniIntroducido = in.nextLine();
           mat = patron.matcher(dniIntroducido);
        }
        System.out.println("El DNI " + dniIntroducido + " es válido.");
        return dniIntroducido;
    }
    
    
        private final String dniChars="TRWAGMYFPDXBNJZSQVHLCKE";   
        
 private static boolean validarDNI(String itDNI) {
            String intPartDNI = itDNI.trim().replaceAll(" ", "").substring(0, 7);
            char ltrDNI = itDNI.charAt(8);
            int valNumDni = Integer.parseInt(intPartDNI) % 23;
            if (itDNI.length()!= 9 && isNumeric(intPartDNI) == false && dniChars.charAt(valNumDni)!= ltrDNI) {
                return false;
            } else {
                return true;
            }
    }
 
 

  
  public static String dnivalidator(String m){
      
      String dni;
      Scanner in= new Scanner(System.in);
      System.out.println("Dime un dni");
      dni=in.nextLine();
      while(!(Arrays.binarySearch(INVALIDOS, dni) < 0 // (1)
	    && REGEXP.matcher(dni).matches() // (2)
        && dni.charAt(8) == DIGITO_CONTROL.charAt(Integer.parseInt(dni.substring(0, 8)) % 23))){
          System.out.println("Dime un dni valido");
           dni=in.nextLine();
      }
        return dni;
      
  }
  
  public static boolean validarDNI3(String dni) {
     
    return Arrays.binarySearch(INVALIDOS, dni) < 0 // (1)
	    && REGEXP.matcher(dni).matches() // (2)
        && dni.charAt(8) == DIGITO_CONTROL.charAt(Integer.parseInt(dni.substring(0, 8)) % 23); // (3)
  }


 private static final Pattern REGEXP = Pattern.compile("[0-9]{8}[A-Z]");
  private static final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
  //los fija ministerio interior como no validos
  private static final  String[] INVALIDOS = new String[] { "00000000T", "00000001R", "99999999R" };

  public static String tecladoDni(String m){
      
      String dni;
      Scanner in= new Scanner(System.in);
      System.out.println("Dime un dni");
      dni=in.nextLine().toUpperCase();
      while(!(Arrays.binarySearch(INVALIDOS, dni) < 0 // (1)
	    && REGEXP.matcher(dni).matches() // (2)
        && dni.charAt(8) == DIGITO_CONTROL.charAt(Integer.parseInt(dni.substring(0, 8)) % 23))){
          System.out.println("Dime un dni valido");
           dni=in.nextLine();
      }
        return dni;
      
  }     

    
    
} 



