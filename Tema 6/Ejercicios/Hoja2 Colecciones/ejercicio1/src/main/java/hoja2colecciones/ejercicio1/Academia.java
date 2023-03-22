/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2colecciones.ejercicio1;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author DAM103
 */
public class Academia {

    private LinkedList<Curso> cursos;

    public Academia() {
        this.cursos = new LinkedList<>();
    }

    public void añadirAlFinal(Curso c) {
        cursos.addLast(c);
    }

    public void insertarEnCualquierPosicion(Curso c) {

        int pos = Teclado.IntroEnteroEnUnRango(0, cursos.size());
        cursos.add(pos, c);
    }

    public void borrar(String codBorrar) {
        Iterator it = cursos.iterator();
        boolean aux = false;
        while (it.hasNext()) {
            Curso c = (Curso) it.next();
            if (c.getCodigo().equalsIgnoreCase(codBorrar)) {
                it.remove();
                aux = true;
            }

        }
        if (aux) {
            System.out.println("Elemento borrado");
        } else {
            System.out.println("No se ha encontrado el cod");
        }
    }

    public void modificarHoras(String cod) {
        boolean aux = false;
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(cod)) {
                curso.setnHoras(Teclado.IntroEntero("Introduce nuevo numero de horas"));
            }
            aux = true;
        }
        if (aux) {
            System.out.println("Modificado");
        } else {
            System.out.println("No modificado");
        }
    }

    public void modificarIterator(String cod) {
        boolean aux = false;
        Iterator<Curso> it = cursos.iterator();
        while (it.hasNext()) {
            Curso c = it.next();
            if(c.getCodigo().equalsIgnoreCase(cod)){
                c.setnHoras(Teclado.IntroEntero("Introduce nuevo numero de horas"));
                aux=true;
            }
        }
        if (aux) {
            System.out.println("Modificado");
        } else {
            System.out.println("No modificado");
        }
    }

    public String mostrar() {
        String cadena = "";
        for (Curso curso : cursos) {
            cadena += curso.toString() + "\n";
        }
        return cadena;
    }
}
