
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbDeleteDate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jbInputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbShowList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbshowDatosHaciaDelante, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbInputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbshowDatosHaciaDelante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbShowList)))
                .addGap(18, 18, 18)
                .addComponent(jbDeleteDate)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInputDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInputDateActionPerformed
        String dato = JOptionPane.showInputDialog("Ingrese un dato para lista: ");
        lista.inicio(dato);
    }//GEN-LAST:event_jbInputDateActionPerformed

    private void jbShowListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbShowListActionPerformed
        lista.imprimirHaciaDelante();
    }//GEN-LAST:event_jbShowListActionPerformed

    private void jbshowDatosHaciaDelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbshowDatosHaciaDelanteActionPerformed
        lista.imprimirHaciaAtras();
    }//GEN-LAST:event_jbshowDatosHaciaDelanteActionPerformed

    private void jbDeleteDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteDateActionPerformed
        String dato = JOptionPane.showInputDialog("Ingrese el dato a eliminar: ");
        lista.eliminarDato(dato);
    }//GEN-LAST:event_jbDeleteDateActionPerformed


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
    private javax.swing.JButton jbDeleteDate;
    private javax.swing.JButton jbInputDate;
    private javax.swing.JButton jbShowList;
    private javax.swing.JButton jbshowDatosHaciaDelante;
    // End of variables declaration//GEN-END:variables
}
