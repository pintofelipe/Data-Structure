package com.coco.partial1;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 * Esta clase va ir agregando compras y va formando una lista simple
 */
public class Shopping {

    Visit inicio;
    int[] entradasVendidasPorEscenario;
    int[] mujeresPorEscenario;
    int escenarioActual;
    Visit visita;

    public Shopping() {

        inicio = null;
        entradasVendidasPorEscenario = new int[3]; // initialize the array with the maximum number of scenarios
        escenarioActual = 0;
        mujeresPorEscenario = new int[3];

    }

    public void enterPerson(String name, String document, String sexo, String fechaNacimiento, int lugarAVisitar) {

        visita = new Visit(name, document, sexo, fechaNacimiento, lugarAVisitar, null);

        if (inicio == null) {
            inicio = visita; // agrego a una nueva persona
        } else {
            Visit temporal = inicio;

            while (temporal.getDireccion() != null) { // si la dirreccion es null, entonces no hay más personas y temporal se ubica en la ultima posción
                temporal = temporal.getDireccion(); // me sirve para moverme en nodos
            }

            temporal.setDireccion(visita); // se queda en la ultima posción

        }
        if (lugarAVisitar != escenarioActual) {
            escenarioActual = lugarAVisitar;
            entradasVendidasPorEscenario[escenarioActual - 1] = 1;
        } else {
            entradasVendidasPorEscenario[escenarioActual - 1]++;
        }
        
        if (sexo.equalsIgnoreCase("Mujer")) {
            mujeresPorEscenario[lugarAVisitar - 1]++;
        }
    
    }

    public void printEntradasVendidasPorEscenario(int escenario) {
        JOptionPane.showConfirmDialog(null, "Cantidad de entradas vendidas para el escenario " + escenario + ": " + entradasVendidasPorEscenario[escenario - 1]);
    }

    public void printEntradasCompradasPorPersona(String persona) {
        Visit visit = inicio;
        int totalEntradas = 0;

        while (visit != null) {
            if (visit.getDocumento().equals(persona)) {
                totalEntradas++;
            }

            visit = visit.getDireccion();
        }

        JOptionPane.showMessageDialog(null, "La persona con este documento " + persona + " ha comprado " + totalEntradas + " entradas");
    }

    public void countMayores65() {
        Visit visit = inicio;
        int mayores65 = 0;

        while (visit != null) {
            int edad = getEdad(visit.getFechaDeNacimiento());

            if (edad >= 65) {
                mayores65++;
            }

            visit = visit.getDireccion();
        }

        JOptionPane.showMessageDialog(null, "Han comprado entradas " + mayores65 + " personas mayores de 65 años");
    }

    private int getEdad(String fechaNacimiento) {
        String[] fechaNacimientoSplit = fechaNacimiento.split("-");
        int year = Integer.parseInt(fechaNacimientoSplit[0]);
        int month = Integer.parseInt(fechaNacimientoSplit[1]);
        int day = Integer.parseInt(fechaNacimientoSplit[2]);

        int edad = LocalDate.now().getYear() - year;

        if (LocalDate.now().getMonthValue() < month || LocalDate.now().getMonthValue() == month && LocalDate.now().getDayOfMonth() < day) {
            edad--;
        }

        return edad;
    }

    public void countHombresMujeres() {
        Visit visit = inicio;
        int hombres = 0;
        int mujeres = 0;

        while (visit != null) {
            String sexo = visit.getSexo();

            if (sexo.equalsIgnoreCase("Hombre")) {
                hombres++;
            } else if (sexo.equalsIgnoreCase("Mujer")) {
                mujeres++;
            }

            visit = visit.getDireccion();
        }

        JOptionPane.showMessageDialog(null, "Han comprado entradas " + hombres + " hombres y " + mujeres + " mujeres");
    }

    public void getEscenarioConMasMujeres() {
        int maxMujeres = 0;
        int escenarioConMasMujeres = 0;

        for (int i = 0; i < mujeresPorEscenario.length; i++) {
            if (mujeresPorEscenario[i] > maxMujeres) {
                maxMujeres = mujeresPorEscenario[i];
                escenarioConMasMujeres = i + 1; // Escenario se indexa desde 1
            }
        }

        JOptionPane.showMessageDialog(null, "El escenario en el que más mujeres han comprado entradas es el " + escenarioConMasMujeres);
    }

}
