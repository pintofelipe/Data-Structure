
package com.coco.binarioarbol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pinto 77
 */
public class Arbol extends javax.swing.JFrame {

    BinaryTree tree = new BinaryTree();

    public Arbol() {
        initComponents();
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbInputDates = new javax.swing.JButton();
        jbShowInorder = new javax.swing.JButton();
        jbShowPostOrden = new javax.swing.JButton();
        jbShowLegalToMinior = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Árbol binario");

        jbInputDates.setText("Ingresar datos al arreglo");
        jbInputDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInputDatesActionPerformed(evt);
            }
        });

        jbShowInorder.setText("Imprimir inorder");
        jbShowInorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbShowInorderActionPerformed(evt);
            }
        });

        jbShowPostOrden.setText("Imprimir postOrden");
        jbShowPostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbShowPostOrdenActionPerformed(evt);
            }
        });

        jbShowLegalToMinior.setText("Imprimir de mayor a menor");
        jbShowLegalToMinior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbShowLegalToMiniorActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jbShowInorder)
                        .addGap(18, 18, 18)
                        .addComponent(jbShowPostOrden))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jbShowLegalToMinior, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jbInputDates))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbInputDates)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbShowPostOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbShowInorder, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbShowLegalToMinior, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInputDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInputDatesActionPerformed
     
       String[] names = new String[]{"maria", "juan", "esteban", "angelica", "edwin", "pedro", "carlos", "juan", "yofi", "rosa"};
        for (String name : names) {
            tree.insert(name);
        }
        textArea.setText("Datos insertados en el árbol.\n");
        
    }//GEN-LAST:event_jbInputDatesActionPerformed

    private void jbShowInorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbShowInorderActionPerformed
        tree.inorder();
        textArea.append("Inorder: " + tree.getTraversalResult() + "\n");

    }//GEN-LAST:event_jbShowInorderActionPerformed

    private void jbShowPostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbShowPostOrdenActionPerformed
        tree.postorder();
        textArea.append("Postorder: " + tree.getTraversalResult() + "\n");
    }//GEN-LAST:event_jbShowPostOrdenActionPerformed

    private void jbShowLegalToMiniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbShowLegalToMiniorActionPerformed
          List<String> sortedList = new ArrayList<>();
        tree.reverseInorder(sortedList);
        //textArea.append("Array alfabéticamente de mayor a menor: " + sortedList + "\n");
        
        textArea.append("Array ordenado alfabéticamente de mayor a menor: " + String.join(" ", sortedList) + "\n");
    
        
    }//GEN-LAST:event_jbShowLegalToMiniorActionPerformed

   
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
            java.util.logging.Logger.getLogger(Arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arbol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbInputDates;
    private javax.swing.JButton jbShowInorder;
    private javax.swing.JButton jbShowLegalToMinior;
    private javax.swing.JButton jbShowPostOrden;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
