package ar.edu.ort.p1.unidades.u2.ejemplos._03_modificadores_de_acceso._1_private.error;

public class Persona {

	private void saludar() { // <-- private dara error
		System.out.println("Hola!");
	}
}