/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja9.ejercicio1;

/**
 *
 * @author gines
 */
enum EstadoTimbre{
    APAGADO,ENCENDIDO
}
public class Alarma {
    private double temp;
    private EstadoTimbre estado;
    
  public Alarma(double temp){
      this.estado=estado.APAGADO;
    
}
  public void comprueba(){
      if(temp>35||temp<10){
          this.estado=estado.ENCENDIDO;
      }
  }
  
 public void normaliza(){
     temp=25;
     this.estado=estado.APAGADO;
 }   

    public EstadoTimbre getEstado() {
        return estado;
    }
 
 

}



