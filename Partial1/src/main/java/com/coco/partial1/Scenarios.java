
package com.coco.partial1;

import java.util.List;
import java.util.ArrayList;

public final class Scenarios extends javax.swing.JFrame {

    /**
     * Creates new form Scenarios
     */


    List<List<Integer>> datos = new ArrayList<>();
    
    
    
    
    
    public Scenarios() {
        llenarMatrizEscenarios();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMatriz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbMatriz.setText("Matriz");
        jbMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMatrizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jbMatriz)
                .addContainerGap(561, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jbMatriz)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMatrizActionPerformed
        mostrarMatriz(datos);
    }//GEN-LAST:event_jbMatrizActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scenarios().setVisible(true);
            }
        });
        
          
    }

    public void llenarMatrizEscenarios(){
        
        // Agregar los datos a la matriz utilizando bucles for
        int[][] valores = {
            {40, 78, 34, 23, 45, 23, 34},   // Mini pista patinaje
            {23, 45, 67, 45, 46, 34, 56},   // Piscina olímpica
            {54, 23, 43, 12, 23, 56, 66},   // Estadio
            {54, 26, 48, 19, 21, 23, 56}    // Parque infantil
        };
        
        for (int i = 0; i < 4; i++) {
            List<Integer> fila = new ArrayList<>();
            
            for (int j = 0; j < 7; j++) {
                fila.add(valores[i][j]);
            }
            
            datos.add(fila);
        }
        
   
        
    }
    
    
    
    public void mostrarMatriz(List<List<Integer>> datos){
        

        for (List<Integer> fila : datos) {
            for (Integer valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println(); 
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbMatriz;
    // End of variables declaration//GEN-END:variables
}
