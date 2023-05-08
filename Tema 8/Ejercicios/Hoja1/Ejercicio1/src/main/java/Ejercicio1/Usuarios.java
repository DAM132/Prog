/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author cic
 */
public class Usuarios {

    private int id;
    private String nombre;
    private String password;
    private String email;

    public Usuarios() {
        id= Teclado.introEnteroPositivo("Dime un numero de id");
        nombre = Teclado.introTexto("introduce el nombre del usuario");
        password = Teclado.introTexto("Dime una contraseña");
        email= Teclado.introTexto("Dime un mail");

    }

    public Usuarios(int id, String nombre, String password, String email) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id=" + id + ", nombre=" + nombre + ", password=" + password + ", email=" + email + '}';
    }
    
    

 
}
