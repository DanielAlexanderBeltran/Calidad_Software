/*
 * CRIOLLO RAMOS JOSE ANTONIO
 * PRUEBA PRG2 15 DE JULIO 2015
 * LLENAR Y DESPLEGAR UNA COLLECTION
 */

package guisConsultorio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import Utilitarios.conexionDB;
import clasesBean.pruebaBean;

public class Prueba extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private static ArrayList<String> lstEnfermedades=new ArrayList<String>();
	private JPanel contentPane;
	private static JButton btnLeer,btnDesplegar;
	private static pruebaBean objEnfermedades=new pruebaBean();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Prueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 btnLeer = new JButton("LEER");
		btnLeer.setBounds(67, 122, 89, 23);
		contentPane.add(btnLeer);
		btnLeer.setActionCommand("leer");
		btnLeer.addActionListener(this);
		btnLeer.setEnabled(true);
		
		 btnDesplegar = new JButton("DESPLEGAR");
		btnDesplegar.setBounds(240, 122, 89, 23);
		contentPane.add(btnDesplegar);
		btnDesplegar.setActionCommand("desplegar");
		btnDesplegar.addActionListener(this);
		btnDesplegar.setEnabled(false);
	}
	//funciones coneccion
	
	public void llenarArrayLis(ArrayList<String> lstGeneric, String strSqlQuery, int intNUmeroColumna)
	{
		Connection cnxGeneric;
		cnxGeneric=conexionDB.getConexion();
		try 
		{
			Statement us=cnxGeneric.createStatement();
			ResultSet res=us.executeQuery(strSqlQuery);
			while(res.next())
			{
				objEnfermedades.setEnfermedad(res.getString(intNUmeroColumna));
				lstGeneric.add(objEnfermedades.getEnfermedad());
				objEnfermedades.setEnfermedad("");
			}
			res.close();
			cnxGeneric.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	//fin funcion coneccion 
	private void activar()
	{
		btnLeer.setEnabled(false);
		btnDesplegar.setEnabled(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String accion=e.getActionCommand();
		if(accion.equals("leer"))
		{

			String strsqlr="select descripcionCie from cie";
			llenarArrayLis(lstEnfermedades, strsqlr, 1);
			activar();
			
		}
		if(accion.equals("desplegar"))
		{
			for(String aux:lstEnfermedades){
				System.out.println(aux);}
			lstEnfermedades=new ArrayList<String>();
		}
	
	}
}
