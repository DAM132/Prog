/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio4;

/**
 *
 * @author gines
 */
public class Ejercicio4 {

    public static void main(String[] args) {
         int a,b,c,d,e,n;
        for (int i = 2016; i <= 2030; i++) {
           
        a=i%19;
        b=i%4;
        c=i%7;
        d=((19*a)+24)%30;
        e=(2*b+4*c+6*d+5)%7;
        n=(22+d+e);
            if(n<=31){
                System.out.println("Fue el año" +i+"el dia marzo"+n);
            }
            
            System.out.println("Fue el año"+i+"el dia abril"+(n-31));
            
        }
               }
}
