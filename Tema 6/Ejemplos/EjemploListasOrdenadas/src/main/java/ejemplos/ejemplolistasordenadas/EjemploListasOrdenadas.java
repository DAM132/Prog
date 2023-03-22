/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplolistasordenadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Nuria
 */
public class EjemploListasOrdenadas {

    public static void main(String[] args) {
          //crear una lista de estudiantes sin ordenar
        List<Estudiante> lista = new ArrayList<>();
        lista.add(new Estudiante("Carlos", 19, 3));
        lista.add(new Estudiante("Felipe", 21, 1));
        lista.add(new Estudiante("Ana", 18, 4));
        lista.add(new Estudiante("Rosa", 15, 1));
        lista.add(new Estudiante("Jose", 10, 2));
        // sera una lista sin ordenar
        System.out.println("Sin ordenar");
        for (Estudiante e : lista) {
            System.out.println(e.toString());

        }
        // ordenarla por nombre
        // Collections es una clase para las colecciones
        //tambien implementa Comparable en el método sort
        //Lista de estudiantes ordenados por orden alfabético: Ana, Carlos, Felipe, Jose, Rosa
        System.out.println("Ordenados por nombre");
        Collections.sort(lista);
        for (Estudiante e : lista) {
            System.out.println(e.toString());

        }
        //ordenarla por edad
        //Collections tambien implementa Comparator en el método sort
        // creada la clase EstudiantePorEdad que implementa Comparator
        System.out.println("Ordenados por edad");
        Comparator<Estudiante> compEdad = new EstudiantePorEdad();
        Collections.sort(lista, compEdad);
        for (Estudiante estudiante : lista) {
            System.out.println(estudiante.toString());
        }
        //ordenarla por curso
        //Collections tambien implementa Comparator en el método sort
        // no merece la pena implementar una clase para solo una vez
        System.out.println("Ordenados por curso implementando el comparator");
        Comparator<Estudiante> compCurso=new Comparator<>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                return e1.getCurso()-e2.getCurso();
            }
        };
        Collections.sort(lista,compCurso); 
        for (Estudiante estudiante : lista) {
            System.out.println(estudiante.toString());
        }
        
//esta parte lo vemos en la parte de programación funcional        
// otra forma de hacerlo sin clases y creando el comparator a través de expresiones Lambda
        System.out.println("Ordenados por edad lambda");
        Collections.sort(lista, (Estudiante e1, Estudiante e2) -> e1.getEdad() - e2.getEdad());

        for (Estudiante estudiante : lista) {
            System.out.println(estudiante.toString());
        }
        System.out.println("Ordenados por curso");
        Collections.sort(lista, (e1, e2) -> e1.getCurso() - e2.getCurso());

        for (Estudiante estudiante : lista) {
            System.out.println(estudiante.toString());
        }
    }
}
