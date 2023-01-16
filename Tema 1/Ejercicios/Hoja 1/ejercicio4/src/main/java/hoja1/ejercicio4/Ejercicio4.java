/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio4;

/**
 *
 * @author DAM103
 */
public class Ejercicio4 {
    public enum meses{ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}
        public static void main(String[] args) {
        meses m;
        m=meses.MARZO;
        System.out.println("el valor de la variable de tipo enumerado tras realizar la asignación es: "+m);
        System.out.printf("el valor de la variable de tipo enumerado tras realizar la asignación es: %s",m);
        
        m=meses.valueOf("MARZO");
        System.out.println("el valor de m es: "+m);
    }
}
