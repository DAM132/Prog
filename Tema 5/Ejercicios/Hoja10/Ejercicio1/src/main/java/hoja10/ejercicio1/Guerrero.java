/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

/**
 *
 * @author Ginés
 */
public abstract class Guerrero {
    protected String nombre;
    protected int edad,fuerza;
    protected boolean herido,muerto;


    
    protected static boolean comprobarEdad (int e){
        boolean aux=false;
        if(e>=15||e<=60){
            aux=true;
        }
        
        return aux;
        
    }
    
        protected static boolean comprobarFuerza(int f){
        boolean aux=false;
        if(f>=1||f<=10){
            aux=true;
        }
        
        return aux;
        
    }
        
        
        
        
            public String getNombre() {
        return nombre;
    }

    public Guerrero(String nombre, int edad, int fuerza) {
        this.nombre = nombre;
        this.edad = edad;
        this.fuerza = fuerza;
        herido=false;
        muerto=false;
        
    }

    public Guerrero() {
        this("guerreroX",15,1);
    }
    
    

    public Guerrero(Guerrero o, String n) {
        n = o.nombre;
        this.edad = o.edad;
        this.fuerza = o.fuerza;
        herido=false;
        muerto=false;
        
    }

    
    public abstract boolean retirarse ();
            
            
            
            
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public boolean isHerido() {
        return herido;
    }

    public void setHerido(boolean herido) {
        this.herido = herido;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }
}
