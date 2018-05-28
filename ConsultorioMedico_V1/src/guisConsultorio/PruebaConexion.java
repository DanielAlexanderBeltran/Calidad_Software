package guisConsultorio;
import java.sql.*;

import Utilitarios.*;

import javax.swing.JOptionPane;
public class PruebaConexion 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Connection miConexion;
		miConexion=conexionDB.getConexion();

		if(miConexion!=null)
		{
			JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
		}
		ResultSet rs = null;
		Statement cmd = null;

		try {

		    cmd = miConexion.createStatement();

		    rs = cmd.executeQuery("SELECT idLugarGeoPadre, descripcionLugarGeo FROM lugargeo");
		    while (rs.next()) {
		    	int idLG=rs.getInt(1);
		        String descriLG = rs.getString("descripcionLugarGeo");
		        System.out.println(idLG + "-" + descriLG);
		    }

		    rs.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
