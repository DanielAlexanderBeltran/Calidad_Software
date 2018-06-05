/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Conexion;
import Clases.Medico;
import Clases.Paciente;
import Clases.Utiles;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author UNI
 */
public class Gui_AgregarPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarDoctor
     */
    public Gui_AgregarPaciente() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmbSangre = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEnfermedad = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        rdoFemenino = new javax.swing.JRadioButton();
        rdoMasculino = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlergia = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setClosable(true);
        setIconifiable(true);
        setTitle("AÑADIR NUEVO PACIENTE");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setDoubleBuffered(true);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 260, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Apellidos:*");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 90, 30));

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 30));

        txtCedula.setToolTipText("");
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Dirección:*");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 128, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 370, 110));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Enfermedades:");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 100, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Alergias:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 128, 23));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Género:*");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 128, 30));

        cmbSangre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione>", "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        jPanel1.add(cmbSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 230, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Tipo de Sangre:*");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 128, 30));

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 265, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Edad:*");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 128, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Altura:*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 128, 30));

        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 265, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("e-mail:*");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 128, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Peso (kg):*");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 128, 30));
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 260, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Cédula:*");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 128, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Nombres:*");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 80, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Teléfono:*");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 128, 30));

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nuevo.png"))); // NOI18N
        jButton1.setText("Registar Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 170, 50));

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 102, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355589_floppy.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 140, 50));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("DATOS PERSONALES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 240, -1));

        txtEnfermedad.setColumns(20);
        txtEnfermedad.setRows(5);
        jScrollPane2.setViewportView(txtEnfermedad);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 265, 100));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("DATOS MÉDICOS GENERALES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 290, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 550));

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 130, 50));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 265, 30));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 265, 30));

        txtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlturaKeyTyped(evt);
            }
        });
        getContentPane().add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 265, 30));

        grupoBotones.add(rdoFemenino);
        rdoFemenino.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdoFemenino.setLabel("Femenino");
        getContentPane().add(rdoFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 80, 30));

        grupoBotones.add(rdoMasculino);
        rdoMasculino.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdoMasculino.setLabel("Masculino");
        getContentPane().add(rdoMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 90, 30));

        txtAlergia.setColumns(20);
        txtAlergia.setRows(5);
        txtAlergia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlergiaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtAlergia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 265, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paciente.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 90, 50));

        setBounds(0, 0, 779, 586);
    }// </editor-fold>//GEN-END:initComponents

    public void Guardar() {
        String error = "";
        String Nombre = txtNombre.getText().trim();
        String Apellido = txtApellido.getText().trim();
        String PesoF = txtPeso.getText().trim();
        String AlturaF = txtAltura.getText().trim();
        String EdadF = txtEdad.getText().trim();
        float Peso = Float.parseFloat(PesoF);
        float Altura = Float.parseFloat(AlturaF);
        int Edad = Integer.parseInt(EdadF);
        String TipoSangre = (String) cmbSangre.getSelectedItem();
        String Alergias = txtAlergia.getText().trim();
        String Enfermedades = txtEnfermedad.getText().trim();
        String Telefono = txtTelefono.getText().trim();
        String Cedula = txtCedula.getText().trim();
        String Direccion = txtDireccion.getText().trim();
        String Email = txtMail.getText().trim();
        String Genero = "";
        if (rdoFemenino.isSelected()) {
            Genero = "F";
        }
        if (rdoMasculino.isSelected()) {
            Genero = "M";
        }

        if ("".equals(Nombre) || "".equals(Apellido) || "<Seleccione>".equals(TipoSangre)
                || "".equals(PesoF) || "".equals(AlturaF) || "".equals(EdadF) || "".equals(Alergias) || "".equals(Enfermedades) || "".equals(Nombre) || "".equals(Cedula) || "".equals(Direccion)
                || "".equals(Email) || "".equals(Genero)) {
              error+="Complete todos los campos y seleccione correctamente. \n";
        } 
        if(!new Utiles().validadorDeCedula(Cedula)){
            error+="La cedula ingresada no es valida. \n";
        }
        
        if(!new Utiles().validarMail(Email)){
            error+="Mail ingresado no valido. \n";
        }
        
        if(error.length()!=0){
            JOptionPane.showMessageDialog(this, error,
                   "ERROR", JOptionPane.ERROR_MESSAGE);
        }else {
            Paciente.Agregar_Paciente(Nombre, Apellido, Peso, Altura, Edad, Alergias, Enfermedades, TipoSangre, Telefono, Email, Genero, Cedula, Direccion);
            Limpiar();// TODO add your handling code here:

        }

    }

    public void validarDecimal(java.awt.event.KeyEvent evt, JTextField txtPrecio) {

        char a = evt.getKeyChar();

        if (!Character.isDigit(a) && !Character.isISOControl(a) && a != '.') {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            return;
        }

        if ("0".equals(txtPrecio.getText()) && txtPrecio.getCaretPosition() == 1 && a != '.' && !Character.isISOControl(a)) {
            txtPrecio.setText(txtPrecio.getText() + ".");
//        return;
        }

        if (a == '.' && txtPrecio.getText().contains(".")) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            return;
        }

        String x1 = "";
        if (Character.isDigit(a) || (Character.isISOControl(a) && !"".equals(txtPrecio.getText()))) {
            x1 = txtPrecio.getText();
        }
        if (Character.isDigit(a) || (a == '.')) {
            x1 = txtPrecio.getText().concat(String.valueOf(a));
        }

        if (!"".equals(x1)) {

            try {

                Double x = Double.parseDouble(x1);

                if (x > Double.MAX_VALUE) {
                    Toolkit.getDefaultToolkit().beep();
                    evt.consume();
                }

            } catch (NumberFormatException ex) {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }
        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Guardar();
    }//GEN-LAST:event_jButton2ActionPerformed

    ResultSet resultado;
    int ID_Esp[];

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

// TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    public void Limpiar() {
        txtApellido.setText("");
        txtTelefono.setText("");
        txtAlergia.setText("");
        txtAltura.setText("");
        txtNombre.setText("");
        txtEnfermedad.setText("");
        txtPeso.setText("");
        txtEdad.setText("");
        cmbSangre.setSelectedIndex(0);
        txtCedula.setText("");
        txtDireccion.setText("");
        txtMail.setText("");
        rdoFemenino.setSelected(false);
        rdoMasculino.setSelected(false);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Limpiar();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtAlergiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlergiaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_TAB) {
            txtEnfermedad.requestFocus();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtAlergiaKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char a = evt.getKeyChar();

        if (!Character.isDigit(a) && !Character.isISOControl(a)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        validarDecimal(evt, txtPeso);        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaKeyTyped
        validarDecimal(evt, txtAltura);        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char a = evt.getKeyChar();

        if (!Character.isLetter(a) && !Character.isISOControl(a) && a != ' ') {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char a = evt.getKeyChar();

        if (!Character.isLetter(a) && !Character.isISOControl(a) && a != ' ') {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbSangre;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoFemenino;
    private javax.swing.JRadioButton rdoMasculino;
    private javax.swing.JTextArea txtAlergia;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextArea txtEnfermedad;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
