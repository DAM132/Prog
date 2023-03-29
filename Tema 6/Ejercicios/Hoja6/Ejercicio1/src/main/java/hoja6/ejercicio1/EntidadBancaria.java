/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ginés
 */
public class EntidadBancaria {

    private HashMap<String, CuentaBancaria> entidad;

    public EntidadBancaria() {
        entidad = new HashMap();

    }

    public void añadirCuenta(String ccc, CuentaBancaria cuenta) {

        if (!entidad.isEmpty() && (entidad.containsValue(cuenta))) {
            System.out.println("La cuenta ya existe en el banco");

        } else {
            entidad.put(ccc, cuenta);
            System.out.println("Cuenta creada correctamente");
        }

    }

    public void listarCuentas(int opcion) {

        CuentaBancaria cuentab = null;
        for (Map.Entry<String, CuentaBancaria> c : entidad.entrySet()) {
            cuentab = c.getValue();

        }

        switch (opcion) {

            case 1 -> {

                if (cuentab instanceof CuentaAhorro aux) {

                    System.out.println(Entrada.recorrerMapas(aux.listaObjeto()));
                }
            }

            case 2 -> {
                if (cuentab instanceof CuentaCorriente aux) {

                    System.out.println(Entrada.recorrerMapas(aux.listaObjeto()));
                }
            }
            case 3 ->
                System.out.println(Entrada.recorrerMapas(cuentab.listaObjeto()));

            case 4 ->
                System.out.println("Saliendo del menú...");
            default ->
                System.out.println("Opción no valida");
        }

    }
    
    public void ingresar(String ccc){
        if(!entidad.isEmpty())
            if(entidad.containsKey(ccc)){
                CuentaBancaria aux= entidad.get(ccc);
                aux.getSaldo()
                
            }
                
    }
}
