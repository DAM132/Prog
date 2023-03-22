/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja2colecciones.ejercicio4;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM103
 */
public class Teclado {

    public static int IntroEnteroEnUnRango(int x, int y) {
        int num = 0;
        boolean aux = false;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                System.out.println("Selecciona un rango entre "+x+" y "+y);
                num = teclado.nextInt();
                if (num < x || num > y) {
                    throw new Exception("Rango incorrecto. Entre " + x + " y " + y);
                }
                aux = true;
            } catch (InputMismatchException e) {
                System.out.println("Error en la introduccion del numero entero");
                teclado.next();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } while (!aux);
        return num;
    }

    public static int IntroEntero(String c) {
        
        int num = 0;
        boolean aux = false;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                System.out.println(c);
                num = teclado.nextInt();
                aux = true;
            } catch (InputMismatchException e) {
                System.out.println("Error en la introduccion del numero entero");
                teclado.next();
            }
        } while (!aux);

        return num;
    }

    public static String IntroString(String p) {
        Scanner teclado = new Scanner(System.in);
        String cadena="";
        boolean aux=false;
        do{
            try{
                System.out.println(p);
                cadena = teclado.nextLine();

                if(cadena.length()>2){
                    aux=true;
                }else{
                    throw new Exception("Error en la introduccion del nombre");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }while(!aux);
        return cadena;
    }
    
     public static String IntroStringSinNumeros(String p) {
        Scanner teclado = new Scanner(System.in);
        String cadena="";
        boolean aux=false;
        try{
            System.out.println(p);
            cadena = teclado.nextLine();
            if(cadena.matches("[A-Za-z]*")){
                if(cadena.length()>3){
                    aux=true;
                }
                }else{
                    throw new Exception("Error en la introduccion del nombre");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return cadena;
    }

    public static double IntroDouble(String c) {
        double num = 0.0;
        boolean aux = false;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                System.out.println(c);
                num = teclado.nextInt();
                aux = true;
            } catch (InputMismatchException e) {
                System.out.println("Error en la introduccion del numero entero");
                teclado.next();
            }
        } while (!aux);

        return num;
    }

    public static boolean IntroBoleano(String cadena) {
        Scanner teclado = new Scanner(System.in);
        boolean resultado = false;
        boolean aux=false;
        do {
            try {
                System.out.println(cadena);
                System.out.println("S/N: ");
                char c = teclado.nextLine().toUpperCase().charAt(0);
                
                    if (c=='S') {
                        resultado = true;
                        }
                    else if (c=='N'){
                        resultado = false;
                    }
                    else{
                        throw new Exception("Error en la introducción");
                    }
                    aux=true;
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
        } while (!aux);
        return resultado;
    }
    
    public static LocalDate IntroFecha(String c) {
        Scanner teclado = new Scanner(System.in);
        LocalDate fecha = null;
        boolean correcto = false;
        do {
            try {
                System.out.println(c);
                int dia = IntroEntero("Introduce el dia");
                int mes = IntroEntero("Introduce el mes");
                int anio = IntroEntero("Introduce el anio");
                fecha = LocalDate.of(anio, mes, dia);
                correcto = true;
            } catch (DateTimeException a) {
                System.out.println("Error en la introducion de la fecha");
                System.out.println("Error " + a.toString());
            }
        } while (!correcto);

        return fecha;

    }
    public static String IntroDNI(String c){
        Scanner teclado = new Scanner(System.in);
        boolean correcto=false;
        String DNI="";
        do {
            try {
                System.out.println(c);
                DNI=teclado.nextLine().toUpperCase();
                if(DNI.matches("[0-9]{8}[A-Z]")){
                    char letraDni=DNI.charAt(DNI.length()-1);
                    int nDni=Integer.parseInt(DNI.substring(0, DNI.length()-1));
                    int resul=nDni%23;
                    String cadena="TRWAGMYFPDXBNJZSQVHLCKE";
                    if(letraDni==cadena.charAt(resul)){
                        correcto = true;
                    }
                }else{
                    throw new Exception("Error en la introduccion del DNI");
                }
            } catch (Exception a) {
                System.out.println("Error " + a.toString());
                teclado.next();
            }
        } while (!correcto);
        return DNI;
    }
    public static LocalDateTime IntroFechaHora(String c) {
        Scanner teclado = new Scanner(System.in);
        LocalDateTime fecha = null;
        boolean correcto = false;
        do {
            try {
                System.out.println(c);
                int dia = IntroEntero("Introduce el dia");
                int mes = IntroEntero("Introduce el mes");
                int anio = IntroEntero("Introduce el anio");
                int hora= IntroEntero("Introduce la hora");
                int min= IntroEntero("Introduce los minutos");
                fecha= LocalDateTime.of(anio, mes, dia, hora, min);
                        
                correcto = true;
            } catch (DateTimeException a) {
                System.out.println("Error en la introducion de la fecha");
                System.out.println("Error " + a.toString());
            }
        } while (!correcto);

        return fecha;
    }
        public static String IntroMatricula(String c){
        Scanner teclado = new Scanner(System.in);
        boolean correcto=false;
        String matricula="";
        do {
            try {
                System.out.println(c);
                matricula=teclado.nextLine().toUpperCase();
                if(matricula.matches("[0-9]{4}[A-Z]{3}")){
                        correcto = true;
                    }
                else{
                    throw new Exception("Error en la introduccion del DNI");
                }
            } catch (Exception a) {
                System.out.println("Error " + a.toString());
                teclado.next();
            }
        }while(!correcto);
        
        return matricula;
    }
}
