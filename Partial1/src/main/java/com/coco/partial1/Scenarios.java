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
    String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

    public Scenarios() {
        llenarMatrizEscenarios();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMatriz = new javax.swing.JButton();
        jbEscenariosMasVisitados = new javax.swing.JButton();
        jlTitle = new javax.swing.JLabel();
        jbDiaMasVisitado = new javax.swing.JButton();
        jbEscenarioMenosVisitado = new javax.swing.JButton();
        jbTotalDePersonas = new javax.swing.JButton();
        jbPromedioDeVisitas = new javax.swing.JButton();
        jbDiaMasVisitadoEstadio = new javax.swing.JButton();

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

        jlTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(153, 102, 255));
        jlTitle.setText("Escenarios Visitados en Ocaña");

        jbDiaMasVisitado.setText("Dia más  y menos visitado");
        jbDiaMasVisitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDiaMasVisitadoActionPerformed(evt);
            }
        });

        jbEscenarioMenosVisitado.setText("Escenario menos visitado");
        jbEscenarioMenosVisitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEscenarioMenosVisitadoActionPerformed(evt);
            }
        });

        jbTotalDePersonas.setText("Total de personas ");
        jbTotalDePersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTotalDePersonasActionPerformed(evt);
            }
        });

        jbPromedioDeVisitas.setText("Promedio de visitas");
        jbPromedioDeVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPromedioDeVisitasActionPerformed(evt);
            }
        });

        jbDiaMasVisitadoEstadio.setText("Dia más visitado el estadio");
        jbDiaMasVisitadoEstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDiaMasVisitadoEstadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jlTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbEscenarioMenosVisitado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbTotalDePersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbPromedioDeVisitas, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbDiaMasVisitado, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbDiaMasVisitadoEstadio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbEscenariosMasVisitados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                                .addGap(115, 115, 115)
                                .addComponent(jbMatriz)))))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jbEscenariosMasVisitados)))
                .addGap(12, 12, 12)
                .addComponent(jbDiaMasVisitadoEstadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbEscenarioMenosVisitado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbTotalDePersonas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbPromedioDeVisitas)
                .addGap(18, 18, 18)
                .addComponent(jbDiaMasVisitado)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMatrizActionPerformed
        mostrarMatriz(datos);
    }//GEN-LAST:event_jbMatrizActionPerformed

    private void jbEscenariosMasVisitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEscenariosMasVisitadosActionPerformed

        int filaMasVisitada = 0;
        int maxVisitas = 0;

        for (int i = 0; i < datos.size(); i++) {
            List<Integer> fila = datos.get(i); // obtiene una fila la primera Va ha ir comparando

            int totalDeVisitas = 0;

            for (int visitas : fila) {
                totalDeVisitas += visitas;
            }

            if (totalDeVisitas > maxVisitas) {
                maxVisitas = totalDeVisitas;
                filaMasVisitada = i;
            }

        }

        String escenarioMasVisitado = nombresEscenarios[filaMasVisitada];

        JOptionPane.showMessageDialog(null, "El escenario más visitado durante la semana es " + escenarioMasVisitado);


    }//GEN-LAST:event_jbEscenariosMasVisitadosActionPerformed

    private void jbDiaMasVisitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDiaMasVisitadoActionPerformed

        int diaMasVisitado = 0;
        int maxVisitas = 0;
        int diaMenosVisitado =0;
        int minVisitas =Integer.MAX_VALUE;
        
        
        for (int dia = 0; dia < 7; dia++) {

            int totalVisitasDia = 0;
            for (List<Integer> fila : datos) {
                totalVisitasDia += fila.get(dia);
            }
            
            if(totalVisitasDia<minVisitas){
                minVisitas = totalVisitasDia;
                diaMenosVisitado = dia;
            }
            
            

            if (totalVisitasDia > maxVisitas) {
                maxVisitas = totalVisitasDia;

                diaMasVisitado = dia;
            }

        }

        JOptionPane.showMessageDialog(null, "El dia más visitado es el dia " + diasSemana[diaMasVisitado]);
        
        JOptionPane.showMessageDialog(null, "El dia menos visitado es el dia " + diasSemana[diaMenosVisitado]);


    }//GEN-LAST:event_jbDiaMasVisitadoActionPerformed

    private void jbEscenarioMenosVisitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEscenarioMenosVisitadoActionPerformed

        int escenarioMenosVisitado = 0;
        int minVisitado = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {

            List<Integer> escenario = datos.get(i);
            int totalDeVisitas = 0;

            for (int visitas : escenario) {
                totalDeVisitas += visitas;
            }

            if (totalDeVisitas < minVisitado) {
                minVisitado = totalDeVisitas;

                escenarioMenosVisitado = i;
            }

        }

        JOptionPane.showMessageDialog(null, "El escenario menos visitado es " + nombresEscenarios[escenarioMenosVisitado]);


    }//GEN-LAST:event_jbEscenarioMenosVisitadoActionPerformed

    private void jbTotalDePersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTotalDePersonasActionPerformed

        JOptionPane.showMessageDialog(null, "El Total, de personas que visitan todos los escenarios durante la semana es de " + contarTotalPersonas());

    }//GEN-LAST:event_jbTotalDePersonasActionPerformed

    private void jbPromedioDeVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPromedioDeVisitasActionPerformed

        double promedio = contarTotalPersonas() / 7;

        JOptionPane.showMessageDialog(null, "El promedio de visitas a las semana es de "+promedio+" personas");
    }//GEN-LAST:event_jbPromedioDeVisitasActionPerformed

    private void jbDiaMasVisitadoEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDiaMasVisitadoEstadioActionPerformed
        
        int diaMasVisitado =0;
        int maxVisitas =0;
        
        
        for (int i = 0; i < 7; i++) {
            
            int visitantesDia = datos.get(2).get(i);
            
            if(visitantesDia>maxVisitas){
                maxVisitas = visitantesDia;
                diaMasVisitado = i;
            }
            
            
        }
        
        
        JOptionPane.showMessageDialog(null, "El dia más visitado en el estadio es el dia "+diasSemana[diaMasVisitado]);
        
        
    }//GEN-LAST:event_jbDiaMasVisitadoEstadioActionPerformed

    public int contarTotalPersonas() {
        int totalDePersonas = 0;

        for (List<Integer> personas : datos) { // Recorre cada fila es decir para cada Escenario
            for (int person : personas) {
                totalDePersonas += person;
            }
        }

        return totalDePersonas;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scenarios().setVisible(true);
            }
        });

    }

    public void llenarMatrizEscenarios() {

        // Agregar los datos a la matriz utilizando bucles for
        int[][] valores = {
            {40, 78, 34, 23, 45, 23, 34}, // Mini pista patinaje
            {23, 45, 67, 45, 46, 34, 56}, // Piscina olímpica
            {54, 23, 43, 12, 23, 56, 66}, // Estadio
            {54, 26, 48, 19, 21, 23, 56} // Parque infantil
        };

        for (int i = 0; i < 4; i++) {
            List<Integer> fila = new ArrayList<>();

            for (int j = 0; j < 7; j++) {
                fila.add(valores[i][j]);
            }

            datos.add(fila);
        }

    }

    public void mostrarMatriz(List<List<Integer>> datos) {

        for (List<Integer> fila : datos) {
            for (Integer valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbDiaMasVisitado;
    private javax.swing.JButton jbDiaMasVisitadoEstadio;
    private javax.swing.JButton jbEscenarioMenosVisitado;
    private javax.swing.JButton jbEscenariosMasVisitados;
    private javax.swing.JButton jbMatriz;
    private javax.swing.JButton jbPromedioDeVisitas;
    private javax.swing.JButton jbTotalDePersonas;
    private javax.swing.JLabel jlTitle;
    // End of variables declaration//GEN-END:variables
}
