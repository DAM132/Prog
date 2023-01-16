/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja6.ejercicio2;

/**
 *
 * @author gines
 */
public class Ejercicio2 {

    public static void main(String[] args) {
Cartas c1= new Cartas();
Cartas c2= new Cartas();
if(c1.getNum()>c2.getNum()){
    System.out.println(c1.getNum()+" c1 es mayor que"+c2.getNum());
}
else if(c1.getNum()<c2.getNum()){
    System.out.println(c1.getNum()+" c1 Es menor que"+ c2.getNum());
}
else if (c1.getNum()==c2.getNum()){
    System.out.println(c1.getNum()+"es igual"+c2.getNum());
}
        System.out.println(c1.getP());
        System.out.println(c2.getP());

        
    }
}
