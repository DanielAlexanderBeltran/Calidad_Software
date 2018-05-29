package guisConsultorio;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import Utilitarios.operacionesSobreDB;
import Utilitarios.operacionesSobreGUI;

public class demostracion extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnLeer, btnPresentar;
	//private ArrayList<String > lstParaLlenar=new ArrayList<String>();
	private operacionesSobreDB objDemos=new operacionesSobreDB();
	private JTable jtbDemos;
	private DefaultTableModel  modeloDemos=new DefaultTableModel(); //= new DefaultTableModel();
	private JComboBox<String> jcbdescripcionLugarGeo;
	private operacionesSobreGUI objDemosGUI=new operacionesSobreGUI();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demostracion frame = new demostracion();
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
	public demostracion() {
		setTitle("demostracion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnLeer = new JButton("LEER");
		btnLeer.setBounds(27, 26, 89, 23);
		contentPane.add(btnLeer);
		btnLeer.setActionCommand("read");
		btnLeer.addActionListener(this);
		
		btnPresentar = new JButton("PRESENTAR");
		btnPresentar.setBounds(146, 26, 89, 23);
		contentPane.add(btnPresentar);
		btnPresentar.setActionCommand("show");
		btnPresentar.addActionListener(this);
		
		
	//cracion de jtable
		
		jtbDemos = new JTable();
		//modeloDemos = //new DefaultTableModel();
		jtbDemos.setModel(modeloDemos);
		modeloDemos.addColumn("id Lugar Geo");
		modeloDemos.addColumn("Codigo Lugar Geo");
		modeloDemos.addColumn("Descripcion");
		modeloDemos.addColumn("Padre");
		JScrollPane barra= new JScrollPane(jtbDemos);
		barra.setBounds(10,60,300,200);
		contentPane.add(barra);
		barra.setVisible(true);
		//fin creacion jtable 
		//------------------------------------------
		
		jcbdescripcionLugarGeo = new JComboBox<String>();
		jcbdescripcionLugarGeo.addItem("SELECCIONE: ");
		objDemos.llenarCombo(jcbdescripcionLugarGeo, "select descripcionLugarGeo From lugargeo");
		jcbdescripcionLugarGeo.setBounds(300,26,100,25);
		contentPane.add(jcbdescripcionLugarGeo);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String accion=e.getActionCommand();
		if(accion.equals("read"))
		{
			String aux= "select  fulano.nombre1Per, fulano.nombre2Per, fulano.apellido1Per, fulano.apellido2Per"
					+ " from persona fulano";
			objDemos.llenarJtable(jtbDemos, modeloDemos, aux);
			
			//String codigo= objDemos.obtenerID("lugargeo","codigoLugarGeo","descripcionLugarGeo",jcbdescripcionLugarGeo.getSelectedItem().toString());
			//System.out.println(codigo);
			
			String ab[] =objDemos.obtnerColumNames("especialidad");
			
			for(int i=0; i<ab.length;i++)
			{
				
				System.out.println(ab[i]);
				
			}
			
		}
		if(accion.equals("show"))
		{
			//objDemosGUI.reiniciarJTable(modeloDemos);
			System.out.println(objDemosGUI.validarExistencia(jtbDemos, "ARCOS", 2));
		}
		// TODO Auto-generated method stub
	
	}
}
