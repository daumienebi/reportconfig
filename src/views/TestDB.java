package views;

import java.sql.Date;
import java.time.LocalDate;

import models.Informe;
import utils.DbConnection;

public class TestDB {

	public static void main(String[] args) {
		//System.out.print("a");
		//DbConnection.connect();
		//DbConnection.showConnectionDetails();
		
		Informe informe  = new Informe(1,"0000000200",1223,
				Date.valueOf(LocalDate.now()),23,Date.valueOf(LocalDate.now()));
		informe.toString();
	}
}
