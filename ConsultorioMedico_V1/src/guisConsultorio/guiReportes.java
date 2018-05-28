/* PROGRAMACION II
 * Nombre de la gui: Gui registrar especialidad medica
 * Nombres: - Criollo Ramos José Antonio
 *          - GUaraca Sislema Oscar Ramiro
 *          - López Moreno Rubby Gabriela
 * Fecha de entrega: 2015-07-27
 * Objetivo: Implementar la clase guiReportes para generar reportes de 4 tipos
 * (pie, lista, tabla de cruce y barras) con datos tomados de la gui como filtros.
 */
package guisConsultorio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;









import Utilitarios.AbstractJasperReports;
import Utilitarios.conexionDB;
import Utilitarios.operacionesSobreDB;
import Utilitarios.operacionesSobreGUI;

import com.toedter.calendar.JDateChooser;


public class guiReportes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	//ventana principal
	private JFrame jfMainWinRepList;
	private JButton btnPrsentarRep, btnCancelar;
	private JComboBox<String> jcbReportes=new JComboBox<>();

	//panel filtrar por genero
	private JPanel jpFiltxGen;
	private JRadioButton rdoMasculino, rdoFemenino, rdoAmbos;
	private ButtonGroup rdoGpFiltXGen;
	//panel filtrar por fecha
	private JPanel jpFiltxFecha;
	private JLabel jlbDesde, jlbHasta;
	private JDateChooser dateDesde, dateHasta;
	//panel filtrar por especialidad
	private JPanel jpFiltxEsp;
	private JComboBox<String> jcbEsp;
	//private JTable jtbEsp;
	//private DefaultTableModel modJtbEsp;
	//private JButton jbtAnadir;

	//variables de control 
	private SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd"); 
	private String strModificador="", strSubtitulo="", strMsgError=""; 
	private operacionesSobreGUI objRepLstGUI=new operacionesSobreGUI();
	private operacionesSobreDB objRepLstDB=new operacionesSobreDB();
	private HashMap<String, String> hsMapParametros=new HashMap<String, String>();
	public guiReportes()
	{
		jfMainWinRepList=new JFrame("LANZAR REPORTES");
		jfMainWinRepList.setLayout(null);
		jfMainWinRepList.setLocation(100, 100);
		panFiltGenero();
		jpFiltxGen.setBounds(10, 11, 141, 107);
		jfMainWinRepList.add(jpFiltxGen);
		panFilFecha();
		jpFiltxFecha.setBounds(161, 11, 181, 107);
		jfMainWinRepList.add(jpFiltxFecha);
		panFilxesp();
		jpFiltxEsp.setBounds(353, 11,191,107);
		jfMainWinRepList.add(jpFiltxEsp);
		//boton presentar reporte
		btnPrsentarRep=new JButton("CREAR REPORTE");
		btnPrsentarRep.setBounds(250, 140, 150, 23);
		btnPrsentarRep.setActionCommand("reportar");
		btnPrsentarRep.addActionListener(this);
		jfMainWinRepList.add(btnPrsentarRep);
		//fin boton presentar reporte
		//inicio boton cancelar
		btnCancelar=new JButton("CANCELAR");
		btnCancelar.setBounds(438, 140, 100, 23);
		btnCancelar.setActionCommand("cancelar");
		btnCancelar.addActionListener(this);
		jfMainWinRepList.add(btnCancelar);
		//-----------------------------------------
		jcbReportes=new JComboBox<String>();
		jcbReportes.addItem("Seleccione tipo de reporte");
		jcbReportes.addItem("Lista");
		jcbReportes.addItem("Pacientes atendidos por especialidad (GRAFICO PIE)");
		jcbReportes.addItem("Barras");
		jcbReportes.addItem("Tabla de cruce");
		jcbReportes.setBounds(10, 140, 210, 23);
		jfMainWinRepList.add(jcbReportes);;
		//-----------------------------------------
		//fin del boton cancelar
		jfMainWinRepList.setSize(560, 220);
		jfMainWinRepList.setResizable(false);
		jfMainWinRepList.setVisible(true);

	}

	///INICI PANEL FILTRAR POR GENERO 

	public void panFiltGenero()
	{
		jpFiltxGen=new JPanel();
		jpFiltxGen.setLayout(null);
		rdoMasculino=new JRadioButton("Masculino");
		rdoFemenino=new JRadioButton("Femenino");
		rdoAmbos=new JRadioButton("Ambos");
		rdoGpFiltXGen=new ButtonGroup();
		rdoGpFiltXGen.add(rdoMasculino);
		rdoGpFiltXGen.add(rdoFemenino);
		rdoGpFiltXGen.add(rdoAmbos);
		rdoMasculino.setBounds(6, 21, 97, 23);
		rdoFemenino.setBounds(6, 47, 97, 23);
		rdoAmbos.setBounds(6, 73, 97, 23);
		jpFiltxGen.add(rdoMasculino);
		jpFiltxGen.add(rdoFemenino);
		jpFiltxGen.add(rdoAmbos);
		jpFiltxGen.setBorder(new TitledBorder(new EtchedBorder(), "FILTRAR POR GÉNERO"));
		jpFiltxGen.setVisible(true);
	}
	//FIN PANEL FILRAR POR GENERO 
	//----------------------------------------------
	//inicio panel filtrar por fecha
	public void panFilFecha()
	{
		jpFiltxFecha=new JPanel();
		jpFiltxFecha.setLayout(null);
		jlbDesde=new JLabel("Desde:");
		jlbHasta=new JLabel("Hasta:");
		jlbDesde.setBounds(10,24,46,14);
		jlbHasta.setBounds(10,61,46,14);
		dateDesde=new JDateChooser();
		dateDesde.setDateFormatString("yyyy-MM-dd");
		dateHasta=new JDateChooser();
		dateHasta.setDateFormatString("yyyy-MM-dd");
		dateDesde.setBounds(61, 18, 110, 20);
		dateHasta.setBounds(61, 55, 110, 20);
		jpFiltxFecha.add(jlbDesde);
		jpFiltxFecha.add(jlbHasta);
		jpFiltxFecha.add(dateDesde);
		jpFiltxFecha.add(dateHasta);
		jpFiltxFecha.setBorder(new TitledBorder(new EtchedBorder(), "FILTRAR POR FECHA"));
		jpFiltxFecha.setVisible(true);
	}
	//fin panel filtrar po rfecha 
	//----------------------------------------------
	//inicio panel filtar por especialidad
	public void panFilxesp()
	{
		jpFiltxEsp=new JPanel();
		jpFiltxEsp.setLayout(null);
		jcbEsp=new JComboBox<String>();
		jcbEsp.addItem("Selecione Especialidad");
		objRepLstDB.llenarCombo(jcbEsp, "select descripcionEspecialidad from especialidad");
		jcbEsp.setBounds(10, 24, 171, 20);
		jpFiltxEsp.add(jcbEsp);
		//inicio jtable
		/*jtbEsp=new JTable();
		modJtbEsp=new DefaultTableModel()
		{//inicio control tabkla editable
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) 
			{
			return false;//editable:true, no editable:false
			}
		};
		modJtbEsp.addColumn("ESPECIALIDAD");
		jtbEsp.setModel(modJtbEsp);
		JScrollPane scrTblEsp=new JScrollPane(jtbEsp);
		scrTblEsp.setBounds(10, 82, 171, 147);
		jpFiltxEsp.add(scrTblEsp);
		//fin jtable
		//-------------------------------------
		//incio del boton
		jbtAnadir=new JButton("ADD");
		jbtAnadir.setBounds(10, 50, 71, 23);
		jpFiltxEsp.add(jbtAnadir);
		jbtAnadir.setActionCommand("añadir");
		jbtAnadir.addActionListener(this);*/
		//fin del boton 
		jpFiltxEsp.setBorder(new TitledBorder(new EtchedBorder(), "FILTRAR POR ESPECILIDAD"));
		jpFiltxEsp.setVisible(true);
	}
	//fin panel filtrar por especialidda
	public void limpiar()
	{
		hsMapParametros=new HashMap<String, String>();
		rdoGpFiltXGen.clearSelection();
		jcbEsp.setSelectedIndex(0);
		dateDesde.setDate(null);
		dateHasta.setDate(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guiReportes app=new guiReportes();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String accion=e.getActionCommand();
		//iniio boton reporte
		if(accion.equals("reportar"))
		{


			Connection cnx;
			cnx=conexionDB.getConexion();
			String strRuta="reportes/ReportePie.jasper";
			if(jcbReportes.getSelectedIndex()>0)
			{
				if(jcbReportes.getSelectedIndex()==1)
					strRuta="reportes/ReporteLista.jasper";
				if(jcbReportes.getSelectedIndex()==2)
					strRuta="reportes/ReportePie.jasper";
				if(jcbReportes.getSelectedIndex()==3)
					strRuta="reportes/ReporteBarras.jasper";
				if(jcbReportes.getSelectedIndex()==4)
					strRuta="reportes/ReporteTablaCruce.jasper";

				if(!rdoMasculino.isSelected()&&!rdoFemenino.isSelected()&&!rdoAmbos.isSelected()
						&&dateDesde.getDate()==null&&dateHasta.getDate()==null&&jcbEsp.getSelectedIndex()==0)
				{

					hsMapParametros.put("subtitulo", "");
					AbstractJasperReports.createReport(cnx,strRuta,hsMapParametros);
					AbstractJasperReports.showViewer();
				}
				else
				{
					strModificador="";
					strSubtitulo="";
					strMsgError="";
					if(rdoMasculino.isSelected())
					{
						strModificador=strModificador+" and pac.sexo='M' ";
						strSubtitulo=strSubtitulo+"Género masculino/";
					}
					if(rdoFemenino.isSelected())
					{
						strModificador=strModificador+" and pac.sexo='F' ";
						strSubtitulo=strSubtitulo+"Género femenino /";
					}
					if(rdoAmbos.isSelected())
					{
						strModificador=strModificador+" and (pac.sexo='F' or pac.sexo='M') ";
						strSubtitulo=strSubtitulo+"Género femenino y género masculino/";
					}

					if(dateDesde.getDate()!=null&&dateHasta.getDate()!=null&&
							objRepLstGUI.compararFechas(formateador.format(dateDesde.getDate()),formateador.format(dateHasta.getDate()))==-1)
					{
						strModificador=strModificador+ " and ate.fechaAte>'"+formateador.format(dateDesde.getDate())+
								"' and ate.fechaAte<'"+formateador.format(dateHasta.getDate())+"' ";
						strSubtitulo=strSubtitulo+" período entre: "+ formateador.format(dateDesde.getDate())+" y "+formateador.format(dateHasta.getDate())+ "/";
					}
					else
					{
						if(dateDesde.getDate()==null&&dateHasta.getDate()!=null)
						{
							strMsgError=strMsgError+"UN NO SE HA INGRESADO FECHA DE INICIO \n";

						}

						if(dateDesde.getDate()!=null&&dateHasta.getDate()==null)
						{
							strMsgError=strMsgError+"AUN NO SE HA INGRESADO FECHA FINA \n";
						}

						if(dateDesde.getDate()!=null&&dateHasta.getDate()!=null)
						{
							if(objRepLstGUI.compararFechas(formateador.format(dateDesde.getDate()),formateador.format(dateHasta.getDate()))==1||
									objRepLstGUI.compararFechas(formateador.format(dateDesde.getDate()),formateador.format(dateHasta.getDate()))==0)
							{
								strMsgError=strMsgError+"LA FECHA DE INCIO NO ESTA ANTES DE  LA FECHA FINAL, \n";
							}

						}
					}
					if(jcbEsp.getSelectedIndex()>0)
					{
						strModificador=strModificador+"and esp.descripcionEspecialidad='"+jcbEsp.getSelectedItem()+"'";
						strSubtitulo=strSubtitulo+"/ESPECIALIDAD "+ jcbEsp.getSelectedItem();
					}

					if(strMsgError.length()==0)
					{
						strSubtitulo=strSubtitulo.substring(0, strSubtitulo.length()-1);
						hsMapParametros.put("subtitulo", strSubtitulo);
						hsMapParametros.put("modificador",strModificador);
						AbstractJasperReports.createReport(cnx,strRuta,hsMapParametros);
						AbstractJasperReports.showViewer();
						limpiar();
					}
					else
					{
						JOptionPane.showMessageDialog(null, strMsgError, "ERROR AL INGRESAR LA FECHA", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "aún no se ha seleccionado ningún tipo de reporte");
			}
			//System.out.println(formateador.format(dateDesde.getDate()));
			conexionDB.cerrarConexion(cnx);
			System.out.println("se ha cerrado la conexion");
		}
		//fin del boton reporte
		if(accion.equals("cancelar"))
		{
			limpiar();
		}
	}

}
