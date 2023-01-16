/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplo3;

/**
 *
 * @author DAM103
 */
public class Ejemplo3 {

    public static void main(String[] args) {
       //1. Definir una variable para guardar la edad y mostrar la que tendrá el próximo año.
        int edad=25;
       
       edad=edad+1;//guarda el resultado en la misma variable
       System.out.println(edad);
       
       //2.
       int anioActual=2022, anioNacimiento;
       anioNacimiento=1996;
       edad=anioActual-anioNacimiento;
       System.out.println(edad);
       
      //3. Short ciclico
      short numero=32767;
      numero=(short)(numero+1);/*los operadores aritmeticos es para trabajar con enteros "int"
      Por lo tanto, es neceario castear la operación.*/
      System.out.println(numero);
      
      //4. Media aritmetica
      double nota1=8, nota2=3;
      double media=(nota1+nota2)/2;
      System.out.println(media);
      
      //5. un numero con necesidad de saber si es par o impar
      int valor=121;
      int resto=valor%2;
      System.out.println(valor+" dividido entre 2 el resto es "+resto);
      
      //6.
      int x = 5, y = 5;
      System.out.println(++x); // imprime 6, le añade uno antes de la impresión
      System.out.println(x); // imprime 6
      System.out.println(y++); // imprime 5, le añade uno mas a posteriori de la "impresion"
      System.out.println(y); // imprime 6
      
      //7.
      edad=25;
      boolean resul;
      resul=edad>=18;
      System.out.println(resul);
      
      //8.
      int num=15;
      boolean esPar;
      esPar=num%2==0;
      System.out.println(esPar);
      
    }
}
