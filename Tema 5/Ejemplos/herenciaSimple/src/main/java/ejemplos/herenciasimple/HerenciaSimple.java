/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.herenciasimple;

/**
 *
 * @author Nuria
 */
public class HerenciaSimple {

    public static void main(String[] args) {
        Animal a=new Animal("Animal","Mamifero",20);
        System.out.println(a.toString());
        a.comer();
        a.respirar();
        
        Pajaro p=new Pajaro("Marron",true,"Piolin","Ave",3);
        System.out.println(p.toString());
        p.comer();
        p.respirar();
       
    }
}
