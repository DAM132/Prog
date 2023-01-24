/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciavehiculo;

/**
 *
 * @author Nuria
 */
public class HerenciaVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        Coche cocheDePepe = new Coche();
        v1 = cocheDePepe;     //Esto sí se permite
//        cocheDePepe=v1;    //ERROR Tipos incompatibles
        cocheDePepe = (Coche) v1;    //Ahora sí se permite, pero sólo porque realmente es un coche 

        if (v1 instanceof Vehiculo) {
            System.out.println("v1 es un Vehiculo");
        }
        if (v1 instanceof Coche) {
            System.out.println("v1 es un Coche");
        }
        if (cocheDePepe instanceof Vehiculo) {
            System.out.println("cocheDePepe es un Vehiculo");
        }
        if (cocheDePepe instanceof Coche) {
            System.out.println("cocheDePepe es un Coche");
        }
    }

}
