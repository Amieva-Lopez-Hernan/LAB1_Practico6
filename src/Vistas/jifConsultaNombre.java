package Vistas;


import Entidades.Producto;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author JulianC
 */
public class jifConsultaNombre extends javax.swing.JInternalFrame {
    
    // Creo modelo de Tabla:
    private DefaultTableModel modelo = new DefaultTableModel();
    
    public boolean IsCellEditable (int f, int c) {
        
        return false;
        
    }
    

    /**
     * Creates new form jifConsultaNombre
     */
    public jifConsultaNombre() {
        initComponents();
        // Inicializo la cabecera:
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlListadoPorNombre = new javax.swing.JLabel();
        jlNombreProducto = new javax.swing.JLabel();
        jtNombreProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablexNombre = new javax.swing.JTable();
        jbCerrar = new javax.swing.JButton();

        jlListadoPorNombre.setText("Listado Por Nombre");

        jlNombreProducto.setText("Nombre del producto:");

        jtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreProductoKeyReleased(evt);
            }
        });

        jTablexNombre.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablexNombre);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jlListadoPorNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlListadoPorNombre)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreProducto)
                    .addComponent(jtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreProductoKeyReleased
        // TODO add your handling code here:
        // Este metodo nos permite leer un techa que ya fue presionada:
        borrarFilas();
        for (Producto prod : deTodosSa.listaProductos) {
            // Agrego las filas a la tabla si el producto empieza con determinada letra.
            if (prod.getDescripcion().toLowerCase().startsWith(jtNombreProducto.getText().toLowerCase())){
                modelo.addRow(new Object[]{prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getStock()});
            }
        }
    }//GEN-LAST:event_jtNombreProductoKeyReleased

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablexNombre;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JLabel jlListadoPorNombre;
    private javax.swing.JLabel jlNombreProducto;
    private javax.swing.JTextField jtNombreProducto;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera (){
        // Set del modelo:
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jTablexNombre.setModel(modelo);
        
    }
    
    // Creo un metodo para borrar filas para que no se superpongan los aticulos:
    private void borrarFilas (){
        // Determinamos las filas de la tabla:
        int f = jTablexNombre.getRowCount()-1;
        for (;f >= 0;f--){
            modelo.removeRow(f);
        }
    }
}
