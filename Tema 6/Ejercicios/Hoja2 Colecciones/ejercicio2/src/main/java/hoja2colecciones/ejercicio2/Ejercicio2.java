/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2colecciones.ejercicio2;

/**
 *
 * @author DAM103
 */
public class Ejercicio2 {

    public static void main(String[] args) throws InterruptedException {
        Taller taller= new Taller();
        
        FichaVehiculo f1=new FichaVehiculo("mod1", "mat1");
        FichaVehiculo f2=new FichaVehiculo("mod2", "mat2");
        FichaVehiculo f3=new FichaVehiculo("mod3", "mat3");
        FichaVehiculo f4=new FichaVehiculo("mod4", "mat4");
        
        taller.insertarVehiculo(f1);
        taller.insertarVehiculo(f2);
        taller.insertarVehiculo(f3);
        taller.insertarVehiculo(f4);
        System.out.println(taller.mostrarEstado());
        Thread.sleep(1000);
        taller.repararVehiculo("mat2");
        Thread.sleep(1000);
        taller.repararVehiculo("mat4");
        Thread.sleep(1000);
        System.out.println(taller.mostrarEstado());
        Thread.sleep(3000);
        taller.darSalidaVehiculo("mat2");
        System.out.println(taller.mostrarEstado());
    }
}
