/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.ventanas.vistas;

import com.org.example.clases.Cliente;
import com.org.example.service.GestionImpleCliente;
import com.org.example.service.Utils;
import java.awt.*;

import static com.org.example.service.Utils.verificarDatos;

/**
 *
 * @author Florsix
 */
public class VistaMiUsuario extends javax.swing.JPanel {
    private Utils utilidades = new Utils();
    private GestionImpleCliente gestorCliente;
    /**
     * Creates new form VistaMiUsuario
     */
    public VistaMiUsuario(Cliente usuario) {
        gestorCliente = new GestionImpleCliente();
        initComponents();
        deshabilitarEditable();
        setTextos(usuario);
    }

    public boolean verificarCampos() {
        boolean res = false;
        if (verificarDatos(ingresoEmail.getText(), ingresoContraseña.getText()) && gestorCliente.verificarIngresosVacios()) {
            res = true;
        }
        return res;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconoMenu = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        ingresoNombre = new javax.swing.JTextField();
        ingresoApellido = new javax.swing.JTextField();
        ingresoDni = new javax.swing.JTextField();
        ingresoDireccion = new javax.swing.JTextField();
        ingresoTelefono = new javax.swing.JTextField();
        ingresoEmail = new javax.swing.JTextField();
        ingresoContraseña = new javax.swing.JTextField();

        setBackground(new java.awt.Color(242, 100, 100));
        setMaximumSize(new java.awt.Dimension(800, 510));
        setMinimumSize(new java.awt.Dimension(800, 510));
        setPreferredSize(new java.awt.Dimension(800, 510));

        iconoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8131374mini2.png"))); // NOI18N

        contenedor.setBackground(new java.awt.Color(242, 142, 142));
        contenedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 240, 240), 4, true));

        btnEditar.setBackground(new java.awt.Color(255, 184, 184));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(242, 100, 100));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 100, 100), 4));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 184, 184));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(242, 100, 100));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setToolTipText("");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 100, 100), 4));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });

        titulo.setBackground(new java.awt.Color(255, 184, 184));
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(242, 100, 100));
        titulo.setText("MIS DATOS");

        ingresoNombre.setBackground(new java.awt.Color(255, 184, 184));
        ingresoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoNombre.setForeground(new java.awt.Color(242, 100, 100));
        ingresoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresoNombre.setBorder(null);
        ingresoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoNombreMouseClicked(evt);
            }
        });

        ingresoApellido.setEditable(false);
        ingresoApellido.setBackground(new java.awt.Color(255, 184, 184));
        ingresoApellido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoApellido.setForeground(new java.awt.Color(242, 100, 100));
        ingresoApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresoApellido.setBorder(null);
        ingresoApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoApellidoMouseClicked(evt);
            }
        });

        ingresoDni.setEditable(false);
        ingresoDni.setBackground(new java.awt.Color(255, 184, 184));
        ingresoDni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoDni.setForeground(new java.awt.Color(242, 100, 100));
        ingresoDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresoDni.setBorder(null);
        ingresoDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoDniMouseClicked(evt);
            }
        });

        ingresoDireccion.setBackground(new java.awt.Color(255, 184, 184));
        ingresoDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoDireccion.setForeground(new java.awt.Color(242, 100, 100));
        ingresoDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresoDireccion.setBorder(null);
        ingresoDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoDireccionMouseClicked(evt);
            }
        });

        ingresoTelefono.setBackground(new java.awt.Color(255, 184, 184));
        ingresoTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoTelefono.setForeground(new java.awt.Color(242, 100, 100));
        ingresoTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresoTelefono.setBorder(null);
        ingresoTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoTelefonoMouseClicked(evt);
            }
        });

        ingresoEmail.setEditable(false);
        ingresoEmail.setBackground(new java.awt.Color(255, 184, 184));
        ingresoEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoEmail.setForeground(new java.awt.Color(242, 100, 100));
        ingresoEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresoEmail.setBorder(null);
        ingresoEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoEmailMouseClicked(evt);
            }
        });

        ingresoContraseña.setEditable(false);
        ingresoContraseña.setBackground(new java.awt.Color(255, 184, 184));
        ingresoContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoContraseña.setForeground(new java.awt.Color(242, 100, 100));
        ingresoContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresoContraseña.setToolTipText("");
        ingresoContraseña.setBorder(null);
        ingresoContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoContraseñaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ingresoNombre)
                    .addComponent(ingresoApellido)
                    .addComponent(ingresoDni)
                    .addComponent(ingresoDireccion)
                    .addComponent(ingresoTelefono)
                    .addComponent(ingresoEmail)
                    .addComponent(ingresoContraseña)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(titulo)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(ingresoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(iconoMenu)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(iconoMenu)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        // TODO add your handling code here:
        btnGuardar.setBackground(new Color(255, 212,212));

    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        // TODO add your handling code here:
        btnGuardar.setBackground(new Color(255,184,184));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        // TODO add your handling code here:
        btnEditar.setBackground(new Color(255, 212,212));

    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        // TODO add your handling code here:
        btnEditar.setBackground(new Color(255,184,184));

    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        // TODO add your handling code here:
        habilitarEditable();
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
        if(verificarCampos()){

        }
        deshabilitarEditable();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void ingresoNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoNombreMouseClicked
        // TODO add your handling code here:
        if(ingresoNombre.isEditable()){
            ingresoNombre.setText("");
        }
    }//GEN-LAST:event_ingresoNombreMouseClicked

    private void ingresoApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoApellidoMouseClicked
        // TODO add your handling code here:
        if(ingresoApellido.isEditable()){
            ingresoApellido.setText("");
        }
    }//GEN-LAST:event_ingresoApellidoMouseClicked

    private void ingresoDniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoDniMouseClicked
        // TODO add your handling code here:
        if(ingresoDni.isEditable()){
            ingresoDni.setText("");
        }
    }//GEN-LAST:event_ingresoDniMouseClicked

    private void ingresoDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoDireccionMouseClicked
        // TODO add your handling code here:
        if(ingresoDireccion.isEditable()){
            ingresoDireccion.setText("");
        }
    }//GEN-LAST:event_ingresoDireccionMouseClicked

    private void ingresoTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoTelefonoMouseClicked
        // TODO add your handling code here:
        if(ingresoTelefono.isEditable()){
            ingresoTelefono.setText("");
        }
    }//GEN-LAST:event_ingresoTelefonoMouseClicked

    private void ingresoEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoEmailMouseClicked
        // TODO add your handling code here:
        if(ingresoEmail.isEditable()){
            ingresoEmail.setText("");
        }
    }//GEN-LAST:event_ingresoEmailMouseClicked

    private void ingresoContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoContraseñaMouseClicked
        // TODO add your handling code here:
        if(ingresoContraseña.isEditable()){
            ingresoContraseña.setText("");
        }
    }//GEN-LAST:event_ingresoContraseñaMouseClicked

