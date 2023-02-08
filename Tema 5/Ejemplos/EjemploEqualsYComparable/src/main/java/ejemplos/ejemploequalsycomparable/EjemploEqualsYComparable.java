/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemploequalsycomparable;

/**
 *
 * @author Nuria
 */
public class EjemploEqualsYComparable {

    public static void main(String[] args) {
        /*Creamos cuatro personas
        Visualizamos el array
        Lo ordenamos por nombre
        Lo ordenamos por id
        Creamos otra persona y la buscamos.*/
        
        Persona p1=new Persona(3,"Nuria","Celis");
        Persona p2=new Persona(1,"Pepe","Garcia");
        Persona p3=new Persona(2,"Pepe","Alba");
        Persona p4=new Persona(4,"Maria","Salas");
        
        ListaPersona lista=new ListaPersona();
        
        System.out.println("Inserto datos");
        lista.insertar(p1);
        lista.insertar(p2);
        lista.insertar(p3);
        lista.insertar(p4);
        
        System.out.println("Visualizar");
        lista.mostrar();
        
        System.out.println("Ordeno");
        lista.ordenar();
        lista.mostrar();
        
        //Ejemplo del equals
        Persona p5=new Persona(1,"Pepe","Garcia");
        System.out.println("Busque a Pepe Garcia");
        lista.buscar(p5);
    }
}
