package views;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import controllers.NewReportController;
import models.Informe;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class NewReportScreen extends JDialog {
	private JTextField txtId;
	private JTextField txtCod;
	private JTextField txtCreadoPor;
	private JTextField txtCreadoFecha;
	private JTextField txtActualizadoPor;
	private JTextField txtActualizadoFecha;

	NewReportController controller = new NewReportController();
	private JTextField txtOrden;
	private JTextField txtCodigoAPI;
	private JTextField txtRutaInforme;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewReportScreen dialog = new NewReportScreen();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public NewReportScreen() {
		setBounds(100, 100, 839, 641);
		
		JLabel lblNewLabel = new JLabel("ID INFORME");
		lblNewLabel.setBounds(20, 69, 89, 22);
		
		txtId = new JTextField();
		txtId.setBounds(153, 71, 61, 19);
		txtId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CODIGO INFORME");
		lblNewLabel_1.setBounds(335, 69, 126, 22);
		
		txtCod = new JTextField();
		txtCod.setBounds(476, 71, 185, 19);
		txtCod.setColumns(10);
		
		JLabel lblCreadoPor = new JLabel("CREADO POR");
		lblCreadoPor.setBounds(20, 123, 90, 22);
		
		txtCreadoPor = new JTextField();
		txtCreadoPor.setBounds(153, 125, 131, 19);
		txtCreadoPor.setColumns(10);
		
		JLabel lblCreadoFecha = new JLabel("CREADO FECHA");
		lblCreadoFecha.setBounds(332, 123, 90, 22);
		
		txtCreadoFecha = new JTextField();
		txtCreadoFecha.setBounds(478, 123, 131, 19);
		txtCreadoFecha.setColumns(10);
		
		JLabel lblActualizadoPor = new JLabel("ACTUALIZADO POR");
		lblActualizadoPor.setBounds(21, 189, 126, 22);
		
		txtActualizadoPor = new JTextField();
		txtActualizadoPor.setBounds(153, 191, 131, 19);
		txtActualizadoPor.setColumns(10);
		
		JLabel lblActualizadoFecha = new JLabel("ACTUALIZADO FECHA");
		lblActualizadoFecha.setBounds(335, 189, 152, 22);
		
		txtActualizadoFecha = new JTextField();
		txtActualizadoFecha.setBounds(478, 191, 131, 19);
		txtActualizadoFecha.setColumns(10);
		
		JButton btnNewButton = new JButton("Crear Informe");
		btnNewButton.setBounds(335, 570, 97, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Informe informe = new Informe();
				informe.setId(0);
				informe.setCodigo("0000000200");
				informe.setCreadoPor(1234);
				informe.setCreadoFecha(Date.valueOf(LocalDate.now()));
				informe.setActualizadoFecha(Date.valueOf(LocalDate.now()));
				informe.setActualizadoPor(1234);
				
				controller.createNewReport(informe, "PROD_GOPYP_COMMON");
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.setBounds(478, 570, 61, 34);
		getContentPane().setLayout(null);
		getContentPane().add(lblNewLabel_1);
		getContentPane().add(lblNewLabel);
		getContentPane().add(lblCreadoPor);
		getContentPane().add(lblCreadoFecha);
		getContentPane().add(lblActualizadoPor);
		getContentPane().add(lblActualizadoFecha);
		getContentPane().add(btnNewButton);
		getContentPane().add(btnNewButton_1);
		getContentPane().add(txtActualizadoPor);
		getContentPane().add(txtActualizadoFecha);
		getContentPane().add(txtCreadoFecha);
		getContentPane().add(txtCreadoPor);
		getContentPane().add(txtCod);
		getContentPane().add(txtId);
		
		JLabel lblNewLabel_2 = new JLabel("ORDEN(En la carpeta)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(20, 251, 127, 13);
		getContentPane().add(lblNewLabel_2);
		
		txtOrden = new JTextField();
		txtOrden.setBounds(155, 249, 96, 19);
		getContentPane().add(txtOrden);
		txtOrden.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Codigo API");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(335, 251, 71, 13);
		getContentPane().add(lblNewLabel_3);
		
		txtCodigoAPI = new JTextField();
		txtCodigoAPI.setBounds(478, 248, 315, 19);
		getContentPane().add(txtCodigoAPI);
		txtCodigoAPI.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("RUTA INFORME");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(20, 335, 89, 13);
		getContentPane().add(lblNewLabel_4);
		
		txtRutaInforme = new JTextField();
		txtRutaInforme.setBounds(153, 333, 640, 19);
		getContentPane().add(txtRutaInforme);
		txtRutaInforme.setColumns(10);
		
		JButton btnCargarParametros = new JButton("Cargar Parametros");
		btnCargarParametros.setBounds(153, 425, 126, 21);
		getContentPane().add(btnCargarParametros);
		
		JLabel lblNewLabel_5 = new JLabel("Elegir informe");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(20, 426, 89, 17);
		getContentPane().add(lblNewLabel_5);

	}
}
