
package ventasdao.ui.abm;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import ventasdao.controladores.TipoClienteControlador;
import ventasdao.objetos.TipoCliente;
import ventasdao.ui.grilla.GrillaTipoCliente;


public class AbmTipoCliente extends javax.swing.JInternalFrame {
    
    private TipoCliente tipoCliente;
    private GrillaTipoCliente grillaTipoCliente;
    private TipoClienteControlador controladorTipoCliente;

    public AbmTipoCliente() {
        initComponents();
        
        ArrayList<TipoCliente> tipoClientes = new ArrayList<>();
        controladorTipoCliente = new TipoClienteControlador();
        
     try {
            tipoClientes = (ArrayList<TipoCliente>) controladorTipoCliente.listar();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        grillaTipoCliente = new GrillaTipoCliente (tipoClientes);
        jtListadoTipoCliente.setModel(grillaTipoCliente);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfDescripcion = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListadoTipoCliente = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripcion");

        jtfId.setEditable(false);

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jtListadoTipoCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtListadoTipoCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfId, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(jtfNombre)
                                    .addComponent(jtfDescripcion))))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAgregar)
                            .addComponent(jbModificar)
                            .addComponent(jbEliminar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:
        tipoCliente = new TipoCliente ();
        tipoCliente.setNombre(jtfNombre.getText());
        tipoCliente.setDescripcion(jtfDescripcion.getText());
        
        try {
            controladorTipoCliente.crear(tipoCliente);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(AbmTipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try {
            jtListadoTipoCliente.setModel(new GrillaTipoCliente((ArrayList<TipoCliente>) controladorTipoCliente.listar()));
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(AbmTipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        tipoCliente = new TipoCliente();
        tipoCliente.setNombre(jtfNombre.getText());
        tipoCliente.setDescripcion(jtfDescripcion.getText());
        tipoCliente.setId(Integer.parseInt(jtfId.getText()));
        
        try {
            controladorTipoCliente.crear(tipoCliente);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(AbmTipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            jtListadoTipoCliente.setModel(new GrillaTipoCliente((ArrayList<TipoCliente>) controladorTipoCliente.listar()));
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(AbmTipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        tipoCliente = new TipoCliente();
        tipoCliente.setId(Integer.parseInt(jtfId.getText()));
        
        try {
            controladorTipoCliente.eliminar(tipoCliente);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(AbmTipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            jtListadoTipoCliente.setModel(new GrillaTipoCliente((ArrayList<TipoCliente>) controladorTipoCliente.listar()));
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(AbmTipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JTable jtListadoTipoCliente;
    private javax.swing.JTextField jtfDescripcion;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
