package edu.ort.u5.ejemplos.generics.ej02_golosinas_con_gen;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa<T> implements Iterable<T> {
	private ArrayList<T> lista = new ArrayList<T>();
	private int tope;

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}

	public void add(T objeto) {
		if (lista.size() < tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("no caben mas");
		}
	}

	public Iterator<T> iterator() {
		return lista.iterator();
	}

	// https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=589:interface-iterable-y-metodo-iterator-api-java-recorrer-colecciones-ejercicio-y-ejemplo-resuelto-cu00915c&catid=58&Itemid=180
}