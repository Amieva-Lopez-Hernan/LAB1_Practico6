package Vistas;


import Entidades.Categoria;
import Entidades.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.util.TreeSet;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author JulianC
 */
public class deTodosSa extends javax.swing.JFrame {
    //Creamos un TreeSet para guardar productos:
    public static TreeSet<Producto> listaProductos = new TreeSet<>();

    /**
     * Creates new form deTodosSa
     */
    public deTodosSa() {
        initComponents();
        setLocationRelativeTo(null);
        cargarProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon (getClass().getResource("/Imagenes/desktop.jpg"));
        Image miImagen = icono.getImage();
        Escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jmMenu = new javax.swing.JMenuBar();
        jmAdministración = new javax.swing.JMenu();
        jmItemProductos = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmItemRubro = new javax.swing.JMenuItem();
        jmItemNombre = new javax.swing.JMenuItem();
        jmItemPrecio = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        jmItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        jmAdministración.setText("Administración");
        jmAdministración.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAdministraciónActionPerformed(evt);
            }
        });

        jmItemProductos.setText("Productos");
        jmItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemProductosActionPerformed(evt);
            }
        });
        jmAdministración.add(jmItemProductos);

        jmMenu.add(jmAdministración);

        jmConsultas.setText("Consultas");
        jmConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultasActionPerformed(evt);
            }
        });

        jmItemRubro.setText("Buscar por Rubro");
        jmItemRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemRubroActionPerformed(evt);
            }
        });
        jmConsultas.add(jmItemRubro);

        jmItemNombre.setText("Buscar por Nombre");
        jmItemNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemNombreActionPerformed(evt);
            }
        });
        jmConsultas.add(jmItemNombre);

        jmItemPrecio.setText("Buscar por Precio");
        jmItemPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemPrecioActionPerformed(evt);
            }
        });
        jmConsultas.add(jmItemPrecio);

        jmMenu.add(jmConsultas);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });

        jmItemSalir.setText("Salir");
        jmItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemSalirActionPerformed(evt);
            }
        });
        jmSalir.add(jmItemSalir);

        jmMenu.add(jmSalir);

        setJMenuBar(jmMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemProductosActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        jifProductos jifProduct = new jifProductos();
        jifProduct.setVisible(true);
        Escritorio.add(jifProduct);
        Escritorio.moveToFront(jifProduct);
    }//GEN-LAST:event_jmItemProductosActionPerformed

    private void jmConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jmConsultasActionPerformed

    private void jmItemNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemNombreActionPerformed
        // TODO add your handling code here:
        // Limpiamos todas las ventanas del escritorio:
        Escritorio.removeAll();
        Escritorio.repaint();
        // Creamos el internalframe:
        jifConsultaNombre jifbpn = new jifConsultaNombre();
        jifbpn.setVisible(true);
        // Agreamos el internalframe al escritorio:
        Escritorio.add(jifbpn);
        // Lo llamamos al frente:
        Escritorio.moveToFront(jifbpn);
    }//GEN-LAST:event_jmItemNombreActionPerformed

    private void jmAdministraciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAdministraciónActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jmAdministraciónActionPerformed

    private void jmItemRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemRubroActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        jifConsultaRubro consRubro= new jifConsultaRubro();
        consRubro.setVisible(true);
        Escritorio.add(consRubro);
        Escritorio.moveToFront(consRubro);
    }//GEN-LAST:event_jmItemRubroActionPerformed

    private void jmItemPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemPrecioActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        jifConsultaPrecio consPrecio=new jifConsultaPrecio();
        consPrecio.setVisible(rootPaneCheckingEnabled);
        Escritorio.add(consPrecio);
        Escritorio.moveToFront(consPrecio);
    }//GEN-LAST:event_jmItemPrecioActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jmItemSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(deTodosSa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deTodosSa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deTodosSa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deTodosSa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deTodosSa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jmAdministración;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuItem jmItemNombre;
    private javax.swing.JMenuItem jmItemPrecio;
    private javax.swing.JMenuItem jmItemProductos;
    private javax.swing.JMenuItem jmItemRubro;
    private javax.swing.JMenuItem jmItemSalir;
    private javax.swing.JMenuBar jmMenu;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
    
    public void cargarProductos (){
        
        listaProductos.add(new Producto (101, "Azucar x 1Kg.", 850, 10, Categoria.COMESTIBLES));
        listaProductos.add(new Producto (102, "Cafe x 1Kg.", 6850, 12, Categoria.COMESTIBLES));
        listaProductos.add(new Producto (103, "Leche x 1L.", 1450, 22, Categoria.COMESTIBLES));
        listaProductos.add(new Producto (104, "Champú x 1L.", 1850, 14, Categoria.PERFUMERIA));
        listaProductos.add(new Producto (105, "Arroz x 1Kg.", 2850, 33, Categoria.COMESTIBLES));
        listaProductos.add(new Producto (106, "Lavandina x 1l.", 750, 12, Categoria.LIMPIEZA));
        listaProductos.add(new Producto (107, "Perfume x 150Cc.", 5000, 12, Categoria.PERFUMERIA));
        listaProductos.add(new Producto (102, "Pan x 1Kg.", 1300, 12, Categoria.COMESTIBLES));
        listaProductos.add(new Producto (102, "Trapo de piso x 1U", 600, 12, Categoria.LIMPIEZA));
        listaProductos.add(new Producto (102, "Mopa x 1U", 2600, 18, Categoria.LIMPIEZA));
        listaProductos.add(new Producto (102, "Agua x 1L", 700, 33, Categoria.COMESTIBLES)); 
    }
}
