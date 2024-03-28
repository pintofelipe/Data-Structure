
package com.coco.partial1;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class Scenarios extends javax.swing.JFrame {

    /**
     * Creates new form Scenarios
     */


    List<List<Integer>> datos = new ArrayList<>();
    String[] nombresEscenarios = {"Mini pista patinaje", "Piscina olímpica", "Estadio", "Parque infantil"};
    
    
    
    
    public Scenarios() {
        llenarMatrizEscenarios();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMatriz = new javax.swing.JButton();
        jbEscenariosMasVisitados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbMatriz.setText("Matriz");
        jbMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMatrizActionPerformed(evt);
            }
        });

        jbEscenariosMasVisitados.setText("Escenario más visitado");
        jbEscenariosMasVisitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEscenariosMasVisitadosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setText("Escenarios Visitados en Ocaña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jbEscenariosMasVisitados, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jbMatriz)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jbEscenariosMasVisitados)))
                .addContainerGap(371, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMatrizActionPerformed
        mostrarMatriz(datos);
    }//GEN-LAST:event_jbMatrizActionPerformed

    private void jbEscenariosMasVisitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEscenariosMasVisitadosActionPerformed
        
        int filaMasVisitada =0;
        int maxVisitas =0;
        
        for(int i=0; i<datos.size();i++){
            List<Integer> fila = datos.get(i); // obtiene una fila la primera Va ha ir comparando
            
            
            int totalDeVisitas = 0;
            
            for (int visitas: fila) {
                totalDeVisitas+=visitas;
            }
            
            
            
            if(totalDeVisitas>maxVisitas){
                maxVisitas = totalDeVisitas;
                filaMasVisitada = i;
            }
            
        }
        
 
        String escenarioMasVisitado = nombresEscenarios[filaMasVisitada];
        
        JOptionPane.showMessageDialog(null, "El escenario más visitado durante la semana es "+escenarioMasVisitado);
        
        
    }//GEN-LAST:event_jbEscenariosMasVisitadosActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbEscenariosMasVisitados;
    private javax.swing.JButton jbMatriz;
    // End of variables declaration//GEN-END:variables
}
