/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.ventanas.vistas.panelesTabbledVistas;

import com.org.example.clases.Productos;
import com.org.example.service.GestionImpleProducto;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Agus-Notebook
 */
public class PanelEdicionProducto extends javax.swing.JPanel {
    private static GestionImpleProducto gestor = new GestionImpleProducto();
     private Productos dato = new Productos();

    /**
     * Creates new form NewPanelEdicionProducto
     */
    public PanelEdicionProducto() {
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

        backgroundPanelEdicionProducto = new javax.swing.JPanel();
        iconoPanelCarga = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ingresoMarcaEdicionProducto = new javax.swing.JTextField();
        ingresoElavoracionEdicionProducto = new javax.swing.JTextField();
        ingresoPrecioEdicionProducto = new javax.swing.JTextField();
        ingresoVencimiento = new javax.swing.JTextField();
        ingresoStockEdicionProducto = new javax.swing.JTextField();
        ingresoNombreEdicionProducto = new javax.swing.JTextField();
        selectorCategoria = new javax.swing.JComboBox<>();
        btnLimpiarEdicionProducto = new javax.swing.JButton();
        btnGuardarEdicionProducto = new javax.swing.JButton();

        backgroundPanelEdicionProducto.setBackground(new java.awt.Color(160, 229, 220));
        backgroundPanelEdicionProducto.setMaximumSize(new java.awt.Dimension(800, 560));
        backgroundPanelEdicionProducto.setMinimumSize(new java.awt.Dimension(800, 560));
        backgroundPanelEdicionProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconoPanelCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cambiar.png"))); // NOI18N
        backgroundPanelEdicionProducto.add(iconoPanelCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(115, 190, 165));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 251, 243), 5, true));

        ingresoMarcaEdicionProducto.setBackground(new java.awt.Color(178, 228, 211));
        ingresoMarcaEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoMarcaEdicionProducto.setForeground(new java.awt.Color(18, 138, 92));
        ingresoMarcaEdicionProducto.setText("   Ingrese Marca del Producto");
        ingresoMarcaEdicionProducto.setBorder(null);
        ingresoMarcaEdicionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoMarcaEdicionProductoMouseClicked(evt);
            }
        });

        ingresoElavoracionEdicionProducto.setBackground(new java.awt.Color(178, 228, 211));
        ingresoElavoracionEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoElavoracionEdicionProducto.setForeground(new java.awt.Color(18, 138, 92));
        ingresoElavoracionEdicionProducto.setText("   Ingrese Fecha de Elaboracion xx/xx/xxxx");
        ingresoElavoracionEdicionProducto.setBorder(null);
        ingresoElavoracionEdicionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoElavoracionEdicionProductoMouseClicked(evt);
            }
        });

        ingresoPrecioEdicionProducto.setBackground(new java.awt.Color(178, 228, 211));
        ingresoPrecioEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoPrecioEdicionProducto.setForeground(new java.awt.Color(18, 138, 92));
        ingresoPrecioEdicionProducto.setText("   Ingrese Precio Producto");
        ingresoPrecioEdicionProducto.setBorder(null);
        ingresoPrecioEdicionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoPrecioEdicionProductoMouseClicked(evt);
            }
        });

        ingresoVencimiento.setEditable(false);
        ingresoVencimiento.setBackground(new java.awt.Color(178, 228, 211));
        ingresoVencimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoVencimiento.setForeground(new java.awt.Color(18, 138, 92));
        ingresoVencimiento.setText("   Ingrese Fecha de Vencimiento xx/xx/xxxx");
        ingresoVencimiento.setBorder(null);
        ingresoVencimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoVencimientoMouseClicked(evt);
            }
        });

        ingresoStockEdicionProducto.setBackground(new java.awt.Color(178, 228, 211));
        ingresoStockEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoStockEdicionProducto.setForeground(new java.awt.Color(18, 138, 92));
        ingresoStockEdicionProducto.setText("   Ingrese Stock  Producto");
        ingresoStockEdicionProducto.setToolTipText("");
        ingresoStockEdicionProducto.setBorder(null);
        ingresoStockEdicionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoStockEdicionProductoMouseClicked(evt);
            }
        });

        ingresoNombreEdicionProducto.setEditable(false);
        ingresoNombreEdicionProducto.setBackground(new java.awt.Color(178, 228, 211));
        ingresoNombreEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoNombreEdicionProducto.setForeground(new java.awt.Color(18, 138, 92));
        ingresoNombreEdicionProducto.setText("   Ingrese Nombre del Producto");
        ingresoNombreEdicionProducto.setBorder(null);

        selectorCategoria.setBackground(new java.awt.Color(178, 228, 211));
        selectorCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectorCategoria.setForeground(new java.awt.Color(8, 138, 92));
        selectorCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "LIMPIEZA", "COMIDA", "JUGUETERIA", "BEBIDAS", "CONGELADOS", "LACTEOS", "VARIOS" }));
        selectorCategoria.setBorder(null);
        selectorCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorCategoriaActionPerformed(evt);
            }
        });

        btnLimpiarEdicionProducto.setBackground(new java.awt.Color(178, 240, 222));
        btnLimpiarEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiarEdicionProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarEdicionProducto.setText("LIMPIAR");
        btnLimpiarEdicionProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(227, 255, 247), 4));
        btnLimpiarEdicionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarEdicionProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarEdicionProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarEdicionProductoMouseExited(evt);
            }
        });

        btnGuardarEdicionProducto.setBackground(new java.awt.Color(178, 240, 222));
        btnGuardarEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarEdicionProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEdicionProducto.setText("GUARDAR");
        btnGuardarEdicionProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(227, 255, 247), 4));
        btnGuardarEdicionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarEdicionProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarEdicionProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarEdicionProductoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLimpiarEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnGuardarEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ingresoStockEdicionProducto)
                        .addComponent(ingresoMarcaEdicionProducto)
                        .addComponent(ingresoPrecioEdicionProducto)
                        .addComponent(ingresoElavoracionEdicionProducto)
                        .addComponent(ingresoNombreEdicionProducto)
                        .addComponent(ingresoVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                        .addComponent(selectorCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(ingresoNombreEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresoVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresoPrecioEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresoElavoracionEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresoMarcaEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresoStockEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        backgroundPanelEdicionProducto.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 370, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanelEdicionProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanelEdicionProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void edicionLetraColortexto(JTextField ingreso) {
        ingreso.setText("");
        ingreso.setForeground(Color.BLACK);
    }
    
    private void ingresoMarcaEdicionProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoMarcaEdicionProductoMouseClicked
        // TODO add your handling code here:
        if(ingresoMarcaEdicionProducto.getText().equals("   Ingrese Marca del Producto")){
            edicionLetraColortexto(ingresoMarcaEdicionProducto);
        }
        if(ingresoNombreEdicionProducto.getText().isEmpty()){
            ingresoNombreEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoNombreEdicionProducto.setText("   Ingrese Nombre del Producto");
        }
        if(ingresoElavoracionEdicionProducto.getText().isEmpty()){
            ingresoElavoracionEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoElavoracionEdicionProducto.setText("   Ingrese Fecha de Elaboracion xx/xx/xxxx");
        }
        if(ingresoVencimiento.getText().isEmpty()){
            ingresoVencimiento.setForeground(new Color(153, 153, 153));
            ingresoVencimiento.setText("   Ingrese Fecha de Vencimiento xx/xx/xxxx");
        }
        if(ingresoStockEdicionProducto.getText().isEmpty()){
            ingresoStockEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoStockEdicionProducto.setText("   Ingrese Stock Producto");

        }
        if(ingresoPrecioEdicionProducto.getText().isEmpty()){
            ingresoPrecioEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoPrecioEdicionProducto.setText("   Ingrese Precio Producto");

        }
    }//GEN-LAST:event_ingresoMarcaEdicionProductoMouseClicked

    private void ingresoStockEdicionProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoStockEdicionProductoMouseClicked
        // TODO add your handling code here:

        if(ingresoMarcaEdicionProducto.getText().isEmpty()){
            ingresoMarcaEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoMarcaEdicionProducto.setText("   Ingrese Marca del Producto");
        }
        if(ingresoNombreEdicionProducto.getText().isEmpty()){
            ingresoNombreEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoNombreEdicionProducto.setText("   Ingrese Nombre del Producto");
        }
        if(ingresoElavoracionEdicionProducto.getText().isEmpty()){
            ingresoElavoracionEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoElavoracionEdicionProducto.setText("   Ingrese Fecha de Elaboracion xx/xx/xxxx");
        }
        if(ingresoVencimiento.getText().isEmpty()){
            ingresoVencimiento.setForeground(new Color(153, 153, 153));
            ingresoVencimiento.setText("   Ingrese Fecha de Vencimiento xx/xx/xxxx");
        }
        if(ingresoStockEdicionProducto.getText().equals("   Ingrese Stock Producto")){
            edicionLetraColortexto(ingresoStockEdicionProducto);

        }
        if(ingresoPrecioEdicionProducto.getText().isEmpty()){
            ingresoPrecioEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoPrecioEdicionProducto.setText("   Ingrese Precio Producto");

        }
    }//GEN-LAST:event_ingresoStockEdicionProductoMouseClicked

    private void ingresoElavoracionEdicionProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoElavoracionEdicionProductoMouseClicked
        // TODO add your handling code here:
        if(ingresoMarcaEdicionProducto.getText().isEmpty()){
            ingresoMarcaEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoMarcaEdicionProducto.setText("   Ingrese Marca del Producto");
        }
        if(ingresoNombreEdicionProducto.getText().isEmpty()){
            ingresoNombreEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoNombreEdicionProducto.setText("   Ingrese Nombre del Producto");
        }
        if(ingresoElavoracionEdicionProducto.getText().equals("   Ingrese Fecha de Elaboracion xx/xx/xxxx")){
            edicionLetraColortexto(ingresoElavoracionEdicionProducto);
        }
        if(ingresoVencimiento.getText().isEmpty()){
            ingresoVencimiento.setForeground(new Color(153, 153, 153));
            ingresoVencimiento.setText("   Ingrese Fecha de Vencimiento xx/xx/xxxx");
        }
        if(ingresoStockEdicionProducto.getText().isEmpty()){
            ingresoStockEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoStockEdicionProducto.setText("   Ingrese Stock Producto");

        }
        if(ingresoPrecioEdicionProducto.getText().isEmpty()){
            ingresoPrecioEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoPrecioEdicionProducto.setText("   Ingrese Precio Producto");

        }
    }//GEN-LAST:event_ingresoElavoracionEdicionProductoMouseClicked

    private void ingresoVencimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoVencimientoMouseClicked
        // TODO add your handling code here:
        if(ingresoMarcaEdicionProducto.getText().isEmpty()){
            ingresoMarcaEdicionProducto.setForeground(new Color(153, 153, 153));

            ingresoMarcaEdicionProducto.setText("   Ingrese Marca del Producto");
        }
        if(ingresoNombreEdicionProducto.getText().isEmpty()){
            ingresoNombreEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoNombreEdicionProducto.setText("   Ingrese Nombre del Producto");
        }
        if(ingresoElavoracionEdicionProducto.getText().isEmpty()){
            ingresoElavoracionEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoElavoracionEdicionProducto.setText("   Ingrese Fecha de Elaboracion xx/xx/xxxx");
        }
        if(ingresoVencimiento.getText().equals("   Ingrese Fecha de Vencimiento xx/xx/xxxx")){
            edicionLetraColortexto(ingresoVencimiento);
        }
        if(ingresoStockEdicionProducto.getText().isEmpty()){
            ingresoStockEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoStockEdicionProducto.setText("   Ingrese Stock Producto");

        }
        if(ingresoPrecioEdicionProducto.getText().isEmpty()){
            ingresoPrecioEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoPrecioEdicionProducto.setText("   Ingrese Precio Producto");

        }
    }//GEN-LAST:event_ingresoVencimientoMouseClicked

    private void ingresoPrecioEdicionProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoPrecioEdicionProductoMouseClicked
        // TODO add your handling code here:
        if(ingresoMarcaEdicionProducto.getText().isEmpty()){
            ingresoMarcaEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoMarcaEdicionProducto.setText("   Ingrese Marca del Producto");
        }
        if(ingresoNombreEdicionProducto.getText().isEmpty()){
            ingresoNombreEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoNombreEdicionProducto.setText("   Ingrese Nombre del Producto");
        }
        if(ingresoElavoracionEdicionProducto.getText().isEmpty()){
            ingresoElavoracionEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoElavoracionEdicionProducto.setText("   Ingrese Fecha de Elaboracion xx/xx/xxxx");
        }
        if(ingresoVencimiento.getText().isEmpty()){
            ingresoVencimiento.setForeground(new Color(153, 153, 153));
            ingresoVencimiento.setText("   Ingrese Fecha de Vencimiento xx/xx/xxxx");
        }
        if(ingresoStockEdicionProducto.getText().isEmpty()){
            ingresoStockEdicionProducto.setForeground(new Color(153, 153, 153));
            ingresoStockEdicionProducto.setText("   Ingrese Stock Producto");
        }
        if(ingresoPrecioEdicionProducto.getText().equals("   Ingrese Precio Producto")){
            edicionLetraColortexto(ingresoPrecioEdicionProducto);
        }
    }//GEN-LAST:event_ingresoPrecioEdicionProductoMouseClicked

    private void selectorCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorCategoriaActionPerformed
        // TODO add your handling code here:
     gestor.selecionarCategoriaProductos(dato, selectorCategoria.getSelectedIndex());
    }//GEN-LAST:event_selectorCategoriaActionPerformed

    private void btnGuardarEdicionProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEdicionProductoMouseEntered
        // TODO add your handling code here:
        btnGuardarEdicionProducto.setBackground(new java.awt.Color( 227, 255, 247));
        btnGuardarEdicionProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(178, 240, 222), 4));
    }//GEN-LAST:event_btnGuardarEdicionProductoMouseEntered

    private void btnGuardarEdicionProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEdicionProductoMouseExited
        // TODO add your handling code here:
        btnGuardarEdicionProducto.setBackground(new java.awt.Color(178, 240, 222));
        btnGuardarEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarEdicionProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEdicionProducto.setText("GUARDAR");
        btnGuardarEdicionProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(227, 255, 247), 4));
    }//GEN-LAST:event_btnGuardarEdicionProductoMouseExited

    private void btnGuardarEdicionProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEdicionProductoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarEdicionProductoMouseClicked

    private void btnLimpiarEdicionProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarEdicionProductoMouseExited
        // TODO add your handling code here:
         btnLimpiarEdicionProducto.setBackground(new java.awt.Color(178, 240, 222));
        btnLimpiarEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiarEdicionProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarEdicionProducto.setText("LIMPIAR");
        btnLimpiarEdicionProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(227, 255, 247), 4));
    }//GEN-LAST:event_btnLimpiarEdicionProductoMouseExited

    private void btnLimpiarEdicionProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarEdicionProductoMouseEntered
        // TODO add your handling code here: btnLimpiarEdicionProducto.setBackground(new java.awt.Color(178, 240, 222));

        btnLimpiarEdicionProducto.setBackground(new java.awt.Color( 227, 255, 247));
        btnLimpiarEdicionProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(178, 240, 222), 4));
    }//GEN-LAST:event_btnLimpiarEdicionProductoMouseEntered

    private void btnLimpiarEdicionProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarEdicionProductoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarEdicionProductoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanelEdicionProducto;
    private javax.swing.JButton btnGuardarEdicionProducto;
    private javax.swing.JButton btnLimpiarEdicionProducto;
    private javax.swing.JLabel iconoPanelCarga;
    private javax.swing.JTextField ingresoElavoracionEdicionProducto;
    private javax.swing.JTextField ingresoMarcaEdicionProducto;
    private javax.swing.JTextField ingresoNombreEdicionProducto;
    private javax.swing.JTextField ingresoPrecioEdicionProducto;
    private javax.swing.JTextField ingresoStockEdicionProducto;
    private javax.swing.JTextField ingresoVencimiento;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> selectorCategoria;
    // End of variables declaration//GEN-END:variables
}
