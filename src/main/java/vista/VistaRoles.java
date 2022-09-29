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
public class VistaRoles extends javax.swing.JPanel {

    /**
     * Creates new form VistaRoles
     */
    public VistaRoles() {
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

        jLabel41 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRrol = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        cmbREstado = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        btnRGuardar = new javax.swing.JButton();
        btnRModificar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblRoles = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("REGISTRO DE ROLES");
        add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 740, 30));

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("_____________________________________________________________________________");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 720, 20));
        add(txtRrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 96, 160, 30));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("Rol:");
        add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 96, -1, 30));

        cmbREstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        add(cmbREstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 146, 160, 30));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("Estado:");
        add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 156, 60, -1));

        btnRGuardar.setBackground(new java.awt.Color(0, 51, 102));
        btnRGuardar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnRGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnRGuardar.setText("GUARDAR");
        btnRGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRGuardarMouseExited(evt);
            }
        });
        btnRGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRGuardarActionPerformed(evt);
            }
        });
        add(btnRGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 96, 110, 30));

        btnRModificar.setBackground(new java.awt.Color(0, 51, 102));
        btnRModificar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnRModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnRModificar.setText("MODIFICAR");
        btnRModificar.setEnabled(false);
        btnRModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRModificarActionPerformed(evt);
            }
        });
        add(btnRModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 146, 120, 30));

        jScrollPane6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));

        tblRoles.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tblRoles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblRoles.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblRoles.setFocusable(false);
        tblRoles.setGridColor(new java.awt.Color(0, 51, 102));
        tblRoles.setRowHeight(25);
        tblRoles.setSelectionBackground(new java.awt.Color(0, 51, 102));
        tblRoles.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblRoles.getTableHeader().setResizingAllowed(false);
        tblRoles.getTableHeader().setReorderingAllowed(false);
        tblRoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRolesMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblRoles);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 700, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRGuardarMouseEntered
        btnRGuardar.setBackground(new Color(5,42,136));
    }//GEN-LAST:event_btnRGuardarMouseEntered

    private void btnRGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRGuardarMouseExited
        btnRGuardar.setBackground(new Color(3,24,77));
    }//GEN-LAST:event_btnRGuardarMouseExited

    private void btnRGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRGuardarActionPerformed
        
    }//GEN-LAST:event_btnRGuardarActionPerformed

    private void btnRModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRModificarActionPerformed

    }//GEN-LAST:event_btnRModificarActionPerformed

    private void tblRolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRolesMouseClicked
        
    }//GEN-LAST:event_tblRolesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRGuardar;
    private javax.swing.JButton btnRModificar;
    private javax.swing.JComboBox<String> cmbREstado;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblRoles;
    private javax.swing.JTextField txtRrol;
    // End of variables declaration//GEN-END:variables
}
