/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplogenerico;

/**
 *
 * @author Nuria
 */
public class EjemploGenerico {

    public static void main(String[] args) {
       /*Ejemplo de utilizar genéricos con Object*/
       Persona p1=new Persona("123","Nuria","Celis");
       Persona p2=new Persona("345","Pepe","Garcia");
       System.out.println(p1.compareTo(p2));
       /*El error al comparar p1 con p3 se produce en tiempo de ejecucion*/
       Object p3=new Object();
       System.out.println(p1.compareTo(p3));
       
       PersonaGenerica p4=new PersonaGenerica("786","Maria","Gomez");
       /*El error de comparar p4 con p3 se produce en tiempo de compilacion*/
       /*De hecho, la instrucción da error*/ 
       //System.out.println(p4.compareTo(p3));
    }
}
