/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nuria
 */
public class EjemploList {

    public static void main(String[] args) {
        // defino una lista de cadenas de texto como contenedor ArrayList
        List<String> lista=new ArrayList<>();
        // los elementos llevan un indice
        lista.add(0,"Hola");
        lista.add(0,"Adios");
        //inserto el objeto en la posición cero, es decir, el primer elemento
        lista.add(0,"que pasa");
        
        // recorro la lista puedo utilizar for each e iterator
        
        for(Object objeto:lista){
            String palabra=(String)objeto;
            System.out.println(palabra);
        }
        // otra forma como nuestro List utiliza genérico String puedo utilizar directamente
        //String en vez de Object
        for(String palabra:lista){
            System.out.println(palabra);
        }
        
        // además me permite borrar por indice del elemento
        String elementoBorrado=lista.remove(0);
        System.out.println("elemento borrado "+elementoBorrado);
        //además me permite buscar por indice del elemento
        String elementoBuscado=lista.get(0);
        System.out.println("elemento buscado "+elementoBuscado);
        // además me devuelve la posicion de un elemento a buscar
        int posicion=lista.indexOf("Hola");
        if (posicion!=-1)
            System.out.println("existe el elemento Hola y esta en la posicion "+ posicion);
        int posicion1=lista.indexOf("prueba");
        if (posicion1==-1)
            System.out.println("el elemento no existe y devuelve -1");
    }
}
