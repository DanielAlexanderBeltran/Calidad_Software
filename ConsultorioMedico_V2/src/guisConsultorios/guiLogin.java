package guisConsultorios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Utilitarios.UsuarioLogeado;
import Utilitarios.ValidarLogin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class guiLogin extends JFrame {

	private JPanel contentPane;
	private JTextField cedulatxt;
	private JPasswordField contrasenatxt;
	public static UsuarioLogeado userloged;
	
	public guiLogin() {
		setTitle("CONSULTORIOS M\u00C9DICOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 423, 444);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscuelaPolitcnicaNacional = new JLabel("ESCUELA POLITÉCNICA NACIONAL");
		lblEscuelaPolitcnicaNacional.setFont(new Font("Arial Black", Font.ITALIC, 11));
		lblEscuelaPolitcnicaNacional.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscuelaPolitcnicaNacional.setBounds(57, 0, 262, 28);
		contentPane.add(lblEscuelaPolitcnicaNacional);
		
		
		JLabel lblFacultadIngenieriaEn = new JLabel("FACULTAD INGENIERIA EN SISTEMAS");
		lblFacultadIngenieriaEn.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacultadIngenieriaEn.setBounds(44, 26, 271, 28);
		contentPane.add(lblFacultadIngenieriaEn);
		
		JLabel lblCapturadorDeFacturas = new JLabel("DEPARTAMENTO M\u00C9DICO");
		lblCapturadorDeFacturas.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
		lblCapturadorDeFacturas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapturadorDeFacturas.setBounds(69, 54, 227, 28);
		contentPane.add(lblCapturadorDeFacturas);
		
		
		
		JLabel lblCdula = new JLabel("Cedula:");
		lblCdula.setBounds(44, 293, 82, 36);
		contentPane.add(lblCdula);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(44, 324, 80, 36);
		contentPane.add(lblContrasea);
		
		/*JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Interfaz_Login.class.getResource("logo.png")));
		lblNewLabel.setBounds(150, 127, 158, 170);
		contentPane.add(lblNewLabel);*/
		
		cedulatxt = new JTextField();
		cedulatxt.setBounds(124, 301, 151, 20);
		contentPane.add(cedulatxt);
		cedulatxt.setColumns(10);
		
		contrasenatxt = new JPasswordField();
		contrasenatxt.setBounds(124, 332, 153, 20);
		contentPane.add(contrasenatxt);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setBackground(Color.DARK_GRAY);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 char clave[]=contrasenatxt.getPassword();
				 String clavedef=new String(clave);
				 ValidarLogin validador= new ValidarLogin();
				 if (validador.validar_ingreso(cedulatxt.getText(),clavedef)==1){

					 JOptionPane.showMessageDialog(null, "Bienvenido\n"+ "Has ingresado satisfactoriamente a"
					 		+ "l sistema",  null,JOptionPane.INFORMATION_MESSAGE);
                                      setVisible(false);
				      userloged = new UsuarioLogeado();
				      userloged.setPass(clavedef);
				      userloged.setUsuario(cedulatxt.getText());
				      new guiVentanaPrincipal().setVisible(true);

				      }else {
	                    JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
	                    + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
	                    JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		
		
		btnIngresar.setBounds(29, 371, 110, 25);
		contentPane.add(btnIngresar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\wsProyectosJava\\ConsultorioMedico\\iconImages\\logo.png"));
		lblNewLabel.setBounds(124, 93, 151, 189);
		contentPane.add(lblNewLabel);
		
		JButton btnNuevoUsuario = new JButton("Nuevo Usuario");
		btnNuevoUsuario.setBounds(184, 372, 112, 23);
		contentPane.add(btnNuevoUsuario);
		
	}
}
