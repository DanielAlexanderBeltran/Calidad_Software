package Utilitarios;

import java.sql.Connection;
import java.util.Map;

import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JRException;

public abstract class AbstractJasperReports 
{
	private static JasperReport report;
	private static JasperPrint reportFilled;
	private static JasperViewer viewer;
	//llenar reporte estatico 
	public static void createReport(Connection conn, String path)
	{
		try
		{
			report=(JasperReport)JRLoader.loadObjectFromFile(path);
			reportFilled=JasperFillManager.fillReport(report, null, conn);
			//System.out.println("se ejecuto hasta aqu");
		}
		catch (JRException ex)
		{
			ex.printStackTrace();
		}
	}
	//llenar reporte dinamico
	//----------------------------------
	//inicio llenar reporte dinamico 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void createReport(Connection conn, String path, Map parameters)
	{
		try
		{
			report=(JasperReport)JRLoader.loadObjectFromFile(path);
			reportFilled=JasperFillManager.fillReport(report, parameters, conn);
			//System.out.println("se ejecuto hasta aqu");
		}
		catch (JRException ex)
		{
			ex.printStackTrace();
		}
	}
	//fin llenar reporte dinamico
		public static void showViewer()
	{
		viewer=new JasperViewer(reportFilled,false);
		viewer.setVisible(true);
	}
	public static void exportToPDF(String destination)
	{
		try
		{
			JasperExportManager.exportReportToPdfFile(reportFilled,destination);
			
		}catch(JRException ex)
		{
			ex.printStackTrace();
		}
	}

}
