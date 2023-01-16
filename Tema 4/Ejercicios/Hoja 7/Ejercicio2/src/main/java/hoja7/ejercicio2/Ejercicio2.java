/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Veterinario v = new Veterinario();
        Mascota pupi = new Mascota("pupi", 1992, 1, 1);
        Mascota miraitowa = new Mascota("miraitowa", 2021, 1, 1);

        v.añadir(pupi);
        v.añadir(miraitowa);
        System.out.println("Las mascotas son:" + v.mostrar()+"\n");
        System.out.println("Las mascotas mayores de 5 años son" + v.mostrarMayores());
    }
}
