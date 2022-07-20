package models;

import java.util.Date;

public class InformeCarpetaLenguaje {

	private int idInformeCarpeta;
	private int idLenguaje;
	private String titulo;
	private int creadoPor;
	private Date creadoFecha;
	private int actualizadoPor;
	private Date actualizadoFecha;
	public InformeCarpetaLenguaje(int idInformeCarpeta, int idLenguaje, String titulo, int creadoPor, Date creadoFecha,
			int actualizadoPor, Date actualizadoFecha) {
		super();
		this.idInformeCarpeta = idInformeCarpeta;
		this.idLenguaje = idLenguaje;
		this.titulo = titulo;
		this.creadoPor = creadoPor;
		this.creadoFecha = creadoFecha;
		this.actualizadoPor = actualizadoPor;
		this.actualizadoFecha = actualizadoFecha;
	}
	public int getIdInformeCarpeta() {
		return idInformeCarpeta;
	}
	public void setIdInformeCarpeta(int idInformeCarpeta) {
		this.idInformeCarpeta = idInformeCarpeta;
	}
	public int getIdLenguaje() {
		return idLenguaje;
	}
	public void setIdLenguaje(int idLenguaje) {
		this.idLenguaje = idLenguaje;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
		return "InformeCarpetaLenguaje [idInformeCarpeta=" + idInformeCarpeta + ", idLenguaje=" + idLenguaje
				+ ", titulo=" + titulo + ", creadoPor=" + creadoPor + ", creadoFecha=" + creadoFecha
				+ ", actualizadoPor=" + actualizadoPor + ", actualizadoFecha=" + actualizadoFecha + "]";
	}

	
}
