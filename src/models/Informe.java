package models;

import java.util.Date;

public class Informe {

	private int id;
	private String codigo;
	private int creadoPor;
	private Date creadoFecha;
	private int actualizadoPor;
	private Date actualizadoFecha;
	
	public Informe(int id, String codigo, int creadoPor, Date creadoFecha, int actualizadoPor, Date actualizadoFecha) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.creadoPor = creadoPor;
		this.creadoFecha = creadoFecha;
		this.actualizadoPor = actualizadoPor;
		this.actualizadoFecha = actualizadoFecha;
	}

	public Informe() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCreadoPor() {
		return creadoPor;
	}

	public void setCreadoPor(int creadoPor) {
		this.creadoPor = creadoPor;
	}

	public Date getCreadoFecha() {
		return creadoFecha;
	}

	public void setCreadoFecha(Date creadoFecha) {
		this.creadoFecha = creadoFecha;
	}

	public int getActualizadoPor() {
		return actualizadoPor;
	}

	public void setActualizadoPor(int actualizadoPor) {
		this.actualizadoPor = actualizadoPor;
	}

	public Date getActualizadoFecha() {
		return actualizadoFecha;
	}

	public void setActualizadoFecha(Date actualizadoFecha) {
		this.actualizadoFecha = actualizadoFecha;
	}

	@Override
	public String toString() {
		return "Informe [id=" + id + ", codigo=" + codigo + ", creadoPor=" + creadoPor + ", creadoFecha=" + creadoFecha
				+ ", actualizadoPor=" + actualizadoPor + ", actualizadoFecha=" + actualizadoFecha + "]";
	}
	
	
}
