/* Calidad de Software
 * Proyecto: Departamento Medico
 * Grupo:03
 */
package guisConsultorio;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class guiVentanaPrincipal extends JFrame implements ActionListener {
	//declaracion de variables
	private static final long serialVersionUID = 1L;
	//items menu registro
	public MenuItem miRegistMedico,miRegistTurno,miRegistPaciente,miRegistLugarGeo,miRegistCie,miRegistEspecialidad,
					miRegistAtencionMedica,miRegistSignosVitales;
	//items menu Agendar Citas Medicas
		public MenuItem miAgendarCitas;
	//items menu reporte
	public MenuItem miPacProEsp,miPacEsp,miPacEspMed,miTurnNoAtend,rep1,rep2, miLanzador;
	//items menu salir
	public MenuItem miSalir;
	//items menu ayuda
	public MenuItem miAyuda;
	//menus
	public Menu mRegistro,mAgendar,mReporte,mAyuda,mSalir,mMantenimiento;
	//menu total
	MenuBar mbBarraMenu = new MenuBar();
	public JFrame jfVentanaPrincipal;
	//fin declaracion de variables
	public guiVentanaPrincipal()
	{
		jfVentanaPrincipal=new JFrame("DEPARTAMENTO MÉDICO");
		jfVentanaPrincipal.setLocation(10,10);
		CrearMenus();
		
		jfVentanaPrincipal.setMenuBar(mbBarraMenu);
		jfVentanaPrincipal.setResizable(false);  
		jfVentanaPrincipal.setVisible(true);
		jfVentanaPrincipal.setSize(600, 670);
		jfVentanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void CrearMenus()
	{
		//inicio menu registro
		mRegistro=new Menu("Registro");//menu que contiene los menu items de registrar
		//items
	
		miRegistPaciente=new MenuItem("Registrar Paciente");
		miRegistAtencionMedica=new MenuItem("Registrar Atención Médica");
		miRegistEspecialidad=new MenuItem("Registrar Especialidad");
		miRegistMedico=new MenuItem("Registar Médico");
		
			
		//añadiendo items
		mRegistro.add(miRegistPaciente);
		mRegistro.add(miRegistAtencionMedica);
		mRegistro.add(miRegistEspecialidad);
		mRegistro.add(miRegistMedico);
		//estableciendo escuchadores
		miRegistPaciente.addActionListener(this);
		miRegistPaciente.setActionCommand("regPac");
		miRegistAtencionMedica.addActionListener(this);
		miRegistAtencionMedica.setActionCommand("regAteMed");
		miRegistEspecialidad.addActionListener(this);
		miRegistEspecialidad.setActionCommand("regEsp");
		miRegistMedico.addActionListener(this);
		miRegistMedico.setActionCommand("regMedico");
		//fin menu registro
		
		//inicio menu Agendar Citas Médicas
		mAgendar=new Menu("Agendar");//menu que contiene los menu items de agendar
		//items
		miAgendarCitas=new MenuItem("Citas Medicas");
		//añadiendo items
		mAgendar.add(miAgendarCitas);
		//estableciendo escuchadores
		miAgendarCitas.addActionListener(this);
		miAgendarCitas.setActionCommand("regCitas");
		//----------------------------------------------------------
		//fin menu Agendar Citas
		//----------------------------------------------------------
		//inicio menu reporte
		mReporte=new Menu("Reporte");
		//items
		miLanzador=new MenuItem("Lanzador de Reportes");
		
		//añadiendo items
		mReporte.add(miLanzador);
		//añadiendo escuchadores
		miLanzador.setActionCommand("lanzarRep");
		miLanzador.addActionListener(this);
	
		//fin menu reporte
		//-----------------------------------------------------------
		
		//inicio menu salir
		mSalir=new Menu("Salir");
		//items
		miSalir=new MenuItem("Salir");
		//añadiendo items
		mSalir.add(miSalir);
		miSalir.setActionCommand("salir");
		miSalir.addActionListener(this);
		//fin menu salir
		//------------------------------------------------------------
		//inicio menu ayuda
		mAyuda=new Menu("Ayuda");
		//items
		miAyuda=new MenuItem("Ayuda");
		//añadiendo items
		mAyuda.add(miAyuda);
		//fin menu ayuda
		//---------------------------------------------------------------
		//inicio del menu mantenimiento
		mMantenimiento=new Menu("Mantenimiento");
		//items
		miRegistLugarGeo=new MenuItem("Registrar LugarGeo (no implementado)");
		miRegistLugarGeo.setEnabled(false);
		miRegistTurno=new MenuItem("Registrar Turno (no implementado)");
		miRegistTurno.setEnabled(false);
		miRegistCie=new MenuItem("Registrar CIE (no implementado)");
		miRegistCie.setEnabled(false);
		miRegistSignosVitales=new MenuItem("Registrar Signos Vitales (no implementado)");
		miRegistSignosVitales.setEnabled(false);
		//añadiendo items
		
		mMantenimiento.add(miRegistLugarGeo);
		mMantenimiento.add(miRegistTurno);
		mMantenimiento.add(miRegistCie);
		mMantenimiento.add(miRegistSignosVitales);
		//fin del menu mantenimiento
		//añadiendo los menus a la barra de menu 
		
		mbBarraMenu.add(mRegistro);
		mbBarraMenu.add(mAgendar);
		mbBarraMenu.add(mReporte);
		mbBarraMenu.add(mMantenimiento);
		mbBarraMenu.setHelpMenu(mAyuda);
		mbBarraMenu.add(mSalir);
		
	}
	public static void main(String[] args) {
		//guiVentanaPrincipal app=new guiVentanaPrincipal();
		//app.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		new guiVentanaPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		//
		
		//
		String comand=e.getActionCommand();
		
		if(comand.equals("regEsp"))
		{
			guiRegistEspecialidad regEsp=new guiRegistEspecialidad();
			regEsp.llenarjtbIdDescripcion();
		}
		
		if(comand.equals("regAteMed"))
		{
			guiRegistAtencionMedica regAte=new guiRegistAtencionMedica();	
			regAte.desactivarContenedores(false);
		}
		
		if (comand.equals("regPac"))
		{
			guiRegistrarPaciente regPac= new guiRegistrarPaciente();
			regPac.llenarTabla();
		}
		if(comand.equals("lanzarRep"))
		{
			new guiReportes();
		}
		if(comand.equals("salir"))
		{
			if(JOptionPane.showConfirmDialog(null,"Seguro que desea Salir del Sistema?", "", JOptionPane.YES_NO_OPTION)==0)
				System.exit(0);
		}
		
	}

}
