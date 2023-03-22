/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3colecciones.ejercicio2;

/**
 *
 * @author DAM103
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Almacen a=new Almacen();
        
        Articulo a1=new Articulo("C1","Patatas",10);
        Articulo a2=new Articulo("C2","Aceitunas",2);
        Articulo a3=new Articulo("C3","Donuts",3);
        Articulo a4=new Articulo("C4","Patatas",4);
        Articulo a5=new Articulo("C2","Patatas",10);
        Articulo a6=new Articulo("C3","Gominolas",1);
        
        a.añadir(a1);
        a.añadir(a2);
        a.añadir(a3);
        a.añadir(a4);
        a.añadir(a5);
        a.añadir(a6);
        
        a.buscar("C3");
        
        System.out.println("Pedidos con menos de 5");
        System.out.println(a.pedidos());
    }
}
