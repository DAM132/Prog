/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplo1;

/**
 *
 * @author DAM103
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int dias=365;// int sirve para añadir una variable. Con el "=" se le puede asignar un valor. Si no se le asigna, su valor es 0.
        System.out.println(dias);
        int dias2;
        dias2=365;
        dias=366;
        System.out.println(dias);
        System.out.print("Hello World!");// "print" sin "ln" sirve para poner los systems siguientes en una misma línea
        System.out.println(dias2);//"println" sirve para imprimir una linea de separacion con la siguiente "expresión"
        System.out.println("Dias: "+dias);
        
        int semanas=35, años=23;
        
        System.out.println(semanas);
        
        int a=13, b=18;
        int c=a+b;
        System.out.println("c = "+c);
        
        int x;
        x=7;
        x=x*2;
        System.out.println("x="+x);        
              
    }
}
