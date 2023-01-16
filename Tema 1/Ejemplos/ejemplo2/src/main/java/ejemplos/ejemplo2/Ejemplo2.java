/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplo2;

/**
 *
 * @author DAM103
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        
    int i=12;
    byte b=(byte) i; //castear los datos hace que no de el error al transformar los datos. Debido a que entra en los valores, no se pierde información
    
    System.out.println(b);
    
    i=1200;
    b=(byte)i;
    System.out.println(b); //al imprimir la b, se pierde valor puesto que el valor no entra en una variable de tipo byte.
    
    b=33;
    i=b; //debido a que entra en el rango de int, no es necesario castearlo de ninguna forma ya que byte es más pequeña que int.
    
    double x=2.5;
    int a=(int)7.5; //cuando hay un double y lo convertimos en entero, le quita el decimal
    System.out.println(a);
    int s = 9;
    double y = x; //correcto, no hay problema al cambiar puesto que double tambien guarda enteros
    
    byte n1=100, n2=100, n3;
    //n3= n1 * n2 /100; //error debido a que se el resultado de la multiplicacion excede el numero de rango del byte
    
    n3 = (byte) (n1 * n2 / 100); // al ya saber que el resultado entra en el rango, se puede castear y no generará ningun error.
    
    int f=5, q=2;
    f=f%q; //el "%" sirve para que devuelva el resto de la operación
    System.out.println(f);
      
    }
}
