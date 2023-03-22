/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Ejercicio2 {

    public static void main(String[] args) throws InterruptedException {
Taller t= new Taller();

FichaVehiculo f1= new FichaVehiculo("mod1","mat1");
FichaVehiculo f2= new FichaVehiculo("mod2","mat2");
FichaVehiculo f3= new FichaVehiculo("mod3","mat3");
FichaVehiculo f4= new FichaVehiculo("mod4","mat4");


t.insertarVehiculo(f1);
t.insertarVehiculo(f2);
t.insertarVehiculo(f3);
t.insertarVehiculo(f4);

        System.out.println(t.mostrarEstado());
        
        Thread.sleep(10000);
        t.repararVehiculo("mat1");
                t.repararVehiculo("mat2");
  Thread.sleep(10000);
       

        System.out.println(t.mostrarEstado());
        
        t.darSalidaVehiculo("mat2");
        System.out.println(t.mostrarEstado());
        
    }
}
