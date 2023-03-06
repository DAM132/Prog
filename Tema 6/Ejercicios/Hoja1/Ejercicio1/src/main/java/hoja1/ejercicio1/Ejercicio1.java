/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
//        System.out.println("Trabajo con un contenedor de enteros");
//Contenedor<Integer> contenedor= new Contenedor<>(new Integer[0]);
//
//        for (int i = 0; i < 10; i++) {
//            
//            contenedor.insertarAlFinal((int)(Math.random()*20));
//            
//        }
//        
//        System.out.println("Sin ordenar" + contenedor.toString());
//        
//        contenedor.ordenar();
//        
//        System.out.println("Contenedor ordenado" +contenedor.toString());
//        
//        Integer i= contenedor.extraerDelPrincipio();
//        
//        System.out.println("Elemento extraido al principio" +i);
//        
//        System.out.println("Despues de extraer: " +contenedor.toString());
//        
//        contenedor.insertarAlPrincipio(100);
//        
//        System.out.println("Despues de insertar el 100 " +contenedor.toString());

        
        /*
        Segunda parte creamos array de personas 
        */
        System.out.println("Trabajo con contenedor de personas");
        Contenedor<Persona> c2= new Contenedor<>(new Persona[0]);
        for (int j = 0; j < 10; j++) {
            int aux=(int) (Math.random()*20);
            Persona p = new Persona("dni"+aux,"nombre"+aux,"apellido"+aux);
            c2.insertarAlFinal(p);
            
        }
        
         System.out.println("Sin ordenar" + c2.toString());
        
        c2.ordenar();
        
        System.out.println("Contenedor ordenado" +c2.toString());
        
        Persona p= c2.extraerDelPrincipio();
        
        System.out.println("Elemento extraido " +p.toString());
        
        System.out.println("Despues de extraer " + c2.toString());
        
        c2.insertarAlPrincipio(p);
        
        System.out.println("Despues de insertar " + c2.toString());

        }
}
