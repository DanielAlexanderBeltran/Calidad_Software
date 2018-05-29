package Utilitarios;
import java.sql.*;

import javax.swing.JOptionPane;
public class conexionDB 
{
	private static Connection con=null;
	public static Connection getConexion()
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String strServidor = "jdbc:mysql://localhost/prg2consultorios";
			String usuarioDB="root";
			String passwordDB="";
			con= DriverManager.getConnection(strServidor,usuarioDB,passwordDB);
		}
		catch(ClassNotFoundException ex)
		{
			JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
			con=null;
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
			con=null;
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
			con=null;
		}
		return con;
	}
	
	public static void cerrarConexion(Connection con)
	{
		try
		{
			con.close();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}

}
