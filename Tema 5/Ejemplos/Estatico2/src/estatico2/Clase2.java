/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico2;

/**
 *
 * @author Nuria
 */
public class Clase2 implements Interfaz{
    @Override
	public void metodo() {
		System.out.println("Otro método en Clase2");
	}

	@Override
	public void metodoPorDefecto() {
		System.out.println("Mi propia implementación del método por defecto");
	}
}
