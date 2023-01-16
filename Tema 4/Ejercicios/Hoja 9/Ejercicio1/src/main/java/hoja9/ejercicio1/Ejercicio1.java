/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja9.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        if(args.length==1){
            if(args[0].length()==3){
                int numero= Integer.parseInt(args[0]);
                if(esArmstrong(numero)){
                    System.out.println("Es de Amstrong");
                }
                else{
                    System.out.println("No es de Amstrong");
                }
            }
            else{
                System.out.println("No es de tras cifras");
            }
            
        }
        else{
            System.out.println("Falta el argumento de entrada");
        }
    }
    //fin del main
    
    public static boolean esArmstrong(int numero){
        boolean resultado=false;
        int copia=numero;
        int suma=0;
        while(copia!=0){
            int ultimoDigito=copia%10;
            suma=(int) (suma+Math.pow(ultimoDigito, 3));
            copia=copia/10;
        }
        if(suma==numero){
            resultado=true;
        }
        return resultado;
        
    }
    }
    
