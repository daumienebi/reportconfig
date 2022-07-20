package models;

import java.util.Date;

public class InformeLenguaje {

	private int idInforme;
	private int idLenguaje;
	private String titulo;
	private String comentario;
	private Date creadoFecha;
	private int actualizadoPor;
	private Date actualizadoFecha;
	public InformeLenguaje(int idInforme, int idLenguaje, String titulo, String comentario, Date creadoFecha,
			int actualizadoPor, Date actualizadoFecha) {
		super();
		this.idInforme = idInforme;
		this.idLenguaje = idLenguaje;
		this.titulo = titulo;
		this.comentario = comentario;
		this.creadoFecha = creadoFecha;
		this.actualizadoPor = actualizadoPor;
		this.actualizadoFecha = actualizadoFecha;
	}
	public int getIdInforme() {
		return idInforme;
	}
	public void setIdInforme(int idInforme) {
		this.idInforme = idInforme;
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
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
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
		return "InformeLenguaje [idInforme=" + idInforme + ", idLenguaje=" + idLenguaje + ", titulo=" + titulo
				+ ", comentario=" + comentario + ", creadoFecha=" + creadoFecha + ", actualizadoPor=" + actualizadoPor
				+ ", actualizadoFecha=" + actualizadoFecha + "]";
	}
	
	
}
