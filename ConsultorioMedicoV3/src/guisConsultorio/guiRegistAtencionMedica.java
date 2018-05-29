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

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import clasesBean.RegistAtencMedicaBean;
import Utilitarios.operacionesSobreDB;
import Utilitarios.operacionesSobreGUI;


public class guiRegistAtencionMedica extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	/*//variables panel ids
	public static JPanel jpPanelId;
	public static JLabel jblIdAtencionMedica,jblIdMedico,jblIdRecepcionista,jblIdEngfermero;
	public static JTextField jtfIdAtencionMedica,jtfIdMedico;*/
	//variables panel atencion 
	public static JPanel jpEstadoTurno;
	
	//variables panel examenes
	public static JPanel jpExamenes;
	public static JTextArea jtaExamenes;
	//variables panel signos vitales
	public static JPanel jpSignosVitales;
	public static JTextArea jtaSignosVitales;
	//descripcion de sintomas
	public static JPanel jpSintomas;
	public static JTextArea jtaSintomas;
	//variables prescrpcion
	public static JPanel jpPrescripcion;
	public static JTextArea jtaPrescrpcion;
	//variables panel diagnostico descriptivo
	public static JPanel jpDiagDescriptivo;
	public static JTextArea jtaDiagDescriptivo;
	//panel jtable
	public static JPanel jpDespliegueAtencion;
	public static JTable jtbDespliegueAtencion;
	public static DefaultTableModel modTableDespliegue;
	//PANEL CONTROLES
	public static JPanel jpControlesAtencion;
	public static JButton jbtGrabar,jbtCancelar,jbtSalir,jbtActualizar,jbtNoAtendido;
	//panel especialidad medico
	public static JLabel jlbEspecialidad,jlbMedico;
	public static JComboBox<String> jcbEspecialidad,jcbMedico;
	public static JPanel jpEspMedico;
	//panel datos paciente
	public static JPanel jpDatosPaciente,jpDatosPac1,jpDatosPac2,jpDatosPac3,jpDatosPac4;
	public static JLabel jlbNroHistClinica,jlbApellido1,jlbApellido2,jlbNombre1,jlbNombre2,jlbCedula,jlbFechaNac,jlbSexo,
							jlbTelefono,jlbDireccion,jlbCanton,jlbParroquia,jlbProvincia,jlbIdPersonaPac,jlbIdParrroquia,
							jlbIdCanton,jlbIdProvincia, jlbIdPaciente, jlbIdAte, jlbIdMed, jlbIdRecepcionista, jlbIdEnfermero;
	public static JTextField jtfNroHistClinica,jtfApellido1,jtfApellido2,jtfNombre1,jtfNombre2,jtfCedula,jtfFechaNac,jtfSexo,
								jtfTelefono,jtfDireccion,jtfCanton,jtfParroquia,jtfProvincia,jtfIdPersonaPac,jtfIdParroquia,
								jtfIdCanton,jtfIdProvincia,jtfIdPaciente, jtfIdAte, jtfIdMed, jtfIdRecepcionista, jtfIdEnfermero;
	public static JTextArea jtaAntSalPer,jtaAntSalFam;
	//panel atencion medicca
	public static JPanel jpAtencionMedica, jpAteMedDiagnostico,jpAtMed1;
	public static JLabel jlbEstadoAte, jlbHoraAte, jlbFechaAte;
	public static JTextField jtfFechaAte,jtfHoraAte,jtfEstadoAte;
	//panel diagnóstico
	public static JPanel jpDiagnostico;
	public static JLabel jlbGpEnfermedad, jlbEnfermedadEspecífica;
	public static JComboBox<String> jcbGpEnfermedad,jcbGpEnfermedadEspecíf;
	public static JButton btnAceptarDiagnostico,btnGrabarDiagnostico,btnEliminarDiagnostico;
	public static JTable jtbDiagnostico;
	private static DefaultTableModel modTblDiagnostico;
	//variables de control 
	private static operacionesSobreDB objGestionRegAteDB=new operacionesSobreDB();
	private static operacionesSobreGUI objGestionRegAteGui=new operacionesSobreGUI();
	private static ArrayList<Integer> lstCmbMedico=new ArrayList<Integer>();
	private static ArrayList<Integer> lstCmbEnfEsp=new ArrayList<Integer>();
	private static ArrayList<String> lstIdsMedicos=new ArrayList<String>();
	private static String strSqlTablaPacientes= "select pac.idHIstClinica, per.apellido1Per,per.apellido2Per, per.nombre1Per, per.nombre2Per,"
			+ "per.cedulaPer, pac.fechaNacPac,ate.idHIstClinica, pac.sexo, pac.direccionPac, lpar.descripcionLugarGeo,"
			+ "lcan.descripcionLugarGeo, lpro.descripcionLugarGeo, per.telefonoPer, ate.fechaAte, ate.horaAte,"
			+ "ate.estdoAte, pac.antecedentesFamSaludPac, pac.antecedentesPerSaludPac, ate.signosvitalesAte,"
			+ "ate.sintomasAte, ate.diagnosticoDescriptivoAte, ate.examenesPedidosAte, ate.prescripcripcionAte,"
			+ "pac.idPaciente,pac.idPersonaPac, pac.idLugarGeoResid, lcan.idLugarGeo, lpro.idLugarGeo, "
			+ "ate.idRecepcionistaAte, ate.idEnfermeroAte, idAtencionMedica, ate.idMedicoAte "
			+ "from paciente pac, persona per, atencionmedica ate, lugargeo lpar, lugargeo lcan, lugargeo lpro "
			+ "where pac.idPersonaPac=per.idpersona and "
			+ "ate.idHistClinica=pac.idHIstClinica and "
			+ "ate.fechaAte=curdate() and "
			+ "lpar.idLugarGeo=pac.idLugarGeoResid and "
			+ "lcan.idlugarGeo=lpar.idLugarGeoPadre and "
			+ "lpro.idLugarGeo=lcan.idLugarGeoPadre and "
			+ "ate.estdoAte='signos vitales' and "
			+ "ate.idMedicoAte='";
	//private static boolean blnCompAct=false;
	private static RegistAtencMedicaBean objRegAte=new RegistAtencMedicaBean();
	private static String strMsjErroDiagnostico="", strMsjErrorAte=""; 
	//-------------------------------------------------------------------------
	private static JFrame jfRegAtencionMedica;
	private static String strArrColsDiagn[]=objGestionRegAteDB.obtnerColumNames("DiagnosticoAte");
	private static String strArrColsPacAte[]=new String[]{"idPaciente","antecedentesFamSaludPac","antecedentesPerSaludPac"};											//pendientes para automatizacion
	private static String strArrColsAte[]=new String[]{"idAtencionMedica","diagnosticoDescriptivoAte","estdoAte","examenesPedidosAte","prescripcripcionAte","sintomasAte"};//pendientes para automatizacion
	public guiRegistAtencionMedica()
	{
		jfRegAtencionMedica=new JFrame("REGISTRAR ATENCION");
		jfRegAtencionMedica.setLayout(null);
		
	
		panelExamenes();
		panelSignosVitales();
		panelSintomas();
		panelPrescripcion();
		panelDespliegue();
		panelControlesAtencion();
		
		panelEspecialidadMedico();
		PanelDatosPaciente();
		PanelAtencionMed();
		panelDiagnostico();
		
		//panelEstadoTurno();
		//panelIds();
		//jpPanelId.setBounds(10, 10, 580, 50);
		//jfRegAtencionMedica.add(jpPanelId);
		//jfRegAtencionMedica.add(jpEstadoTurno);
		//jfRegAtencionMedica.add(jpPrescripcion);
		//jpEstadoTurno.setBounds(10, 60, 300, 100);
		jpDespliegueAtencion.setBounds(10, 390, 580, 200);
		jpControlesAtencion.setBounds(10, 600, 580, 50);
		
		jpEspMedico.setBounds(10, 10, 580, 60);
		jpDatosPaciente.setBounds(10, 70, 580, 300);
		jpAtencionMedica.setBounds(600,10,580,360);
		jpDiagnostico.setBounds(600, 370, 580, 260);
		
		jfRegAtencionMedica.add(jpDespliegueAtencion);
		jfRegAtencionMedica.add(jpControlesAtencion);
		jfRegAtencionMedica.add(jpEspMedico);
		jfRegAtencionMedica.add(jpDatosPaciente);
		jfRegAtencionMedica.add(jpAtencionMedica);
		jfRegAtencionMedica.add(jpDiagnostico);
		jfRegAtencionMedica.setLocation(100, 20);
		jfRegAtencionMedica.setResizable(false);
		jfRegAtencionMedica.setVisible(true);
		jfRegAtencionMedica.setSize(1200, 670);
		
	}
	/*public void panelIds()
	{
		jpPanelId=new JPanel(new FlowLayout());
		jblIdAtencionMedica=new JLabel("Id Atencion Medica");jtfIdAtencionMedica=new JTextField(3);
		jblIdMedico=new JLabel("Id Medico");jtfIdMedico=new JTextField(3);
		jblIdRecepcionista=new JLabel("Id Recepcionista");jtfIdRecepcionista=new JTextField(3);
		jblIdEngfermero=new JLabel("Id Enfermero");jtfIdEnfermero=new JTextField(3);
		jpPanelId.add(jblIdAtencionMedica);jpPanelId.add(jtfIdAtencionMedica);
		jpPanelId.add(jblIdMedico);jpPanelId.add(jtfIdMedico);
		jpPanelId.add(jblIdRecepcionista);jpPanelId.add(jtfIdRecepcionista);
		jpPanelId.add(jblIdEngfermero);jpPanelId.add(jtfIdEnfermero);
		jpPanelId.setBorder(new TitledBorder(new EtchedBorder(), "Panel Ids"));
		jpPanelId.setVisible(true);
	}
	public void panelEstadoTurno()
	{
		jpEstadoTurno = new JPanel(new GridBagLayout());
		GridBagConstraints gbc =new GridBagConstraints();
		jlbHoraAte=new JLabel("HORA  ");jtfHoraAte=new JTextField(10);
		jlbFechaAte=new JLabel("FECHA  ");jtfFechaAte=new JTextField(10);
		jlbEstadoAte=new JLabel("ESTADO  ");jtfEstadoAte=new JTextField(10);
		//primera fila
		gbc.anchor=GridBagConstraints.WEST;
		gbc.gridwidth=1;
		jpEstadoTurno.add(jlbHoraAte,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpEstadoTurno.add(jtfHoraAte,gbc);
		//segunda fila
		gbc.gridwidth=1;
		jpEstadoTurno.add(jlbFechaAte,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpEstadoTurno.add(jtfFechaAte,gbc);
		//tercera fila
		gbc.gridwidth=1;
		jpEstadoTurno.add(jlbEstadoAte,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpEstadoTurno.add(jtfEstadoAte,gbc);
		jpEstadoTurno.setBorder(new TitledBorder(new EtchedBorder(), "Atencion"));
		jpEstadoTurno.setVisible(true);
		
	}*/
	public void panelExamenes()
	{
		jpExamenes=new JPanel(new BorderLayout());
		jtaExamenes=new JTextArea();
		JScrollPane scroll=new JScrollPane(jtaExamenes);
		jpExamenes.add(scroll,BorderLayout.CENTER);
		jpExamenes.setBorder(new TitledBorder(new EtchedBorder(), "Examenes Solicitados"));
		jpExamenes.setVisible(true);
	}
	
	public void panelSignosVitales()
	{
		jpSignosVitales=new JPanel(new BorderLayout());
		jtaSignosVitales=new JTextArea();
		JScrollPane scroll=new JScrollPane(jtaSignosVitales);
		jpSignosVitales.add(scroll,BorderLayout.CENTER);
		jpSignosVitales.setBorder(new TitledBorder(new EtchedBorder(), "Signos Vitales"));
		jpSignosVitales.setVisible(true);
	}
	
	public void panelSintomas()
	{
		jpSintomas=new JPanel(new BorderLayout());
		jtaSintomas=new JTextArea();
		JScrollPane scroll=new JScrollPane(jtaSintomas);
		jpSintomas.add(scroll,BorderLayout.CENTER);
		jpSintomas.setBorder(new TitledBorder(new EtchedBorder(), "Descripcion Sintomas"));
		jpSintomas.setVisible(true);
	}
	public void panelPrescripcion()
	{
		jpPrescripcion=new JPanel(new BorderLayout());
		jtaPrescrpcion=new JTextArea();
		JScrollPane scroll=new JScrollPane(jtaPrescrpcion);
		jpPrescripcion.add(scroll,BorderLayout.CENTER);
		jpPrescripcion.setBorder(new TitledBorder(new EtchedBorder(), "Prescripcion Medica"));
		jpPrescripcion.setVisible(true);
	}
	public void panelDiagnosticoDescriptivo()
	{
		jpDiagDescriptivo=new JPanel(new BorderLayout());
		jtaDiagDescriptivo=new JTextArea();
		JScrollPane scroll=new JScrollPane(jtaDiagDescriptivo);
		jpDiagDescriptivo.add(scroll,BorderLayout.CENTER);
		jpDiagDescriptivo.setBorder(new TitledBorder(new EtchedBorder(), "Diagnóstico Descriptivo"));
		jpDiagDescriptivo.setVisible(true);
	}
	
	public void panelDespliegue()
	{
		jpDespliegueAtencion=new JPanel(new BorderLayout());
		jtbDespliegueAtencion=new JTable();
		jtbDespliegueAtencion.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		modTableDespliegue=new DefaultTableModel()
		{//inicio control tabkla editable
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) 
			{
			return false;//editable:true, no editable:false
			}
		};
		jtbDespliegueAtencion.setModel(modTableDespliegue);
		modTableDespliegue.addColumn("# Hist. Clínica");
		modTableDespliegue.addColumn("Apellido1");
		modTableDespliegue.addColumn("Apellido2");
		modTableDespliegue.addColumn("Nombre1");
		modTableDespliegue.addColumn("Nombre2");
		modTableDespliegue.addColumn("CI");
		modTableDespliegue.addColumn("Feccha Nac");
		modTableDespliegue.addColumn("idHist.Clinic");//pendiente para edad
		modTableDespliegue.addColumn("Sexo");
		modTableDespliegue.addColumn("Direccion");
		modTableDespliegue.addColumn("Parroquia");
		modTableDespliegue.addColumn("Cantón");
		modTableDespliegue.addColumn("Provincia");
		modTableDespliegue.addColumn("Teléfono");
		modTableDespliegue.addColumn("FechaAte");
		modTableDespliegue.addColumn("HoraAte");
		modTableDespliegue.addColumn("EstadoAte");
		modTableDespliegue.addColumn("Ant. Med. Familiares");
		modTableDespliegue.addColumn("Ant.Med. Personales");
		modTableDespliegue.addColumn("Signos vitales");
		modTableDespliegue.addColumn("Síntomas");
		modTableDespliegue.addColumn("Diagnóstico Descriptivo");
		modTableDespliegue.addColumn("Exámenes Solicitados");
		modTableDespliegue.addColumn("Prescripción");
		modTableDespliegue.addColumn("IdPaciente");
		modTableDespliegue.addColumn("IdPersonaPac");
		modTableDespliegue.addColumn("IdLugGeoRes");
		modTableDespliegue.addColumn("IdCant");
		modTableDespliegue.addColumn("IdProv");
		modTableDespliegue.addColumn("IdRecepcionista");
		modTableDespliegue.addColumn("IdEnfermero");
		modTableDespliegue.addColumn("IdAtenMedica");
		modTableDespliegue.addColumn("IdMedico");
		//cambia de tamaño las columnas
		TableColumnModel columnModelTbDespliegueAte=jtbDespliegueAtencion.getColumnModel();
		for (int i = 0; i < modTableDespliegue.getColumnCount(); i++) {
			columnModelTbDespliegueAte.getColumn(i).setPreferredWidth(100);
			}
		//fin cambio de tamaño de las columnas
		//------------------------------------------------------------------------
		// añadiendo escuchadores a la tabla 
		jtbDespliegueAtencion.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e)
			{
				JTable table =(JTable) e.getSource();
				Point point =e.getPoint();
				int row = table.rowAtPoint(point);//row devolvera -1 si se ha clicado fuera de la fila pero dentro de la tabla, si no devolvera el indice de la fila en la que se ha clicado. 
				if (e.getClickCount() == 2) 
				{
					//blnCompAct=true;
					//panel ids
					//jtfIdPersona.setText(jtbTablaDespliegue.getValueAt(row, 0).toString());
					jtfNroHistClinica.setText(jtbDespliegueAtencion.getValueAt(row, 0).toString());
					jtfApellido1.setText(jtbDespliegueAtencion.getValueAt(row, 1).toString());
					jtfApellido2.setText(jtbDespliegueAtencion.getValueAt(row, 2).toString());
					jtfNombre1.setText(jtbDespliegueAtencion.getValueAt(row, 3).toString());
					jtfNombre2.setText(jtbDespliegueAtencion.getValueAt(row, 4).toString());
					jtfCedula.setText(jtbDespliegueAtencion.getValueAt(row, 5).toString());
					jtfFechaNac.setText(jtbDespliegueAtencion.getValueAt(row, 6).toString());
					jtfSexo.setText(jtbDespliegueAtencion.getValueAt(row, 8).toString());
					jtfDireccion.setText(jtbDespliegueAtencion.getValueAt(row, 9).toString());
					jtfParroquia.setText(jtbDespliegueAtencion.getValueAt(row, 10).toString());
					jtfCanton.setText(jtbDespliegueAtencion.getValueAt(row, 11).toString());
					jtfProvincia.setText(jtbDespliegueAtencion.getValueAt(row, 12).toString());
					jtfTelefono.setText(jtbDespliegueAtencion.getValueAt(row, 13).toString());
					jtfFechaAte.setText(jtbDespliegueAtencion.getValueAt(row, 14).toString());
					jtfHoraAte.setText(jtbDespliegueAtencion.getValueAt(row, 15).toString());
					jtfEstadoAte.setText(jtbDespliegueAtencion.getValueAt(row, 16).toString());
					
					if(jtbDespliegueAtencion.getValueAt(row, 17)==null)
						jtaAntSalFam.setText("");
					else
						jtaAntSalFam.setText(jtbDespliegueAtencion.getValueAt(row, 17).toString());
					
					if(jtbDespliegueAtencion.getValueAt(row, 18)==null)
						jtaAntSalPer.setText("");
					else
						jtaAntSalPer.setText(jtbDespliegueAtencion.getValueAt(row, 18).toString());
					
					if(jtbDespliegueAtencion.getValueAt(row, 19)==null)
						jtaSignosVitales.setText("");
					else
						jtaSignosVitales.setText(jtbDespliegueAtencion.getValueAt(row, 19).toString());
					
					if(jtbDespliegueAtencion.getValueAt(row, 20)==null)
						jtaSintomas.setText("");
					else
						jtaSintomas.setText(jtbDespliegueAtencion.getValueAt(row, 20).toString());
					if(jtbDespliegueAtencion.getValueAt(row, 21)==null)
						jtaDiagDescriptivo.setText("");
					else
						jtaDiagDescriptivo.setText(jtbDespliegueAtencion.getValueAt(row, 21).toString());
					if(jtbDespliegueAtencion.getValueAt(row, 22)==null)
						jtaExamenes.setText("");
					else
						jtaExamenes.setText(jtbDespliegueAtencion.getValueAt(row, 22).toString());
					if(jtbDespliegueAtencion.getValueAt(row, 23)==null)
						jtaPrescrpcion.setText("");
					else
						jtaPrescrpcion.setText(jtbDespliegueAtencion.getValueAt(row, 23).toString());
					
					jtfIdPaciente.setText(jtbDespliegueAtencion.getValueAt(row, 24).toString());
					jtfIdPersonaPac.setText(jtbDespliegueAtencion.getValueAt(row, 25).toString());
					jtfIdParroquia.setText(jtbDespliegueAtencion.getValueAt(row, 26).toString());
					jtfIdCanton.setText(jtbDespliegueAtencion.getValueAt(row, 27).toString());
					jtfIdProvincia.setText(jtbDespliegueAtencion.getValueAt(row, 28).toString());
					jtfIdRecepcionista.setText(jtbDespliegueAtencion.getValueAt(row, 29).toString());
					jtfIdEnfermero.setText(jtbDespliegueAtencion.getValueAt(row, 30).toString());
					jtfIdAte.setText(jtbDespliegueAtencion.getValueAt(row, 31).toString());
					jtfIdMed.setText(jtbDespliegueAtencion.getValueAt(row, 32).toString());
					//comprobacion de actualizacion 
					
					
				}
			}
		});
		// fin añadir escuchadores a la tabla 
		JScrollPane scrollPac=new JScrollPane(jtbDespliegueAtencion);
		jpDespliegueAtencion.add(new JLabel("DESPLIEGUE ATENCION MEDICA",SwingConstants.CENTER),BorderLayout.NORTH);
		jpDespliegueAtencion.add(scrollPac,BorderLayout.CENTER);
		jpDespliegueAtencion.setVisible(true);
	}
	
	private void  panelControlesAtencion()
	{
		jpControlesAtencion=new JPanel(new FlowLayout());
		//jbtGrabar=new JButton("GRABAR");
		jbtCancelar=new JButton("CANCELAR");
		jbtSalir=new JButton("SALIR");
		jbtActualizar=new JButton("GRABAR");
		jbtNoAtendido=new JButton("ASIGANAR NO ATENDIDO");
		//jpControlesAtencion.add(jbtGrabar);
		jpControlesAtencion.add(jbtCancelar);
		jpControlesAtencion.add(jbtSalir);
		jpControlesAtencion.add(jbtActualizar);
		jpControlesAtencion.add(jbtNoAtendido);
		//inicio añadir escuchadores
		jbtCancelar.setActionCommand("cancelar");
		jbtSalir.setActionCommand("salir");
		jbtActualizar.setActionCommand("actualizar");
		jbtNoAtendido.setActionCommand("noatendido");
		//--------------------------
		jbtCancelar.addActionListener(this);
		jbtSalir.addActionListener(this);
		jbtActualizar.addActionListener(this);
		jbtNoAtendido.addActionListener(this);
		//fin añadir escuchadores
		jpControlesAtencion.setVisible(true);
		
	}
	
	public void panelEspecialidadMedico()
	{
		jpEspMedico=new JPanel(new GridBagLayout());
		jlbEspecialidad=new JLabel("Especialidad ");
		jlbMedico=new JLabel("Médico ");
		jcbEspecialidad=new JComboBox<String>();jcbEspecialidad.addActionListener(this);
		jcbEspecialidad.addItem("Seleccione Especialidad");
		//lenado combo especialidad
		String strSqlEsp="select descripcionEspecialidad "
				+ "from especialidad "
				+ "where idEspecialidad in (select idEspecialidadMed from medico);";
		objGestionRegAteDB.llenarCombo(jcbEspecialidad, strSqlEsp);
		//-------------------------
		
		jcbMedico=new JComboBox<String>();jcbMedico.addActionListener(this);
		jcbMedico.addItem("Seleccione Médico");
		//lenado combo medico
		//--------------------------
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.anchor=GridBagConstraints.WEST;
		gbc.gridwidth=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.NONE;
		//jcbEspecialidad.setPreferredSize(new Dimension(150,30));
		jpEspMedico.add(jlbEspecialidad,gbc);jpEspMedico.add(jcbEspecialidad,gbc);
		jpEspMedico.add(new JLabel("   "),gbc);
		jpEspMedico.add(jlbMedico,gbc);jpEspMedico.add(jcbMedico,gbc);
		jpEspMedico.setBorder(new TitledBorder(new EtchedBorder(), "Especialidad y Médico"));
		
	}
	
	void PanelDatosPaciente()
	{
		jpDatosPaciente=new JPanel(new GridBagLayout());//anel principal
		//inicio subanel 1
		jpDatosPac1=new JPanel(new GridBagLayout());
		GridBagConstraints gbcP1=new GridBagConstraints();//grid bag constarain spara panel 1
		jlbNroHistClinica=new JLabel("Nro. Hist. Clínica ");jtfNroHistClinica=new JTextField(15);
		jlbApellido1=new JLabel("Apellido 1 ");jtfApellido1=new JTextField(15);
		jlbApellido2=new JLabel("Apellido 2 ");jtfApellido2=new JTextField(15);
		jlbNombre1=new JLabel("Nombre 1 ");jtfNombre1=new JTextField(15);
		jlbNombre2=new JLabel("Nombre 2");jtfNombre2=new JTextField(15);
		jlbCedula=new JLabel("Cédula");jtfCedula=new JTextField(15);
		jlbFechaNac=new JLabel("Fecha de Nacimiento ");jtfFechaNac=new JTextField(15);
		jlbSexo=new JLabel("Sexo");jtfSexo=new JTextField(5);
		//primera fila
		gbcP1.anchor=GridBagConstraints.WEST;
		gbcP1.gridwidth=1;
		jpDatosPac1.add(jlbNroHistClinica,gbcP1);
		gbcP1.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac1.add(jtfNroHistClinica,gbcP1);
		//segunda fila
		gbcP1.gridwidth=1;
		jpDatosPac1.add(jlbApellido1,gbcP1);
		gbcP1.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac1.add(jtfApellido1,gbcP1);
		//tercera fila
		gbcP1.gridwidth=1;
		jpDatosPac1.add(jlbApellido2,gbcP1);
		gbcP1.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac1.add(jtfApellido2,gbcP1);
		//cuarta fila
		gbcP1.gridwidth=1;
		jpDatosPac1.add(jlbNombre1,gbcP1);
		gbcP1.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac1.add(jtfNombre1,gbcP1);
		//quinta fila
		gbcP1.gridwidth=1;
		jpDatosPac1.add(jlbNombre2,gbcP1);
		gbcP1.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac1.add(jtfNombre2,gbcP1);
		//sexta fila
		gbcP1.gridwidth=1;
		jpDatosPac1.add(jlbCedula,gbcP1);
		gbcP1.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac1.add(jtfCedula,gbcP1);
		//septima fila
		gbcP1.gridwidth=1;
		jpDatosPac1.add(jlbFechaNac,gbcP1);
		gbcP1.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac1.add(jtfFechaNac,gbcP1);
		//octava fila
		gbcP1.gridwidth=1;
		jpDatosPac1.add(jlbSexo,gbcP1);
		gbcP1.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac1.add(jtfSexo,gbcP1);
		jpDatosPac1.setBorder(new TitledBorder(new EtchedBorder(), ""));
		//fin subpanel 1
		//------------------------------------------------------------------------
		//inicio del subpanel 2
		jpDatosPac2=new JPanel(new GridBagLayout());
		GridBagConstraints gbcP2=new GridBagConstraints();
		jlbTelefono=new JLabel("Teléfono ");jtfTelefono=new JTextField(10);
		jlbDireccion=new JLabel("Direccion ");jtfDireccion=new JTextField(15);
		jlbCanton=new JLabel("Cantón ");jtfCanton=new JTextField(15);
		jlbParroquia=new JLabel("Parroquia ");jtfParroquia=new JTextField(15);
		jlbProvincia=new JLabel("Provincia ");jtfProvincia=new JTextField(15);
		//id's
		jlbIdPersonaPac=new JLabel("Id Per ");jtfIdPersonaPac=new JTextField(3);
		jlbIdParrroquia=new JLabel(" IdParr ");jtfIdParroquia=new JTextField(3);
		jlbIdCanton=new JLabel(" IdCan ");jtfIdCanton=new JTextField(3);
		jlbIdProvincia=new JLabel(" IdPro ");jtfIdProvincia=new JTextField(3);
		jlbIdPaciente=new JLabel(" IdPac ");jtfIdPaciente=new JTextField(3);
		jlbIdAte=new JLabel(" IdAte ");jtfIdAte=new JTextField(3);
		jlbIdMed=new JLabel(" IdMed ");jtfIdMed=new JTextField(3);
		jlbIdRecepcionista=new JLabel(" IdRep ");jtfIdRecepcionista=new JTextField(3);
		jlbIdEnfermero=new JLabel(" IdEnf ");jtfIdEnfermero=new JTextField(3);
		gbcP2.anchor=GridBagConstraints.WEST;
		//primera fila
		gbcP2.gridwidth=1;
		jpDatosPac2.add(jlbTelefono,gbcP2);
		gbcP2.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac2.add(jtfTelefono,gbcP2);
		//segunda fila
		gbcP2.gridwidth=1;
		jpDatosPac2.add(jlbDireccion,gbcP2);
		gbcP2.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac2.add(jtfDireccion,gbcP2);
		//tercera fila
		gbcP2.gridwidth=1;
		jpDatosPac2.add(jlbProvincia,gbcP2);
		gbcP2.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac2.add(jtfProvincia,gbcP2);
		//cuarta fila
		gbcP2.gridwidth=1;
		jpDatosPac2.add(jlbCanton,gbcP2);
		gbcP2.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac2.add(jtfCanton,gbcP2);
		//quinta fila
		gbcP2.gridwidth=1;
		jpDatosPac2.add(jlbParroquia,gbcP2);
		gbcP2.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac2.add(jtfParroquia,gbcP2);
		jpDatosPac2.setBorder(new TitledBorder(new EtchedBorder(), ""));
		//sexta fila
		gbcP2.gridwidth=1;
		jpDatosPac2.add(jlbIdPersonaPac,gbcP2);
		//gbcP2.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac2.add(jtfIdPersonaPac,gbcP2);
		jpDatosPac2.add(jlbIdParrroquia,gbcP2);
		jpDatosPac2.add(jtfIdParroquia,gbcP2);
		jpDatosPac2.add(jlbIdCanton,gbcP2);
		gbcP2.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac2.add(jtfIdCanton,gbcP2);
		//septima fila
		gbcP2.gridwidth=1;
		jpDatosPac2.add(jlbIdProvincia,gbcP2);
		jpDatosPac2.add(jtfIdProvincia,gbcP2);
		jpDatosPac2.add(jlbIdPaciente,gbcP2);
		jpDatosPac2.add(jtfIdPaciente,gbcP2);
		jpDatosPac2.add(jlbIdAte,gbcP2);
		gbcP2.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac2.add(jtfIdAte,gbcP2);
		//octva fila
		gbcP2.gridwidth=1;
		jpDatosPac2.add(jlbIdMed,gbcP2);
		jpDatosPac2.add(jtfIdMed,gbcP2);
		jpDatosPac2.add(jlbIdRecepcionista,gbcP2);
		jpDatosPac2.add(jtfIdRecepcionista,gbcP2);
		jpDatosPac2.add(jlbIdEnfermero,gbcP2);
		//gbcP2.gridwidth=GridBagConstraints.REMAINDER;
		jpDatosPac2.add(jtfIdEnfermero,gbcP2);
		
		jpDatosPac2.setBorder(new TitledBorder(new EtchedBorder(), ""));
		//fin del subpanel 2
		//-------------------------------------------------------------------------
		//inicio del subpanel 3
		jpDatosPac3=new JPanel(new BorderLayout());
		jtaAntSalPer=new JTextArea();
		jpDatosPac3.add(jtaAntSalPer,BorderLayout.CENTER);
		jpDatosPac3.setBorder(new TitledBorder(new EtchedBorder(), "Antecedentes de Salud Personales"));
		//fin del subpanel 3
		//--------------------------------------------------------------------------
		//inicio del subpanel 4
		jpDatosPac4=new JPanel(new BorderLayout());
		jtaAntSalFam=new JTextArea();
		jpDatosPac4.add(jtaAntSalFam,BorderLayout.CENTER);
		jpDatosPac4.setBorder(new TitledBorder(new EtchedBorder(), "Antecedentes de Salud Familiares"));
		//fin del subpanel 4
		
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.gridwidth=2;
		gbc.gridx=0;gbc.gridy=0;
		jpDatosPaciente.add(jpDatosPac1,gbc);
		gbc.gridx=2;gbc.gridy=0;
		jpDatosPaciente.add(jpDatosPac2,gbc);
		gbc.gridx=0;gbc.gridy=1;
		jpDatosPaciente.add(jpDatosPac3,gbc);
		gbc.gridx=2;gbc.gridy=1;
		jpDatosPaciente.add(jpDatosPac4,gbc);
		jpDatosPaciente.setVisible(true);
		jpDatosPaciente.setBorder(new TitledBorder(new EtchedBorder(), "Datos del Paciente"));
		objGestionRegAteGui.sTamañoJArea(jtaAntSalFam, 99);
		objGestionRegAteGui.sTamañoJArea(jtaAntSalPer, 99);
	}
	
	public void PanelAtencionMed()
	{
		jpAtencionMedica =new JPanel(new GridBagLayout());
		//inicio del subpanel 1
		jpAtMed1=new JPanel(new FlowLayout());
		jlbEstadoAte=new JLabel("Estado ");jtfEstadoAte=new JTextField(10);
		jlbHoraAte=new JLabel("Hora ");jtfHoraAte=new JTextField(10);
		jlbFechaAte=new JLabel("Fecha ");jtfFechaAte=new JTextField(10);
		jpAtMed1.add(jlbEstadoAte);jpAtMed1.add(jtfEstadoAte);
		jpAtMed1.add(jlbHoraAte);jpAtMed1.add(jtfHoraAte);
		jpAtMed1.add(jlbFechaAte);jpAtMed1.add(jtfFechaAte);
		//fin panel subpanel 1
		//------------------------------------
		//inicio del subpanel 2
		panelSignosVitales();//crea el panel signos vitales
		//fin del subpanel 2
		//-----------------------------------------
		//iniio subpanel 3
		panelSintomas();
		//fin subpanel 3
		//------------------------------------------
		//inicio subpanel 4
		panelExamenes();
		//fin subpanel 4
		//-------------------------------------------
		//iniio subpanel 5
		panelDiagnosticoDescriptivo();
		//fin subpanel 5
		//----------------------------------------------
		//inicio subpanel 6
		panelPrescripcion();
		//fin subpanel 6
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.anchor=GridBagConstraints.CENTER;
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpAtencionMedica.add(jpAtMed1,gbc);
		//segunda fila
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		jpAtencionMedica.add(jpSignosVitales,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpAtencionMedica.add(jpDiagDescriptivo,gbc);
		//tercera fila
		gbc.gridwidth=GridBagConstraints.RELATIVE;
		jpAtencionMedica.add(jpSintomas,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpAtencionMedica.add(jpPrescripcion,gbc);
		jpAtencionMedica.add(jpExamenes,gbc);
		//añadiendo limitadores de texto
		objGestionRegAteGui.sTamañoJArea(jtaDiagDescriptivo, 99);
		objGestionRegAteGui.sTamañoJArea(jtaExamenes, 49);
		objGestionRegAteGui.sTamañoJArea(jtaPrescrpcion, 99);
		objGestionRegAteGui.sTamañoJArea(jtaSintomas, 99);
		
		jpAtencionMedica.setBorder(new TitledBorder(new EtchedBorder(), "Atencion Médica"));
		jpAtencionMedica.setVisible(true);
		
	}
	
	public void panelDiagnostico()
	{
		jpDiagnostico =new JPanel(new GridBagLayout());
		GridBagConstraints gbc =new GridBagConstraints();
		jlbGpEnfermedad=new JLabel("Grupo de enfermedad");jcbGpEnfermedad=new JComboBox<String>();
		jlbEnfermedadEspecífica=new JLabel("Enfermedad específica ");jcbGpEnfermedadEspecíf=new JComboBox<String>();
		jcbGpEnfermedad.addItem("seleccione grupo de enfermedda ");jcbGpEnfermedad.addActionListener(this);
		//llenado de combo de enfermedad
		String sqlReq="select descripcionCie from cie where length(codigoCie)=3;";
		objGestionRegAteDB.llenarCombo(jcbGpEnfermedad, sqlReq);
		//fin llenado de combo de enfermedad
		jcbGpEnfermedadEspecíf.addItem("Seleccione la enfermedda específica ");jcbGpEnfermedadEspecíf.addActionListener(this);
		btnAceptarDiagnostico=new JButton("ACEPTAR");
		btnEliminarDiagnostico=new JButton("ELIMINAR");
		btnGrabarDiagnostico=new JButton("GRABAR");
		//primera fila
		gbc.anchor=GridBagConstraints.WEST;
		gbc.gridwidth=1;
		jpDiagnostico.add(jlbGpEnfermedad,gbc);
		jpDiagnostico.add(jcbGpEnfermedad,gbc);
		jpDiagnostico.add(new JLabel("   "),gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDiagnostico.add(btnEliminarDiagnostico,gbc);
		
		//segunda fila
		gbc.gridwidth=1;
		jpDiagnostico.add(jlbEnfermedadEspecífica,gbc);
		jpDiagnostico.add(jcbGpEnfermedadEspecíf,gbc);
		jpDiagnostico.add(new JLabel("   "),gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDiagnostico.add(btnAceptarDiagnostico,gbc);
		
		//-----blanco
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDiagnostico.add(new JLabel(" "),gbc);
		//-----blanco
		//tercera fila
			jtbDiagnostico=new JTable();
			jtbDiagnostico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			modTblDiagnostico=new DefaultTableModel()
			{//inicio control tabkla editable
				private static final long serialVersionUID = 1L;

				public boolean isCellEditable(int row, int column) 
				{
				return false;//editable:true, no editable:false
				}
			};
			jtbDiagnostico.setModel(modTblDiagnostico);
			modTblDiagnostico.addColumn("IdGrupo");
			modTblDiagnostico.addColumn("Cód.");
			modTblDiagnostico.addColumn("Descrip. Grupo");
			modTblDiagnostico.addColumn("IdEnfermedad");
			modTblDiagnostico.addColumn("Código");
			modTblDiagnostico.addColumn("Descrip. Enfermedad");
			TableColumnModel columnModelTbDespliegue=jtbDiagnostico.getColumnModel();
			
				columnModelTbDespliegue.getColumn(0).setPreferredWidth(50);
				columnModelTbDespliegue.getColumn(1).setPreferredWidth(50);
				columnModelTbDespliegue.getColumn(2).setPreferredWidth(150);
				columnModelTbDespliegue.getColumn(3).setPreferredWidth(50);
				columnModelTbDespliegue.getColumn(4).setPreferredWidth(50);
				columnModelTbDespliegue.getColumn(5).setPreferredWidth(400);

		JScrollPane scrolTbDiag=new JScrollPane(jtbDiagnostico);
		//fin cracion de jtable
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpDiagnostico.add(scrolTbDiag,gbc);
		//cuarta fila
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		gbc.anchor=GridBagConstraints.CENTER;
		gbc.weightx=0.0;
		gbc.weighty=0.0;
		gbc.fill=GridBagConstraints.NONE;
		//añadiendo escuchadores
		btnAceptarDiagnostico.setActionCommand("acDiagnostico");
		btnEliminarDiagnostico.setActionCommand("ElDiagnostico");
		btnGrabarDiagnostico.setActionCommand("recDiagnostico");
		btnAceptarDiagnostico.addActionListener(this);
		btnEliminarDiagnostico.addActionListener(this);
		btnGrabarDiagnostico.addActionListener(this);
		//jpDiagnostico.add(btnGrabarDiagnostico,gbc);
		jpDiagnostico.setBorder(new TitledBorder(new EtchedBorder(), "Diagnóstico"));
		
	}
	//funciones de trabajo 
	private void llenarCombo(JComboBox<String> jcbOut, JComboBox<String> jcbIn, String strSqlIn,ArrayList<Integer> arrListPOs,ArrayList<String> LstIdsMedicos)
	{
		
		objGestionRegAteGui.llenarComboDinamico(jcbOut, jcbIn, strSqlIn, arrListPOs, lstIdsMedicos);
	}
	//desactivar paneles
		public void desactivarContenedores(boolean blnVal)
		{
			//panl datos paciente
			objGestionRegAteGui.ActivarDesactivarContenedores(jpDatosPaciente, blnVal);
			objGestionRegAteGui.ActivarDesactivarContenedores(jpDatosPac1, blnVal);
			objGestionRegAteGui.ActivarDesactivarContenedores(jpDatosPac2, blnVal);
			objGestionRegAteGui.ActivarDesactivarContenedores(jpDatosPac3, blnVal);
			objGestionRegAteGui.ActivarDesactivarContenedores(jpDatosPac4, blnVal);
			//-------------------------------------------
			//panel atencion medica
			objGestionRegAteGui.ActivarDesactivarContenedores(jpAtencionMedica, blnVal);
			objGestionRegAteGui.ActivarDesactivarContenedores(jpAtMed1, blnVal);
			jtaSignosVitales.setEditable(false);
			jtaDiagDescriptivo.setEditable(false);
			jtaExamenes.setEditable(false);
			jtaPrescrpcion.setEditable(false);
			jtaSintomas.setEditable(false);
			//-------------------------------------------
			objGestionRegAteGui.ActivarDesactivarContenedores(jpDespliegueAtencion, blnVal);
			objGestionRegAteGui.ActivarDesactivarContenedores(jpDiagnostico, blnVal);
			//panel controles
			objGestionRegAteGui.ActivarDesactivarContenedores(jpControlesAtencion, blnVal);
		}
		//fin desactivar paneles
		//---------------------------------------------------------
		private void activarAteMed()
		{
			
			objGestionRegAteGui.ActivarDesactivarContenedores(jpAtencionMedica, true);
			objGestionRegAteGui.ActivarDesactivarContenedores(jpDiagnostico, true);
			objGestionRegAteGui.ActivarDesactivarContenedores(jpDespliegueAtencion, true);
			objGestionRegAteGui.ActivarDesactivarContenedores(jpDatosPaciente, true);
			objGestionRegAteGui.ActivarDesactivarContenedores(jpDatosPac3, true);
			objGestionRegAteGui.ActivarDesactivarContenedores(jpDatosPac4, true);
			jtaDiagDescriptivo.setEditable(true);
			jtaExamenes.setEditable(true);
			jtaPrescrpcion.setEditable(true);
			jtaSintomas.setEditable(true);
			objGestionRegAteGui.ActivarDesactivarContenedores(jpControlesAtencion, true);
		}
		//iniio funciones de limpieza
		private void limpiarInterfaceRegAte()
		{
			//inicio panel datos paciente
			jtfNroHistClinica.setText("");
			jtfApellido1.setText("");
			jtfApellido2.setText("");
			jtfNombre1.setText("");
			jtfNombre2.setText("");
			jtfCedula.setText("");
			jtfFechaNac.setText("");
			jtfSexo.setText("");
			jtfTelefono.setText("");
			jtfDireccion.setText("");
			jtfProvincia.setText("");
			jtfCanton.setText("");
			jtfParroquia.setText("");
			jtfIdPersonaPac.setText("");
			jtfIdParroquia.setText("");
			jtfIdCanton.setText("");
			jtfIdProvincia.setText("");
			jtfIdPaciente.setText("");
			jtfIdAte.setText("");
			jtfIdMed.setText("");
			jtfIdRecepcionista.setText("");
			jtfIdEnfermero.setText("");
			jtaAntSalFam.setText("");
			jtaAntSalPer.setText("");
			//fin panel datos paciente
			//---------------------------------
			//panel atencion medica
			jtfEstadoAte.setText("");
			jtfHoraAte.setText("");
			jtfFechaAte.setText("");
			jtaSignosVitales.setText("");
			jtaDiagDescriptivo.setText("");
			jtaSintomas.setText("");
			jtaPrescrpcion.setText("");
			jtaExamenes.setText("");
			//fin panel atencion medica
			//-----------------------------------
			//inicio panel diagnostico
			jcbGpEnfermedad.setSelectedIndex(0);
			jcbGpEnfermedadEspecíf.setSelectedIndex(0);
			//fin panel diagnostico
			objGestionRegAteGui.reiniciarJTable(modTblDiagnostico);
			objGestionRegAteGui.reiniciarJTable(modTableDespliegue);
			
			
			
		}
		private void limpiarObjetoRegAte()
		{
			objRegAte.setAntSaldFam("");
			objRegAte.setAntSaldPer("");
			objRegAte.setDiagnosticoDescriptivo("");
			objRegAte.setEstadoAte("");
			objRegAte.setExamenesPedidos("");
			objRegAte.setPrescripcionAte("");
			objRegAte.setSintomasAte("");
		}
		//fin funciones delimpieza
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guiRegistAtencionMedica app=new guiRegistAtencionMedica();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.desactivarContenedores(false);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(jcbEspecialidad.getSelectedIndex()>0)
		{//if del combo especialidad
			String strSqlMed="select concat_ws(' ',per.apellido1Per,per.apellido2Per,per.nombre1Per,per.nombre2Per), med.idMedico "
					+ "from persona per, medico med, especialidad esp "
					+ "where per.idPersona=med.idPersonaMed and "
					+ "med.idEspecialidadMed=esp.idEspecialidad and "
					+ "esp.descripcionEspecialidad='"+jcbEspecialidad.getSelectedItem()+"';";

			llenarCombo(jcbEspecialidad, jcbMedico, strSqlMed, lstCmbMedico,lstIdsMedicos);
			if(jcbMedico.getSelectedIndex()>0)
			{//if combo medico

				//System.out.println(lstIdsMedicos.get(jcbMedico.getSelectedIndex()-1));
				//String strSqlAux=strSqlTablaPacientes+lstIdsMedicos.get(jcbMedico.getSelectedIndex()-1)+"';";
				//objGestionRegAteDB.llenarJtable(jtbDespliegueAtencion, modTableDespliegue, strSqlAux);
				//-------------------------------------
				/*if(jtbDespliegueAtencion.getRowCount()>=1)
					//activarAteMed();
				else
				{
					desactivarContenedores(false);
				}*/
				if(jcbGpEnfermedad.getSelectedIndex()>0)
				{
					//System.out.println(objGestionRegAteDB.obtenerID("Cie", "idCie", "descripcionCie", jcbGpEnfermedad.getSelectedItem().toString()));
					String strSqlEnfEsp="select descripcionCie from cie where idCiePadre='"+objGestionRegAteDB.obtenerID("Cie", "idCie", "descripcionCie", jcbGpEnfermedad.getSelectedItem().toString())+"';";
					objGestionRegAteGui.llenarComboDinamico(jcbGpEnfermedad, jcbGpEnfermedadEspecíf, strSqlEnfEsp, lstCmbEnfEsp);
				}
			}//fin del if combo medico 
		}//fin del combo especialiadad
		//---------------------------------------------------------------------------------------
		String accion=e.getActionCommand();
		if(jcbEspecialidad.getSelectedIndex()>0  && jcbMedico.getSelectedIndex()>0)
		{
			objGestionRegAteGui.reiniciarJTable(modTableDespliegue);
			String strSqlAux=strSqlTablaPacientes+lstIdsMedicos.get(jcbMedico.getSelectedIndex()-1)+"';";
			objGestionRegAteDB.llenarJtable(jtbDespliegueAtencion, modTableDespliegue, strSqlAux);
			if(jtbDespliegueAtencion.getRowCount()>=1)
			{
				activarAteMed();
			}
			else
			{
				desactivarContenedores(false);
			}
		}
		//inicio aceptar diagnostico

		if(accion.equals("acDiagnostico"))
		{
			strMsjErroDiagnostico="";
			//inicio validacion Diagnostico
			if(jtfNroHistClinica.getText().length()!=0 && jcbGpEnfermedad.getSelectedIndex()>0 && jcbGpEnfermedadEspecíf.getSelectedIndex()>0
					&& !objGestionRegAteGui.validarExistencia(jtbDiagnostico,
							jcbGpEnfermedadEspecíf.getSelectedItem().toString(),5))
			{

			}
			else
			{
				if(objGestionRegAteGui.validarExistencia(jtbDiagnostico,
						jcbGpEnfermedadEspecíf.getSelectedItem().toString(),5))
					strMsjErroDiagnostico=strMsjErroDiagnostico+"EL DIAGNÓSTICO INGRESADO YA ESTA EN LISTA,\n";
				if(jtfNroHistClinica.getText().equals(""))
					strMsjErroDiagnostico=strMsjErroDiagnostico+"AÚN NO SE HA SELECCIONADO NINGÚN PACIENTE,\n";
				if(jcbGpEnfermedadEspecíf.getSelectedIndex()<=0)
					strMsjErroDiagnostico=strMsjErroDiagnostico+"NO SE HA SELECCIONDO EL GRUPO DE LA ENFERMEDAD, \n";
				if(jcbGpEnfermedad.getSelectedIndex()<=0)
					strMsjErroDiagnostico=strMsjErroDiagnostico+"NO SE HA SELECCIONDO ENFERMEDAD ESPECÍFICA, \n";
			}
			//fin validacion diagnóstico
			if(strMsjErroDiagnostico.length()==0)
			{
				//inicio escritura en jtable de dignóstico
				Object objTablaDiagnostico[] =new Object[6];
				objTablaDiagnostico[0]=objGestionRegAteDB.obtenerID("Cie", "idCie", "descripcionCie", jcbGpEnfermedad.getSelectedItem().toString());
				objTablaDiagnostico[1]=objGestionRegAteDB.obtenerID("Cie", "codigoCie", "descripcionCie", jcbGpEnfermedad.getSelectedItem().toString());
				objTablaDiagnostico[2]=jcbGpEnfermedad.getSelectedItem();
				objTablaDiagnostico[3]=objGestionRegAteDB.obtenerID("Cie", "idCie", "descripcionCie", jcbGpEnfermedadEspecíf.getSelectedItem().toString());
				objTablaDiagnostico[4]=objGestionRegAteDB.obtenerID("Cie", "codigoCie", "descripcionCie", jcbGpEnfermedadEspecíf.getSelectedItem().toString());
				objTablaDiagnostico[5]=jcbGpEnfermedadEspecíf.getSelectedItem();
				modTblDiagnostico.addRow(objTablaDiagnostico);
				//fin de la escritura en el jtable de dignóstico
			}
			else
			{
				JOptionPane.showMessageDialog(null, strMsjErroDiagnostico, "ERROR AL INGRESAR DIAGNÓSTICO", JOptionPane.ERROR_MESSAGE);
			}
		}
		//fin aceptar diagnóstico
		//------------------------------------------------------------------
		//inicio del boton eliminar
		if(accion.equals("ElDiagnostico"))
		{//
			int fila = jtbDiagnostico.getSelectedRow();
			if(fila != -1)
			{
				modTblDiagnostico.removeRow(fila);
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
			}
		}
		//fin del boton eliminar
		//-----------------------------------------------------------------------
		//inicio boton grbar diagnóstico
		if(accion.equals("recDiagnostico"))
		{

			if(jtbDiagnostico.getRowCount()>0)
			{
				if(JOptionPane.showConfirmDialog(null,"Realmente desea guardar este diagnóstico?", "", JOptionPane.YES_NO_OPTION)==0)
				{
					/*for(int i=0; i<jtbDiagnostico.getRowCount();i++)

					{
						/*System.out.println(jtbDiagnostico.getValueAt(i,2).toString()+
						jtbDiagnostico.getValueAt(i,3).toString()+
						jtbDiagnostico.getValueAt(i,4).toString());
						objGestionRegAteDB.insertarDatosDB("DiagnosticoAte", strArrColsDiagn, 
								new String[]{jtbDiagnostico.getValueAt(i,3).toString(),jtfIdAte.getText()});

					}*/
					objGestionRegAteGui.ActivarDesactivarContenedores(jpDiagnostico, false);
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "AUN NO SE INGRESADO NINGUN DIAGNÓTICO", "ERROR AL GUARDAR DIAGNÓSTICO", JOptionPane.ERROR_MESSAGE);
			}
		}
		//fin del boton grabar diagnóstico
		//-----------------------------------------------------------------------------------
		//iniico del boton actualizar
		if(accion.equals("actualizar"))
		{
			btnGrabarDiagnostico.doClick();
			if(jtfIdAte.getText().length()>0)
			{
				strMsjErrorAte="";
				//inicio validacion antecedentes personales
				if(jtaAntSalFam.getText().trim().length()==0)
				{
					strMsjErrorAte=strMsjErrorAte+"LOS ANTECEDENTES DE SALUD FAMILIARES,\n";	
				}
				else
				{
					objRegAte.setAntSaldFam(jtaAntSalFam.getText().toUpperCase());
				}
				//fin validacion antecedentes personales
				//--------------------------------------------------------
				//inicio validacion antecedentes personales
				if(jtaAntSalPer.getText().trim().length()==0)
				{
					strMsjErrorAte=strMsjErrorAte+"LOS ANTECEDENTES DE SALUD PERSONALES,\n";	
				}
				else
				{
					objRegAte.setAntSaldPer(jtaAntSalPer.getText().toUpperCase());
				}
				//fin validacion antecedentes personales
				//-----------------------------------------------------
				//inicio validacion diagnostico descriptivo
				if(jtaDiagDescriptivo.getText().trim().length()==0)
				{
					strMsjErrorAte=strMsjErrorAte+"EL DIAGNÓSTICO DESCRIPTIVO,\n";	
				}
				else
				{
					objRegAte.setDiagnosticoDescriptivo(jtaDiagDescriptivo.getText().toUpperCase());
				}
				//fin validacion diagnostico descriptivo
				//-----------------------------------------------------------------------------------
				//inicio validacion sintomas
				if(jtaSintomas.getText().trim().length()==0)
				{
					strMsjErrorAte=strMsjErrorAte+" LOS SINTOMAS,\n";
				}
				else
				{
					objRegAte.setSintomasAte(jtaSintomas.getText().toUpperCase());
				}
				//fin validacion sintomas
				//--------------------------------------------------------------
				//inicio validacion  prescripcion
				if(jtaPrescrpcion.getText().trim().length()==0)
				{
					strMsjErrorAte=strMsjErrorAte+" LA PRESCRIPCION,\n";
				}
				else
				{
					objRegAte.setPrescripcionAte(jtaPrescrpcion.getText().toUpperCase());
				}
				//fin validacion prescripcio 
				//--------------------------------------------------------------
				//inicio validacion examenes
				if(jtaExamenes.getText().trim().length()==0)
				{
					strMsjErrorAte=strMsjErrorAte+" LOS EXAMENES SOLICITADOS,\n";
				}
				else
				{
					objRegAte.setExamenesPedidos(jtaExamenes.getText().toUpperCase());
				}
				//fin validacion examenes
				//-----------------------------------------------------------------
				//inicio validacion estado
				objRegAte.setEstadoAte("ATENDIDO");
				//fin validacion estado
				
				if(strMsjErrorAte.length()!=0)
				{
					strMsjErrorAte=strMsjErrorAte+"AUN NO HAN SIDO INGRESADOS, REALMENTE DESEA CONTINUAR?";
					if(JOptionPane.showConfirmDialog(null,strMsjErrorAte, "ADVERTENCIA", JOptionPane.YES_NO_OPTION)==0)
					{
						objRegAte.setAntSaldFam(jtaAntSalFam.getText().toUpperCase());
						objRegAte.setAntSaldPer(jtaAntSalPer.getText().toUpperCase());
						objRegAte.setDiagnosticoDescriptivo(jtaDiagDescriptivo.getText().toUpperCase());
						objRegAte.setSintomasAte(jtaSintomas.getText().toUpperCase());
						objRegAte.setPrescripcionAte(jtaPrescrpcion.getText().toUpperCase());
						objRegAte.setExamenesPedidos(jtaExamenes.getText().toUpperCase());
						objRegAte.setEstadoAte("ATENDIDO");
						objGestionRegAteDB.actualizarDatosDB("Paciente", strArrColsPacAte, new String[]{
								objRegAte.getAntSaldFam(),objRegAte.getAntSaldPer()}, jtfIdPersonaPac.getText());

						objGestionRegAteDB.actualizarDatosDB("Atencionmedica", strArrColsAte, new String[]{
								objRegAte.getDiagnosticoDescriptivo(),objRegAte.getEstadoAte(), objRegAte.getExamenesPedidos(),
								objRegAte.getPrescripcionAte(), objRegAte.getSintomasAte()}, jtfIdAte.getText());
						
						
						for(int i=0; i<jtbDiagnostico.getRowCount();i++)
						{
							/*System.out.println(jtbDiagnostico.getValueAt(i,2).toString()+
							jtbDiagnostico.getValueAt(i,3).toString()+
							jtbDiagnostico.getValueAt(i,4).toString());*/
							objGestionRegAteDB.insertarDatosDB("DiagnosticoAte", strArrColsDiagn, 
									new String[]{jtbDiagnostico.getValueAt(i,3).toString(),jtfIdAte.getText()});

						}
						limpiarObjetoRegAte();
						limpiarInterfaceRegAte();
						objGestionRegAteGui.reiniciarJTable(modTableDespliegue);
						String strSqlAux=strSqlTablaPacientes+lstIdsMedicos.get(jcbMedico.getSelectedIndex()-1)+"';";
						objGestionRegAteDB.llenarJtable(jtbDespliegueAtencion, modTableDespliegue, strSqlAux);
					}
				}
				else
				{
					//rutina de actualizacion
					objGestionRegAteDB.actualizarDatosDB("Paciente", strArrColsPacAte, new String[]{
							objRegAte.getAntSaldFam(),objRegAte.getAntSaldPer()}, jtfIdPersonaPac.getText());

					objGestionRegAteDB.actualizarDatosDB("Atencionmedica", strArrColsAte, new String[]{
							objRegAte.getDiagnosticoDescriptivo(),objRegAte.getEstadoAte(), objRegAte.getExamenesPedidos(),
							objRegAte.getPrescripcionAte(), objRegAte.getSintomasAte()}, jtfIdAte.getText());
					
					//diag
					for(int i=0; i<jtbDiagnostico.getRowCount();i++)
					{
						/*System.out.println(jtbDiagnostico.getValueAt(i,2).toString()+
						jtbDiagnostico.getValueAt(i,3).toString()+
						jtbDiagnostico.getValueAt(i,4).toString());*/
						objGestionRegAteDB.insertarDatosDB("DiagnosticoAte", strArrColsDiagn, 
								new String[]{jtbDiagnostico.getValueAt(i,3).toString(),jtfIdAte.getText()});

					}
					limpiarObjetoRegAte();
					limpiarInterfaceRegAte();
					objGestionRegAteGui.reiniciarJTable(modTableDespliegue);
					String strSqlAux=strSqlTablaPacientes+lstIdsMedicos.get(jcbMedico.getSelectedIndex()-1)+"';";
					objGestionRegAteDB.llenarJtable(jtbDespliegueAtencion, modTableDespliegue, strSqlAux);
				}
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "AUN NO SE HA SELECCIONADO NINGUN PACIENTE", "ERROR AL ACTUALIZAR LA ATENCION MEDICA", JOptionPane.ERROR_MESSAGE);
			}
		}
		//fin del boton actualizar
		//------------------------------------------------------------------------------------
		//inicio boton cancelar
		if(accion.equals("cancelar"))
		{
			limpiarInterfaceRegAte();
			limpiarObjetoRegAte();
		}
		//fin del boton cancelar
		//-----------------------------------------------------------------------------------
		//inicio del boton salir
		//-----------------------------------------------------------------------------------
		//inicio del boton no atendido
		if(accion.equals("noatendido"))
		{
			if(jtfIdAte.getText().length()>0)
			{
				strMsjErrorAte="";
				//inicio validacion antecedentes personales
				if(jtaAntSalFam.getText().trim().length()==0)
				{
					strMsjErrorAte=strMsjErrorAte+"LOS ANTECEDENTES DE SALUD FAMILIARES,\n";	
				}
				else
				{
					objRegAte.setAntSaldFam(jtaAntSalFam.getText().toUpperCase());
				}
				//fin validacion antecedentes personales
				//--------------------------------------------------------
				//inicio validacion antecedentes personales
				if(jtaAntSalPer.getText().trim().length()==0)
				{
					strMsjErrorAte=strMsjErrorAte+"LOS ANTECEDENTES DE SALUD PERSONALES,\n";	
				}
				else
				{
					objRegAte.setAntSaldPer(jtaAntSalPer.getText().toUpperCase());
				}
				//fin validacion antecedentes personales
				//-----------------------------------------------------
				//inicio validacion diagnostico descriptivo
				if(jtaDiagDescriptivo.getText().trim().length()==0)
				{
					strMsjErrorAte=strMsjErrorAte+"EL DIAGNÓSTICO DESCRIPTIVO,\n";	
				}
				else
				{
					objRegAte.setDiagnosticoDescriptivo(jtaDiagDescriptivo.getText().toUpperCase());
				}
				//fin validacion diagnostico descriptivo
				//-----------------------------------------------------------------------------------
				//inicio validacion sintomas
				if(jtaSintomas.getText().trim().length()==0)
				{
					strMsjErrorAte=strMsjErrorAte+" LOS SINTOMAS,\n";
				}
				else
				{
					objRegAte.setSintomasAte(jtaSintomas.getText().toUpperCase());
				}
				//fin validacion sintomas
				//--------------------------------------------------------------
				//inicio validacion  prescripcion
				if(jtaPrescrpcion.getText().trim().length()==0)
				{
					strMsjErrorAte=strMsjErrorAte+" LA PRESCRIPCION,\n";
				}
				else
				{
					objRegAte.setPrescripcionAte(jtaPrescrpcion.getText().toUpperCase());
				}
				//fin validacion prescripcio 
				//--------------------------------------------------------------
				//inicio validacion examenes
				if(jtaExamenes.getText().trim().length()==0)
				{
					strMsjErrorAte=strMsjErrorAte+" LOS EXAMENES SOLICITADOS,\n";
				}
				else
				{
					objRegAte.setExamenesPedidos(jtaExamenes.getText().toUpperCase());
				}
				//fin validacion examenes
				//-----------------------------------------------------------------
				//inicio validacion estado
				objRegAte.setEstadoAte("NO ATENDIDO");
				//fin validacion estado
				
				if(strMsjErrorAte.length()!=0)
				{
					strMsjErrorAte=strMsjErrorAte+"AUN NO HAN SIDO INGRESADOS, REALMENTE DESEA CONTINUAR?";
					if(JOptionPane.showConfirmDialog(null,strMsjErrorAte, "ADVERTENCIA", JOptionPane.YES_NO_OPTION)==0)
					{
						objRegAte.setAntSaldFam(jtaAntSalFam.getText().toUpperCase());
						objRegAte.setAntSaldPer(jtaAntSalPer.getText().toUpperCase());
						objRegAte.setDiagnosticoDescriptivo(jtaDiagDescriptivo.getText().toUpperCase());
						objRegAte.setSintomasAte(jtaSintomas.getText().toUpperCase());
						objRegAte.setPrescripcionAte(jtaPrescrpcion.getText().toUpperCase());
						objRegAte.setExamenesPedidos(jtaExamenes.getText().toUpperCase());
						objRegAte.setEstadoAte("NO ATENDIDO");
						objGestionRegAteDB.actualizarDatosDB("Paciente", strArrColsPacAte, new String[]{
								objRegAte.getAntSaldFam(),objRegAte.getAntSaldPer()}, jtfIdPersonaPac.getText());

						objGestionRegAteDB.actualizarDatosDB("Atencionmedica", strArrColsAte, new String[]{
								objRegAte.getDiagnosticoDescriptivo(),objRegAte.getEstadoAte(), objRegAte.getExamenesPedidos(),
								objRegAte.getPrescripcionAte(), objRegAte.getSintomasAte()}, jtfIdAte.getText());
						
						limpiarObjetoRegAte();
						limpiarInterfaceRegAte();
						objGestionRegAteGui.reiniciarJTable(modTableDespliegue);
						String strSqlAux=strSqlTablaPacientes+lstIdsMedicos.get(jcbMedico.getSelectedIndex()-1)+"';";
						objGestionRegAteDB.llenarJtable(jtbDespliegueAtencion, modTableDespliegue, strSqlAux);
					}
				}
				else
				{
					//rutina de actualizacion
					objGestionRegAteDB.actualizarDatosDB("Paciente", strArrColsPacAte, new String[]{
							objRegAte.getAntSaldFam(),objRegAte.getAntSaldPer()}, jtfIdPersonaPac.getText());

					objGestionRegAteDB.actualizarDatosDB("Atencionmedica", strArrColsAte, new String[]{
							objRegAte.getDiagnosticoDescriptivo(),objRegAte.getEstadoAte(), objRegAte.getExamenesPedidos(),
							objRegAte.getPrescripcionAte(), objRegAte.getSintomasAte()}, jtfIdAte.getText());
					
					//diag
					limpiarObjetoRegAte();
					limpiarInterfaceRegAte();
					objGestionRegAteGui.reiniciarJTable(modTableDespliegue);
					String strSqlAux=strSqlTablaPacientes+lstIdsMedicos.get(jcbMedico.getSelectedIndex()-1)+"';";
					objGestionRegAteDB.llenarJtable(jtbDespliegueAtencion, modTableDespliegue, strSqlAux);
				}
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "AUN NO SE HA SELECCIONADO NINGUN PACIENTE", "ERROR AL ACTUALIZAR LA ATENCION MEDICA", JOptionPane.ERROR_MESSAGE);
			}
		}
		//fin del boton no atendido
		if(accion.equals("salir"))
		{
			jfRegAtencionMedica.setVisible(false);
		}
		//fin del boton salir
	}

}