public void habilitarEditable(){
        ingresoNombre.setEditable(true);
        ingresoApellido.setEditable(true);
        ingresoDireccion.setEditable(true);
        ingresoEmail.setEditable(true);
        ingresoDni.setEditable(true);
        ingresoTelefono.setEditable(true);
        ingresoContraseña.setEditable(true);
}
    public void deshabilitarEditable(){
        ingresoNombre.setEditable(false);
        ingresoApellido.setEditable(false);
        ingresoDireccion.setEditable(false);
        ingresoEmail.setEditable(false);
        ingresoDni.setEditable(false);
        ingresoTelefono.setEditable(false);
        ingresoContraseña.setEditable(false);
    }
    public void limpiarCampos(){
        ingresoNombre.setText("");
        ingresoApellido.setText("");
        ingresoDireccion.setText("");
        ingresoEmail.setText("");
        ingresoDni.setText("");
        ingresoTelefono.setText("");
        ingresoContraseña.setText("");
    }

    public void setTextos(Cliente user){
        ingresoNombre.setText(user.getNombre());
        ingresoApellido.setText(user.getApellido());
        ingresoDireccion.setText(user.getDireccion());
        ingresoEmail.setText(user.getEmail());
        ingresoDni.setText(user.getDni());
        ingresoTelefono.setText(user.getTelefono());
        ingresoContraseña.setText(user.getContrasenia());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel iconoMenu;
    private javax.swing.JTextField ingresoApellido;
    private javax.swing.JTextField ingresoContraseña;
    private javax.swing.JTextField ingresoDireccion;
    private javax.swing.JTextField ingresoDni;
    private javax.swing.JTextField ingresoEmail;
    private javax.swing.JTextField ingresoNombre;
    private javax.swing.JTextField ingresoTelefono;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
