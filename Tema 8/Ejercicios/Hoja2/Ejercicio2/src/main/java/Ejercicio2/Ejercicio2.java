/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Ejercicio2;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cic
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        try ( Connection conn = AccesoBaseDatos.getInstance().getConn()) {
            // de la interfaz
            Repositorio<Usuarios> repositorio = new UsuarioDAOImp();

            boolean salir = false;
            int opcion;

            while (!salir) {

                System.out.println("1. Actualizar");
                System.out.println("2. Eliminar");
                System.out.println("3. Agregar");
                System.out.println("4. Listar");
                System.out.println("5. Salir");

                try {

                    opcion = Teclado.introEnteroPositivo("\"Escribe una de las opciones\"");

                    switch (opcion) {
                        case 1:
                            System.out.println("Has seleccionado la opcion 1");
                            // primero recuperamos el producto
                            int aux = Teclado.introEnteroPositivo("Dime el id que quieres modificar");
                            Usuarios produAux = repositorio.porId(aux);
                            // modificamos el nombre del producto
                            if (produAux != null) {

                                produAux.setNombre(Teclado.introTexto("dime un nombre"));
                                produAux.setPassword("Dime una contraseña");
                                produAux.setEmail("Dime un mail");
                                repositorio.guardar(produAux);
                                System.out.println("Mostramos el usuario" + repositorio.porId(aux));

                            } else {
                                System.out.println("El usuario" + aux + "no existe");
                            }

                            break;
                        case 2:
                            System.out.println("Has seleccionado la opcion 2");
                            repositorio.eliminar(Teclado.introEnteroPositivo("Dime el id que quieres borrar"));
                            break;
                        case 3:
                            System.out.println("Has seleccionado la opcion 3");
                            Usuarios usuarion = new Usuarios();
                            repositorio.guardar(usuarion);
                            break;
                        case 4:
                            System.out.println("Has seleccionado la opcion 4");
                            //listar con funcional 
                            repositorio.listar().forEach(System.out::println);
                            
                            break;
                        case 5:
                            System.out.println("adeuuu!");
                            salir = true;
                            break;
                        default:

                            System.out.println("Solo números entre 1 y 5");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");

                }
            }

        } catch (SQLException ex) {
            System.out.println("error sql" + ex.getMessage());
        }

    }

}
