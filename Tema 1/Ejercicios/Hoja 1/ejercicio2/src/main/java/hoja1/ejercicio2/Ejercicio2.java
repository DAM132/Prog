/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio2;

/**
 * @author DAM103
 * Ejercicio de definición de variables y realizar lo comentarios necesarios para comprender el uso de esas definciones.
 * Comienzo de la clase Ejercicio 2
*/
public class Ejercicio2 {
    //definicion de un tipo de dato enumerado
    public enum sexo {V,M};
    public static void main(String[] args) {//principio del main
        
    boolean casado=true; //Escogemos boolean para una respuestra de Verdadero y Falso, en este caso, estado civil.
    final int MAXIMO=999999; /*definicion de una constante. Usamos el int para un numero que este entre -2.147.483.648 a 2.147.483.647
    final sirve para convertir una variable en constante, es decir, no se puede modificar a posteriori.
    */
    byte diaSem=1; //byte sirve para el uso de valores entre -128 a 127
    short diaAnual=300; //variable para dia del año, valores entre -32.768 a 32.767
    long milisegundos=1298332800000L ; /*Variable utilizada para un numero comprendido entre -9.223.372.036.854.775.808 a 9.223.372.036.854.775.8087.
    Si nos pasamos de entero nos dará un error, tene,os que indicarle que es un "long" con una "L" al final
    */
    sexo genero=sexo.M; /*variable personalizada para una respuesta que no tenemos una respuesta clara con las otras variables.
    Para poder poner los valores de la variable especial, tenemos que poner el nombre de la variable. y su valor.
    */
    double totalFactura=10350.678; /*en caso del double no es necesario el uso de ninguna letra al final del numero. En caso de usar un numero mas grande que "long"
    tambien usamos double porque es capaz de guardar más informacion que el long.
*/
    long poblacion=6775235741l;
    char letra='A'; //char graba todos los elementos de la tabla ASCII, puede grabar tambien el codigo de la tabla. Solo se entrecomillan las letras, un solo simbolo.
    letra=65; // tambien puede grabar el codigo de la tabla directamente.
    //d) usando println
    System.out.println("    ---- EJERCICIO DE VARIABLES Y TIPOS DE DATOS ----");
    System.out.println("\t El valor de la variable casado es "+casado);
    System.out.println("\t El valor de la variable MAXIMO es "+MAXIMO);
    System.out.println("\t El valor de la variable diaSem es "+diaSem);
    System.out.println("\t El valor de la variable diaAnual es "+diaAnual);
    System.out.println("\t El valor de la variable milisegundos es "+milisegundos);
    System.out.println("\t El valor de la variable factura es "+totalFactura);
    System.out.println("\t El valor de la variable poblacion es "+poblacion);
    System.out.println("\t El valor de la variable genero es "+genero);
    // usando print
    System.out.print("    ---- EJERCICIO DE VARIABLES Y TIPOS DE DATOS ----");
    System.out.print("\n\t El valor de la variable casado es "+casado);
    System.out.print("\n\t El valor de la variable MAXIMO es "+MAXIMO);
    System.out.print("\n\t El valor de la variable diaSem es "+diaSem);
    System.out.print("\n\t El valor de la variable diaAnual es "+diaAnual);
    System.out.print("\n\t El valor de la variable milisegundos es "+milisegundos);
    System.out.print("\n\t El valor de la variable factura es "+totalFactura);
    System.out.print("\n\t El valor de la variable poblacion es "+poblacion);
    System.out.print("\n\t El valor de la variable genero es "+genero);
    //usando printf
    System.out.printf("\n    ---- EJERCICIO DE VARIABLES Y TIPOS DE DATOS ----");
    System.out.printf("\n\t El valor de la variable casado es %b", casado);
    System.out.printf("\n\t El valor de la variable MAXIMO es %d", MAXIMO);
    System.out.printf("\n\t El valor de la variable diaSem es %d", diaSem);
    System.out.printf("\n\t El valor de la variable diaAnual es %d", diaAnual);
    System.out.printf("\n\t El valor de la variable milisegundos es %d", milisegundos);
    System.out.printf("\n\t El valor de la variable factura es %f", totalFactura);
    System.out.printf("\n\t El valor de la variable poblacion es %d", poblacion);
    System.out.printf("\n\t El valor de la variable genero es %s", genero);
    }//fin del main
}

