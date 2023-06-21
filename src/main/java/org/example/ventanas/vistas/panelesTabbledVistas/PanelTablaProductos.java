/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.ventanas.vistas.panelesTabbledVistas;

/**
 *
 * @author Agus-Notebook
 */
public class PanelTablaProductos extends javax.swing.JPanel {

    /**
     * Creates new form PanelTablaProductos
     */
    public PanelTablaProductos() {
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

        backgrounPanelTablaProductos = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscarTablaPruductos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 510));
        setMinimumSize(new java.awt.Dimension(800, 510));
        setName(""); // NOI18N

        backgrounPanelTablaProductos.setBackground(new java.awt.Color(205, 240, 234));
        backgrounPanelTablaProductos.setMaximumSize(new java.awt.Dimension(800, 510));
        backgrounPanelTablaProductos.setMinimumSize(new java.awt.Dimension(800, 510));
        backgrounPanelTablaProductos.setPreferredSize(new java.awt.Dimension(800, 510));

        btnBuscar.setBackground(new java.awt.Color(22, 135, 167));
        btnBuscar.setText("Buscar");

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Nombre", "Fecha de vencimiento", "Fecha de elaboración", "Stock", "Precio", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        btnBorrar.setBackground(new java.awt.Color(22, 135, 167));
        btnBorrar.setText("BORRAR");

        btnEditar.setBackground(new java.awt.Color(22, 135, 167));
        btnEditar.setText("EDITAR");

        btnGuardar.setBackground(new java.awt.Color(22, 135, 167));
        btnGuardar.setText("GUARDAR");

        javax.swing.GroupLayout backgrounPanelTablaProductosLayout = new javax.swing.GroupLayout(backgrounPanelTablaProductos);
        backgrounPanelTablaProductos.setLayout(backgrounPanelTablaProductosLayout);
        backgrounPanelTablaProductosLayout.setHorizontalGroup(
            backgrounPanelTablaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrounPanelTablaProductosLayout.createSequentialGroup()
                .addGroup(backgrounPanelTablaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(backgrounPanelTablaProductosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgrounPanelTablaProductosLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(backgrounPanelTablaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgrounPanelTablaProductosLayout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscarTablaPruductos, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        backgrounPanelTablaProductosLayout.setVerticalGroup(
            backgrounPanelTablaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrounPanelTablaProductosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(backgrounPanelTablaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarTablaPruductos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(backgrounPanelTablaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgrounPanelTablaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgrounPanelTablaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgrounPanelTablaProductos;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtBuscarTablaPruductos;
    // End of variables declaration//GEN-END:variables
}
