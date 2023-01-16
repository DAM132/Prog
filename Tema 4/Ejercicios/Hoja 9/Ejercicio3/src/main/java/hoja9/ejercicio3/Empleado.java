/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja9.ejercicio3;

/**
 *
 * @author Ginés
 */
public class Empleado {
private int sueldo;
private  String nombre;

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String imprimir() {
        return "Empleado{" + "sueldo=" + sueldo + ", nombre=" + nombre + '}';
    }

    public boolean impuesto(){
        boolean aux=false;
        if(sueldo>3000){
            aux=true;
        }
        
    return aux;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
