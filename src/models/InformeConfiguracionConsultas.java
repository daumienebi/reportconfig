package models;

import java.util.Date;

public class InformeConfiguracionConsultas {

	private int id;
	private int idInformeEstablecimiento;
	private String codigo;
	private String consulta;
	private int creadoPor;
	private Date creadoFecha;
	private int actualizadoPor;
	private Date actualizadoFecha;
	
	
	
	
	public InformeConfiguracionConsultas(int id, int idInformeEstablecimiento, String codigo, String consulta,
			int creadoPor, Date creadoFecha, int actualizadoPor, Date actualizadoFecha) {
		super();
		this.id = id;
		this.idInformeEstablecimiento = idInformeEstablecimiento;
		this.codigo = codigo;
		this.consulta = consulta;
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




	public int getIdInformeEstablecimiento() {
		return idInformeEstablecimiento;
	}




	public void setIdInformeEstablecimiento(int idInformeEstablecimiento) {
		this.idInformeEstablecimiento = idInformeEstablecimiento;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
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
		return "InformeConfiguracionConsultas [id=" + id + ", idInformeEstablecimiento=" + idInformeEstablecimiento
				+ ", codigo=" + codigo + ", consulta=" + consulta + ", creadoPor=" + creadoPor + ", creadoFecha="
				+ creadoFecha + ", actualizadoPor=" + actualizadoPor + ", actualizadoFecha=" + actualizadoFecha + "]";
	}

	
}
