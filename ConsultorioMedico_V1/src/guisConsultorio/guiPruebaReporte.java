package guisConsultorio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;

import Utilitarios.AbstractJasperReports;
import Utilitarios.conexionDB;

public class guiPruebaReporte implements ActionListener{

	private JFrame frmPruebaReporteestatico;
	private JButton btnNewButton;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiPruebaReporte window = new guiPruebaReporte();
					window.frmPruebaReporteestatico.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public guiPruebaReporte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPruebaReporteestatico = new JFrame();
		frmPruebaReporteestatico.setTitle("PRUEBA REPORTE(ESTATICO)");
		frmPruebaReporteestatico.setBounds(100, 100, 199, 175);
		frmPruebaReporteestatico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPruebaReporteestatico.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Mostrar Reporte");
		btnNewButton.setBounds(34, 45, 117, 43);
		frmPruebaReporteestatico.getContentPane().add(btnNewButton);
		btnNewButton.setActionCommand("mostrarReporte");
		btnNewButton.addActionListener(this);
	}
	public int sumaSimple(int num1,int num2)
	{
		int c=num1+num2;
		return c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String accion=e.getActionCommand();
		if(accion.equals("mostrarReporte"))
		{
			Connection cnx;
			cnx=conexionDB.getConexion();
			String strRuta="reportes/Prueba.jasper";
			AbstractJasperReports.createReport(cnx,strRuta);
			AbstractJasperReports.showViewer();
			//System.out.println(sumaSimple(3, 5));
		}
		// TODO Auto-generated method stub
		
	}
}
