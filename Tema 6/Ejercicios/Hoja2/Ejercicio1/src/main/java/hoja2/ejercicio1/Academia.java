/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Ginés
 */
public class Academia {
    private LinkedList <Curso>lista;

    public Academia() {
        lista= new LinkedList();
    }
    
    public void addCurso(Curso a){
        lista.addLast(a);
    }
    
    public void addCualquierpos(Curso c){
        
        lista.add(lista.size()/2, c);
        
    }
    
    
    public void borrarCurso(String cod){
       
        Iterator i = lista.iterator();
        boolean borrado = false;

        while (i.hasNext()) {

            Curso aux = (Curso) i.next();
            if (aux.getCod().equalsIgnoreCase(cod)) {
                i.remove();
            }
            borrado = true;
        }
        if (!borrado) {
            System.out.println("No encontrado");
}
    }
   
    
    public void modHoras(String cod){
         Iterator i=lista.iterator();
        boolean mod = false;
                     
        while(i.hasNext()&&!mod){
            Curso aux = (Curso) i.next();
            if(aux.getCod().equalsIgnoreCase(cod))
                aux.setnHoras(claseTeclado.esEntero("Dime el nuevo numeros de horas"));
           mod=true;
        }
        if(mod){
            System.out.println("No existe ningudo con ese cod");
        }
    }
    

    
   public void mostrarTodos(){
       for (Curso curso : lista) {
           System.out.println(curso.toString());
       }
       
   }
    
}
