/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplocollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Nuria
 */
public class EjemploCollection {

    public static void main(String[] args) {
        // del interface Collection  defino el contenedor ArrayList
        Collection <String> coleccion = new ArrayList<>();
        //añadimos elementos a la coleccion método add
        for (int i = 0; i < 10; i++) {
            coleccion.add(String.valueOf(i));
        }
        //imprimimos el tamaño de la colección método size
        System.out.println("Tamaño de la colección: " + coleccion.size());
        // verificamos si existe en la coleccion un elemento en concreto método contains
        if (coleccion.contains("4")) {
            System.out.println("El 4 existe en la lista");
        } else {
            System.out.println("El 4 no existe en la lista");
        }
        // recorremos la colección con for each
        System.out.println("Recorremos antes de borrar");
        for (Object aux : coleccion) {
            String contenido = (String) aux;
            System.out.println(contenido);
        }
        // otra manera de recorrer la colección con for each
        // realiza el cast en la propia sentencia del instanceof
        System.out.println("Otra forma de recorrer la colección");
        for (Object aux : coleccion) {
            if (aux instanceof String contenido) {
                System.out.println(contenido);
            }
        }

        for (String string : coleccion) {
            System.out.println(string);
        }
        //borramos un elemento de la colección  método remove
        if (coleccion.remove("4")) {
            System.out.println("Se elimino el 4");
        } else {
            System.out.println("No se elimino el 4");
        }
        // recorremos la colección con un Iterador
        // hasNext() nos indica si hay siguiente elemento
        // next() contiene el elemento
        System.out.println("Recorremos despues de borrar");
        Iterator it = coleccion.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
