package com.coco.partial1;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public final class Scenarios extends javax.swing.JFrame {

    /**
     * Creates new form Scenarios
     */
    Shopping visit = new Shopping();

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
        jBEscenarioMasYMenosVisitadoDia = new javax.swing.JButton();
        jbComprarEntrada = new javax.swing.JButton();
        jbConsultarEscenario = new javax.swing.JButton();
        jbconsultarEntradas = new javax.swing.JButton();
        jbEntradasCompradasPorPersona = new javax.swing.JButton();
        jbAdultosMayores = new javax.swing.JButton();
        jbHombresYmujeres = new javax.swing.JButton();
        jbMasMujeres = new javax.swing.JButton();

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

        jBEscenarioMasYMenosVisitadoDia.setText("Dia de la semana y escenario + y - visitado");
        jBEscenarioMasYMenosVisitadoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEscenarioMasYMenosVisitadoDiaActionPerformed(evt);
            }
        });

        jbComprarEntrada.setText("Comprar entrada");
        jbComprarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComprarEntradaActionPerformed(evt);
            }
        });

        jbConsultarEscenario.setText("Consultar escenario");
        jbConsultarEscenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarEscenarioActionPerformed(evt);
            }
        });

        jbconsultarEntradas.setText("Consultar entradas");
        jbconsultarEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbconsultarEntradasActionPerformed(evt);
            }
        });

        jbEntradasCompradasPorPersona.setText("# Entradas compradas");
        jbEntradasCompradasPorPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntradasCompradasPorPersonaActionPerformed(evt);
            }
        });

        jbAdultosMayores.setText("Adultos mayores");
        jbAdultosMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdultosMayoresActionPerformed(evt);
            }
        });

        jbHombresYmujeres.setText("Hombres y mujeres");
        jbHombresYmujeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHombresYmujeresActionPerformed(evt);
            }
        });

        jbMasMujeres.setText("Mas mujeres");
        jbMasMujeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMasMujeresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbDiaMasVisitadoEstadio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEscenarioMenosVisitado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbTotalDePersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbPromedioDeVisitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEscenarioMasYMenosVisitadoDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbDiaMasVisitado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEscenariosMasVisitados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addComponent(jbMatriz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbHombresYmujeres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbConsultarEscenario, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(jbComprarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(jbconsultarEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEntradasCompradasPorPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAdultosMayores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMasMujeres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitle)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle)
                .addGap(18, 18, 18)
                .addComponent(jbMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEscenariosMasVisitados)
                    .addComponent(jbComprarEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDiaMasVisitadoEstadio)
                    .addComponent(jbConsultarEscenario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEscenarioMenosVisitado)
                    .addComponent(jbconsultarEntradas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbTotalDePersonas)
                    .addComponent(jbEntradasCompradasPorPersona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPromedioDeVisitas)
                    .addComponent(jbAdultosMayores))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDiaMasVisitado)
                    .addComponent(jbHombresYmujeres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEscenarioMasYMenosVisitadoDia)
                    .addComponent(jbMasMujeres))
                .addContainerGap(66, Short.MAX_VALUE))
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
        int diaMenosVisitado = 0;
        int minVisitas = Integer.MAX_VALUE;

        for (int dia = 0; dia < 7; dia++) {

            int totalVisitasDia = 0;
            for (List<Integer> fila : datos) {
                totalVisitasDia += fila.get(dia);
            }

            if (totalVisitasDia < minVisitas) {
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

        JOptionPane.showMessageDialog(null, "El promedio de visitas a las semana es de " + promedio + " personas");
    }//GEN-LAST:event_jbPromedioDeVisitasActionPerformed

    private void jbDiaMasVisitadoEstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDiaMasVisitadoEstadioActionPerformed

        int diaMasVisitado = 0;
        int maxVisitas = 0;

        for (int i = 0; i < 7; i++) {

            int visitantesDia = datos.get(2).get(i);

            if (visitantesDia > maxVisitas) {
                maxVisitas = visitantesDia;
                diaMasVisitado = i;
            }

        }

        JOptionPane.showMessageDialog(null, "El dia más visitado en el estadio es el dia " + diasSemana[diaMasVisitado]);


    }//GEN-LAST:event_jbDiaMasVisitadoEstadioActionPerformed

    private void jBEscenarioMasYMenosVisitadoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEscenarioMasYMenosVisitadoDiaActionPerformed

        int escenarioMasVisitado = 0;
        int diaMasVisitado = 0;
        int maxDia = 0;

        int diaMenosVisitado = Integer.MAX_VALUE;
        int escenarioMenosVisitado = 0;
        int minDia = 0;

        for (int dia = 0; dia < 7; dia++) {

            int visitasDia = 0;

            for (int escenario = 0; escenario < 4; escenario++) {

                visitasDia = datos.get(escenario).get(dia);

                if (visitasDia > diaMasVisitado) {
                    diaMasVisitado = visitasDia;
                    escenarioMasVisitado = escenario;
                    maxDia = dia;
                }

                if (visitasDia < diaMenosVisitado) {
                    diaMenosVisitado = visitasDia;
                    escenarioMenosVisitado = escenario;
                    minDia = dia;
                }

            }

        }

        JOptionPane.showMessageDialog(null, "El dia más visitado es " + diasSemana[maxDia] + " y el escenario es " + nombresEscenarios[escenarioMasVisitado]);

        JOptionPane.showMessageDialog(null, "El dia menos visitado es " + diasSemana[minDia] + " y el escenario es " + nombresEscenarios[escenarioMenosVisitado]);


    }//GEN-LAST:event_jBEscenarioMasYMenosVisitadoDiaActionPerformed

    private void jbComprarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComprarEntradaActionPerformed

        /*import java.time.LocalDate;
            import java.time.Period;
            import java.time.format.DateTimeFormatter;

        // 01/01/2000
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNac = LocalDate.parse("15/08/1993", fmt);
        LocalDate ahora = LocalDate.now();

            Period periodo = Period.between(fechaNac, ahora);
            System.out.printf("Tu edad es: %s años, %s meses y %s días",
        periodo.getYears(), periodo.getMonths(), periodo.getDays());*/
        boolean aprovado = false;
        int age;

        String name = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String document = JOptionPane.showInputDialog("Ingrese su documento: ");
        String sexo = JOptionPane.showInputDialog("Ingrese su sexo = {Hombre - Mujer} ");
        String fechaNacimiento = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento =  dd-MM-yyyy ");

        //Funcionalidad de la fecha de nacimiento
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        age = periodo.getYears();

        //Contruyo menú de escenarios 
        StringBuilder menu = new StringBuilder("Lugares a los que puede ir:\n"); // Un StringBuilder es una clase que se utiliza para construir cadenas de caracteres de manera eficiente en términos de memoria y rendimiento.

        for (int i = 0; i < nombresEscenarios.length; i++) {
            menu.append((i + 1)).append(". ").append(nombresEscenarios[i]).append("\n");
        }

        menu.append("\nIngrese el número correspondiente al cuál deseas ir: ");

        int lugarAVisitar = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        if (lugarAVisitar == 2) {
            if (age < 18) {
                JOptionPane.showMessageDialog(null, "Lo sentimos " + name + " eres menor de edad para ingresar a la " + nombresEscenarios[1]);
            } else {
                visit.enterPerson(name, document, sexo, fechaNacimiento, lugarAVisitar);
            }
        } else {
            visit.enterPerson(name, document, sexo, fechaNacimiento, lugarAVisitar);
        }


    }//GEN-LAST:event_jbComprarEntradaActionPerformed

    private void jbConsultarEscenarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarEscenarioActionPerformed
        StringBuilder menu = new StringBuilder("Lugares a los que puede ir:\n");
        for (int i = 0; i < nombresEscenarios.length; i++) {
            menu.append((i + 1)).append(". ").append(nombresEscenarios[i]).append("\n");
        }

        int escenario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número correspondiente al escenario: \n" + menu.append(0)));

        int totalVisitas = 0;
        int maxVisitas = 0;
        int minVisitas = Integer.MAX_VALUE;
        int maxDia = 0;
        int minDia = 0;

        for (int dia = 0; dia < 7; dia++) {
            int visitasDia = datos.get(escenario - 1).get(dia);
            totalVisitas += visitasDia;

            if (visitasDia > maxVisitas) {
                maxVisitas = visitasDia;
                maxDia = dia;
            }

            if (visitasDia < minVisitas) {
                minVisitas = visitasDia;
                minDia = dia;
            }
        }

        int promedio = Math.round(totalVisitas / 7);

        JOptionPane.showMessageDialog(null, "Escenario " + escenario + ":\n"
                + "Día más visitado: " + diasSemana[maxDia] + " con " + maxVisitas + " visitas.\n"
                + "Día menos visitado: " + diasSemana[minDia] + " con " + minVisitas + " visitas.\n"
                + "Promedio diario: " + promedio + " visitantes.");


    }//GEN-LAST:event_jbConsultarEscenarioActionPerformed

    private void jbconsultarEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbconsultarEntradasActionPerformed
        StringBuilder menu = new StringBuilder("Lugares a los que puede ir:\n");
        for (int i = 0; i < nombresEscenarios.length; i++) {
            menu.append((i + 1)).append(". ").append(nombresEscenarios[i]).append("\n");
        }

        int escenario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número correspondiente al escenario: \n" + menu.append(0)));

        visit.printEntradasVendidasPorEscenario(escenario);
    }//GEN-LAST:event_jbconsultarEntradasActionPerformed

    private void jbEntradasCompradasPorPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntradasCompradasPorPersonaActionPerformed
        String persona = JOptionPane.showInputDialog("ingrese su documento");
        visit.printEntradasCompradasPorPersona(persona);
    }//GEN-LAST:event_jbEntradasCompradasPorPersonaActionPerformed

    private void jbAdultosMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdultosMayoresActionPerformed
        visit.countMayores65();
    }//GEN-LAST:event_jbAdultosMayoresActionPerformed

    private void jbHombresYmujeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHombresYmujeresActionPerformed
        visit.countHombresMujeres();
    }//GEN-LAST:event_jbHombresYmujeresActionPerformed

    private void jbMasMujeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMasMujeresActionPerformed
        visit.getEscenarioConMasMujeres();
    }//GEN-LAST:event_jbMasMujeresActionPerformed

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
    private javax.swing.JButton jBEscenarioMasYMenosVisitadoDia;
    private javax.swing.JButton jbAdultosMayores;
    private javax.swing.JButton jbComprarEntrada;
    private javax.swing.JButton jbConsultarEscenario;
    private javax.swing.JButton jbDiaMasVisitado;
    private javax.swing.JButton jbDiaMasVisitadoEstadio;
    private javax.swing.JButton jbEntradasCompradasPorPersona;
    private javax.swing.JButton jbEscenarioMenosVisitado;
    private javax.swing.JButton jbEscenariosMasVisitados;
    private javax.swing.JButton jbHombresYmujeres;
    private javax.swing.JButton jbMasMujeres;
    private javax.swing.JButton jbMatriz;
    private javax.swing.JButton jbPromedioDeVisitas;
    private javax.swing.JButton jbTotalDePersonas;
    private javax.swing.JButton jbconsultarEntradas;
    private javax.swing.JLabel jlTitle;
    // End of variables declaration//GEN-END:variables
}
