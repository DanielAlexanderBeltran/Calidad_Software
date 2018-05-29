package guisConsultorio;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import Utilitarios.ValidarLogin;
import clasesBean.UsuarioLogeado;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class guiLogin extends JFrame {

	private JFrame JFrameLogin;
	private JTextField txtFieldUsuario;
	private JPasswordField passwordField;
	public  static UsuarioLogeado userloged;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiLogin window = new guiLogin();
					window.JFrameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public guiLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//Incio del JFrame login
	private void initialize() {
		JFrameLogin = new JFrame();
		JFrameLogin.getContentPane().setBackground(new Color(102, 205, 170));
		JFrameLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\wsPrgII2015-A\\ConsultorioMedico\\Iconos\\dep_medico.png"));
		JFrameLogin.setTitle("DEPARTAMENTO M\u00C9DICO");
		JFrameLogin.setBounds(100, 100, 474, 411);
		JFrameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrameLogin.getContentPane().setLayout(null);
		//--------------------------------------------------------------------
		// Inicio de componentes del JFrame
		//--------------------------------------------------------------------
		// Propiedades LabelTitulo 1
				JLabel lblTituLogin = new JLabel("ESCUELA POLIT\u00C9CNICA NACIONAL");
		lblTituLogin.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblTituLogin.setBounds(77, 11, 334, 14);
		JFrameLogin.getContentPane().add(lblTituLogin);
		
		// Propiedades LabelTitulo2
		JLabel lblTit2_login = new JLabel("Departamento M\u00E9dico");
		lblTit2_login.setFont(new Font("Arial Black", Font.ITALIC, 14));
		lblTit2_login.setBounds(124, 33, 221, 33);
		JFrameLogin.getContentPane().add(lblTit2_login);
		
		// Propiedades LabelImagen
		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon("D:\\wsPrgII2015-A\\ConsultorioMedico\\Iconos\\logo.png"));
		lblImagen.setBounds(134, 67, 157, 159);
		JFrameLogin.getContentPane().add(lblImagen);
		
		// Propiedades LabelModo
		JLabel lblModo = new JLabel("Modo:");
		lblModo.setForeground(new Color(0, 0, 0));
		lblModo.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblModo.setBounds(53, 237, 61, 25);
		JFrameLogin.getContentPane().add(lblModo);
		
		// Propiedades LabelUsuario.
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblUsuario.setBounds(53, 273, 61, 14);
		JFrameLogin.getContentPane().add(lblUsuario);
		
		// Propiedades LabelClave
		JLabel lblClave = new JLabel("Clave:");
		lblClave.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblClave.setBounds(53, 296, 61, 14);
		JFrameLogin.getContentPane().add(lblClave);
		
		// Propiedades BotonIngresar
		JButton btnIngresar = new JButton("Ingresar al Sistema");
		btnIngresar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnIngresar.setForeground(new Color(0, 0, 0));
		btnIngresar.setBackground(new Color(100, 149, 237));
		btnIngresar.setBounds(65, 339, 168, 23);
		JFrameLogin.getContentPane().add(btnIngresar);
		
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 char clave[]=passwordField.getPassword();
				 String clavedef=new String(clave);
				 ValidarLogin validador= new ValidarLogin();
				 if (validador.validar_ingreso(txtFieldUsuario.getText(),clavedef)==1){

					 JOptionPane.showMessageDialog(null, "Bienvenido\n"+ "Has ingresado satisfactoriamente a"
					 		+ "l sistema",  null,JOptionPane.INFORMATION_MESSAGE);
                                      setVisible(false);
				      userloged = new UsuarioLogeado();
				      userloged.setPass(clavedef);
				      userloged.setUsuario(txtFieldUsuario.getText());
				      new guiVentanaPrincipal().setVisible(true);

				      }else {
	                    JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
	                    + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
	                    JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		
		// Propiedades Botton Salir
		JButton btnSalir = new JButton("Salir del Sistema");
		btnSalir.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnSalir.setBackground(new Color(100, 149, 237));
		btnSalir.setBounds(276, 339, 157, 23);
		JFrameLogin.getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent ae) { 
            	if(JOptionPane.showConfirmDialog(null,"Seguro que desea Salir del Sistema?", "", JOptionPane.YES_NO_OPTION)==0)
                System.exit(0); // Salir del sistema
                            } 
        } );
		
		
		// Propiedades TextFielUsuario
		txtFieldUsuario = new JTextField();
		txtFieldUsuario.setBounds(124, 267, 190, 23);
		JFrameLogin.getContentPane().add(txtFieldUsuario);
		txtFieldUsuario.setColumns(10);
		
		// Propiedades Password
		passwordField = new JPasswordField();
		passwordField.setBounds(124, 294, 190, 23);
		JFrameLogin.getContentPane().add(passwordField);
		
		// Propiedades JCombo Box Modo
		JComboBox cBoxModo = new JComboBox();
		cBoxModo.setBounds(124, 237, 184, 25);
		JFrameLogin.getContentPane().add(cBoxModo);
		cBoxModo.addItem("Escoja uno");
		cBoxModo.addItem("Recepcionista");
		cBoxModo.addItem("Médico");
		cBoxModo.addItem("Administrador");
	}
}
