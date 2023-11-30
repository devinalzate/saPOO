/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.udistrital.view;

import co.edu.udistrital.controller.Controller;
import co.edu.udistrital.controller.ControllerIniciarSesion;
import co.edu.udistrital.controller.ControllerSesionPrincipal;

/**
 *
 * @author jhono
 */
public class SesionPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    
    Controller control;
    ControllerSesionPrincipal sesionPrincipal;
    
    public SesionPrincipal() {
        initComponents();
    }
    
     public SesionPrincipal(Controller control,  ControllerSesionPrincipal sesionPrincipal) {
         
         initComponents();
        this.sesionPrincipal = sesionPrincipal;
        this.control = control;
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonAgregarPareja = new javax.swing.JButton();
        botonDistribuirCupo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botonHorarioCompra = new javax.swing.JButton();
        pedirSobrecupo = new javax.swing.JButton();
        mostrarListaParejas = new javax.swing.JButton();
        botonMostrarDatos = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        comboProductos = new javax.swing.JComboBox<>();
        comboPuntoVenta = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        botonComprar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("     ¡Bienvenido!");

        botonAgregarPareja.setText("Agregar Pareja");
        botonAgregarPareja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarParejaActionPerformed(evt);
            }
        });

        botonDistribuirCupo.setText("Distribuir Cupo de tarjeta");
        botonDistribuirCupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDistribuirCupoActionPerformed(evt);
            }
        });

        jLabel4.setText("Buen día, ¿Qué desea hacer el día de hoy?");

        botonHorarioCompra.setText("Establecer horario de compra");
        botonHorarioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHorarioCompraActionPerformed(evt);
            }
        });

        pedirSobrecupo.setText("Pedir sobrecupo");
        pedirSobrecupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedirSobrecupoActionPerformed(evt);
            }
        });

        mostrarListaParejas.setText("Mostrar Lista de parejas");
        mostrarListaParejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarListaParejasActionPerformed(evt);
            }
        });

        botonMostrarDatos.setText("Mostrar datos");
        botonMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarDatosActionPerformed(evt);
            }
        });

        botonCerrarSesion.setText("Cerrar Sesion");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pedirSobrecupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonDistribuirCupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMostrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAgregarPareja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarListaParejas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonHorarioCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(115, 115, 115))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(botonMostrarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAgregarPareja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarListaParejas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonHorarioCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonDistribuirCupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pedirSobrecupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCerrarSesion)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Menú principal", jPanel4);

        comboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manzana - $100", "Arroz - $500", "Frijoles - $600", "Leche - $400", "Condones - $1000" }));
        comboProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductosActionPerformed(evt);
            }
        });

        comboPuntoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20 de Julio", "Portal 80", "Granja", "Villa de los alpes", "Montebello" }));
        comboPuntoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPuntoVentaActionPerformed(evt);
            }
        });

        jLabel7.setText("Producto:");

        botonComprar.setText("Comprar");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Realiza tus compras");

        jLabel8.setText("Punto de venta:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboPuntoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(botonComprar))
                    .addComponent(jLabel2))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPuntoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addComponent(botonComprar)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Compras", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPuntoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPuntoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPuntoVentaActionPerformed

    private void comboProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProductosActionPerformed

    private void botonMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarDatosActionPerformed

        
        sesionPrincipal.mostrarDatosUsuario();
        
    }//GEN-LAST:event_botonMostrarDatosActionPerformed

    private void mostrarListaParejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarListaParejasActionPerformed
       sesionPrincipal.mostrarListaParejas();
    }//GEN-LAST:event_mostrarListaParejasActionPerformed

    private void botonHorarioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHorarioCompraActionPerformed
       sesionPrincipal.establecerHorarios();
    }//GEN-LAST:event_botonHorarioCompraActionPerformed

    private void botonDistribuirCupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDistribuirCupoActionPerformed
        sesionPrincipal.asignarCupo();
    }//GEN-LAST:event_botonDistribuirCupoActionPerformed

    private void botonAgregarParejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarParejaActionPerformed

        sesionPrincipal.agregarParejas();

    }//GEN-LAST:event_botonAgregarParejaActionPerformed

    private void pedirSobrecupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedirSobrecupoActionPerformed
       
        sesionPrincipal.pedirSobrecupo();
        
    }//GEN-LAST:event_pedirSobrecupoActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
       
        sesionPrincipal.cerrarSesion();
        
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(SesionPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SesionPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SesionPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SesionPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarPareja;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonComprar;
    private javax.swing.JButton botonDistribuirCupo;
    private javax.swing.JButton botonHorarioCompra;
    private javax.swing.JButton botonMostrarDatos;
    private javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JComboBox<String> comboPuntoVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton mostrarListaParejas;
    private javax.swing.JButton pedirSobrecupo;
    // End of variables declaration//GEN-END:variables
}
