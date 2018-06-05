/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Conexion;
import Clases.Consulta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Gui_VerAtencionMedica extends javax.swing.JInternalFrame {

    public Gui_VerAtencionMedica() {
        initComponents();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        cmbBusc = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Cosultas Medicas");
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

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/modificar.png"))); // NOI18N
        jButton2.setText("ModificarDatos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 170, 40));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 120, 40));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Consultas por:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 400, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 152, 658, 262));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1439253074_power_off.png"))); // NOI18N
        jButton4.setText("Activar/Desactivar");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 180, 40));

        cmbBusc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paciente", "Medico" }));
        jPanel1.add(cmbBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 91, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/atencionMedica.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 100, 60));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("CONSULTAS MÉDICAS REGISTRADAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 705, 510);
    }// </editor-fold>//GEN-END:initComponents

    public void Modificar() {

        int Fila = jTable1.getSelectedRow();

       // System.out.println("Fila "+Fila);
        if (Fila >= 0) {

            int ID = Integer.parseInt(model.getValueAt(Fila, 0).toString());

            Gui_ModificarDiagnostico MD = new Gui_ModificarDiagnostico(null, true);
            MD.CargarDatos(ID);
            MD.setVC(this);
            MD.setVisible(true);

//        this.toBack();
//        ME.toFront();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el registro a modificar",
                    "Seleccione", JOptionPane.ERROR_MESSAGE);
        }

    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Modificar();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    ResultSet resultado;

    public void CargarDatos() {

        model.setRowCount(0);

        String[] Header = {"No.", "Fecha cita", "Medico", "Paciente", "Descripcion consulta",
            "Diagnostico", "Receta", "Estado"};
        model.setColumnIdentifiers(Header);

        String[] Datos = new String[8];

        try {

            resultado = Conexion.consulta("Select * from ConsultaV");

            while (resultado.next()) {
                Datos[0] = String.valueOf(resultado.getInt(1));
                SimpleDateFormat SDF = new SimpleDateFormat("dd-MMM-yyyy");
                Date Fecha = resultado.getDate(2);
                Datos[1] = SDF.format(Fecha);
                String Medico = "Dr. " + resultado.getString(3).trim() + " " + resultado.getString(4).trim();
                Datos[2] = Medico;
                String Paciente = resultado.getString(5).trim() + " " + resultado.getString(6).trim();
                Datos[3] = Paciente;
                Datos[4] = resultado.getString(7);
                Datos[5] = resultado.getString(8);
                Datos[6] = resultado.getString(9);
                boolean Estado = resultado.getBoolean(10);
                String Estate = "Inactivo";
                if (Estado) {
                    Estate = "Activo";
                }
                Datos[7] = Estate;

                model.addRow(Datos);
            }

        } catch (SQLException ex) {

        }

        jTable1.setModel(model);
    }

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        CargarDatos();

// TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    public void ActDes() {

        int Fila = jTable1.getSelectedRow();
        int Col = 7;

     //   System.out.println("Fila "+Fila);
        if (Fila >= 0) {

            int ID = Integer.parseInt(model.getValueAt(Fila, 0).toString());
            String Estado = model.getValueAt(Fila, Col).toString();

            if (Estado.equalsIgnoreCase("Activo")) {
                Consulta.Desactivar_Consulta(ID); //Des  
            }
            if (Estado.equalsIgnoreCase("Inactivo")) {
                Consulta.Activar_Consulta(ID);  //Act
            }

            CargarDatos();

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el registro a Activar/Desactivar",
                    "Seleccione", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ActDes();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    public void Buscar() {
        String Buscar = txtBuscar.getText();

        model.setRowCount(0);

        String[] Header = {"No.", "Fecha cita", "Medico", "Paciente", "Descripcion consulta",
            "Diagnostico", "Receta", "Estado"};
        model.setColumnIdentifiers(Header);

        String[] Datos = new String[8];

        try {

            if (cmbBusc.getSelectedIndex() == 0) {
                resultado = Conexion.consulta("Select * from ConsultaV "
                        + "where Nombres like '%" + Buscar + "%' "
                        + "or Apellidos like '%" + Buscar + "%'");
            }

            if (cmbBusc.getSelectedIndex() == 1) {
                resultado = Conexion.consulta("Select * from ConsultaV "
                        + "where NombresMed like '%" + Buscar + "%' "
                        + "or ApellidosMed like '%" + Buscar + "%'");
            }

            while (resultado.next()) {
                Datos[0] = String.valueOf(resultado.getInt(1));
                SimpleDateFormat SDF = new SimpleDateFormat("dd-MMM-yyyy");
                Date Fecha = resultado.getDate(2);
                Datos[1] = SDF.format(Fecha);
                String Medico = "Dr. " + resultado.getString(3).trim() + " " + resultado.getString(4).trim();
                Datos[2] = Medico;
                String Paciente = resultado.getString(5).trim() + " " + resultado.getString(6).trim();
                Datos[3] = Paciente;
                Datos[4] = resultado.getString(7);
                Datos[5] = resultado.getString(8);
                Datos[6] = resultado.getString(9);
                boolean Estado = resultado.getBoolean(10);
                String Estate = "Inactivo";
                if (Estado) {
                    Estate = "Activo";
                }
                Datos[7] = Estate;

                model.addRow(Datos);
            }

        } catch (SQLException ex) {

        }

        jTable1.setModel(model);
    }

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        Buscar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyReleased

    DefaultTableModel model = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }

    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbBusc;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
