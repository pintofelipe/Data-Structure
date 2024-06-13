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
    private static ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

    public Main() {
        initComponents();
        modelo = new DefaultTableModel();
    }

    public void listar() {
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
    public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
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

    
     private void imprimirArbol() {
        System.out.println("Árbol binario ordenado por edad (de mayor a menor):");
        abb.imprimirArbolDescendente();
    }
     
    private void mostrarTurnoActualYProximo() {
        StringBuilder sb = new StringBuilder();

        sb.append("Cola Preferencial:\n");
        if (!colaPreferencial.isEmpty()) {
            sb.append("Atendiendo ahora: ").append(colaPreferencial.getFirst().getNombre()).append(" (").append(colaPreferencial.getFirst().getDocumento()).append(")\n");
            if (colaPreferencial.size() > 1) {
                sb.append("Próximo turno: ").append(colaPreferencial.get(1).getNombre()).append(" (").append(colaPreferencial.get(1).getDocumento()).append(")\n");
            } else {
                sb.append("No hay más turnos en la cola preferencial.\n");
            }
        } else {
            sb.append("No hay turnos en la cola preferencial.\n");
        }

        sb.append("\nCola No Preferencial:\n");
        if (!colaNoPreferencial.isEmpty()) {
            sb.append("Atendiendo ahora: ").append(colaNoPreferencial.getFirst().getNombre()).append(" (").append(colaNoPreferencial.getFirst().getDocumento()).append(")\n");
            if (colaNoPreferencial.size() > 1) {
                sb.append("Próximo turno: ").append(colaNoPreferencial.get(1).getNombre()).append(" (").append(colaNoPreferencial.get(1).getDocumento()).append(")\n");
            } else {
                sb.append("No hay más turnos en la cola no preferencial.\n");
            }
        } else {
            sb.append("No hay turnos en la cola no preferencial.\n");
        }

        JOptionPane.showMessageDialog(this, sb.toString());
    }

    private void consultarPosicionEnCola() {
        String documento = JOptionPane.showInputDialog(this, "Ingrese el documento:");
        if (documento != null && !documento.trim().isEmpty()) {
            int posPreferencial = -1;
            int posNoPreferencial = -1;
            for (int i = 0; i < colaPreferencial.size(); i++) {
                if (colaPreferencial.get(i).getDocumento().equals(documento)) {
                    posPreferencial = i;
                    break;
                }
            }
            for (int i = 0; i < colaNoPreferencial.size(); i++) {
                if (colaNoPreferencial.get(i).getDocumento().equals(documento)) {
                    posNoPreferencial = i;
                    break;
                }
            }

            if (posPreferencial != -1) {
                JOptionPane.showMessageDialog(this, "El usuario está a " + (posPreferencial + 1) + " turnos de ser atendido en la cola preferencial.");
            } else if (posNoPreferencial != -1) {
                JOptionPane.showMessageDialog(this, "El usuario está a " + (posNoPreferencial + 1) + " turnos de ser atendido en la cola no preferencial.");
            } else {
                JOptionPane.showMessageDialog(this, "El usuario no está en ninguna cola.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Documento inválido.");
        }
    }

    private void atenderUsuario() {
        if (!colaPreferencial.isEmpty()) {
            Usuario atendido = colaPreferencial.poll();
            JOptionPane.showMessageDialog(this, "Atendiendo a: " + atendido.getNombre() + " (Preferencial)");
        } else if (!colaNoPreferencial.isEmpty()) {
            Usuario atendido = colaNoPreferencial.poll();
            JOptionPane.showMessageDialog(this, "Atendiendo a: " + atendido.getNombre() + " (No Preferencial)");
        } else {
            JOptionPane.showMessageDialog(this, "No hay usuarios en las colas.");
        }
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
        jbMostrarTurnos = new javax.swing.JButton();
        jbConsultarPosicion = new javax.swing.JButton();
        jbAtenderUsuario = new javax.swing.JButton();
        jbArbolBinario = new javax.swing.JButton();

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

        jbMostrarTurnos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbMostrarTurnos.setForeground(new java.awt.Color(102, 102, 255));
        jbMostrarTurnos.setText("Mostrar Turnos");
        jbMostrarTurnos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        jbMostrarTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarTurnosActionPerformed(evt);
            }
        });

        jbConsultarPosicion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbConsultarPosicion.setForeground(new java.awt.Color(102, 102, 255));
        jbConsultarPosicion.setText("Consultar Posicion");
        jbConsultarPosicion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        jbConsultarPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarPosicionActionPerformed(evt);
            }
        });

        jbAtenderUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbAtenderUsuario.setForeground(new java.awt.Color(102, 102, 255));
        jbAtenderUsuario.setText("Atender Usuario");
        jbAtenderUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        jbAtenderUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtenderUsuarioActionPerformed(evt);
            }
        });

        jbArbolBinario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbArbolBinario.setForeground(new java.awt.Color(102, 102, 255));
        jbArbolBinario.setText("Arbol Binario");
        jbArbolBinario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        jbArbolBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArbolBinarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jbConsultarTurnos1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jbConsultarTurnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbAtenderUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbMostrarTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbConsultarPosicion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbArbolBinario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(jbConsultarTurnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbMostrarTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbConsultarPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAtenderUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbArbolBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void jbMostrarTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarTurnosActionPerformed
        mostrarTurnoActualYProximo();
    }//GEN-LAST:event_jbMostrarTurnosActionPerformed

    private void jbConsultarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarPosicionActionPerformed
        consultarPosicionEnCola();
    }//GEN-LAST:event_jbConsultarPosicionActionPerformed

    private void jbAtenderUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtenderUsuarioActionPerformed
        atenderUsuario();
        limpiarTabla();
        listar();
    }//GEN-LAST:event_jbAtenderUsuarioActionPerformed

    private void jbArbolBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArbolBinarioActionPerformed
        imprimirArbol();
    }//GEN-LAST:event_jbArbolBinarioActionPerformed

    public static void main(String args[]) {
        //Ajustar la ruta del archivo txt

        String rutaArchivo = "C:\\Users\\57312\\Downloads\\Data-Structure\\ExamenFinal\\Hospital\\target\\classes\\com\\coco77\\hospital\\usuarios.txt";

        cargarDatosDesdeArchivo(rutaArchivo);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private static void cargarDatosDesdeArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo " + " no existe. ");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
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
                abb.insertar(usuario);
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbArbolBinario;
    private javax.swing.JButton jbAtenderUsuario;
    private javax.swing.JButton jbConsultarPosicion;
    private javax.swing.JButton jbConsultarTurnos;
    private javax.swing.JButton jbConsultarTurnos1;
    private javax.swing.JButton jbConsultarTurnos2;
    private javax.swing.JButton jbMostrarTurnos;
    private javax.swing.JTable jtListaPersonas;
    // End of variables declaration//GEN-END:variables
}
