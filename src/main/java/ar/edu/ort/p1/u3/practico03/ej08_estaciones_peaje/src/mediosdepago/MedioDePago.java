package ar.edu.ort.p1.u3.practico03.ej08_estaciones_peaje.src.mediosdepago;

import ar.edu.ort.p1.u3.practico03.ej08_estaciones_peaje.src.Descontable;

public abstract class MedioDePago implements Descontable {
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}
}