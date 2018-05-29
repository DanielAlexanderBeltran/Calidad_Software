/* PROGRAMACION II
 * Nombre de la gui: Gui registrar especialidad medica
 * Nombres: - Criollo Ramos José Antonio
 *          - GUaraca Sislema Oscar Ramiro
 *          - López Moreno Rubby Gabriela
 * Fecha de entrega: 2015-07-27
 * Objetivo: Implementar la clase guiRegistPaciente para capturar datos a
 *  través de una clase bean mediante la GUI
 */
package guisConsultorio;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import clasesBean.RegistrarPacienteBean;
import Utilitarios.*;

public class guiRegistrarPaciente extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	public static JPanel jpPanelIds,jpDatosPaciente,jpDatosPaciente2,jpDespliegue,jpCotroles;
	public static JLabel jlbIdPersona,JlbIdPaciente,jlbIdParr, jlbIdCant, jlbIdProv;//panel ids
	public static JTextField jtfIdPersona,jtfIdPaciente,jtfIdParr, jtfIdCant, jtfIdProv;//panel ids
	//inicio variables panel jpDatos Paciente
	public static JLabel jlbCi,jlbNroHistClinica,jlbApellido1,jlbApellido2,jlbNombre1,jlbNombre2,jlbTelefonoReferencial,jlbDireccion,jlbSexo,jlbProvincia,jlbCanton,jlbParroquia,jlbLugarResidencia,jlbFechaNac,jlbFacultad,jlbEmail;
	public static JTextField jtfCi,jtfNroHistClinica,jtfApellido1,jtfApellido2,jtfNombre1,jtfNombre2,jtfTelefonoReferencial,jtfDireccion,jtfFechaNac,jtfFacultad,jtfEmail ;
	public static JRadioButton jroMasculino,jroFemenino;
	public static ButtonGroup jroGrGenero;
	@SuppressWarnings("rawtypes")
	public static JComboBox jcbProvincia,jcbCanton,jcbParroquia;
	//fin variables panel jpDatos Paciente
	//---------------------------------------------------------------------------------------------------------
	//inicio variables panel despliegue
	private static JLabel jlbDesplieguePacientes;
	private static JTable jtbTablaDespliegue;
	private static DefaultTableModel modeloTablaDespliegue;
	//fin variables panel despliegue
	//---------------------------------------------------------------------------------------------------------
	//inicio variables panel controles
	private static JButton jbtGrabar, jbtCancelar,jbtSalir;//jbtEliminar;
	//gestion de gui y db
	private static operacionesSobreDB objGestionDBRP=new operacionesSobreDB();
	private static operacionesSobreGUI objGestionGui =new operacionesSobreGUI();
	//fin variables panel controles
	//variables de control 
	private static ArrayList<Integer> pos1=new ArrayList<Integer>(), pos2=new ArrayList<Integer>() ;
	private static RegistrarPacienteBean objRegistPac=new RegistrarPacienteBean();
	private static String strMsjErrorRegPac="";
	private static String strArrColsTblPersona[]=objGestionDBRP.obtnerColumNames("Persona");
	private static String strArrColsTblPaciente[]=objGestionDBRP.obtnerColumNames("Paciente");
	private static String strSql="SELECT pac.idPersonaPac, pac.idPaciente, lpar.idLugarGeo, lcant.idLugarGeo, "
			+ "lprov.idLugarGeo,per.cedulaPer,pac.idHIstClinica,per.apellido1Per,per.apellido2Per, "
			+ "per.nombre1Per,per.nombre2Per,per.telefonoPer, pac.direccionPac, pac.sexo, "
			+ "lprov.descripcionLugarGeo,lcant.descripcionLugarGeo,lpar.descripcionLugarGeo, "
			+ "pac.fechaNacPac "
			+"from persona per, paciente pac, lugargeo lpar, lugargeo lcant, lugargeo lprov "+
			"where pac.idPersonaPac=per.idPersona and lpar.idLugarGeo=pac.idLugarGeoResid and "
			+ "lcant.idLugarGeo=lpar.idLugarGeoPadre and lprov.idLugarGeo=lcant.idLugarGeoPadre;";
	private static boolean blnCompAct=false;
	public guiRegistrarPaciente()
	{
		JFrame jfVentanaRegPaciente=new JFrame("REGISTRAR PACIENTE");
		jfVentanaRegPaciente.setLayout(null);
		jfVentanaRegPaciente.setLocation(100, 20);
		jfVentanaRegPaciente.setResizable(false);
		jfVentanaRegPaciente.setVisible(true);
		panelids();
		datospaciente();
		datospaciente2();
		panelDespliegue();
		panelControles();
		jpPanelIds.setBounds(10, 10, 580,50);
		jpDatosPaciente.setBounds(10, 60, 350, 250);
		jpDatosPaciente2.setBounds(360, 60, 230, 250);
		jpDespliegue.setBounds(10, 310, 580, 300);
		jpCotroles.setBounds(10, 630, 580, 40);
		jfVentanaRegPaciente.add(jpPanelIds);
		jfVentanaRegPaciente.add(jpDatosPaciente);
		jfVentanaRegPaciente.add(jpDatosPaciente2);
		jfVentanaRegPaciente.add(jpCotroles);
		jfVentanaRegPaciente.add(jpDespliegue);
		jfVentanaRegPaciente.setSize(600, 700);
		//jfmmainwindow.setSize(1024, 750);
	}
	public void panelids()
	{
		jpPanelIds=new JPanel(new FlowLayout());
		jlbIdPersona=new JLabel("IdPersona:");JlbIdPaciente=new JLabel("IdPaciente:");jlbIdParr=new JLabel("IdParr");jlbIdCant=new JLabel("IdCant"); jlbIdProv=new JLabel("IdProv");
		jtfIdPersona=new JTextField(3);jtfIdPaciente=new JTextField(3);jtfIdParr=new JTextField(3); jtfIdCant=new JTextField(3); jtfIdProv=new JTextField(3);
		jpPanelIds.add(jlbIdPersona);jpPanelIds.add(jtfIdPersona);jpPanelIds.add(JlbIdPaciente);jpPanelIds.add(jtfIdPaciente);
		jpPanelIds.add(jlbIdParr);jpPanelIds.add(jtfIdParr);jpPanelIds.add(jlbIdCant);jpPanelIds.add(jtfIdCant);jpPanelIds.add(jlbIdProv);jpPanelIds.add(jtfIdProv);
		//desactivando textfieldsd de ids
		jtfIdPersona.setEnabled(false);
		jtfIdPaciente.setEnabled(false);
		jtfIdParr.setEnabled(false);
		jtfIdCant.setEnabled(false);
		jtfIdProv.setEnabled(false);
		jpPanelIds.setBorder(new TitledBorder(new EtchedBorder(), "Panel Ids"));
		jpPanelIds.setVisible(true);
	}
	public void datospaciente()
	{
		jpDatosPaciente=new JPanel(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		jlbCi=new JLabel("CI ");jtfCi=new JTextField(20);
		jlbNroHistClinica=new JLabel("Nro. Hist. Clínica ");jtfNroHistClinica=new JTextField(20);
		jlbApellido1=new JLabel("Apellido 1");jtfApellido1=new JTextField(20);
		jlbApellido2=new JLabel("Apellido 2");jtfApellido2=new JTextField(20);
		jlbNombre1=new JLabel("Nombre 1");jtfNombre1=new JTextField(20);
		jlbNombre2=new JLabel("Nombre 2");jtfNombre2=new JTextField(20);
		jlbTelefonoReferencial=new JLabel("Telefono Ref. ");jtfTelefonoReferencial=new JTextField(20);
		jlbDireccion=new JLabel("Direccion");jtfDireccion=new JTextField(20);
		jlbFechaNac=new JLabel("Fecha Nac.");jtfFechaNac=new JTextField(20);
		jlbFacultad=new JLabel("Facultad.");jtfFacultad=new JTextField(20);
		jlbEmail=new JLabel("Email.");jtfEmail=new JTextField(20);
		//primera fila
		gbc.anchor=GridBagConstraints.WEST;
		gbc.gridwidth=1;
		jpDatosPaciente.add(jlbCi,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente.add(jtfCi,gbc);
		//segunda fila
		gbc.gridwidth=1;
		jpDatosPaciente.add(jlbNroHistClinica,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente.add(jtfNroHistClinica,gbc);
		//tercera  fila
		gbc.gridwidth=1;
		jpDatosPaciente.add(jlbApellido1,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente.add(jtfApellido1,gbc);
		//cuarta fila
		gbc.gridwidth=1;
		jpDatosPaciente.add(jlbApellido2,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente.add(jtfApellido2,gbc);
		//quinta fila
		gbc.gridwidth=1;
		jpDatosPaciente.add(jlbNombre1,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente.add(jtfNombre1,gbc);
		//sexta fila
		gbc.gridwidth=1;
		jpDatosPaciente.add(jlbNombre2,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente.add(jtfNombre2,gbc);
		//septima fila 
		gbc.gridwidth=1;
		jpDatosPaciente.add(jlbTelefonoReferencial,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente.add(jtfTelefonoReferencial,gbc);
		//octava fila
		gbc.gridwidth=1;
		jpDatosPaciente.add(jlbDireccion,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente.add(jtfDireccion,gbc);
		//novena fila 
		gbc.gridwidth=1;
		jpDatosPaciente.add(jlbFechaNac,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente.add(jtfFechaNac,gbc);
		//decima fila 
		gbc.gridwidth=1;
		jpDatosPaciente.add(jlbFacultad,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente.add(jtfFacultad,gbc);
		//undecima fila 
		gbc.gridwidth=1;
		jpDatosPaciente.add(jlbEmail,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente.add(jtfEmail,gbc);
		//duodecima fila
		jpDatosPaciente.setBorder(new TitledBorder(new EtchedBorder(), "Datos paciente"));
		jpDatosPaciente.setVisible(true);
		//añadiendo validacion en tiempo real 
		objGestionGui.sNumeros(jtfCi, 10);
		objGestionGui.sNumeros(jtfNroHistClinica, 3);
		objGestionGui.sLetras(jtfApellido1, 15);
		objGestionGui.sLetras(jtfApellido2, 15);
		objGestionGui.sLetras(jtfNombre1, 15);
		objGestionGui.sLetras(jtfNombre2, 15);
		objGestionGui.sNumeros(jtfTelefonoReferencial, 10);
		objGestionGui.sTamañoJtfield(jtfDireccion, 100);
		objGestionGui.sLetras(jtfFacultad, 15);
		objGestionGui.sLetras(jtfEmail, 15);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void datospaciente2()
	{
		jpDatosPaciente2=new JPanel(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		jroFemenino=new JRadioButton("FEMENINO                ");jroMasculino=new JRadioButton("MASCULINO                 ");
		jroGrGenero=new ButtonGroup();
		jroGrGenero.add(jroFemenino);jroGrGenero.add(jroMasculino);
		jlbSexo=new JLabel("GÉNERO");
		jlbLugarResidencia=new JLabel("LUGAR DE RESIDENCIA");
		jlbProvincia=new JLabel("Provincia ");
		jlbCanton=new JLabel("Canton ");
		jlbParroquia=new JLabel("Parroquia ");
		jcbProvincia=new JComboBox();jcbProvincia.addActionListener(this);
		jcbProvincia.addItem("Seleccione Provincia");
		jcbCanton=new JComboBox();jcbCanton.addActionListener(this);
		jcbCanton.addItem("Seleccione Canton");
		jcbParroquia=new JComboBox();jcbParroquia.addActionListener(this);
		jcbParroquia.addItem("Seleccione Parroquia");
		//inicio asignacion dinamica de combos
		String strAuxLG="select descripcionLugarGeo from lugargeo where length(codigoLugarGeo)=2";
		objGestionDBRP.llenarCombo(jcbProvincia, strAuxLG);
		
		
		/*String straux="SELECT cant.descripcionLugarGeo FROM lugargeo cant, lugargeo pro "
				+ "WHERE cant.idLugarGeoPadre=pro.idLugarGeo and pro.descripcionLugarGeo='PICHINCHA'";
		objGestionRP.llenarCombo(jcbCanton, straux);*/
				//fin asignacion dinamica de combos
		
		//primera fila
		gbc.anchor=GridBagConstraints.CENTER;
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente2.add(jlbSexo,gbc);
		//segunda fila
		gbc.anchor=GridBagConstraints.WEST;
		jpDatosPaciente2.add(jroMasculino,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente2.add(jroFemenino,gbc);
		//TERCERA FILA
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente2.add(new JLabel(" "),gbc);
		////////////////////////////////////////
		gbc.anchor=GridBagConstraints.CENTER;
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente2.add(jlbLugarResidencia,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente2.add(new JLabel(" "),gbc);
		//cuarta fila
		gbc.anchor=GridBagConstraints.WEST;
		gbc.gridwidth=1;
		jpDatosPaciente2.add(jlbProvincia,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente2.add(jcbProvincia,gbc);
		//quinta fila
		gbc.gridwidth=1;
		jpDatosPaciente2.add(jlbCanton,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente2.add(jcbCanton,gbc);
		//sexta fila 
		gbc.gridwidth=1;
		jpDatosPaciente2.add(jlbParroquia,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPaciente2.add(jcbParroquia,gbc);
		
		jpDatosPaciente2.setBorder(new TitledBorder(new EtchedBorder(), "Datos paciente"));
		jpDatosPaciente2.setVisible(true);
	}
	public void panelDespliegue()
	{
		jpDespliegue=new JPanel(new BorderLayout());
		jlbDesplieguePacientes=new JLabel("DESPLIEGUE DE PACIENTES",SwingConstants.CENTER);
		jtbTablaDespliegue=new JTable();
		jtbTablaDespliegue.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		modeloTablaDespliegue=new DefaultTableModel()
		{//inicio control tabkla editable
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) 
			{
			return false;//editable:true, no editable:false
			}
		};
		jtbTablaDespliegue.setModel(modeloTablaDespliegue);
		modeloTablaDespliegue.addColumn("Id Persona");
		modeloTablaDespliegue.addColumn("Id Paciente");
		modeloTablaDespliegue.addColumn("Id LugarGeoPar");
		modeloTablaDespliegue.addColumn("Id LugarGeoCant");
		modeloTablaDespliegue.addColumn("Id LugarGeoProv");
		modeloTablaDespliegue.addColumn("Cedula");
		modeloTablaDespliegue.addColumn("Nro.Hist. Clinica");
		modeloTablaDespliegue.addColumn("Apellido 1");
		modeloTablaDespliegue.addColumn("Apellido 2");
		modeloTablaDespliegue.addColumn("Nombre 1");
		modeloTablaDespliegue.addColumn("Nombre 2");
		modeloTablaDespliegue.addColumn("Teléfono");
		modeloTablaDespliegue.addColumn("Dirección");
		modeloTablaDespliegue.addColumn("Sexo");
		modeloTablaDespliegue.addColumn("Provincia");
		modeloTablaDespliegue.addColumn("Canton");
		modeloTablaDespliegue.addColumn("Parroquia");
		modeloTablaDespliegue.addColumn("Fecha Nacimiento");
		TableColumnModel columnModelTbDespliegue=jtbTablaDespliegue.getColumnModel();
		for (int i = 0; i < modeloTablaDespliegue.getColumnCount(); i++) 
		{
			columnModelTbDespliegue.getColumn(i).setPreferredWidth(100);
		}
		//inicio escuchadores
		jtbTablaDespliegue.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e)
			{
				JTable table =(JTable) e.getSource();
				Point point =e.getPoint();
				int row = table.rowAtPoint(point);//row devolvera -1 si se ha clicado fuera de la fila pero dentro de la tabla, si no devolvera el indice de la fila en la que se ha clicado. 
				if (e.getClickCount() == 2) 
				{
					//panel ids
					jtfIdPersona.setText(jtbTablaDespliegue.getValueAt(row, 0).toString());
					jtfIdPaciente.setText(jtbTablaDespliegue.getValueAt(row, 1).toString());
					jtfIdParr.setText(jtbTablaDespliegue.getValueAt(row, 2).toString());
					jtfIdCant.setText(jtbTablaDespliegue.getValueAt(row, 3).toString());
					jtfIdProv.setText(jtbTablaDespliegue.getValueAt(row, 4).toString());
					//panel datos Paciente 1
					jtfCi.setText(jtbTablaDespliegue.getValueAt(row, 5).toString());
					jtfNroHistClinica.setText(jtbTablaDespliegue.getValueAt(row, 6).toString());
					jtfApellido1.setText(jtbTablaDespliegue.getValueAt(row, 7).toString());
					jtfApellido2.setText(jtbTablaDespliegue.getValueAt(row, 8).toString());
					jtfNombre1.setText(jtbTablaDespliegue.getValueAt(row, 9).toString());
					jtfNombre2.setText(jtbTablaDespliegue.getValueAt(row, 10).toString());
					jtfTelefonoReferencial.setText(jtbTablaDespliegue.getValueAt(row, 11).toString());
					jtfDireccion.setText(jtbTablaDespliegue.getValueAt(row, 12).toString());
					//panel datos paciente 2
					if(jtbTablaDespliegue.getValueAt(row, 13).toString().equals("M"))
					{
						jroMasculino.setSelected(true);
					}
					else
					{
						jroFemenino.setSelected(true);
					}
					jcbProvincia.setSelectedItem(jtbTablaDespliegue.getValueAt(row, 14).toString());
					jcbCanton.setSelectedItem(jtbTablaDespliegue.getValueAt(row, 15).toString());
					jcbParroquia.setSelectedItem(jtbTablaDespliegue.getValueAt(row, 16).toString());
					jtfFechaNac.setText(jtbTablaDespliegue.getValueAt(row, 17).toString());
					//comprobacion de actualizacion 
					blnCompAct=true;
					
				}
			}
		});
		//fin escuchadores
		jpDespliegue.add(jlbDesplieguePacientes,BorderLayout.NORTH);
		JScrollPane scrollPac=new JScrollPane(jtbTablaDespliegue);
		jpDespliegue.add(scrollPac,BorderLayout.CENTER);
		jpDespliegue.setVisible(true);
		
	}
	public void panelControles()
	{
		jpCotroles=new JPanel(new FlowLayout());
		jbtGrabar=new JButton("GRABAR");jbtCancelar=new JButton("CANCELAR");
		jbtSalir=new JButton("SALIR");
		//jbtEliminar=new JButton("ELIMINAR");
		jpCotroles.add(jbtGrabar);jpCotroles.add(jbtCancelar);
		jpCotroles.add(jbtSalir);
		//jpCotroles.add(jbtEliminar);
		//colocando escuchadores
		jbtGrabar.setActionCommand("grabar");jbtCancelar.setActionCommand("cancelar");jbtSalir.setActionCommand("salir");
		jbtGrabar.addActionListener(this);jbtCancelar.addActionListener(this);jbtSalir.addActionListener(this);
		jpCotroles.setVisible(true);
	}
	//FUNCIONES DE TRABAJO
	public void llenarTabla()
	{
		objGestionDBRP.llenarJtable(jtbTablaDespliegue, modeloTablaDespliegue, strSql);
	}
	//FIN FUNCIONES DE TRABAJO
	public void llenarCombo(JComboBox<String> jcbOut, JComboBox<String> jcbIn, String strSqlIn,ArrayList<Integer> arrListPOs)
	{
		
		objGestionGui.llenarComboDinamico(jcbOut, jcbIn, strSqlIn, arrListPOs);
	}
	
	//inicio limpiar interfaz
	public void limpiarInterfazRegPac()
	{
		//panel ids
		jtfIdPersona.setText("");
		jtfIdPaciente.setText("");
		jtfIdParr.setText("");
		jtfIdCant.setText("");
		jtfIdProv.setText("");
		//panel datospac1
		jtfCi.setText("");
		jtfNroHistClinica.setText("");
		jtfApellido1.setText("");
		jtfApellido2.setText("");
		jtfNombre1.setText("");
		jtfNombre2.setText("");
		jtfTelefonoReferencial.setText("");
		jtfDireccion.setText("");
		jtfFechaNac.setText("");
		//panel datos paciente 2
		jroGrGenero.clearSelection();
		jcbProvincia.setSelectedIndex(0);
		jcbCanton.setSelectedIndex(0);
		jcbParroquia.setSelectedIndex(0);
		//comprobacion de actualizacion 
		blnCompAct=false;
	}
	
	//fin limpiar interfaz
	//-----------------------------------------------------------
	//inicio limpiar objetos
	public void limpiarObjetoregPac()
	{
		objRegistPac.setStrCI("");
		objRegistPac.setStrNroHistClinc("");
		objRegistPac.setStrApellido1("");
		objRegistPac.setStrApellido2("");
		objRegistPac.setStrNombre1("");
		objRegistPac.setStrNombre2("");
		objRegistPac.setStrTelefono("");
		objRegistPac.setStrDireccion("");
		objRegistPac.setStrSexo("");
		objRegistPac.setStrProvincia("");
		objRegistPac.setStrCanton("");
		objRegistPac.setStrParroquia("");
		objRegistPac.setStrFechaNac("");
		objRegistPac.setStrIdParr("");
		objRegistPac.setStrIdCant("");
		objRegistPac.setStrIdProv("");
	}
	//fin limpiar objetos
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guiRegistrarPaciente app=new guiRegistrarPaciente();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.llenarTabla();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//inicio llenado automatico de combos	
		if(jcbProvincia.getSelectedIndex()>0)
		{

			String strAuxLG="SELECT cant.descripcionLugarGeo FROM lugargeo cant, lugargeo pro "
					+ "WHERE cant.idLugarGeoPadre=pro.idLugarGeo and pro.descripcionLugarGeo='"+jcbProvincia.getSelectedItem()+"';";
			llenarCombo(jcbProvincia, jcbCanton, strAuxLG,pos1);
			if(jcbCanton.getSelectedIndex()==0)
			{
				jcbParroquia.setSelectedIndex(0);
			}
			else
			{

				strAuxLG="SELECT parr.descripcionLugarGeo FROM lugargeo parr, lugargeo cant "
						+ "WHERE parr.idLugarGeoPadre=cant.idLugarGeo and cant.descripcionLugarGeo='"+jcbCanton.getSelectedItem()+"';";
				llenarCombo(jcbCanton, jcbParroquia, strAuxLG,pos2);
			}
		}
		//fin llenado automatico de combos
		String accion=e.getActionCommand();
		if(accion.equals("grabar"))
		{//inicio boton grabar
			strMsjErrorRegPac="";
			//inicio validacin cedula
			if(jtfCi.getText().length()==10 && objGestionGui.ValidarCedula(jtfCi.getText()))
			{
					objRegistPac.setStrCI(jtfCi.getText());
			}
			else
			{
				if(jtfCi.getText().length()<10&&jtfCi.getText().length()>0)
				{
				strMsjErrorRegPac=strMsjErrorRegPac+"LA CEDULA INGRESADA DE NO CONTIENE AL MENOS 10 DIGITOS, \n";
				}
				if(jtfCi.getText().length()==0)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"LA CEDULA AUN NO HA SIDO INGRESADA TODAVIA, \n";
				}
				if(jtfCi.getText().length()==10 && !objGestionGui.ValidarCedula(jtfCi.getText()))
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"LA CEDILA INGRESADA NO ES VALIDA \n";
				}
			}
			//fin validacion cedula
			//--------------------------------------------
			//inicio validacion historia clinica
			if(blnCompAct)
			{
				if(jtfNroHistClinica.getText().length()>0)
				{
					objRegistPac.setStrNroHistClinc(jtfNroHistClinica.getText());
				}
				else
				{
					if(jtfNroHistClinica.getText().length()==0)
					{
						strMsjErrorRegPac=strMsjErrorRegPac+"EL NUMERO DE HISTORIA CLINICA AUN NO HA SIDO INGRESADO TODAVIA, \n";
					}
						
				}
			}
			else
			{
				if(jtfNroHistClinica.getText().length()>0&&!objGestionGui.validarExistencia(jtbTablaDespliegue,jtfNroHistClinica.getText(),6))
				{
					objRegistPac.setStrNroHistClinc(jtfNroHistClinica.getText());
				}
				else
				{
					if(jtfNroHistClinica.getText().length()==0)
					{
						strMsjErrorRegPac=strMsjErrorRegPac+"EL NUMERO DE HISTORIA CLINICA AUN NO HA SIDO INGRESADO TODAVIA, \n";
					}
					if(jtfNroHistClinica.getText().length()>0&&objGestionGui.validarExistencia(jtbTablaDespliegue,jtfNroHistClinica.getText(),6))
					{
						strMsjErrorRegPac=strMsjErrorRegPac+"EL NUMERO DE HISTORIA CLINICA INGRESADO YA EXISTE, \n";
					}
						
				}
			}
				
			//fin validacion historia clinica
			//-------------------------------------------
			//inicio validacion apellido1
			if(jtfApellido1.getText().trim().length()>=3)
			{
				objRegistPac.setStrApellido1(jtfApellido1.getText().trim().toUpperCase());
			}
			else
			{
				if(jtfApellido1.getText().trim().length()>0&&jtfApellido1.getText().trim().length()<3)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL PRIMER APELLIDO INGRESADO DEBE CONTENER ALMENOS TRES LETRAS, \n";
				}
				if(jtfApellido1.getText().trim().length()==0)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL APELLIDO AUN NO HA SIDO INGRESADO, \n";
				}
			}
			//fin validacion apellido 1
			//------------------------------------------
			//inicio validacion apellido 2
			if(jtfApellido2.getText().trim().length()>=3)
			{
				objRegistPac.setStrApellido2(jtfApellido2.getText().trim().toUpperCase());
			}
			else
			{
				if(jtfApellido2.getText().trim().length()>0&&jtfApellido2.getText().trim().length()<3)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL SEGUNDO APELLIDO INGRESADO DEBE CONTENER ALMENOS TRES LETRAS, \n";
				}
				if(jtfApellido2.getText().trim().length()==0)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL APELLIDO AUN NO HA SIDO INGRESADO, \n";
				}
			}
			//fin validacion apellido 2
			//-----------------------------------------
			//inicio validacion nombre1
			if(jtfNombre1.getText().trim().length()>=3)
			{
				objRegistPac.setStrNombre1(jtfNombre1.getText().trim().toUpperCase());
			}
			else
			{
				if(jtfNombre1.getText().trim().length()>0&&jtfNombre1.getText().trim().length()<3)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL PRIMER NOMBRE DEBE CONTENER ALMENOS TRES LETRAS, \n";
				}
				if(jtfNombre1.getText().trim().length()==0)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL PRIMER NOMBRE AUN NO HA SIDO INGRESADO, \n";
				}
			}
			//fin validacion nombre 1
			//-----------------------------------------
			//inico validacion nombre 2
			if(jtfNombre2.getText().trim().length()>=3)
			{
				objRegistPac.setStrNombre2(jtfNombre2.getText().trim().toUpperCase());
			}
			else
			{
				if(jtfNombre2.getText().trim().length()>0&&jtfNombre2.getText().trim().length()<3)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL SEGUNDO NOMBRE DEBE CONTENER ALMENOS TRES LETRAS, \n";
				}
				if(jtfNombre2.getText().trim().length()==0)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL SEGUNDO NOMBRE AUN NO HA SIDO INGRESADO, \n";
				}
			}
			//fin validacion nombre 2
			//---------------------------------------
			//inicio validacion telefono
			if(jtfTelefonoReferencial.getText().length()==9||jtfTelefonoReferencial.getText().length()==10)
			{
				objRegistPac.setStrTelefono(jtfTelefonoReferencial.getText());
			}
			else
			{
				if(jtfTelefonoReferencial.getText().length()<9&&jtfTelefonoReferencial.getText().length()>0)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL NUMERO DE TELEFONO DEBE CONTENER DIEZ DIGITOS(CELULAR) O NUEVE DIGITOS(CONVENCIONAL),\n";
				}
				if(jtfTelefonoReferencial.getText().length()==0)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL NUMERO DE TELÉFONO AUN NO HA SIDO INGRESADO, \n";
				}
			}
			//fin validacion telefono 
			//----------------------------------------
			//inicio validacion direccion
			if(jtfDireccion.getText().trim().length()>=10)
			{
				objRegistPac.setStrDireccion(jtfDireccion.getText().trim().toUpperCase());
			}
			else
			{
				if(jtfDireccion.getText().trim().length()<1010 && jtfDireccion.getText().trim().length()>5)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"LA DIRECCION INGRESADA AL MENOS DEBE TENER CINCO CARACTERES LETRAS,\n";
				}
				if(jtfDireccion.getText().trim().length()==10)
				{
					
				}
			}
			//fin validacion direccion 
			//-------------------------------------------
			//inicio validacion sexo
			if(!jroFemenino.isSelected()&&!jroMasculino.isSelected())
			{
				strMsjErrorRegPac=strMsjErrorRegPac+"EL SEXO AUN NO HA SIDO SELECCIONADO,\n";
			}
			else
			{
				if(jroFemenino.isSelected())
				{
					objRegistPac.setStrSexo("F");
				}
				if(jroMasculino.isSelected())
				{
					objRegistPac.setStrSexo("M");
				}
			}
			//fin validacion sexo
			//-----------------------------------------------
			//inicio validacion provincia
			if(jcbProvincia.getSelectedIndex()<=0)
			{
				strMsjErrorRegPac=strMsjErrorRegPac+"LA PROVINCIA DE RESIDENCIA AUN NO HA SIDO SELECCIONADA ,\n";
			}
			else
			{
				objRegistPac.setStrProvincia(jcbProvincia.getSelectedItem().toString());
				objRegistPac.setStrIdProv(objGestionDBRP.obtenerID("lugargeo","idLugarGeo", "descripcionLugarGeo", jcbProvincia.getSelectedItem().toString()));
				System.out.println("Id Provincia: "+objRegistPac.getStrIdProv());
			}
			//fin validacion provincia
			//---------------------------------------------------
			//inicio validacion canton
			if(jcbCanton.getSelectedIndex()<=0)
			{
				strMsjErrorRegPac=strMsjErrorRegPac+"EL CANTON DE RESIDENCIA AUN NO HA SIDO SELECCIONADO ,\n";
			}
			else
			{
				objRegistPac.setStrCanton(jcbCanton.getSelectedItem().toString());
				objRegistPac.setStrIdCant(objGestionDBRP.obtenerID("lugargeo","idLugarGeo", "descripcionLugarGeo", jcbCanton.getSelectedItem().toString()));
				System.out.println("Id Canton: "+objRegistPac.getStrIdProv());
			}
			//fin validacion canton 
			//-----------------------------------------------------
			//inicio validacion parroquia
			if(jcbParroquia.getSelectedIndex()<=0)
			{
				strMsjErrorRegPac=strMsjErrorRegPac+"LA PAROOQUIA DE RESIDENCIA NO HA SIDO INGRESADA TODAVIA ,\n";
			}
			else
			{
				objRegistPac.setStrParroquia(jcbParroquia.getSelectedItem().toString());
				objRegistPac.setStrIdParr(objGestionDBRP.obtenerID("lugargeo","idLugarGeo", "descripcionLugarGeo", jcbParroquia.getSelectedItem().toString()));
				System.out.println("Id Parroquia: "+objRegistPac.getStrIdProv());
			}
			//fin validacion parroquia
			//-----------------------------------------------------
			//inicio validacion fechaNac
			if(jtfFechaNac.getText().length()==10 && jtfFechaNac.getText().matches("[0-9]{4}[\\-][0-9]{2}[\\-][0-9]{2}") &&
					objGestionGui.compararFechas(jtfFechaNac.getText())<0&&objGestionGui.compararFechas(jtfFechaNac.getText(),"1900-01-01")>0)
			{
				objRegistPac.setStrFechaNac(jtfFechaNac.getText());
			}
			else
			{
				if(jtfFechaNac.getText().length()>0 &&jtfFechaNac.getText().length()<10)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"LA FECHA INGRESADA DEBE CONTENER AL MENOS 10 CARACTERES, \n";
				}
				if(jtfFechaNac.getText().length()==10&&!jtfFechaNac.getText().matches("[0-9]{4}[\\-][0-9]{2}[\\-][0-9]{2}"))
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"LA FECHA INGRESADA DEBE TENER EL FORMATO (YYYY-MM-DD),\n";
				}
				if(jtfFechaNac.getText().length()==10 && objGestionGui.compararFechas(jtfFechaNac.getText())>0)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"LA FECHA INGRESADA DEBE SER ANTERIOR O IGUAL A LA ACTUAL, \n";
				}
				if(jtfFechaNac.getText().length()==10 && objGestionGui.compararFechas(jtfFechaNac.getText(),"1900-01-01")<0)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"LA FECHA INGRESADA DEBE SER POSTERIOR A 1900-01-01, \n";
				}
				if(jtfFechaNac.getText().matches("[0-9]{4}[\\-][0-9]{2}[\\-][0-9]{2}")&&objGestionGui.compararFechas(jtfFechaNac.getText())==-6)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL MES Y DIA DE LA FECHA INGRESADA ESTAN FUERA DE RANGO,\n";
				}
				if(jtfFechaNac.getText().matches("[0-9]{4}[\\-][0-9]{2}[\\-][0-9]{2}")&&objGestionGui.compararFechas(jtfFechaNac.getText())==-2)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL MES DE LA FECHA INGRESADA ESTAN FUERA DE RANGO,\n";
				}
				if(jtfFechaNac.getText().matches("[0-9]{4}[\\-][0-9]{2}[\\-][0-9]{2}")&&objGestionGui.compararFechas(jtfFechaNac.getText())==-3)
				{
					strMsjErrorRegPac=strMsjErrorRegPac+"EL DIA DE LA FECHA INGRESADA ESTAN FUERA DE RANGO,\n";
				}
			
			}
			//fin validacion fechaNac
			
			if(strMsjErrorRegPac.length()>0)
			{
				JOptionPane.showMessageDialog(null, strMsjErrorRegPac, "ERROR AL REGISTRAR PACIENTE", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				//GRABACION A LA BASE DE DATOS
				if(objGestionGui.validarExistencia(jtbTablaDespliegue,jtfIdPersona.getText(),0))
				{
					objGestionDBRP.actualizarDatosDB("Persona", strArrColsTblPersona,new String[]
							{objRegistPac.getStrApellido1(),objRegistPac.getStrApellido2(),
							objRegistPac.getStrNombre1(),objRegistPac.getStrNombre2(),
							objRegistPac.getStrCI(), objRegistPac.getStrTelefono()}, jtfIdPersona.getText());
					objGestionDBRP.actualizarDatosDB("Paciente", strArrColsTblPaciente, new String[]
							{"","",objRegistPac.getStrDireccion(),objRegistPac.getStrFechaNac(),
							objGestionDBRP.obtenerID("Persona","idPersona","cedulaPer", objRegistPac.getStrCI()),
							objRegistPac.getStrIdParr(), objRegistPac.getStrNroHistClinc(),objRegistPac.getStrSexo()}
							, jtfIdPaciente.getText());
					objGestionGui.reiniciarJTable(modeloTablaDespliegue);
					objGestionDBRP.llenarJtable(jtbTablaDespliegue, modeloTablaDespliegue, strSql);
					limpiarInterfazRegPac();
					limpiarObjetoregPac();
				}
				else
				{
					objGestionDBRP.insertarDatosDB("Persona", strArrColsTblPersona, new String[]
							{objRegistPac.getStrApellido1(),objRegistPac.getStrApellido2(),
							objRegistPac.getStrNombre1(),objRegistPac.getStrNombre2(),
							objRegistPac.getStrCI(), objRegistPac.getStrTelefono()});
					objGestionDBRP.insertarDatosDB("Paciente", strArrColsTblPaciente, new String[]
							{"","",objRegistPac.getStrDireccion(),objRegistPac.getStrFechaNac(),
							objGestionDBRP.obtenerID("Persona","idPersona","cedulaPer", objRegistPac.getStrCI()),
							objRegistPac.getStrIdParr(), objRegistPac.getStrNroHistClinc(),objRegistPac.getStrSexo()});
					objGestionGui.reiniciarJTable(modeloTablaDespliegue);
					objGestionDBRP.llenarJtable(jtbTablaDespliegue, modeloTablaDespliegue, strSql);
					limpiarInterfazRegPac();
					limpiarObjetoregPac();
				}
				
				//GRABACION A LA BASE DEDATOS 
			}
		}//fin boton grabar
		
		if(accion.equals("cancelar"))
		{//inicio boton cancelar
			limpiarInterfazRegPac();
			limpiarObjetoregPac();
		}//fin boton cancelar
		if(accion.equals("salir"))
		{
			
		}
		// TODO Auto-generated method stub
		
	}

}
