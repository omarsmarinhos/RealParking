/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.Color;

/**
 *
 * @author Lenovo
 */
public class VistaUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form VistaUsuarios
     */
    public VistaUsuarios() {
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

        jLabel18 = new javax.swing.JLabel();
        txtUDni = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtUnombre = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cmbUEstado = new javax.swing.JComboBox<>();
        btnUGuardar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtUPass = new javax.swing.JPasswordField();
        jLabel27 = new javax.swing.JLabel();
        txtUPassRe = new javax.swing.JPasswordField();
        btnUModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        cmbUCargo = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Nombre Completo:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        add(txtUDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 74, 160, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Estado:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 30));
        add(txtUnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 114, 160, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Dni:");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, 30));

        cmbUEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        add(cmbUEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 204, 160, 30));

        btnUGuardar.setBackground(new java.awt.Color(0, 51, 102));
        btnUGuardar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnUGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnUGuardar.setText("GUARDAR");
        btnUGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUGuardarMouseExited(evt);
            }
        });
        add(btnUGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 120, 30));

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("____________________________________________________________________________________________");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 730, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("REGISTRO DE USUARIOS");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 740, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Contraseña:");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));
        add(txtUPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 160, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Repetir contraseña:");
        add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));
        add(txtUPassRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 160, 30));

        btnUModificar.setBackground(new java.awt.Color(0, 51, 102));
        btnUModificar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnUModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnUModificar.setText("MODIFICAR");
        btnUModificar.setEnabled(false);
        btnUModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUModificarMouseExited(evt);
            }
        });
        add(btnUModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 120, 30));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));

        tblUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tblUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblUsuarios.setFocusable(false);
        tblUsuarios.setGridColor(new java.awt.Color(0, 51, 102));
        tblUsuarios.setRowHeight(25);
        tblUsuarios.setSelectionBackground(new java.awt.Color(0, 51, 102));
        tblUsuarios.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblUsuarios.getTableHeader().setResizingAllowed(false);
        tblUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblUsuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 700, 330));

        cmbUCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Digitador", "Cajero", "Prueba", "Abogado" }));
        add(cmbUCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 164, 160, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Cargo: ");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUGuardarMouseEntered
        btnUGuardar.setBackground(new Color(5,42,136));
    }//GEN-LAST:event_btnUGuardarMouseEntered

    private void btnUGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUGuardarMouseExited
        btnUGuardar.setBackground(new Color(3,24,77));
    }//GEN-LAST:event_btnUGuardarMouseExited

    private void btnUModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUModificarMouseEntered
        btnUModificar.setBackground(new Color(5,42,136));
    }//GEN-LAST:event_btnUModificarMouseEntered

    private void btnUModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUModificarMouseExited
        btnUModificar.setBackground(new Color(3,24,77));
    }//GEN-LAST:event_btnUModificarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnUGuardar;
    public javax.swing.JButton btnUModificar;
    public javax.swing.JComboBox<String> cmbUCargo;
    public javax.swing.JComboBox<String> cmbUEstado;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblUsuarios;
    public javax.swing.JTextField txtUDni;
    public javax.swing.JPasswordField txtUPass;
    public javax.swing.JPasswordField txtUPassRe;
    public javax.swing.JTextField txtUnombre;
    // End of variables declaration//GEN-END:variables
}
