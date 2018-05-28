/* PROGRAMACION II
 * Nombre de la gui: Gui registrar especialidad medica
 * Nombres: - Criollo Ramos José Antonio
 *          - GUaraca Sislema Oscar Ramiro
 *          - López Moreno Rubby Gabriela
 * Fecha de entrega: 2015-07-27
 * Objetivo: Implementar la clase guiVentana principal desde la que se puede acceder
 * a todas las clases gui implementadas en este proyecto.
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
	//items menu reporte
	public MenuItem miPacProEsp,miPacEsp,miPacEspMed,miTurnNoAtend,rep1,rep2, miLanzador;
	//items menu salir
	public MenuItem miSalir;
	//items menu ayuda
	public MenuItem miAyuda;
	//menus
	public Menu mRegistro,mReporte,mAyuda,mSalir,mMantenimiento;
	//menu total
	MenuBar mbBarraMenu = new MenuBar();
	public JFrame jfVentanaPrincipal;
	//fin declaracion de variables
	public guiVentanaPrincipal()
	{
		jfVentanaPrincipal=new JFrame("APLICACIÓN CONSULTORIO MÉDICO");
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
		
		miRegistAtencionMedica=new MenuItem("Registrar Atención Médica");
		miRegistEspecialidad=new MenuItem("Registrar Especialidad");
		miRegistPaciente=new MenuItem("Registrar Paciente");
		
		
		
		//añadiendo items
		mRegistro.add(miRegistAtencionMedica);
		mRegistro.add(miRegistEspecialidad);
		mRegistro.add(miRegistPaciente);
		//estableciendo escuchadores
		miRegistAtencionMedica.addActionListener(this);
		miRegistAtencionMedica.setActionCommand("regAteMed");
		miRegistEspecialidad.addActionListener(this);
		miRegistEspecialidad.setActionCommand("regEsp");
		miRegistPaciente.addActionListener(this);
		miRegistPaciente.setActionCommand("regPac");
		//fin menu registro
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
		miRegistMedico=new MenuItem("Registrar Médico (no implementado)");
		miRegistMedico.setEnabled(false);
		miRegistLugarGeo=new MenuItem("Registrar LugarGeo (no implementado)");
		miRegistLugarGeo.setEnabled(false);
		miRegistTurno=new MenuItem("Registrar Turno (no implementado)");
		miRegistTurno.setEnabled(false);
		miRegistCie=new MenuItem("Registrar CIE (no implementado)");
		miRegistCie.setEnabled(false);
		miRegistSignosVitales=new MenuItem("Registrar Signos Vitales (no implementado)");
		miRegistSignosVitales.setEnabled(false);
		//añadiendo items
		mMantenimiento.add(miRegistMedico);
		mMantenimiento.add(miRegistLugarGeo);
		mMantenimiento.add(miRegistTurno);
		mMantenimiento.add(miRegistCie);
		mMantenimiento.add(miRegistSignosVitales);
		//fin del menu mantenimiento
		//añadiendo los menus a la barra de menu 
		
		mbBarraMenu.add(mRegistro);
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
			if(JOptionPane.showConfirmDialog(null,"Desea continuar?", "", JOptionPane.YES_NO_OPTION)==0)
				System.exit(0);
		}
		
	}

}
