/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Conexion;
import Clases.PasswordAuthentication;
import com.sun.glass.events.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author UNI
 */
public class Gui_Login extends javax.swing.JDialog {
    private PasswordAuthentication seg=new PasswordAuthentication();

    /**
     * Creates new form InicioSesion
     *
     * @param parent
     * @param modal
     */
    public Gui_Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/Images/dr-icon.png")).getImage());
        } catch (NullPointerException ex) {
        }

        initComponents();
        this.setResizable(false);

        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.CremeCoffeeSkin");

        /* SKINS 
– org.jvnet.substance.skin.AutumnSkin
– org.jvnet.substance.skin.BusinessBlackSteelSkin
– org.jvnet.substance.skin.BusinessBlueSteelSkin =>
– org.jvnet.substance.skin.BusinessSkin
– org.jvnet.substance.skin.CremeCoffeeSkin
– org.jvnet.substance.skin.CremeSkin
– org.jvnet.substance.skin.EmeraldDuskSkin
– org.jvnet.substance.skin.FieldOfWheatSkin
– org.jvnet.substance.skin.FindingNemoSkin
– org.jvnet.substance.skin.GreenMagicSkin
– org.jvnet.substance.skin.MagmaSkin
– org.jvnet.substance.skin.MangoSkin
– org.jvnet.substance.skin.MistAquaSkin
– org.jvnet.substance.skin.ModerateSkin
– org.jvnet.substance.skin.NebulaBrickWallSkin
– org.jvnet.substance.skin.NebulaSkin
– org.jvnet.substance.skin.OfficeBlue2007Skin
– org.jvnet.substance.skin.OfficeSilver2007Skin
– org.jvnet.substance.skin.RavenGraphiteGlassSkin
– org.jvnet.substance.skin.RavenGraphiteSkin
– org.jvnet.substance.skin.RavenSkin
– org.jvnet.substance.skin.SaharaSkin
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblUsuario = new javax.swing.JLabel();
        jlblContraseña = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jBtnIngresar = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jlblTitulo1 = new javax.swing.JLabel();
        jlblImagen = new javax.swing.JLabel();
        jlblTitulo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setBackground(new java.awt.Color(153, 255, 153));
        setForeground(new java.awt.Color(153, 255, 153));
        setIconImage(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblUsuario.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlblUsuario.setText("Usuario*:");
        getContentPane().add(jlblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 17));

        jlblContraseña.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlblContraseña.setText("Contraseña*:");
        getContentPane().add(jlblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 212, 30));

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 212, 30));

        jBtnIngresar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBtnIngresar.setForeground(new java.awt.Color(51, 153, 0));
        jBtnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/entrar.png"))); // NOI18N
        jBtnIngresar.setText("Ingresar al Sisntema");
        jBtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 50));

        jBtnSalir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBtnSalir.setForeground(new java.awt.Color(204, 0, 51));
        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir.png"))); // NOI18N
        jBtnSalir.setText("Salir del Sistema");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 170, 50));

        jlblTitulo1.setBackground(new java.awt.Color(0, 102, 102));
        jlblTitulo1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jlblTitulo1.setText("DEPARTAMENTO MÉDICO");
        getContentPane().add(jlblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 320, 40));

        jlblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        getContentPane().add(jlblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 100, 100));

        jlblTitulo2.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jlblTitulo2.setText("Login");
        getContentPane().add(jlblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 90, -1));

        setSize(new java.awt.Dimension(507, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
ResultSet resultado;

    public void Conectar() {

        String User = txtUser.getText().trim();
        String Pass = txtPass.getText().trim();

        if (!"".equals(User) || !"".equals(Pass)) {

            try {
                Conexion C = new Conexion();
                
                
                C.Conectar(Credenciales.UserPass.User, Credenciales.UserPass.Pass);
            } catch (SQLException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(this, "Usuario/contrasena erroneo", "Error de autentificacion", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int ID_Usuario = 0;
            String Rol = "";

            try {
                
                resultado = Conexion.consulta("Select ID_Usuario, Rol_Usuario from Usuario where Nombre_Usuario = '" + User + "' "
                        + " and Contrasena_Usuario = '" + seg.hashing(Pass) + "' and Estado = " + true);

                while (resultado.next()) {
                    ID_Usuario = resultado.getInt(1);
                    Rol = resultado.getString(2);

                }

            } catch (Exception ex) {
            }

            if (ID_Usuario == 0) {
                JOptionPane.showMessageDialog(this, "Usuario/contrasena erroneo", "Error de autentificacion", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Gui_Principal P = new Gui_Principal();
            Gui_Principal.setID_Usuario(ID_Usuario);
            P.Iniciar(Rol.trim());
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(this, "Ingrese usuario y contrasena", "Ingrese", JOptionPane.ERROR_MESSAGE);

        }

    }


    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        char a = evt.getKeyChar();

        if (a == KeyEvent.VK_ENTER) {

            Conectar();

        }

// TODO add your handling code here:
    }//GEN-LAST:event_txtPassKeyTyped

    private void jBtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIngresarActionPerformed
        Conectar();        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnIngresarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        char a = evt.getKeyChar();

        if (a == KeyEvent.VK_ENTER) {
            txtPass.requestFocus();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_txtUserKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Gui_Login dialog = new Gui_Login(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnIngresar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jlblContraseña;
    private javax.swing.JLabel jlblImagen;
    private javax.swing.JLabel jlblTitulo1;
    private javax.swing.JLabel jlblTitulo2;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
