package models;

import java.util.Date;

public class InformeCarpeta {
	private int id;
	private int idEstablecimiento;
	private int idCarpetaPadre;
	private int orden;
	private boolean isInforme;
	private int idInforme;
	private String nivelConfidencialidad;
	private String tipoInforme;
	private int idGrupoMenuPrincipal;
	private String codigoGrupoMenuPrincipal;
	private int creadoPor;
	private Date creadoFecha;
	private int actualizadoPor;
	private Date actualizadoFecha;
	public InformeCarpeta(int id, int idEstablecimiento, int idCarpetaPadre, int orden, boolean isInforme,
			int idInforme, String nivelConfidencialidad, String tipoInforme, int idGrupoMenuPrincipal,
			String codigoGrupoMenuPrincipal, int creadoPor, Date creadoFecha, int actualizadoPor,
			Date actualizadoFecha) {
		super();
		this.id = id;
		this.idEstablecimiento = idEstablecimiento;
		this.idCarpetaPadre = idCarpetaPadre;
		this.orden = orden;
		this.isInforme = isInforme;
		this.idInforme = idInforme;
		this.nivelConfidencialidad = nivelConfidencialidad;
		this.tipoInforme = tipoInforme;
		this.idGrupoMenuPrincipal = idGrupoMenuPrincipal;
		this.codigoGrupoMenuPrincipal = codigoGrupoMenuPrincipal;
		this.creadoPor = creadoPor;
		this.creadoFecha = creadoFecha;
		this.actualizadoPor = actualizadoPor;
		this.actualizadoFecha = actualizadoFecha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdEstablecimiento() {
		return idEstablecimiento;
	}
	public void setIdEstablecimiento(int idEstablecimiento) {
		this.idEstablecimiento = idEstablecimiento;
	}
	public int getIdCarpetaPadre() {
		return idCarpetaPadre;
	}
	public void setIdCarpetaPadre(int idCarpetaPadre) {
		this.idCarpetaPadre = idCarpetaPadre;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	public boolean isInforme() {
		return isInforme;
	}
	public void setInforme(boolean isInforme) {
		this.isInforme = isInforme;
	}
	public int getIdInforme() {
		return idInforme;
	}
	public void setIdInforme(int idInforme) {
		this.idInforme = idInforme;
	}
	public String getNivelConfidencialidad() {
		return nivelConfidencialidad;
	}
	public void setNivelConfidencialidad(String nivelConfidencialidad) {
		this.nivelConfidencialidad = nivelConfidencialidad;
	}
	public String getTipoInforme() {
		return tipoInforme;
	}
	public void setTipoInforme(String tipoInforme) {
		this.tipoInforme = tipoInforme;
	}
	public int getIdGrupoMenuPrincipal() {
		return idGrupoMenuPrincipal;
	}
	public void setIdGrupoMenuPrincipal(int idGrupoMenuPrincipal) {
		this.idGrupoMenuPrincipal = idGrupoMenuPrincipal;
	}
	public String getCodigoGrupoMenuPrincipal() {
		return codigoGrupoMenuPrincipal;
	}
	public void setCodigoGrupoMenuPrincipal(String codigoGrupoMenuPrincipal) {
		this.codigoGrupoMenuPrincipal = codigoGrupoMenuPrincipal;
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
		return "InformeCarpeta [id=" + id + ", idEstablecimiento=" + idEstablecimiento + ", idCarpetaPadre="
				+ idCarpetaPadre + ", orden=" + orden + ", isInforme=" + isInforme + ", idInforme=" + idInforme
				+ ", nivelConfidencialidad=" + nivelConfidencialidad + ", tipoInforme=" + tipoInforme
				+ ", idGrupoMenuPrincipal=" + idGrupoMenuPrincipal + ", codigoGrupoMenuPrincipal="
				+ codigoGrupoMenuPrincipal + ", creadoPor=" + creadoPor + ", creadoFecha=" + creadoFecha
				+ ", actualizadoPor=" + actualizadoPor + ", actualizadoFecha=" + actualizadoFecha + "]";
	}
	
	
}
