/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author Ginés
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class GestorSeries {
    private ArrayList<Serie> series;

    public GestorSeries() {
        this.series = new ArrayList<>();
    }

    public Serie existeSerie(String nombre) {
        Serie s= null;
        for (Serie serie : series) {
            if (serie.getNombre().equals(nombre)) {
                s=serie;
            }
        }
        return s;
    }

    public void crearSerie() {
        Scanner scanner = new Scanner(System.in);

        String entr = Entrada.pedirNombre();

        if (existeSerie(entr) == null) {
            Serie nuevaSerie = new Serie(entr, Entrada.entradaT(), Entrada.pedirNacionalidad(), Entrada.estaFinalizada(), Entrada.pedirntemp());
            series.add(nuevaSerie);
            System.out.println("La serie se ha añadido correctamente.");
        } else {
            System.out.println("Existe ya esa serie =)");
        }


    }

    public void eliminarSerie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre de la serie a eliminar: ");
        String nombre = scanner.nextLine();

        Serie serie = existeSerie(nombre);

        if (serie == null) {
            System.out.println("La serie no existe en el listado.");
            return;
        }

        series.remove(serie);
        System.out.println("La serie se ha eliminado correctamente.");
    }

    public void verSeries() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Ver todas las series");
        System.out.println("2. Ver series por temática");
        System.out.println("3. Ver series por nacionalidad");
        System.out.print("Elige una opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                for (Serie serie : series) {
                    System.out.println(serie);
                }
                break;
            case 2:
              Tematica t= Entrada.entradaT();
                for (Serie serie : series) {
                    if (serie.getTematica().equals(t)) {
                        System.out.println(serie);
                    }
                }
                break;
            case 3:
                System.out.print("Introduce la nacionalidad de las series: ");
                String nacionalidad = scanner.nextLine();
                for (Serie serie : series) {
                    if (serie.getNacionalidad().equals(nacionalidad)) {
                        System.out.println(serie);
                    }
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

   public void crearCapitulo() {
    Scanner scanner = new Scanner(System.in);

    String nombre = Entrada.pedirNombre();

    // Comprobar si la serie existe
    Serie serie = existeSerie(nombre);
    if (serie == null) {
        System.out.println("La serie no existe.");
        
    }
    else{
        
  
            // Pedir los datos del capítulo
            System.out.print("Introduce la desc del capítulo: ");
            String desc = scanner.next();
            System.out.print("Introduce el número del capítulo: ");
            int numero = scanner.nextInt();
            System.out.print("Introduce el número del temporada: ");
            int temp = scanner.nextInt();

            // Comprobar si el capítulo ya existe
          
                    Capitulo capitulo = new Capitulo(temp, numero, desc);

                    serie.insertaCapitulo(Serie.generaClaveCapitulo(nombre, temp, numero), capitulo);
                

            }
        }
    

   
   
   public void eliminarCapitulo(){
        
         String nombre = Entrada.pedirNombre();
         Iterator <Serie> i= series.iterator();
         
         while(i.hasNext()){
             if(i.next().getNombre().equalsIgnoreCase(nombre)){
                 i.remove();
                 System.out.println("Se ha eliminado correctamente");
             }
             else
                 System.out.println("No se ha eliminado");
         }
   }
   
   public void verCapitulos(){
       String nombre = Entrada.pedirNombre();
       Serie serie = existeSerie(nombre);

       if (serie == null) {
           System.out.println("No existe la serie");
       } else {
           for (Serie sery : series) {
               sery.visualizaCapitulos();
           }
       }

}

}
