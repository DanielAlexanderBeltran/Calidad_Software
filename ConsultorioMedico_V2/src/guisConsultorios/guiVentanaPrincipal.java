package guisConsultorios;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class guiVentanaPrincipal extends JFrame implements ActionListener {
	
	//declaracion de variables
		private static final long serialVersionUID = 1L;
		//items menu registro	
	
	
	
	
	private JFrame jfVentanaPrincipal;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiVentanaPrincipal window = new guiVentanaPrincipal();
					window.jfVentanaPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public guiVentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jfVentanaPrincipal = new JFrame("Aplicación Consultorios Médicos");
		jfVentanaPrincipal.setTitle("APLICACI\u00D3N CONSULTORIO M\u00C9DICO");
		jfVentanaPrincipal.setBounds(100, 100, 450, 413);
		jfVentanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		jfVentanaPrincipal.getContentPane().setLayout(gridBagLayout);
		
		JMenuBar mbBarraMenu = new JMenuBar();
		jfVentanaPrincipal.setJMenuBar(mbBarraMenu);
		
		JMenu mRegistro = new JMenu("Registrar");
		mbBarraMenu.add(mRegistro);
		
		JMenuItem mntmRegistarPaciente = new JMenuItem("Registar Paciente");
		mRegistro.add(mntmRegistarPaciente);
		
		JMenuItem mntmRegistar = new JMenuItem("Registar M\u00E9dico");
		mRegistro.add(mntmRegistar);
		
		JMenuItem mntmRegistrarEspecialidad = new JMenuItem("Registrar Especialidad");
		mRegistro.add(mntmRegistrarEspecialidad);
		
		JMenuItem mntmRegistarAtencinMdica = new JMenuItem("Registar Atenci\u00F3n M\u00E9dica");
		mRegistro.add(mntmRegistarAtencinMdica);
		
		JMenu mAgendar = new JMenu("Agendar");
		mbBarraMenu.add(mAgendar);
		
		JMenuItem mntmCitasMdicas = new JMenuItem("Citas M\u00E9dicas");
		mAgendar.add(mntmCitasMdicas);
		
		JMenu mReporte = new JMenu("Reportes");
		mbBarraMenu.add(mReporte);
		
		JMenuItem mntmLanzadorReportes = new JMenuItem("Lanzador Reportes");
		mReporte.add(mntmLanzadorReportes);
		
		JMenu mMantenimiento = new JMenu("Mantenimiento");
		mbBarraMenu.add(mMantenimiento);
		
		JMenu mAyuda = new JMenu("Ayuda");
		mbBarraMenu.add(mAyuda);
		
		JMenuItem mntmAyuda = new JMenuItem("Ayuda");
		mAyuda.add(mntmAyuda);
		
		JMenu mSalir = new JMenu("Salir");
		mbBarraMenu.add(mSalir);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mSalir.add(mntmSalir);
	}

}
