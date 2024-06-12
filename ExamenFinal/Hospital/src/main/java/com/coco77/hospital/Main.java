
package com.coco77.hospital;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    private static List<Usuario> usuario = new ArrayList<>();
    
    
    public Main() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Sistema de Turnos Hospital de Ocaña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        //Ajustar la ruta del archivo txt
        
        String rutaArchivo = "C:\\Users\\andre\\OneDrive\\Documents\\NetBeansProjects\\Hospital\\src\\main\\java\\com\\coco77\\hospital\\usuarios.txt"; 

        cargarDatosDesdeArchivo(rutaArchivo);
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    
    private static void cargarDatosDesdeArchivo(String nombreArchivo){
            File archivo = new File(nombreArchivo);
            
            if(!archivo.exists()){
                JOptionPane.showMessageDialog(null, "El archivo "+" no existe. ");
                return;
            }
            
            try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
                String linea;
                
                while((linea = br.readLine())!= null){
                    String[] datos = linea.split(",");
                    Usuario usuario = new Usuario(
                    
                    
                    )
                }
                
            }catch(IOException e){
                e.getMessage();
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
