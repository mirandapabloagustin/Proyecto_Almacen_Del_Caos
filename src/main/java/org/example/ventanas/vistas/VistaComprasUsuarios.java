/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.ventanas.vistas;

import com.org.example.clases.Cliente;
import com.org.example.clases.Pedido;
import com.org.example.clases.Productos;
import com.org.example.service.GestionImpleCliente;
import com.org.example.service.GestionImplePedido;
import com.org.example.service.Utils;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Agus-Notebook
 */
public class VistaComprasUsuarios extends javax.swing.JPanel {
    private GestionImpleCliente gestorCliente;
    private GestionImplePedido gestor;
    private DefaultTableModel modeloTablaPedido;
    private DefaultTableModel modeloTablaProductos;
    private TableRowSorter tablaFlitro;
    private String filtro;
    private Cliente cliente;

    /**
     * Creates new form VistaCompras
     */
    public VistaComprasUsuarios(Cliente user) {
        cliente = user;
        modeloTablaPedido = new DefaultTableModel();
        modeloTablaProductos = new DefaultTableModel();
        gestor = new GestionImplePedido();
        gestorCliente = new GestionImpleCliente();
        initComponents();
        cargarTablaPedido();
        tablaPedidos.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent event){
                if(!event.getValueIsAdjusting() && tablaPedidos.getSelectedRow() != -1){
                    int filaSeleccionada = tablaPedidos.getSelectedRow();
                    cargarTablaProductos(cliente.getListaDePedidos().get(filaSeleccionada).getProductos());
                }
            }
        });
        selecionTotal.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < tablaPedidos.getRowCount(); i++) {
                    if (selecionTotal.isSelected()) {
                        for (int j = 0; j < tablaPedidos.getRowCount(); j++) {
                            tablaPedidos.setValueAt(true, j, 3);
                        }
                    } else {
                        for (int j = 0; j < tablaPedidos.getRowCount(); j++) {
                            tablaPedidos.setValueAt(false, j, 3);
                        }
                    }
                }
            }
        });
        
    }

    public void cargarTablaPedido() {
        if (cliente.getListaDePedidos() != null) {
            for (Pedido item : cliente.getListaDePedidos()) {
                Object[] infoDatos = new Object[4];
                infoDatos[0] = item.getNumPedido();
                infoDatos[1] = item.getEstado();
                infoDatos[2] = item.getProductos().size();
                infoDatos[3] = false;
                modeloTablaPedido.addRow(infoDatos);
            }
        }
    }

    public void cargarTablaProductos(ArrayList<Productos> lista) {
        for(Productos item : lista){
            Object[] infoDatos = new Object[3];
                infoDatos[0] = item.getNombre();
                infoDatos[1] = item.getStock();
                infoDatos[2] = item.getPrecio();
                modeloTablaPedido.addRow(infoDatos);
        }
    }
    
    public void filtro(){
        filtro = buscadorElementos.getText();
        tablaFlitro.setRowFilter(RowFilter.regexFilter(buscadorElementos.getText(), 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundVistaCompras = new javax.swing.JPanel();
        btnBuscador = new javax.swing.JButton();
        buscadorElementos = new javax.swing.JTextField();
        contenedorTabla1 = new javax.swing.JScrollPane();
        tablaProductosDelPedido = new javax.swing.JTable();
        contenedorTabla2 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        btnBorrarSeleccionados = new javax.swing.JButton();
        textoPrecioTotal = new javax.swing.JLabel();
        precioTotalPedido = new javax.swing.JTextField();
        btnConfirmarPedido = new javax.swing.JButton();
        selecionTotal = new javax.swing.JCheckBox();

        setMaximumSize(new java.awt.Dimension(800, 510));
        setMinimumSize(new java.awt.Dimension(800, 510));
        setName(""); // NOI18N

        backgroundVistaCompras.setBackground(new java.awt.Color(134, 150, 254));
        backgroundVistaCompras.setMaximumSize(new java.awt.Dimension(800, 560));
        backgroundVistaCompras.setMinimumSize(new java.awt.Dimension(800, 560));
        backgroundVistaCompras.setName(""); // NOI18N
        backgroundVistaCompras.setPreferredSize(new java.awt.Dimension(800, 560));

        btnBuscador.setBackground(new java.awt.Color(204, 255, 204));
        btnBuscador.setText("Buscar:");
        btnBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscadorActionPerformed(evt);
            }
        });

        buscadorElementos.setText("Ingrese N°Pedido");
        buscadorElementos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscadorElementosMouseClicked(evt);
            }
        });
        buscadorElementos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscadorElementosKeyTyped(evt);
            }
        });

        tablaProductosDelPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productos", "Cantidad", "Precio Unitario"
            }
        ));
        contenedorTabla1.setViewportView(tablaProductosDelPedido);

        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Pedido", "Estado", "cantProductos", "Seleccionado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        contenedorTabla2.setViewportView(tablaPedidos);

        btnBorrarSeleccionados.setBackground(new java.awt.Color(189, 205, 214));
        btnBorrarSeleccionados.setText("BORRAR");
        btnBorrarSeleccionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarSeleccionadosMouseClicked(evt);
            }
        });

        textoPrecioTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoPrecioTotal.setText("TOTAL:");

        precioTotalPedido.setText("$");
        precioTotalPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioTotalPedidoActionPerformed(evt);
            }
        });

        btnConfirmarPedido.setBackground(new java.awt.Color(189, 205, 214));
        btnConfirmarPedido.setText("PAGAR");

        selecionTotal.setBackground(new java.awt.Color(134, 150, 254));
        selecionTotal.setText("Seleccionar Todos");

        javax.swing.GroupLayout backgroundVistaComprasLayout = new javax.swing.GroupLayout(backgroundVistaCompras);
        backgroundVistaCompras.setLayout(backgroundVistaComprasLayout);
        backgroundVistaComprasLayout.setHorizontalGroup(
            backgroundVistaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundVistaComprasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(backgroundVistaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundVistaComprasLayout.createSequentialGroup()
                        .addComponent(btnBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscadorElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))
                    .addGroup(backgroundVistaComprasLayout.createSequentialGroup()
                        .addGroup(backgroundVistaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundVistaComprasLayout.createSequentialGroup()
                                .addComponent(textoPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precioTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundVistaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(contenedorTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundVistaComprasLayout.createSequentialGroup()
                                    .addComponent(btnConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(btnBorrarSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(contenedorTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(selecionTotal))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        backgroundVistaComprasLayout.setVerticalGroup(
            backgroundVistaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundVistaComprasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(backgroundVistaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscadorElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(selecionTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundVistaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundVistaComprasLayout.createSequentialGroup()
                        .addComponent(contenedorTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(backgroundVistaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBorrarSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundVistaComprasLayout.createSequentialGroup()
                        .addComponent(contenedorTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(backgroundVistaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoPrecioTotal))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundVistaCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundVistaCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void precioTotalPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioTotalPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioTotalPedidoActionPerformed

    private void buscadorElementosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorElementosKeyTyped
        // TODO add your handling code here:
        tablaFlitro = new TableRowSorter(tablaPedidos.getModel());
        tablaPedidos.setRowSorter(tablaFlitro);
        
    }//GEN-LAST:event_buscadorElementosKeyTyped

    private void buscadorElementosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscadorElementosMouseClicked
        // TODO add your handling code here:
        buscadorElementos.setText("");
    }//GEN-LAST:event_buscadorElementosMouseClicked

    private void btnBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscadorActionPerformed
        // TODO add your handling code here:

        buscadorElementos.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = buscadorElementos.getText();
                repaint();
                filtro();
            }

        });
    }//GEN-LAST:event_btnBuscadorActionPerformed

    private void btnBorrarSeleccionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarSeleccionadosMouseClicked
        // TODO add your handling code here:
        
        for (int i = 0; i < tablaPedidos.getRowCount(); i++) {
            if ((boolean) tablaPedidos.getValueAt(i, 3)) {
                    gestor.borrarPedido(Integer.parseInt(String.valueOf(tablaPedidos.getValueAt(i, 0)).toString()), cliente);
                    
                    Utils.borrarFilaDeTabla(tablaPedidos, i);

            }
        }
    }//GEN-LAST:event_btnBorrarSeleccionadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundVistaCompras;
    private javax.swing.JButton btnBorrarSeleccionados;
    private javax.swing.JButton btnBuscador;
    private javax.swing.JButton btnConfirmarPedido;
    private javax.swing.JTextField buscadorElementos;
    private javax.swing.JScrollPane contenedorTabla1;
    private javax.swing.JScrollPane contenedorTabla2;
    private javax.swing.JTextField precioTotalPedido;
    private javax.swing.JCheckBox selecionTotal;
    private javax.swing.JTable tablaPedidos;
    private javax.swing.JTable tablaProductosDelPedido;
    private javax.swing.JLabel textoPrecioTotal;
    // End of variables declaration//GEN-END:variables
}