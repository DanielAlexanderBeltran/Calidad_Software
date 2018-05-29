/* PROGRAMACION II
 * Nombre de la gui: Gui registrar especialidad medica
 * Nombres: - Criollo Ramos José Antonio
 *          - GUaraca Sislema Oscar Ramiro
 *          - López Moreno Rubby Gabriela
 * Fecha de entrega: 2015-07-27
 * Objetivo: Implementar la clase guiRegistEspecialidad para capturar datos a
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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import clasesBean.RegistrarEspecialidadBean;
import Utilitarios.*;

public class guiRegistEspecialidad extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private static JLabel jlbIdEsp,jlbDescripcionEspecialidad;
	private static JTextField jtfIdEsp,jtfDescripcionEspecialidad;
	private static JPanel jpanel1,jpcontroles,jpDespliegue;
	private static JButton jbtGrabar,jbtCancelar,jbtSalir;
	private static JTable jtbIdDescripcion;
	private static DefaultTableModel modelo;
	private static RegistrarEspecialidadBean objRegistEspec=new RegistrarEspecialidadBean();
	private static operacionesSobreGUI objGestionGui=new operacionesSobreGUI();
	private static operacionesSobreDB objGestionDB=new operacionesSobreDB();
	private static String strMsjeError="";
	private static String strArrColsOfDB[]=objGestionDB.obtnerColumNames("Especialidad");
	private static JFrame jfVentanaRegEspecialidad;
	public guiRegistEspecialidad()
	{
		jfVentanaRegEspecialidad = new JFrame("REGISTRAR ESPECIALIDAD"); 
		jfVentanaRegEspecialidad.setLayout(null);
		jfVentanaRegEspecialidad.setLocation(100, 20);
		jfVentanaRegEspecialidad.setResizable(false);
		panel1();
		controles();
		tablaDespliegue();
		jpanel1.setBounds(10, 10, 300, 100);
		jpcontroles.setBounds(10, 110, 300, 50);
		jpDespliegue.setBounds(10, 160, 300, 200);
		
		jfVentanaRegEspecialidad.add(jpanel1);
		jfVentanaRegEspecialidad.add(jpcontroles);
		jfVentanaRegEspecialidad.add(jpDespliegue);
		jfVentanaRegEspecialidad.setVisible(true);
		jfVentanaRegEspecialidad.setSize(330, 470);
	}
	public void panel1()
	{
		jpanel1=new JPanel(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		jlbIdEsp=new JLabel("IDESPECIALIDAD ");jtfIdEsp=new JTextField(5);jtfIdEsp.setEnabled(false);
		jlbDescripcionEspecialidad=new JLabel("DESCRIPCION ESP. ");jtfDescripcionEspecialidad=new JTextField("aqui especialidad");
		//primera fila
		gbc.anchor=GridBagConstraints.WEST;
		gbc.gridwidth=1;
		jpanel1.add(jlbIdEsp,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpanel1.add(jtfIdEsp,gbc);
		//segunda fila
		gbc.gridwidth=1;
		jpanel1.add(jlbDescripcionEspecialidad,gbc);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		jpanel1.add(jtfDescripcionEspecialidad,gbc);
		objGestionGui.sLetras(jtfDescripcionEspecialidad, 25);
		jpanel1.setBorder(new TitledBorder(new EtchedBorder(), "ESPECIALIDAD"));
		jpanel1.setVisible(true);
	}

	public void controles()
	{
		jpcontroles=new JPanel(new FlowLayout());
		jbtGrabar=new JButton("GRABAR");jbtCancelar=new JButton("CANCELAR");
		//jbtEliminar=new JButton("ELIMINAR");
		jbtSalir=new JButton("SALIR");
		jpcontroles.add(jbtGrabar);jpcontroles.add(jbtCancelar);
		//jpcontroles.add(jbtEliminar);
		jpcontroles.add(jbtSalir);
		//añadiendo comands
		jbtGrabar.setActionCommand("grabar");jbtCancelar.setActionCommand("cancelar");
		//jbtEliminar.setActionCommand("eliminar");
		jbtSalir.setActionCommand("salir");
		//añadiendo escuchadores
		jbtGrabar.addActionListener(this);jbtCancelar.addActionListener(this);
		//jbtEliminar.addActionListener(this);
		jbtSalir.addActionListener(this);
		jpcontroles.setVisible(true);
	}
	public void tablaDespliegue()
	{
		jpDespliegue=new JPanel(new BorderLayout());
		jtbIdDescripcion=new JTable();
		modelo=new DefaultTableModel()
		{//inicio control tabkla editable
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) 
			{
			return false;//editable:true, no editable:false
			}
		};//fin control tabla editable
		jtbIdDescripcion.setModel(modelo);
		modelo.addColumn("id Especialidad");
		modelo.addColumn("Descripcion Especialidad");
		//inicio escuchadores ed fila
		jtbIdDescripcion.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e)
			{
				JTable table =(JTable) e.getSource();
				Point point =e.getPoint();
				int row = table.rowAtPoint(point);//row devolvera -1 si se ha clicado fuera de la fila pero dentro de la tabla, si no devolvera el indice de la fila en la que se ha clicado. 
				if (e.getClickCount() == 2) 
				{
					jtfIdEsp.setText(jtbIdDescripcion.getValueAt(row, 0).toString());
					jtfDescripcionEspecialidad.setText(jtbIdDescripcion.getValueAt(row, 1).toString());
					//System.out.println(""+jtbIdDescripcion.getValueAt(jtbIdDescripcion.getSelectedRow(), 1));
				}
			}
		});
	
		//fin escuchadores de fila 
		JScrollPane scroll=new JScrollPane(jtbIdDescripcion);
		jpDespliegue.add(scroll);
		jpDespliegue.setVisible(true);
	}
	
	//INICIO LIMPIAR INTERFAZ
	public void limpiarInterfazRE()
	{
		jtfDescripcionEspecialidad.setText("");
		jtfIdEsp.setText("");
	}
	//FIN LIMPIAR INTERFAZ
	//----------------------------------------------------------------------------------
	//INICIO FUNCIONES DE TRABAJO
	//-----------metodo llenar jtale
	public void llenarjtbIdDescripcion()
	{
		String sqlc="Select idEspecialidad, descripcionEspecialidad from Especialidad";
		objGestionDB.llenarJtable(jtbIdDescripcion, modelo, sqlc);
	}
	//----------fin metodo llenar jtable
	//------------------------------------------------------------------------------------
	//----------metodo para insertar
	public void insertarEspecialidad(String strTblName,String strArrTablCols[], String strArrNewValues[])
	{
		objGestionDB.insertarDatosDB(strTblName, strArrTablCols, strArrNewValues);
	}
	//----------fin metodo para inserta
	//-------------------------------------------------------------------------------------
	//----------inicio metodo para actualizar
	public void actualizarEspecialidad(String strTblName, String strArrTblCols[], String stblArrValues[], String strIdentif )
	{
		objGestionDB.actualizarDatosDB(strTblName, strArrTblCols, stblArrValues, strIdentif);
	}
	//----------fin metodo para actualizar
	
	//FIN FUNCIONES DE TRABAJO
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guiRegistEspecialidad application = new guiRegistEspecialidad();  //declarando e instanciando
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.llenarjtbIdDescripcion();
		//System.out.println("NUmero de columnas: "+jtbIdDescripcion.getColumnCount());
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{//inicio action event
		String accion=e.getActionCommand();
		if(accion.equals("grabar"))
		{//inicio boton grabar
			strMsjeError="";
			if(jtfDescripcionEspecialidad.getText().trim().length()>=5)
			{
				objRegistEspec.setStrEspecialidad(jtfDescripcionEspecialidad.getText().toUpperCase().trim());
			}
			else
			{
				if(jtfDescripcionEspecialidad.getText().trim().length()<5&&jtfDescripcionEspecialidad.getText().trim().length()>0)
				{
				strMsjeError=strMsjeError+"La Especialidad ingresada no contine al menos cinco letras";
				}
				if(jtfDescripcionEspecialidad.getText().trim().length()==0)
				{
					strMsjeError=strMsjeError+"La Descripción de la especialidad aun no ha sido ingresada";
				}
			}
			if(strMsjeError.length()>0)
			{
				JOptionPane.showConfirmDialog(null, strMsjeError, "ERROR AL GRABAR LA ESPECIALIDAD",JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				if(objGestionGui.validarExistencia(jtbIdDescripcion, jtfIdEsp.getText(),0))
				{
					actualizarEspecialidad("Especialidad", strArrColsOfDB, new String[]{objRegistEspec.getStrEspecialidad()}, jtfIdEsp.getText());
					objGestionGui.reiniciarJTable(modelo);
					llenarjtbIdDescripcion();
					limpiarInterfazRE();
				}
				else
				{
					insertarEspecialidad("Especialidad",strArrColsOfDB,new String[]{objRegistEspec.getStrEspecialidad()});
					objGestionGui.reiniciarJTable(modelo);
					llenarjtbIdDescripcion();
					limpiarInterfazRE();
				}
				
			}
			
		}//fin boton grabar
		//-----------------------------------
		//inicio el boton cancelar
		if(accion.equals("cancelar"))
		{
			limpiarInterfazRE();
			
		}
		
		if(accion.equals("salir"))
		{
			jfVentanaRegEspecialidad.setVisible(false);
		}
		
		
	}//fin action event

}
