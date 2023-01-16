/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
      
Letra [] letras;

letras= new Letra[2];

        for (int i = 0; i < letras.length; i++) {
            letras[i]= new Letra();
            
            

        }
        
        for (int i = 0; i < letras.length; i++) {
            System.out.println("La letra guardada es");
            letras[i].mostrar();
            System.out.println("");
        }
      
        //procesar
        System.out.println("Salida");
        System.out.println("Todas las letras vencidas");
        for (int i = 0; i < letras.length; i++) {
            if(letras[i].vencida())
                letras[i].mostrar();
        }
        
        System.out.println("Demorar en 15 días");
        for (int i = 0; i < letras.length; i++) {
            if(letras[i].devuelveMes()==1){
                letras[i].demora(15);
                System.out.println("Nueva letra");
                letras[i].mostrar();
            }
            
        }
        
        System.out.println("Visualizar el titular y el nº dias que faltan");
        
        for (int i = 0; i < letras.length; i++) {
            if(!letras[i].vencida()){
                System.out.println("El titular es " +letras[i].getTitular());
                System.out.println("Dias que faltan " +letras[i].diasFaltan());
            }
        }
        
    }
}
