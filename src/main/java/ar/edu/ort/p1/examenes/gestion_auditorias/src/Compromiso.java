package ar.edu.ort.p1.examenes.gestion_auditorias.src;

import ar.edu.ort.p1.util.Fecha;

public class Compromiso {

	private String descripcion;
	private Fecha fechaCompromiso;

	public Compromiso(String descripcion, Fecha fechaCompromiso) {
		super();
		this.descripcion = descripcion;
		this.fechaCompromiso = fechaCompromiso;
	}

	public Fecha getFechaCompromiso() {
		return fechaCompromiso;
	}

}
