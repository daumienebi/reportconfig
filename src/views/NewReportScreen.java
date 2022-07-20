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

public class NewReportScreen extends JDialog {
	private JTextField txtId;
	private JTextField txtCod;
	private JTextField txtCreadoPor;
	private JTextField txtCreadoFecha;
	private JTextField txtActualizadoPor;
	private JTextField txtActualizadoFecha;

	NewReportController controller = new NewReportController();
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
		setBounds(100, 100, 425, 490);
		
		JLabel lblNewLabel = new JLabel("ID INFORME");
		
		txtId = new JTextField();
		txtId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CODIGO INFORME");
		
		txtCod = new JTextField();
		txtCod.setColumns(10);
		
		JLabel lblCreadoPor = new JLabel("CREADO POR");
		
		txtCreadoPor = new JTextField();
		txtCreadoPor.setColumns(10);
		
		JLabel lblCreadoFecha = new JLabel("CREADO FECHA");
		
		txtCreadoFecha = new JTextField();
		txtCreadoFecha.setColumns(10);
		
		JLabel lblActualizadoPor = new JLabel("ACTUALIZADO POR");
		
		txtActualizadoPor = new JTextField();
		txtActualizadoPor.setColumns(10);
		
		JLabel lblActualizadoFecha = new JLabel("ACTUALIZADO FECHA");
		
		txtActualizadoFecha = new JTextField();
		txtActualizadoFecha.setColumns(10);
		
		JButton btnNewButton = new JButton("Crear Informe");
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
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
										.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
									.addComponent(lblCreadoPor, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblCreadoFecha, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblActualizadoPor, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblActualizadoFecha, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
							.addGap(29))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(68)
							.addComponent(btnNewButton)
							.addGap(32)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton_1)
							.addContainerGap(119, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtActualizadoPor, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtActualizadoFecha, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCreadoFecha, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCreadoPor, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(txtCod, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addComponent(txtId, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
							.addGap(77))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(69)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCreadoPor, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCreadoPor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCreadoFecha, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCreadoFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActualizadoPor, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtActualizadoPor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActualizadoFecha, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtActualizadoFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);

	}
}
