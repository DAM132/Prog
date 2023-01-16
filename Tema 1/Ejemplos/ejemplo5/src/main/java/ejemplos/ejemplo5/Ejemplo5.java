/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplo5;

import java.util.Scanner; //linea creada con el add de la bombilla



/**
 *
 * @author DAM103
 */
public class Ejemplo5 {

    public static void main(String[] args) {
    // ejemplo printf
        
        double x=7.0/3.0;
        int y=5;
        System.out.println("valor x="+x); //imprime todo el numero con los decimales periodicos
        System.out.printf("valor x=%f\n",x); //"%f" caracter comodín que hace que saque una variable de tipo float, además, 
        //en vez de poner un "+" fuera de los parentesis, se le sustituye por una ",".
        System.out.printf("valor x=%,.3f",x); 
        
        //si le ponemos despues del "%" una "," es cuantos miles quiero que salgan pero el "." es para decir cuantos decimales quiero que saquen.
        System.out.printf("valor x=%,.3f valor de y=%d\n",x,y); // los valores comodines "%f" y "%d" son sustituidos en el orden de en el que son nombradas despues de las comillas.
        
    // Ejemplo de Scanner 
        // Creamos objeto teclado
        Scanner teclado = new Scanner(System.in); //daba un error, dimos a la bombilla y pulsamos add import for java.util.Scanner. Añade una linea de codigo que de ahi es de donde sale.
        // Declaramos variables a utilizar
        String nombre; // "string" es una variable para palabras completas. Los string se entrecomillan doble al darle la palabra, a diferencia del char.
        int edad;
        boolean estudias;
        float salario;
        String vivir;
        // Entrada de datos
        System.out.println("Nombre: ");
        nombre=teclado.nextLine(); //en la variable hace que la siguiente palabra sea guardada en nombre
        System.out.println("Edad: ");
        edad=teclado.nextInt(); // coge el siguiente int y lo mete en edad
        System.out.println("Estudias: ");
        estudias=teclado.nextBoolean(); //tenemos que responder con true o false
        System.out.println("Salario: ");
        salario=teclado.nextFloat(); //lo siguiente que introduzcamos, debe ser un float y lo guarda en salario
        //una vez se inicie el programa, en la ventana de output se puede introducir lo que se "pide"
        System.out.println("Nombre = "+nombre);
        
    }
}
