package ar.edu.ort.p1.unidades.u5.practico05.ej02_pelotas_tenis.src;

import java.util.Random;

import ar.edu.ort.tp1.u5.tda.impl.PilaNodos;
import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class TuboPelotasDeTenis extends PilaNodos<PelotaDeTenis> {

	public final static int MAX_PELOTAS = 3;

	public TuboPelotasDeTenis() {
		super(MAX_PELOTAS);
		inicializar();
	}

	public boolean hayAlgunaPelotaUsada() {
		boolean hayAlguna = false;

		Pila<PelotaDeTenis> pilaAux; // Recordar trabajar con interfaces
		pilaAux = new PilaNodos<PelotaDeTenis>(); // Instanciar clases concretas

		while (!isEmpty() && !hayAlguna) {
			PelotaDeTenis pelota = this.pop();
			pilaAux.push(pelota);
			hayAlguna = pelota.getEstado() != Estado.NUEVA;
		}
		while (!pilaAux.isEmpty()) {
			push(pilaAux.pop());
		}
		return hayAlguna;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializar() {

		int cant = (int) (Math.random() * 4 + 0);
		System.out.println("Creo un tubo con " + cant + " pelotas");
		for (int i = 0; i < cant; i++) {
			PelotaDeTenis p = new PelotaDeTenis();
			int usos = (int) (Math.random() * 11 + 0);

			for (int j = 0; j < usos; j++) {
				p.usar();
			}
			this.push(p);
			System.out.println(p);
		}

	}

}