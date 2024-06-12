
package com.coco77.hospital;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {
     private static List<Usuario> usuarios = new ArrayList<>();
     DefaultTableModel modelo;
     private static LinkedList<Usuario> colaPreferencial = new LinkedList<>();
    private static LinkedList<Usuario> colaNoPreferencial = new LinkedList<>();
     
    
    public Main() {
        initComponents();
        modelo = new DefaultTableModel();
    }

    public void listar(){
        modelo = (DefaultTableModel) jtListaPersonas.getModel();
        Object[] ob = new Object[7];
        
        for (int i = 0; i < usuarios.size(); i++) {
            ob[0] = usuarios.get(i).getDocumento();
            ob[1] = usuarios.get(i).getTipoCliente();
            ob[2] = usuarios.get(i).getNombre();
            ob[3] = usuarios.get(i).getCorreo();
            ob[4] = usuarios.get(i).getTelefono();
            ob[5] = usuarios.get(i).getEdad();
            ob[6] = usuarios.get(i).getEstrato();
            
            modelo.addRow(ob);
        }
        
        jtListaPersonas.setModel(modelo);
    }
    
    //Limpiar Tabla
    public void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i-1;
        }
    }
    
        private void solicitarTurno() {
        String documento = JOptionPane.showInputDialog(this, "Ingrese el documento:");
        if (documento != null && !documento.trim().isEmpty()) {
            boolean encontrado = false;
            for (Usuario usuario : usuarios) {
                if (usuario.getDocumento().equals(documento)) {
                    colaPreferencial.add(usuario);
                    encontrado = true;
                    JOptionPane.showMessageDialog(this, "Turno asignado en la cola preferencial.");
                    break;
                }
            }
            if (!encontrado) {
                Usuario nuevoUsuario = new Usuario(documento, "No registrado", "Desconocido", "Desconocido", "Desconocido", 0, 0);
                colaNoPreferencial.add(nuevoUsuario);
                JOptionPane.showMessageDialog(this, "Usuario no registrado. Turno asignado en la cola no preferencial.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Documento inválido.");
        }
    }
    
    
    private void mostrarColas() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cola Preferencial:\n");
        for (Usuario usuario : colaPreferencial) {
            sb.append(usuario.getNombre()).append(" (").append(usuario.getDocumento()).append(")\n");
        }

        sb.append("\nCola No Preferencial:\n");
        for (Usuario usuario : colaNoPreferencial) {
            sb.append(usuario.getNombre()).append(" (").append(usuario.getDocumento()).append(")\n");
        }

        JOptionPane.showMessageDialog(this, sb.toString());
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaPersonas = new javax.swing.JTable();
        jbConsultarTurnos = new javax.swing.JButton();
        jbConsultarTurnos1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbConsultarTurnos2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Base de datos hospital de Ocaña");

        jtListaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Tipo Cliente", "Nombre", "correo", "telefono", "edad", "estracto"
            }
        ));
        jScrollPane1.setViewportView(jtListaPersonas);

        jbConsultarTurnos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbConsultarTurnos.setForeground(new java.awt.Color(102, 102, 255));
        jbConsultarTurnos.setText("Consultar Datos");
        jbConsultarTurnos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        jbConsultarTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarTurnosActionPerformed(evt);
            }
        });

        jbConsultarTurnos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbConsultarTurnos1.setForeground(new java.awt.Color(102, 102, 255));
        jbConsultarTurnos1.setText("Solicitar Turno");
        jbConsultarTurnos1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        jbConsultarTurnos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarTurnos1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Solicitud de Turnos");

        jbConsultarTurnos2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbConsultarTurnos2.setForeground(new java.awt.Color(102, 102, 255));
        jbConsultarTurnos2.setText("Consultar Colas");
        jbConsultarTurnos2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        jbConsultarTurnos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarTurnos2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jbConsultarTurnos1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jbConsultarTurnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jbConsultarTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jbConsultarTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbConsultarTurnos1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbConsultarTurnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConsultarTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarTurnosActionPerformed
        limpiarTabla();
        listar();
    }//GEN-LAST:event_jbConsultarTurnosActionPerformed

    private void jbConsultarTurnos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarTurnos1ActionPerformed
        solicitarTurno();
        limpiarTabla();
        listar();
    }//GEN-LAST:event_jbConsultarTurnos1ActionPerformed

    private void jbConsultarTurnos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarTurnos2ActionPerformed
        mostrarColas();
    }//GEN-LAST:event_jbConsultarTurnos2ActionPerformed

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
                    datos[0], // Documento
                    datos[1], // Tipo de cliente
                    datos[2], // Nombre
                    datos[3], // Correo
                    datos[4], // Telefono
                    Integer.parseInt(datos[5]), // Edad
                    Integer.parseInt(datos[6]) // Estrato
                    );
                usuarios.add(usuario);
                }
                
            }catch(IOException e){
                e.getMessage();
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConsultarTurnos;
    private javax.swing.JButton jbConsultarTurnos1;
    private javax.swing.JButton jbConsultarTurnos2;
    private javax.swing.JTable jtListaPersonas;
    // End of variables declaration//GEN-END:variables
}
