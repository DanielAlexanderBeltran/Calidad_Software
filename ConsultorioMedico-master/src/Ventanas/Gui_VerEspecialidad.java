/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Conexion;
import Clases.Especialidad;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UNI
 */
public class Gui_VerEspecialidad extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarDoctor
     */
    public Gui_VerEspecialidad() {
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
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("LISTA DE ESPECIALIDADES MÉDICAS");
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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/modificar.png"))); // NOI18N
        jButton2.setText("Modificar Datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355619_search.png"))); // NOI18N
        jLabel1.setText("Buscar Especialidad Registrada:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 20));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 350, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 669, 280));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1439253074_power_off.png"))); // NOI18N
        jButton4.setText("Activar/Desactivar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Especialidad.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 100, 70));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 705, 510);
    }// </editor-fold>//GEN-END:initComponents

    public void Modificar(){
        
      
int Fila = jTable1.getSelectedRow();

     //   System.out.println("Fila "+Fila);

if(Fila >= 0){
  
    int ID = Integer.parseInt(model.getValueAt(Fila, 0).toString());
    
        Gui_ModificarEspecialidad ME = new Gui_ModificarEspecialidad(null, true);
        ME.CargarDatos(ID);
        ME.setVE(this);
        ME.setVisible(true);
        
//        this.toBack();
//        ME.toFront();
        
    
}
else{
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
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
CargarDatos();
// TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    public void ActDes(){
        
           
int Fila = jTable1.getSelectedRow();
int Col = 3;

     //   System.out.println("Fila "+Fila);

if(Fila >= 0){
  
    int ID = Integer.parseInt(model.getValueAt(Fila, 0).toString());
    String Estado = model.getValueAt(Fila, Col).toString();
    
    if(Estado.equalsIgnoreCase("Activo")){
     Especialidad.Desactivar_Especialidad(ID); //Des  
    }
    if(Estado.equalsIgnoreCase("Inactivo")){
      Especialidad.Activar_Especialidad(ID);  //Act
    }

    CargarDatos();
    
}
else{
    JOptionPane.showMessageDialog(this, "Debe seleccionar el registro a Activar/Desactivar", 
            "Seleccione", JOptionPane.ERROR_MESSAGE);  
} 
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
ActDes();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    public void Buscar(){
        String Buscar = txtBuscar.getText();
        
        model.setRowCount(0);
        
String [] Header = {"No.","Nombre","Descripcion","Estado"};    
model.setColumnIdentifiers(Header);

String [] Datos = new String[4];

try{
    
    resultado = Conexion.consulta("Select * from Especialidad where Nombre like '%"+Buscar+"%'");
    
    while(resultado.next()){
       Datos [0] = String.valueOf(resultado.getInt(1));
       Datos [1] = resultado.getString(2);
       Datos [2] = resultado.getString(3);
       boolean Estado = resultado.getBoolean(4);
       String Estate = "Inactivo";
       if(Estado){
         Estate = "Activo";
       }
       Datos [3] = Estate;
       
       model.addRow(Datos);
    }
    
}catch(SQLException ex){
    
}

jTable1.setModel(model);
    

        
    }
    
    
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
Buscar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyReleased
 
    public void CargarDatos(){
 
model.setRowCount(0);
        
String [] Header = {"No.","Nombre","Descripcion","Estado"};    
model.setColumnIdentifiers(Header);

String [] Datos = new String[4];

try{
    
    resultado = Conexion.consulta("Select * from Especialidad");
    
    while(resultado.next()){
       Datos [0] = String.valueOf(resultado.getInt(1));
       Datos [1] = resultado.getString(2);
       Datos [2] = resultado.getString(3);
       boolean Estado = resultado.getBoolean(4);
       String Estate = "Inactivo";
       if(Estado){
         Estate = "Activo";
       }
       Datos [3] = Estate;
       
       model.addRow(Datos);
    }
    
}catch(SQLException ex){
    
}

jTable1.setModel(model);
    }


    DefaultTableModel model = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }

    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
