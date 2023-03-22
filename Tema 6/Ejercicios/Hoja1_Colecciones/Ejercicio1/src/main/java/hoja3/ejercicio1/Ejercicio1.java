/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
         List<Double> lista=leeValores();
         
        double suma= calcularSuma(lista);
        
        mostrarResultados(lista,suma,suma/lista.size());
         
    }
    
    public static List<Double> leeValores(){
        Scanner in= new Scanner(System.in);
        List<Double> lista= new ArrayList<>();
        double valor;
        System.out.println("Dime el valor");
        valor=in.nextInt();
        while(valor!=99){
             lista.add(0,valor);
            System.out.println("Dime el valor");
            valor=in.nextInt();
           
    
        }
        return lista;
    }
    
    public static double calcularSuma(List lista){
        double aux = 0;
        
        Iterator <Double> iterator=lista.iterator();
      
        while (iterator.hasNext()) {
            aux += iterator.next();
}
        
        return aux;
        
    }
    
    public static void mostrarResultados(List<Double> lista, double suma, double media){
        for (Double numericos : lista) {
            System.out.println(numericos);
        }
        
        System.out.println("La suma es " + suma);
        
        System.out.println("La media es " +media);
  
    }
}
