package controllers;

import models.Informe;

public class NewReportController{

	private static String n = "\n"; // \n
	private static String op = "("; //open parentheses
	private static String cp = ")"; //close parentheses
	private static String ob = "[";	//close bracket
	private static String cb = "]";	//close bracket
	private static String c = ",";	//close bracket
	private static String NULL = "NULL";
	
    public void createNewReport(Informe informe,String bdName){
    	//maybe return int to get the report id
        String script = "";
        script = "USE "+ "["+bdName+"]"+n+
        "GO"+n+
        "INSERT INTO [dbo].[Informe]"+n+
        			op+
        			ob+"Codigo"+cb+n+c+
        			ob+"CreadoPor"+cb+n+c+
        			ob+"CreadoFecha"+cb+n+c+
        			ob+"ActualizadoPor"+cb+n+c+
        			ob+"ActualizadoFecha"+cb+cp+n+n+
        	"VALUES" +n+
        			op+addQmarks(informe.getCodigo())+n+c+
        			informe.getCreadoPor()+n+c+
        			NULL+n+c+
        			NULL+n+c+
        			NULL+cp+n+
        			//informe.getCreadoFecha()+n+c+
        			//informe.getActualizadoPor()+n+c+
        			//informe.getActualizadoFecha()+cp+n+
        "GO";
        print(script);
        		
    }
    
    public void generateInformeLenguaje(Informe informe) {
    	String script = "";
        script =
        "GO"+n+
        "INSERT INTO [dbo].[Informe]"+n+
        			op+
        			ob+"Codigo"+cb+n+c+
        			ob+"CreadoPor"+cb+n+c+
        			ob+"CreadoFecha"+cb+n+c+
        			ob+"ActualizadoPor"+cb+n+c+
        			ob+"ActualizadoFecha"+cb+cp+n+n+
        	"VALUES" +n+
        			op+addQmarks(informe.getCodigo())+n+c+
        			informe.getCreadoPor()+n+c+
        			NULL+n+c+
        			NULL+n+c+
        			NULL+cp+n+
        			//informe.getCreadoFecha()+n+c+
        			//informe.getActualizadoPor()+n+c+
        			//informe.getActualizadoFecha()+cp+n+
        "GO";
    }
    
    
    private String addQmarks(String txt) {
    	return "\'"+txt+"\'";
    }
    
    private static void print(String msg) {
    	System.out.println(msg);
    }
}