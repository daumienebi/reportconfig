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
}
