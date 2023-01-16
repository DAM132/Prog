/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mispracticas.practica2;

/**
 *
 * @author jdcg1
 */
public class Practica2 {

        public enum sexo {V,M};
    public static void main(String[] args) {//principio del main
        
    boolean casado=false; //Escogemos boolean para una respuestra de Verdadero y Falso, en este caso, estado civil.
    final int MAXIMO=999999; /*definicion de una constante. Usamos el int para un numero que este entre -2.147.483.648 a 2.147.483.647
    final sirve para convertir una variable en constante, es decir, no se puede modificar a posteriori.
    */
    byte diaSemana=7; //byte sirve para el uso de valores entre -128 a 127
    short diaAnio=365; //variable para dia del año, valores entre -32.768 a 32.767
    sexo genero=sexo.V; /*variable personalizada para una respuesta que no tenemos una respuesta clara con las otras variables.
    Para poder poner los valores de la variable especial, tenemos que poner el nombre de la variable. y su valor.
    */
    long milisegundos=1548962554518951548L ; /*Variable utilizada para un numero comprendido entre -9.223.372.036.854.775.808 a 9.223.372.036.854.775.8087.
    Si nos pasamos de entero nos dará un error, tene,os que indicarle que es un "long" con una "L" al final
    */
    float factura=123.8f; //para poner decimales usamos float o double, en el caso del float, tenemos que poner una "f" al terminar el número.
    double factura2=123.5; /*en caso del double no es necesario el uso de ninguna letra al final del numero. En caso de usar un numero mas grande que "long"
    tambien usamos double porque es capaz de guardar más informacion que el long.
*/
    long poblacion=7000000000l; //debemos poner una "l" al final para remarcar que es un long.
    char letra='A'; //char graba todos los elementos de la tabla ASCII, puede grabar tambien el codigo de la tabla. Solo se entrecomillan las letras, un solo simbolo.
    letra=65; // tambien puede grabar el codigo de la tabla directamente.
    System.out.println("---- EJERCICIO DE VARIABLES Y TIPOS DE DATOS ----");
    System.out.println("\t El valor de la variable casado es "+casado);
    System.out.println("\t El valor de la variable MAXIMO es "+MAXIMO);
    System.out.println("\t El valor de la variable diaSemana es "+diaSemana);
    System.out.println("\t El valor de la variable diaAnio es "+diaAnio);
    System.out.println("\t El valor de la variable genero es "+genero);
    System.out.println("\t El valor de la variable milisegundos es "+milisegundos);
    System.out.println("\t El valor de la variable factura es "+ factura);
    System.out.println("\t El valor de la variable poblacion es "+ poblacion);
    System.out.println("\t El valor de la variable letra es "+ letra);
    }
}
