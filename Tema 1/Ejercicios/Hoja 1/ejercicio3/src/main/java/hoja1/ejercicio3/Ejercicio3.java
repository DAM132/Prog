/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio3;

/**
 *
 * @author DAM103
 */
public class Ejercicio3 {

/*
operadoresaritmeticos.java
Programa que muestra el uso de los operadores aritméticos
*/
   
   public static void main(String[] args) {
// Hay que añadir el void antes del main y es necesaria abrir la llave del main, no tiene la llave.       
short x = 7;
int y = 5;
float f1 = 13.5f; //falta una "f" en el final del número.
float f2 = 8f;
System.out.println("El valor de x es "+x +" y el valor de y es "+y); /* para hacer que el programa escriba las variables, en este caso, 
habria que sustituir las "," por "+". */
System.out.println("El resultado de x + y es " + (x + y));//falta el ";" al final de linea
System.out.println("El resultado de x - y es " + (x - y));
System.out.printf("\n%s%s%d\n","División entera:","x / y = ",(x/y)); //faltaba añadir el comodin de los numeros enteros %d
System.out.println("Resto de la división entera: x % y = " + (x % y));
System.out.printf("El valor de f1 es %f y el de f2 es %f\n",f1,f2);
System.out.println("El resultado de f1 / f2 es " + (f1 / f2));//falta el ";" al final


    }
}
