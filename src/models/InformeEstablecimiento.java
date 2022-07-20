package models;

import java.util.Date;

public class InformeEstablecimiento {

	private int id;
	private int idEstablecimiento;
	private int idInforme;
	private String idInformeAPI;
	private String codigoInforme;
	private String nombre;
	private String ruta;
	private int creadoPor;
	private Date creadoFecha;
	private int actualizadoPor;
	private Date actualizadoFecha;
	
	public InformeEstablecimiento(int id, int idEstablecimiento, int idInforme, String idInformeAPI,
			String codigoInforme, String nombre, String ruta, int creadoPor, Date creadoFecha, int actualizadoPor,
			Date actualizadoFecha) {
		super();
		this.id = id;
		this.idEstablecimiento = idEstablecimiento;
		this.idInforme = idInforme;
		this.idInformeAPI = idInformeAPI;
		this.codigoInforme = codigoInforme;
		this.nombre = nombre;
		this.ruta = ruta;
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

	public int getIdInforme() {
		return idInforme;
	}

	public void setIdInforme(int idInforme) {
		this.idInforme = idInforme;
	}

	public String getIdInformeAPI() {
		return idInformeAPI;
	}

	public void setIdInformeAPI(String idInformeAPI) {
		this.idInformeAPI = idInformeAPI;
	}

	public String getCodigoInforme() {
		return codigoInforme;
	}

	public void setCodigoInforme(String codigoInforme) {
		this.codigoInforme = codigoInforme;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
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
		return "InformeEstablecimiento [id=" + id + ", idEstablecimiento=" + idEstablecimiento + ", idInforme="
				+ idInforme + ", idInformeAPI=" + idInformeAPI + ", codigoInforme=" + codigoInforme + ", nombre="
				+ nombre + ", ruta=" + ruta + ", creadoPor=" + creadoPor + ", creadoFecha=" + creadoFecha
				+ ", actualizadoPor=" + actualizadoPor + ", actualizadoFecha=" + actualizadoFecha + "]";
	}
	
	
}
