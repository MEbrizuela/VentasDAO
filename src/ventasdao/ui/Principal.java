
package ventasdao.ui;

import ventasdao.ui.abm.AbmCategoria;
import ventasdao.ui.abm.AbmCliente;
import ventasdao.ui.abm.AbmProducto;
import ventasdao.ui.abm.AbmTipoCliente;


public class Principal extends javax.swing.JFrame {

   
    public Principal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpContenedorPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiCategoria = new javax.swing.JMenuItem();
        jmiCliente = new javax.swing.JMenuItem();
        jmiProducto = new javax.swing.JMenuItem();
        jmiTipoCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpContenedorPrincipalLayout = new javax.swing.GroupLayout(jdpContenedorPrincipal);
        jdpContenedorPrincipal.setLayout(jdpContenedorPrincipalLayout);
        jdpContenedorPrincipalLayout.setHorizontalGroup(
            jdpContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jdpContenedorPrincipalLayout.setVerticalGroup(
            jdpContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jmiCategoria.setText("Categoria");
        jmiCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCategoriaActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCategoria);

        jmiCliente.setText("Cliente");
        jmiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCliente);

        jmiProducto.setText("Producto");
        jmiProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiProducto);

        jmiTipoCliente.setText("Tipo Cliente");
        jmiTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTipoClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jmiTipoCliente);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpContenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpContenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCategoriaActionPerformed
        // TODO add your handling code here:
        
        AbmCategoria abmCategoria = new AbmCategoria();
        jdpContenedorPrincipal.add(abmCategoria);
        abmCategoria.setVisible(true);
    }//GEN-LAST:event_jmiCategoriaActionPerformed

    private void jmiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClienteActionPerformed
        // TODO add your handling code here:
        AbmCliente abmCliente = new AbmCliente();
        jdpContenedorPrincipal.add(abmCliente);
        abmCliente.setVisible(true);
        
        
    }//GEN-LAST:event_jmiClienteActionPerformed

    private void jmiProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductoActionPerformed
        // TODO add your handling code here:
        AbmProducto abmProducto = new AbmProducto();
        jdpContenedorPrincipal.add(abmProducto);
        abmProducto.setVisible(true);
    }//GEN-LAST:event_jmiProductoActionPerformed

    private void jmiTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTipoClienteActionPerformed
        // TODO add your handling code here:
        AbmTipoCliente abmTipoCliente = new AbmTipoCliente();
        jdpContenedorPrincipal.add(abmTipoCliente);
        abmTipoCliente.setVisible(true);
    }//GEN-LAST:event_jmiTipoClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpContenedorPrincipal;
    private javax.swing.JMenuItem jmiCategoria;
    private javax.swing.JMenuItem jmiCliente;
    private javax.swing.JMenuItem jmiProducto;
    private javax.swing.JMenuItem jmiTipoCliente;
    // End of variables declaration//GEN-END:variables
}
