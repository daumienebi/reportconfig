package models;

import java.util.Date;

public class InformeConfiguracionParametros {

	private int id;
	private int idInformeEstablecimiento;
	private String codigo;
	private int idTipoParametro;
	private String nombreParametro;
	private String parametro;
	private String subconsulta;
	private int idTipoControl;
	private int idTipoDato;
	private String grupoControl;
	private String valorDefecto;
	private boolean parametroInforme;
	private boolean obligatorio;
	private String codTipoEntidad;
	private boolean bdComun;
	private String tablaRelacion;
	private String campoMostrarBD;
	private int creadoPor;
	private Date creadoFecha;
	private int actualizadoPor;
	private Date actualizadoFecha;
	
	public InformeConfiguracionParametros(int id, int idInformeEstablecimiento, String codigo, int idTipoParametro,
			String nombreParametro, String parametro, String subconsulta, int idTipoControl, int idTipoDato,
			String grupoControl, String valorDefecto, boolean parametroInforme, boolean obligatorio,
			String codTipoEntidad, boolean bdComun, String tablaRelacion, String campoMostrarBD, int creadoPor,
			Date creadoFecha, int actualizadoPor, Date actualizadoFecha) {
		super();
		this.id = id;
		this.idInformeEstablecimiento = idInformeEstablecimiento;
		this.codigo = codigo;
		this.idTipoParametro = idTipoParametro;
		this.nombreParametro = nombreParametro;
		this.parametro = parametro;
		this.subconsulta = subconsulta;
		this.idTipoControl = idTipoControl;
		this.idTipoDato = idTipoDato;
		this.grupoControl = grupoControl;
		this.valorDefecto = valorDefecto;
		this.parametroInforme = parametroInforme;
		this.obligatorio = obligatorio;
		this.codTipoEntidad = codTipoEntidad;
		this.bdComun = bdComun;
		this.tablaRelacion = tablaRelacion;
		this.campoMostrarBD = campoMostrarBD;
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

	public int getIdTipoParametro() {
		return idTipoParametro;
	}

	public void setIdTipoParametro(int idTipoParametro) {
		this.idTipoParametro = idTipoParametro;
	}

	public String getNombreParametro() {
		return nombreParametro;
	}

	public void setNombreParametro(String nombreParametro) {
		this.nombreParametro = nombreParametro;
	}

	public String getParametro() {
		return parametro;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

	public String getSubconsulta() {
		return subconsulta;
	}

	public void setSubconsulta(String subconsulta) {
		this.subconsulta = subconsulta;
	}

	public int getIdTipoControl() {
		return idTipoControl;
	}

	public void setIdTipoControl(int idTipoControl) {
		this.idTipoControl = idTipoControl;
	}

	public int getIdTipoDato() {
		return idTipoDato;
	}

	public void setIdTipoDato(int idTipoDato) {
		this.idTipoDato = idTipoDato;
	}

	public String getGrupoControl() {
		return grupoControl;
	}

	public void setGrupoControl(String grupoControl) {
		this.grupoControl = grupoControl;
	}

	public String getValorDefecto() {
		return valorDefecto;
	}

	public void setValorDefecto(String valorDefecto) {
		this.valorDefecto = valorDefecto;
	}

	public boolean isParametroInforme() {
		return parametroInforme;
	}

	public void setParametroInforme(boolean parametroInforme) {
		this.parametroInforme = parametroInforme;
	}

	public boolean isObligatorio() {
		return obligatorio;
	}

	public void setObligatorio(boolean obligatorio) {
		this.obligatorio = obligatorio;
	}

	public String getCodTipoEntidad() {
		return codTipoEntidad;
	}

	public void setCodTipoEntidad(String codTipoEntidad) {
		this.codTipoEntidad = codTipoEntidad;
	}

	public boolean isBdComun() {
		return bdComun;
	}

	public void setBdComun(boolean bdComun) {
		this.bdComun = bdComun;
	}

	public String getTablaRelacion() {
		return tablaRelacion;
	}

	public void setTablaRelacion(String tablaRelacion) {
		this.tablaRelacion = tablaRelacion;
	}

	public String getCampoMostrarBD() {
		return campoMostrarBD;
	}

	public void setCampoMostrarBD(String campoMostrarBD) {
		this.campoMostrarBD = campoMostrarBD;
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
		return "InformeConfiguracionParametros [id=" + id + ", idInformeEstablecimiento=" + idInformeEstablecimiento
				+ ", codigo=" + codigo + ", idTipoParametro=" + idTipoParametro + ", nombreParametro=" + nombreParametro
				+ ", parametro=" + parametro + ", subconsulta=" + subconsulta + ", idTipoControl=" + idTipoControl
				+ ", idTipoDato=" + idTipoDato + ", grupoControl=" + grupoControl + ", valorDefecto=" + valorDefecto
				+ ", parametroInforme=" + parametroInforme + ", obligatorio=" + obligatorio + ", codTipoEntidad="
				+ codTipoEntidad + ", bdComun=" + bdComun + ", tablaRelacion=" + tablaRelacion + ", campoMostrarBD="
				+ campoMostrarBD + ", creadoPor=" + creadoPor + ", creadoFecha=" + creadoFecha + ", actualizadoPor="
				+ actualizadoPor + ", actualizadoFecha=" + actualizadoFecha + "]";
	}

	
	
}
