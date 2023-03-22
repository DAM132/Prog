/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplotreeset;

import java.util.TreeSet;

/**
 *
 * @author Nuria
 */
public class EjemploTreeSet {

   public static void main(String[] args) {
        TreeSet<Alumno> expedientes = new TreeSet<>();

        Alumno alum1 = new Alumno(1, "Pedro");
        Alumno alum2 = new Alumno(2, "Marta");
        Alumno alum3 = new Alumno(3, "Raquel");

        expedientes.add(alum3);
        expedientes.add(alum1);
        expedientes.add(alum2);

        // implementado comparable en Alumno y establecido por expediente
        System.out.println("====FIJAROS COMO SALEN ORDENADOS POR NUMERO DE EXPEDIENTE");
        for (Alumno expediente : expedientes) {
            System.out.println(expediente.toString());
        }

        //creo un nuevo alumno pero tiene un número de expediente que ya existe
        // implementado en comparable y hace que sea único, no permite duplicado por ese valor
        Alumno alum4 = new Alumno(3, "María");
        // añado el expediente
        if (expedientes.add(alum4)) {
            System.out.println("Insertado correctamente");
        } else {
            System.out.println("NO se ha podido insertar");
        }
    }
}
