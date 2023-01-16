/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Calculo {

    public Calculo() {
    }
    
    public void metodo1(){
        int i=100;
        while(i!=0){
            System.out.println(i);
            i--;
        }
        System.out.println("Despegueeeeee");
    }
    public void metodo2(){
        int num;
        int i=0,p = 0,n = 0,nulo = 0;
        while (i!=10){
            System.out.println("Dime un numero");
            Scanner in=new Scanner(System.in);
            num= in.nextInt();
            i++;
            if(num>0){
                p++;
            }
            else if(num<0){
                n++;
            }
            else if(num==0)
                nulo++;
        }
        System.out.println("positivo" + p + "negativo" +n + "nulo" +nulo);
    }
    
    public void metodo3(){
        int numero;
        int factorial = 1;
        int i = 1;
         System.out.println("Dime un numero");
            Scanner in=new Scanner(System.in);
            numero= in.nextInt();
        while (numero>=i){
           
            
            factorial=factorial*i;
           i++;
            }
        System.out.println("El factorial de" +numero+ "es "+ factorial);
    }
    
//    public void metodo4(){
//        String texto="";
//        int i=0;
//        while(texto.contains(".")==false){
//           if(texto.length()>1){
//               System.out.println("Solo se puede un caracter");
//               i--;
//           }
//            System.out.println("Dime un caracter");
//            Scanner in= new Scanner(System.in);
//            texto=in.next();
//            i++;
//        }
//        System.out.println("El texto mide caracteres "+(i-1));
//    }
    
    public void metodo4(){
        Scanner in=new Scanner(System.in);
        System.out.println("Cuenta caracteres");
        char letra;
        int i=0;
        letra=in.nextLine().charAt(0);
        while(letra!='.'){
            i++;
            letra=in.nextLine().charAt(0);
        }
        System.out.println("Se han introducido "+i+"caracteres");
    }
    
    public void metodo5() {
        double i = 0,num, suma = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Programa que calcula los numeros positivos introducidos"
                + "\nPara al introducir un numero negativo");
        num = in.nextInt();
        while (num >= 0) {
            System.out.println("Dime un numero");
            i++;
            num = in.nextInt();
            suma += num;

        }
        if (i != 0) {
            System.out.println("La medida d elos numeros positivos introducido es");
            System.out.println((suma) / i);
        }
    }
}
