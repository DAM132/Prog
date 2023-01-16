/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio1;

/**
 *
 * @author gines
 */
public class Persona {
    private String nombre,apellido1,apellido2,dni;

    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String contrasena() {
        String resul = "";
        if (nombre.length() > 0 ){
        resul=resul+nombre.charAt(0); 
        }
        if (apellido1.length() >= 3 ){
        //resul=resul+apellido1.charAt(0)+apellido1.charAt(1)+apellido1.charAt(2); 
        resul=resul+apellido1.substring(0,3);
        }
        else{
            resul=resul+apellido1;
        }
        if (apellido2.length() >= 0 ){
        resul=resul+(apellido2.charAt(apellido2.length()-1)); 
        }
          
        return resul;


}
    public boolean dniValido(){
        boolean resul=false;
        int r;
        r = Integer.parseInt(dni)%23 ;
        
        return false;
        
    }
}



