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
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

    public boolean impuesto(){
        boolean aux=false;
        if(sueldo>3000){
            aux=true;
        }
        
    return aux;
    }

    public static void main(String[] args) {
        if(args.length==2){
           
            Empleado e=new Empleado();
            e.setNombre(args[0]);
            e.setSueldo(Integer.parseInt(args[1]));
                    System.out.println(e.imprimir());
        if(e.impuesto())
            System.out.println("Paga impuestos");
        else
            System.out.println("No paga");
        }
        else
            System.out.println("No tengo datos");
        

    }
}
