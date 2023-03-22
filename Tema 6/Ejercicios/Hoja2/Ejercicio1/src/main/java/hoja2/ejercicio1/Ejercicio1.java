/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {

       Academia a=new Academia();
       Curso c1=new Curso("111","curso1",100);
       Curso c2=new Curso("1112","curso1",100);
       Curso c3=new Curso("1113","curso1",100);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
       do{
           System.out.println("1- Añadir un nuevo curso al final de la lista");
           System.out.println("2- Insertar un nuevo curso en cualquier posición");
           System.out.println("3- Borrar un curso dado su código");
           System.out.println("4- Modificar el número de Horas de un curso dado su código");
           System.out.println("5- Mostrar todos los cursos");
           System.out.println("6- Salir");
          
           opcion = claseTeclado.esEntero("Dime las opciones");
           switch(opcion){
               case 1:
                   a.addCurso(c1);
                   break;
               case 2:
                   a.addCualquierpos(c2);
                   break;
                case 3:
                   a.borrarCurso("111");
                   break;
                   case 4:
                   a.modHoras("111");
                   break;
                   case 5:
                   a.mostrarTodos();
                   break;
                case 6:
                    System.out.println("Adios! =)");
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 6");
           }
       }
      while(!salir);    }
}
