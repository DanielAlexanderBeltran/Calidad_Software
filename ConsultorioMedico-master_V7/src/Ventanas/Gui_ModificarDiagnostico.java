/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Conexion;
import Clases.Consulta;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Gui_ModificarDiagnostico extends javax.swing.JDialog {

    public Gui_ModificarDiagnostico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDr = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsulta = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtReceta = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Consulta | Diagnostico | Receta | Archivos al expediente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Nombre del Paciente:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, 39));

        txtPaciente.setEditable(false);
        txtPaciente.setDoubleBuffered(true);
        getContentPane().add(txtPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 270, 39));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Médico Tratante:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 120, 39));

        txtDr.setEditable(false);
        getContentPane().add(txtDr, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 260, 40));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel14.setText("Motivo de la Consulta:*");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 39));

        txtConsulta.setColumns(20);
        txtConsulta.setRows(5);
        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtConsulta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 740, 110));

        jLabel15.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel15.setText("Diagnostico Médico:*");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 40));

        txtReceta.setColumns(20);
        txtReceta.setRows(5);
        jScrollPane3.setViewportView(txtReceta);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 740, 120));

        jLabel16.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel16.setText("Tratamiento-Medicamentos Recetados:*");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 310, 39));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355589_floppy.png"))); // NOI18N
        jButton2.setText("Guardar Cambios");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, 40));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 100, 40));

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        txtDiagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiagnosticoKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtDiagnostico);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 740, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 770, 540));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel2.setText("REGISTRO DE ATENCIÓN MÉDICA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 340, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paciente.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/medico.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    ResultSet resultado;
    int IDD;

    public void CargarDatos(int ID) {

        String Paciente = "";
        String Doctor = "";
        String Descripcion = "";
        String Receta = "";
        String Diagnostico = "";

        try {

            resultado = Conexion.consulta("Select ID_Consulta, Descripcion_Consulta, "
                    + "Diagnostico, Receta, Nombres, Apellidos, NombreM, ApellidoM"
                    + " from Expediente Where ID_Consulta = " + ID);

            while (resultado.next()) {
                IDD = resultado.getInt(1);
                Descripcion = resultado.getString(2);
                Diagnostico = resultado.getString(3);
                Receta = resultado.getString(4);
                Paciente = resultado.getString(5).trim() + " " + resultado.getString(6).trim();
                Doctor = resultado.getString(7).trim() + " " + resultado.getString(8).trim();

            }

        } catch (SQLException ex) {
        }

        txtConsulta.setText(Descripcion);
        txtDiagnostico.setText(Diagnostico);
        txtReceta.setText(Receta);
        txtDr.setText(Doctor);
        txtPaciente.setText(Paciente);

    }

    public void Guardar() {
        String ConsultaF = txtConsulta.getText().trim();
        String Diagnostico = txtDiagnostico.getText().trim();
        String Receta = txtReceta.getText().trim();

        Consulta.Actualizar_Consulta(IDD, ConsultaF, Diagnostico, Receta);

        Limpiar();
    }

    Gui_VerAtencionMedica VC;

    public void setVC(Gui_VerAtencionMedica VC) {
        this.VC = VC;
    }

    public void Limpiar() {
        VC.CargarDatos();
        dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Guardar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_TAB) {
            txtDiagnostico.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultaKeyTyped

    private void txtDiagnosticoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiagnosticoKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_TAB) {
            txtReceta.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnosticoKeyTyped

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
            java.util.logging.Logger.getLogger(Gui_ModificarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_ModificarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_ModificarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_ModificarDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Gui_ModificarDiagnostico dialog = new Gui_ModificarDiagnostico(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtConsulta;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtDr;
    private javax.swing.JTextField txtPaciente;
    private javax.swing.JTextArea txtReceta;
    // End of variables declaration//GEN-END:variables
}
