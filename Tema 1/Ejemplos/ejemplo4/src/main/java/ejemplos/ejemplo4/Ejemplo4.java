/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplo4;

/**
 *
 * @author DAM103
 */
public class Ejemplo4 {

    public static void main(String[] args) {
        //1. operadores de condicion
        
        boolean llueve, tareas, biblioteca;
        boolean salir;
        llueve=true;
        tareas=false;
        biblioteca=false;
        
        salir=(!llueve && tareas) ||(biblioteca); 
/* usamos ! para poner una condicion que no se deba cumplir. && para que se deba cumplir ambas condiciones
|| es para condicuionar si uno u otro sirve y si se cumple uno, sale true.*/
        System.out.println(salir);
        
        //2. ejemplo operadores de asignación
        double manzanas=3, peras=2;
        double beneficio;
        
        //1ª Solución. beneficio=peras*1.95+manzanas*2.35;
        beneficio=peras*1.95;
       // Equivalente linea siguiente. 2ª solución. beneficio=beneficio+manzanas*2.35;
        beneficio+=manzanas*2.35;
        
        System.out.println(beneficio);
        //3. Operador Ternario
        int a,b;
        a=3<5 ? 1 : -1; //3<5 es cierto: así que a toma el valor 1.
        b= a == 7 ?10:20; // a (que vale 1) == 7 es falso, así que b toma el valor 20
        
        //Escribe un programa que analice si es par o impar
        boolean resultado;
        a=7;
        resultado=(a%2==0)?true:false;
        System.out.println(resultado);
        
        //Ejemplo salida pantalla
        System.out.println("Hola, mi primer programa");
        System.out.println("\"Hola, mi primer programa\""); //Se utiliza las barraas para imprimir tambien las dobles comillas.
        System.out.println("Hola, mi primer programa, está en c:\\");//doble barra para que saque una de ellas puesto que una sola da error
        System.out.print("Hola, mi primer programa\n");// "\n" java lo reconoce como un cambio de línea
        System.out.println("Hola, mi primer programa\n"); //se saltan dos lineas, una por el println y otro por el \n
    }
}
