/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio5;

/**
 *
 * @author gines
 */
public class Ejercicio5 {

    public static void main(String[] args) {
int []num={1,2,3,4,5,6,7,8,9,10};
int aux;
int j=num.length-1;
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i]+"\t");
           
            
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------");
        
        for (int i = 0; i < num.length/2; i++) {
            aux=num[i];
            num[i]=num[j];        
            num[j]=aux;
            j--;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"\t");
            
        }    
    }
}
