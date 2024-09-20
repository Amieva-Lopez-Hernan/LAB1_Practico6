/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Categoria;
import Entidades.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JulianC
 */
public class jifProductos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private static boolean eliminado = false;
    private static boolean actualizado = false;
    private static Producto prodEA;

    /**
     * Creates new form jifProductos
     */
    public jifProductos() {
        initComponents();
        armarCabecera();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlGdeProductos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jlCodigo = new javax.swing.JLabel();
        jlDescripcion = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jlRubro = new javax.swing.JLabel();
        jlStock = new javax.swing.JLabel();
        jtPaneCodigo = new javax.swing.JTextField();
        jtPaneDescripcion = new javax.swing.JTextField();
        jtPanePrecio = new javax.swing.JTextField();
        cbPaneRubro = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jbBuscar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();

        jlGdeProductos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlGdeProductos.setText("Gestion de Productos");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("Filtar por categoría");

        cbCategorias.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cbCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriasActionPerformed(evt);
            }
        });

        jTableGProductos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTableGProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableGProductos);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlCodigo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jlCodigo.setText("Código:");

        jlDescripcion.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jlDescripcion.setText("Descripción:");

        jlPrecio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jlPrecio.setText("Precio:");

        jlRubro.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jlRubro.setText("Rubro:");

        jlStock.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jlStock.setText("Stock:");

        jtPaneCodigo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jtPaneDescripcion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jtPaneDescripcion.setEnabled(false);

        jtPanePrecio.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jtPanePrecio.setEnabled(false);

        cbPaneRubro.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbPaneRubro.setEnabled(false);

        jSpinner1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jSpinner1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlPrecio)
                        .addGap(47, 47, 47)
                        .addComponent(jtPanePrecio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlRubro)
                            .addComponent(jlStock))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPaneRubro, 0, 194, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDescripcion)
                            .addComponent(jlCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPaneCodigo)
                            .addComponent(jtPaneDescripcion))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jtPaneCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDescripcion)
                    .addComponent(jtPaneDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecio)
                    .addComponent(jtPanePrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRubro)
                    .addComponent(cbPaneRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlStock)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search 50x50.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbActualizar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/in-time 25x25.png"))); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.setEnabled(false);
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new-folder 25x25.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bin 25x25.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diskette 25x25.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbCerrar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlGdeProductos)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlGdeProductos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCerrar)
                        .addGap(80, 80, 80)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCancelar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        agregarProducto();
        cbCategoriasActionPerformed(evt);
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void cbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriasActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        for (Producto prod : deTodosSa.listaProductos) {
            // Agrego las filas a la tabla si el producto empieza con determinada letra.
            if (cbCategorias.getSelectedItem() == prod.getRubro()) {
                modelo.addRow(new Object[]{prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getRubro(), prod.getStock()});
            }
        }
    }//GEN-LAST:event_cbCategoriasActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        eliminarProducto();
        cbCategoriasActionPerformed(evt);
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        actualizarProducto();
        cbCategoriasActionPerformed(evt);
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        nuevo();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        cancelar();
        cbCategoriasActionPerformed(evt);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Categoria> cbCategorias;
    private javax.swing.JComboBox<Categoria> cbPaneRubro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTableGProductos;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlGdeProductos;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlRubro;
    private javax.swing.JLabel jlStock;
    private javax.swing.JTextField jtPaneCodigo;
    private javax.swing.JTextField jtPaneDescripcion;
    private javax.swing.JTextField jtPanePrecio;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        // Set del modelo:
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoría");
        modelo.addColumn("Stock");
        jTableGProductos.setModel(modelo);

    }

    public void agregarProducto() {

        if (jtPaneCodigo.getText().isEmpty() || jtPaneDescripcion.getText().isEmpty() || jtPanePrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No pueden haber campos vacios!");
            return;
        }
        boolean validar = validarCampos();
        if (validar) {
            int codigo = Integer.parseUnsignedInt(jtPaneCodigo.getText());
            String descripcion = jtPaneDescripcion.getText();
            double precio = Double.parseDouble(jtPanePrecio.getText());
            int stock = Integer.parseInt(jSpinner1.getValue().toString());
            Categoria rubro = (Categoria) cbPaneRubro.getSelectedItem();
            Producto prod = new Producto(codigo, descripcion, precio, stock, rubro);
            if (deTodosSa.listaProductos.add(prod)) {
                JOptionPane.showMessageDialog(this, "El producto se ha guardado correctamente!");
                desactivarCampos();
                jtPaneCodigo.setText("");
                jtPaneDescripcion.setText("");
                jtPanePrecio.setText("");
                jSpinner1.setValue(0);
                jbGuardar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "El codigo del producto que intenta agregar ya existe!");
            }
        }
    }

    public void cargarCombo() {
        // Llenar combos: 
        cbPaneRubro.addItem(Categoria.LIMPIEZA);
        cbPaneRubro.addItem(Categoria.COMESTIBLES);
        cbPaneRubro.addItem(Categoria.PERFUMERIA);

        cbCategorias.addItem(Categoria.LIMPIEZA);
        cbCategorias.addItem(Categoria.COMESTIBLES);
        cbCategorias.addItem(Categoria.PERFUMERIA);
    }

    private void nuevo() {
        activarCampos();
        jtPaneCodigo.setText("");
        jtPaneDescripcion.setText("");
        jtPanePrecio.setText("");
        jSpinner1.setValue(0);
        prodEA = null;
        eliminado = false;
        actualizado = false;
        jtPaneCodigo.setEnabled(true);
        jbGuardar.setEnabled(true);
        jbEliminar.setEnabled(false);
        jbActualizar.setEnabled(false);
    }

    private void buscar() {
        if (jtPaneCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "En campo código no puede estar vacio!");
            return;
        } else {
            try {
                int buscar = Integer.parseInt(jtPaneCodigo.getText());
                boolean encontrado = false;
                for (Producto prod : deTodosSa.listaProductos) {
                    if (buscar == prod.getCodigo()) {
                        jbGuardar.setEnabled(false);
                        jtPaneDescripcion.setText(prod.getDescripcion());
                        jtPanePrecio.setText(String.valueOf(prod.getPrecio()));
                        cbPaneRubro.setSelectedItem(prod.getRubro());
                        jSpinner1.setValue(prod.getStock());
                        jtPaneCodigo.setEnabled(false);
                        encontrado = true;
                        activarCampos();
                        jbActualizar.setEnabled(true);
                        jbEliminar.setEnabled(true);
                    }
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(this, "El codigo ingresado no esxiste");
                    jtPaneCodigo.requestFocus();
                }
            } catch (NumberFormatException nf) {
                JOptionPane.showMessageDialog(this, "En código solo puede ingresar numeros enteros!");
                jtPaneCodigo.setText("");
                jtPaneCodigo.requestFocus();
            }
        }
    }

    private void borrarFilas() {
        // Determinamos las filas de la tabla:
        int f = jTableGProductos.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    public void eliminarProducto() {

        if (jtPaneCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "En campo código no puede estar vacio!");
            return;
        } else {
            try {
                Producto borrarProducto = null;
                for (Producto prod : deTodosSa.listaProductos) {
                    if (prod.getCodigo() == Integer.parseInt(jtPaneCodigo.getText())) {
                        borrarProducto = prod;
                        prodEA = prod;
                        eliminado = true;
                    }
                }
                if (deTodosSa.listaProductos.remove(borrarProducto)) {
                    JOptionPane.showMessageDialog(this, "El producto ha sido eliminado correctamente");
                    desactivarCampos();
                    jtPaneCodigo.setText("");
                    jtPaneDescripcion.setText("");
                    jtPanePrecio.setText("");
                    jSpinner1.setValue(0);
                    jbActualizar.setEnabled(false);
                    jbEliminar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "El codigo de producto que intenta eliminar no existe!");
                }
            } catch (NumberFormatException nf) {
                JOptionPane.showMessageDialog(this, "En el código solo puede ingresar numeros enteros!");
                jtPaneCodigo.setText("");
                jtPaneCodigo.requestFocus();
            } catch (NullPointerException np) {
                JOptionPane.showMessageDialog(this, "El codigo de producto que intenta eliminar no existe!");
                jtPaneCodigo.setText("");
                jtPaneCodigo.requestFocus();
            }
        }
    }

    public void actualizarProducto() {
        boolean encontrado = false;
        if (jtPaneCodigo.getText().isEmpty() || jtPaneDescripcion.getText().isEmpty() || jtPanePrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No pueden haber campos vacios!");
            return;
        }
        for (Producto prod : deTodosSa.listaProductos) {
            if (prod.getCodigo() == Integer.parseInt(jtPaneCodigo.getText())) {
                if (jtPaneCodigo.getText().isEmpty() || jtPaneDescripcion.getText().isEmpty() || jtPanePrecio.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No pueden haber campos vacios!");
                    return;
                }
                boolean validar = validarCampos();
                if (validar) {
                    actualizado = true;
                    encontrado = true;
                    int codigo = Integer.parseUnsignedInt(jtPaneCodigo.getText());
                    prod.setCodigo(codigo);
                    String descripcion = jtPaneDescripcion.getText();
                    prod.setDescripcion(descripcion);
                    double precio = Double.parseDouble(jtPanePrecio.getText());
                    prod.setPrecio(precio);
                    int stock = Integer.parseInt(jSpinner1.getValue().toString());
                    prod.setStock(stock);
                    Categoria rubro = (Categoria) cbPaneRubro.getSelectedItem();
                    prod.setRubro(rubro);
                    JOptionPane.showMessageDialog(this, "El producto ha sido actualizado correctamente");
                    desactivarCampos();
                    jbActualizar.setEnabled(false);
                    jbEliminar.setEnabled(false);
                }
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "El codigo ingresado no existe!");
            jtPaneCodigo.requestFocus();
        }
        jtPaneCodigo.setText("");
        jtPaneDescripcion.setText("");
        jtPanePrecio.setText("");
        jSpinner1.setValue(0);
        jtPaneCodigo.setEditable(true);
    }

    private void cancelar() {
        if (actualizado) {
            JOptionPane.showMessageDialog(this, "Modifique nuevamente el producto");
            activarCampos();
        } else {
            if (eliminado) {
                deTodosSa.listaProductos.add(prodEA);
                JOptionPane.showMessageDialog(this, "Se ha restablecido el producto que elimino previamente!");
                nuevo();
            } else {
                JOptionPane.showMessageDialog(this, "No hay acciones que puedan ser canceladas!");
            }
        }
    }

    private boolean validarCampos() {

        String val1 = "[0-9]*";
        if (!jtPaneCodigo.getText().matches(val1)) {
            JOptionPane.showMessageDialog(this, "En el apartado codigos solo puede ingresar números!");
            jtPaneCodigo.requestFocus();
            return false;
        }
        String val2 = "^[0-9]+(\\.[0-9]+){0,1}$";
        if (!jtPanePrecio.getText().matches(val2)) {
            JOptionPane.showMessageDialog(this, "En el apartado precio solo puede ingresar números!");
            jtPanePrecio.requestFocus();
            return false;
        }

        if ((int) jSpinner1.getValue() < 1) {
            JOptionPane.showMessageDialog(this, "Ingrese la cantidad en stock!");
            jSpinner1.requestFocus();
            return false;
        }
        return true;
    }

    private void desactivarCampos() {
        jtPaneDescripcion.setEnabled(false);
        jtPanePrecio.setEnabled(false);
        jSpinner1.setEnabled(false);
        cbPaneRubro.setEnabled(false);
    }

    private void activarCampos() {
        jtPaneDescripcion.setEnabled(true);
        jtPanePrecio.setEnabled(true);
        jSpinner1.setEnabled(true);
        cbPaneRubro.setEnabled(true);
    }
}
