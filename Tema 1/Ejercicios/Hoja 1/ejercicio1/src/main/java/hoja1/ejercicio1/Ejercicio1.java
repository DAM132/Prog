/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio1;

/**
 *
 * @author DAM103
 */
public class Ejercicio1 {
    public enum sexo {V,M}; //para definir un tipo de datos que necesitemos de forma personalizada, entonces, fuera del main hay que "enumerarla" (enum).
    //Y entre llaves se indican los valores que puede tener esas variables personalizadas
    public static void main(String[] args) {
    //las variables siempre suelen empezar con una minúscula.
    boolean casado;
    final int MAXIMO=999999; //"final int" sirve para marcarla como una variable que no se puede modificar, es decir, la convierte en una constante.
    // Las constantes van siempre en mayúsculas. Las constantes solo se pueden definir una vez.
    byte diaSemana; //Cuando una variable la nombramos por nombre compuesto, la segunda parte del nombre empiece con mayúscula
    short diaAnio;
    sexo genero; //se marca con el nombre agenciado al tipo personalizado.
    long milisegundos;
    float factura; //float y double son los unicos que pueden ser variables señaladas con decimales.
    long poblacion;
    
    }
}
