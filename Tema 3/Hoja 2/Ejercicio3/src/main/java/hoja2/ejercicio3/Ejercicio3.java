/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int num,opc;
        Scanner in= new Scanner(System.in);
        System.out.println("Dime un numero");
        num=in.nextInt();
        System.out.println("Elige la opcion");
        opc=in.nextInt();
        switch (opc){
            case 1:
                        System.out.println("El cuadrado es" + Math.pow(num, 2));
        break;
            case 2:
                        System.out.println("El doble del num es"+ num*2);
            break;
            case 3:
                        System.out.println("La raiz cuadrada es" +Math.sqrt(num));
            break;
            default:
                System.out.println("No has elegido la opcion correcta");
        }
        
        
        
    }
}
