/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.ventanas.vistas.panelesTabbledVistas;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Agus-Notebook
 */
public class PanelEdicionProducto extends javax.swing.JPanel {

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
        btnLimpiarEdicionProducto = new javax.swing.JButton();
        btnGuardarEdicionProducto = new javax.swing.JButton();
        panelMuestraTexto = new javax.swing.JPanel();
        contentText1 = new javax.swing.JPanel();
        textoIngresoMarca = new javax.swing.JLabel();
        ingresoMarcaEdicionProducto = new javax.swing.JTextField();
        contentText2 = new javax.swing.JPanel();
        textoIngresoNombre = new javax.swing.JLabel();
        ingresoNombreEdicionProducto = new javax.swing.JTextField();
        contentText3 = new javax.swing.JPanel();
        ingresoElavoracionEdicionProducto = new javax.swing.JTextField();
        textoIngresoElaboracion = new javax.swing.JLabel();
        contentText4 = new javax.swing.JPanel();
        textoIngresoVencimiento = new javax.swing.JLabel();
        ingresoVencimiento = new javax.swing.JTextField();
        contentText5 = new javax.swing.JPanel();
        textoIngresoStock = new javax.swing.JLabel();
        ingresoStockEdicionProducto = new javax.swing.JTextField();
        contentText6 = new javax.swing.JPanel();
        textoIngresoPrecio = new javax.swing.JLabel();
        ingresoPrecioEdicionProducto = new javax.swing.JTextField();
        iconoPanelCarga = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        backgroundPanelEdicionProducto.setMaximumSize(new java.awt.Dimension(800, 560));
        backgroundPanelEdicionProducto.setMinimumSize(new java.awt.Dimension(800, 560));
        backgroundPanelEdicionProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiarEdicionProducto.setBackground(new java.awt.Color(57, 136, 158));
        btnLimpiarEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiarEdicionProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarEdicionProducto.setText("LIMPIAR");
        btnLimpiarEdicionProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backgroundPanelEdicionProducto.add(btnLimpiarEdicionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 140, 50));

        btnGuardarEdicionProducto.setBackground(new java.awt.Color(57, 136, 158));
        btnGuardarEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarEdicionProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEdicionProducto.setText("GUARDAR");
        btnGuardarEdicionProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backgroundPanelEdicionProducto.add(btnGuardarEdicionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 140, 50));

        panelMuestraTexto.setBackground(new java.awt.Color(51, 51, 255));
        panelMuestraTexto.setOpaque(false);
        panelMuestraTexto.setPreferredSize(new java.awt.Dimension(560, 400));

        contentText1.setBackground(new java.awt.Color(255, 255, 255));
        contentText1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textoIngresoMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoIngresoMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoIngresoMarca.setText("Marca :");
        textoIngresoMarca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textoIngresoMarca.setMaximumSize(new java.awt.Dimension(160, 34));
        textoIngresoMarca.setMinimumSize(new java.awt.Dimension(160, 34));
        textoIngresoMarca.setPreferredSize(new java.awt.Dimension(160, 34));

        ingresoMarcaEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoMarcaEdicionProducto.setForeground(new java.awt.Color(153, 153, 153));
        ingresoMarcaEdicionProducto.setText("   Ingrese Marca del Producto");
        ingresoMarcaEdicionProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ingresoMarcaEdicionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoMarcaEdicionProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contentText1Layout = new javax.swing.GroupLayout(contentText1);
        contentText1.setLayout(contentText1Layout);
        contentText1Layout.setHorizontalGroup(
            contentText1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentText1Layout.createSequentialGroup()
                .addComponent(textoIngresoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ingresoMarcaEdicionProducto))
        );
        contentText1Layout.setVerticalGroup(
            contentText1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentText1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(textoIngresoMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresoMarcaEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contentText2.setBackground(new java.awt.Color(255, 255, 255));
        contentText2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contentText2.setFocusable(false);

        textoIngresoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoIngresoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoIngresoNombre.setText("Nombre :");
        textoIngresoNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textoIngresoNombre.setMaximumSize(new java.awt.Dimension(160, 34));
        textoIngresoNombre.setMinimumSize(new java.awt.Dimension(160, 34));
        textoIngresoNombre.setPreferredSize(new java.awt.Dimension(160, 34));

        ingresoNombreEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoNombreEdicionProducto.setForeground(new java.awt.Color(153, 153, 153));
        ingresoNombreEdicionProducto.setText("   Ingrese Nombre del Producto");

        javax.swing.GroupLayout contentText2Layout = new javax.swing.GroupLayout(contentText2);
        contentText2.setLayout(contentText2Layout);
        contentText2Layout.setHorizontalGroup(
            contentText2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentText2Layout.createSequentialGroup()
                .addComponent(textoIngresoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ingresoNombreEdicionProducto))
        );
        contentText2Layout.setVerticalGroup(
            contentText2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentText2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(textoIngresoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ingresoNombreEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contentText3.setBackground(new java.awt.Color(255, 255, 255));
        contentText3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ingresoElavoracionEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoElavoracionEdicionProducto.setForeground(new java.awt.Color(153, 153, 153));
        ingresoElavoracionEdicionProducto.setText("   Ingrese Fecha de Elaboracion xx/xx/xxxx");
        ingresoElavoracionEdicionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoElavoracionEdicionProductoMouseClicked(evt);
            }
        });

        textoIngresoElaboracion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoIngresoElaboracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoIngresoElaboracion.setText("Fecha Elaboracion :");
        textoIngresoElaboracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textoIngresoElaboracion.setMaximumSize(new java.awt.Dimension(160, 34));
        textoIngresoElaboracion.setMinimumSize(new java.awt.Dimension(160, 34));
        textoIngresoElaboracion.setPreferredSize(new java.awt.Dimension(160, 34));

        javax.swing.GroupLayout contentText3Layout = new javax.swing.GroupLayout(contentText3);
        contentText3.setLayout(contentText3Layout);
        contentText3Layout.setHorizontalGroup(
            contentText3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentText3Layout.createSequentialGroup()
                .addComponent(textoIngresoElaboracion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ingresoElavoracionEdicionProducto))
        );
        contentText3Layout.setVerticalGroup(
            contentText3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentText3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(textoIngresoElaboracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresoElavoracionEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contentText4.setBackground(new java.awt.Color(255, 255, 255));
        contentText4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textoIngresoVencimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoIngresoVencimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoIngresoVencimiento.setText("FechaVencimiento :");
        textoIngresoVencimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textoIngresoVencimiento.setMaximumSize(new java.awt.Dimension(160, 34));
        textoIngresoVencimiento.setMinimumSize(new java.awt.Dimension(160, 34));
        textoIngresoVencimiento.setPreferredSize(new java.awt.Dimension(160, 34));

        ingresoVencimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoVencimiento.setForeground(new java.awt.Color(153, 153, 153));
        ingresoVencimiento.setText("   Ingrese Fecha de Vencimiento xx/xx/xxxx");
        ingresoVencimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoVencimientoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contentText4Layout = new javax.swing.GroupLayout(contentText4);
        contentText4.setLayout(contentText4Layout);
        contentText4Layout.setHorizontalGroup(
            contentText4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentText4Layout.createSequentialGroup()
                .addComponent(textoIngresoVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ingresoVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
        );
        contentText4Layout.setVerticalGroup(
            contentText4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentText4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(textoIngresoVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresoVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contentText5.setBackground(new java.awt.Color(255, 255, 255));
        contentText5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textoIngresoStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoIngresoStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoIngresoStock.setText("Cantidad Producto :");
        textoIngresoStock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textoIngresoStock.setMaximumSize(new java.awt.Dimension(160, 34));
        textoIngresoStock.setMinimumSize(new java.awt.Dimension(160, 34));
        textoIngresoStock.setPreferredSize(new java.awt.Dimension(160, 34));

        ingresoStockEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoStockEdicionProducto.setForeground(new java.awt.Color(153, 153, 153));
        ingresoStockEdicionProducto.setText("   Ingrese Stock  Producto");
        ingresoStockEdicionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoStockEdicionProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contentText5Layout = new javax.swing.GroupLayout(contentText5);
        contentText5.setLayout(contentText5Layout);
        contentText5Layout.setHorizontalGroup(
            contentText5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentText5Layout.createSequentialGroup()
                .addComponent(textoIngresoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ingresoStockEdicionProducto))
        );
        contentText5Layout.setVerticalGroup(
            contentText5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentText5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(textoIngresoStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresoStockEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contentText6.setBackground(new java.awt.Color(255, 255, 255));
        contentText6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textoIngresoPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoIngresoPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoIngresoPrecio.setText("Precio del Producto :");
        textoIngresoPrecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textoIngresoPrecio.setMaximumSize(new java.awt.Dimension(160, 34));
        textoIngresoPrecio.setMinimumSize(new java.awt.Dimension(160, 34));
        textoIngresoPrecio.setPreferredSize(new java.awt.Dimension(160, 34));

        ingresoPrecioEdicionProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresoPrecioEdicionProducto.setForeground(new java.awt.Color(153, 153, 153));
        ingresoPrecioEdicionProducto.setText("   Ingrese Precio Producto");
        ingresoPrecioEdicionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoPrecioEdicionProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contentText6Layout = new javax.swing.GroupLayout(contentText6);
        contentText6.setLayout(contentText6Layout);
        contentText6Layout.setHorizontalGroup(
            contentText6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentText6Layout.createSequentialGroup()
                .addComponent(textoIngresoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ingresoPrecioEdicionProducto))
        );
        contentText6Layout.setVerticalGroup(
            contentText6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentText6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(textoIngresoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingresoPrecioEdicionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelMuestraTextoLayout = new javax.swing.GroupLayout(panelMuestraTexto);
        panelMuestraTexto.setLayout(panelMuestraTextoLayout);
        panelMuestraTextoLayout.setHorizontalGroup(
            panelMuestraTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentText5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentText4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentText6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentText3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMuestraTextoLayout.setVerticalGroup(
            panelMuestraTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMuestraTextoLayout.createSequentialGroup()
                .addComponent(contentText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contentText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contentText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contentText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contentText5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contentText6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backgroundPanelEdicionProducto.add(panelMuestraTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 560, 330));

        iconoPanelCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cambiar.png"))); // NOI18N
        backgroundPanelEdicionProducto.add(iconoPanelCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diseño sin título (4).png"))); // NOI18N
        backgroundPanelEdicionProducto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanelEdicionProducto;
    private javax.swing.JButton btnGuardarEdicionProducto;
    private javax.swing.JButton btnLimpiarEdicionProducto;
    private javax.swing.JPanel contentText1;
    private javax.swing.JPanel contentText2;
    private javax.swing.JPanel contentText3;
    private javax.swing.JPanel contentText4;
    private javax.swing.JPanel contentText5;
    private javax.swing.JPanel contentText6;
    private javax.swing.JLabel iconoPanelCarga;
    private javax.swing.JTextField ingresoElavoracionEdicionProducto;
    private javax.swing.JTextField ingresoMarcaEdicionProducto;
    private javax.swing.JTextField ingresoNombreEdicionProducto;
    private javax.swing.JTextField ingresoPrecioEdicionProducto;
    private javax.swing.JTextField ingresoStockEdicionProducto;
    private javax.swing.JTextField ingresoVencimiento;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panelMuestraTexto;
    private javax.swing.JLabel textoIngresoElaboracion;
    private javax.swing.JLabel textoIngresoMarca;
    private javax.swing.JLabel textoIngresoNombre;
    private javax.swing.JLabel textoIngresoPrecio;
    private javax.swing.JLabel textoIngresoStock;
    private javax.swing.JLabel textoIngresoVencimiento;
    // End of variables declaration//GEN-END:variables
}
