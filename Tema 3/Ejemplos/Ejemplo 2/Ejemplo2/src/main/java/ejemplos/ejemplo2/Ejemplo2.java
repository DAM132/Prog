/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplo2;

/**
 *
 * @author gines
 */
public class Ejemplo2 {

    public static void main(String[] args) {
boolean salir=false; /* En este caso el centinela es una variable booleana que inicialmente vale falso */
int i=0;
int contador=0;
while(salir==false&&contador<5) 	// Condición de repetición: que salir siga siendo falso. Ese es el centinela. 
{	//También se podía haber escrito simplemente: while(!salir)
        i=(int)Math.floor(Math.random()*499+1); // Lo que se repite en el bucle:
        System.out.println(i); 	// calcular un número aletorio de 1 a 500 y escribirlo
        salir=(i%7==0);   //El centinela vale verdadero si el número es múltiplo de 7 
        contador++;
        
}  
if (salir==true){
    System.out.println("Se encontro el multiplo " +i);
}
     else   System.out.println("No se encontro multiplo");
    }
}

