/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    Proyecto proyecto = new Proyecto();

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCrearListaSimple = new javax.swing.JButton();
        jbConsultarListaSimple = new javax.swing.JButton();
        jbCrearListaDoble = new javax.swing.JButton();
        jbConsultarListaDoble = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbShowListDoble = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbCrearListaSimple.setText("Crear lista simple");
        jbCrearListaSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearListaSimpleActionPerformed(evt);
            }
        });

        jbConsultarListaSimple.setText("Consultar lista simple");
        jbConsultarListaSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarListaSimpleActionPerformed(evt);
            }
        });

        jbCrearListaDoble.setText("Crear lista Doble");
        jbCrearListaDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearListaDobleActionPerformed(evt);
            }
        });

        jbConsultarListaDoble.setText("Consultar lista Doble");
        jbConsultarListaDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarListaDobleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("Listas de Número ");

        jbShowListDoble.setText("Mostrar Lista Doble");
        jbShowListDoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbShowListDobleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbCrearListaDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCrearListaSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbConsultarListaDoble)
                            .addComponent(jbConsultarListaSimple)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jbShowListDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrearListaSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultarListaSimple, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCrearListaDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultarListaDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jbShowListDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCrearListaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearListaSimpleActionPerformed
        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un dato"));
        proyecto.crearsimple(dato);

    }//GEN-LAST:event_jbCrearListaSimpleActionPerformed

    private void jbCrearListaDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearListaDobleActionPerformed
        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un dato"));
        proyecto.creardoble(dato);
    }//GEN-LAST:event_jbCrearListaDobleActionPerformed

    private void jbConsultarListaSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarListaSimpleActionPerformed
        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un dato a buscar"));
        proyecto.buscarSimple(dato);
    }//GEN-LAST:event_jbConsultarListaSimpleActionPerformed

    private void jbConsultarListaDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarListaDobleActionPerformed
        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un dato a buscar"));
        proyecto.buscar(dato);

        proyecto.intercambiarDatos(dato);
    }//GEN-LAST:event_jbConsultarListaDobleActionPerformed

    private void jbShowListDobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbShowListDobleActionPerformed
        // Después de realizar modificaciones en la lista doblemente enlazada
        String listaModificada = proyecto.mostrarListaDoble();
        System.out.println("Lista modificada: " + listaModificada);

    }//GEN-LAST:event_jbShowListDobleActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbConsultarListaDoble;
    private javax.swing.JButton jbConsultarListaSimple;
    private javax.swing.JButton jbCrearListaDoble;
    private javax.swing.JButton jbCrearListaSimple;
    private javax.swing.JButton jbShowListDoble;
    // End of variables declaration//GEN-END:variables
}
