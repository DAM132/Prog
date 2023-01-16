
package ejemplos.ejemplosarrays;

import java.time.LocalDate;

/**
 *
 * @author cic
 */
public class Grupo {
     private int numeroAlumnos;
    private String nombre;
    private Alumno[] estudiantes;

    /**
     * Parámetros del grupo
     * @param numeroAlumnos
     * @param nombre
     */
    public Grupo(int numeroAlumnos, String nombre) {
        this.numeroAlumnos = numeroAlumnos;
        this.nombre = nombre;
        estudiantes=new Alumno[numeroAlumnos];
        double nota=0;
        for(int i=0;i<estudiantes.length;i++){
            nota=Math.floor(Math.random()*10)+1;
            estudiantes[i]=new Alumno("Nombre "+ (i+1),"Apellidos "+(i+1),nota,LocalDate.now());
        }
    }
    
    /**
     *Nos muestra por pantalla la información del Grupo
     */
    public void print(){
        System.out.println("Grupo : "+nombre);
        System.out.println("Numero de alumnos: "+numeroAlumnos);
        for(int i=0;i<estudiantes.length;i++){
            estudiantes[i].print();
        }
    
    }
}
