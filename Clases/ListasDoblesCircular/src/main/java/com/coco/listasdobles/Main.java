
package com.coco.listasdobles;

import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {

    NodoDobleCircular lista = new NodoDobleCircular();
    
    public Main() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbInputDate = new javax.swing.JButton();
        jbShowList = new javax.swing.JButton();
        jbshowDatosHaciaDelante = new javax.swing.JButton();
        jbDeleteDate = new javax.swing.JButton();
        jbActualizarDatos = new javax.swing.JButton();
        jbActualizarOrden = new javax.swing.JButton();
        jbValidar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Lista doble enlazadas circular");

        jbInputDate.setText("Ingresar Dato");
        jbInputDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInputDateActionPerformed(evt);
            }
        });

        jbShowList.setText("Imprimir lista Hacia atras");
        jbShowList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbShowListActionPerformed(evt);
            }
        });

        jbshowDatosHaciaDelante.setText("Imprimir lista hacia delante");
        jbshowDatosHaciaDelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbshowDatosHaciaDelanteActionPerformed(evt);
            }
        });

        jbDeleteDate.setText("Eliminar un dato");
        jbDeleteDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteDateActionPerformed(evt);
            }
        });

        jbActualizarDatos.setText("Actualizar datos");
        jbActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarDatosActionPerformed(evt);
            }
        });

        jbActualizarOrden.setText("Actualizar orden");
        jbActualizarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarOrdenActionPerformed(evt);
            }
        });

        jbValidar.setText("validar");
        jbValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbValidarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbInputDate, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jbValidar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbActualizarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbshowDatosHaciaDelante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbShowList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbDeleteDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbActualizarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jbInputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbshowDatosHaciaDelante, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbShowList, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbDeleteDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jbValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbActualizarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbActualizarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInputDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInputDateActionPerformed
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato para lista: "));
        lista.inicio(dato);
    }//GEN-LAST:event_jbInputDateActionPerformed

    private void jbShowListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbShowListActionPerformed
        lista.imprimirHaciaDelante();
    }//GEN-LAST:event_jbShowListActionPerformed

    private void jbshowDatosHaciaDelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbshowDatosHaciaDelanteActionPerformed
        lista.imprimirHaciaAtras();
    }//GEN-LAST:event_jbshowDatosHaciaDelanteActionPerformed

    private void jbDeleteDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteDateActionPerformed
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a eliminar: "));
        lista.eliminarDato(dato);
    }//GEN-LAST:event_jbDeleteDateActionPerformed

    private void jbActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarDatosActionPerformed
        lista.actualizarLista();
    }//GEN-LAST:event_jbActualizarDatosActionPerformed

    private void jbActualizarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarOrdenActionPerformed
       lista.ActualizarOrden();
    }//GEN-LAST:event_jbActualizarOrdenActionPerformed

    private void jbValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbValidarActionPerformed

        lista.buscarDato();
    }//GEN-LAST:event_jbValidarActionPerformed


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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbActualizarDatos;
    private javax.swing.JButton jbActualizarOrden;
    private javax.swing.JButton jbDeleteDate;
    private javax.swing.JButton jbInputDate;
    private javax.swing.JButton jbShowList;
    private javax.swing.JButton jbValidar;
    private javax.swing.JButton jbshowDatosHaciaDelante;
    // End of variables declaration//GEN-END:variables
}
