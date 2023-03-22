/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio1;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Ginés
 */
public class Equipo {

    private TreeSet<Jugador> listaJugadores;

    public Equipo() {

        listaJugadores = new TreeSet();
    }

    public boolean add(Jugador add) {

        return listaJugadores.add(add);

    }

    public boolean borrarJugador(String nombre) {
        boolean aux = false;
        Iterator<Jugador> i = listaJugadores.iterator();

        while (i.hasNext() && !aux) {
            if (i.next().getNombre().equalsIgnoreCase(nombre)) {
                i.remove();
                aux = true;
            }
        }
        return aux;

    }

    public String mostrarTodos() {
        String cadena = "";

        for (Jugador listaJugadore : listaJugadores) {

            cadena += listaJugadore.toString() + "\n";
        }
        return cadena;

    }

    public Jugador masBajo() {

        Jugador aux = listaJugadores.last();

        return aux;

    }

    public Jugador masAlto() {

        Jugador aux = listaJugadores.first();

        return aux;

    }

    public SortedSet<Jugador> jugadores2metros() {
        SortedSet<Jugador> aux = listaJugadores.tailSet(new Jugador("", 2.0f));

        return aux;
    }
}
