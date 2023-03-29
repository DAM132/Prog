/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;

/**
 *
 * @author Ginés
 */
public abstract class CuentaCorriente extends CuentaBancaria {
    
    private boolean siAutoriza;

    public CuentaCorriente(Persona titular, String ccc) {
        super(titular, ccc);
        siAutoriza=true;
    }

    
   public HashMap<String, String> listaObjeto() {
         HashMap<String, String> aux;
         aux = new HashMap();
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         aux.putAll(super.listaObjeto());
         aux.put("Autoriza", siAutoriza?"s":"n");
         
        return aux;
    }
    
    
    public boolean isSiAutoriza() {
        return siAutoriza;
    }

    public void setSiAutoriza(boolean siAutoriza) {
        this.siAutoriza = siAutoriza;
    }


    
    
    
}
