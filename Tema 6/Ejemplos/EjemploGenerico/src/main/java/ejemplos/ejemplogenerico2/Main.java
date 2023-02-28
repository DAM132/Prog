/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.ejemplogenerico2;

/**
 *
 * @author Nuria
 */
public class Main {
    public static void main(String[] args){
        Contenedor<Integer> c=new Contenedor<>();
        c.guardar(5);
        /*Intento guardar un tipo de dato que no es Integer*/
        //c.guardar(4.4);  //error de compilación
        Integer i=c.extraer();
        System.out.println(i);
        
        Contenedor<Double> d=new Contenedor<>();
        d.guardar(4.4);
        Double aux=d.extraer();
        System.out.println(aux);
        
        Contenedor<Persona> p=new Contenedor<>();
        Persona p1=new Persona("123","Nuria","Celis");
        p.guardar(p1);
        Persona p2=p.extraer();
        System.out.println(p2.toString());
        
        
        /*Ahora usamos Contenedor sin especificar el tipo*/
        /*Funciona como si fuera un genérico con object, en tiempo de compilación nos deja 
        meter de todo en el contenedor. Si hay error, solo saldrá en tiempo de ejecución*/
        Contenedor c2=new Contenedor();
        c2.guardar(4);
        c2.guardar("roca");
        Double num=(Double)c2.extraer();
    }
}
