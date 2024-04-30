package com.coco.listasdobles;

import javax.swing.JOptionPane;

public class NodoDobleCircular {

    NodoDC primero;
    NodoDC ultimo;

    public NodoDobleCircular() {
        primero = null;
        ultimo = null;
    }

    public void inicio(int dato) {
        NodoDC nuevo = new NodoDC();

        nuevo.setDato(dato);
        nuevo.setAnt(nuevo);
        nuevo.setSgt(nuevo);

        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            //cada vez que se va agregando un nodo se va a ir creando uno nuevo
            nuevo.setSgt(primero);
            primero.setAnt(nuevo);
            primero = nuevo;
            primero.setAnt(ultimo);
            ultimo.setSgt(primero);
        }

    }

    public void imprimirHaciaDelante() {
        if (ultimo != null) {
            NodoDC temporal = ultimo;

            do {
                JOptionPane.showMessageDialog(null, temporal.getDato());
                temporal = temporal.getAnt();
            } while (temporal != ultimo);
        }

    }

    public void imprimirHaciaAtras() {
        NodoDC temporal = primero;

        do {
            JOptionPane.showMessageDialog(null, temporal.getDato());
            temporal = temporal.getSgt();

        } while (temporal != primero);
    }

    public void eliminarDato(int dato) {

        if (primero == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }

        // Buscar el nodo que contiene el dato
        NodoDC actual = primero;
        boolean encontrado = false;

        do {
            if (actual.getDato() == (dato)) {
                encontrado = true;
                break;
            }
            actual = actual.getSgt();
        } while (actual != primero);

        if (encontrado) {
            if (primero == ultimo) {
                primero = null;
                ultimo = null;
            } else if (actual == primero) { // Si es el primer nodo
                primero = actual.getSgt();
                primero.setAnt(ultimo);
                ultimo.setSgt(primero);
            } else if (actual == ultimo) { // Si es el último nodo
                ultimo = actual.getAnt();
                ultimo.setSgt(primero);
                primero.setAnt(ultimo);
            } else { // Si es un nodo intermedio
                actual.getAnt().setSgt(actual.getSgt());
                actual.getSgt().setAnt(actual.getAnt());
            }
            JOptionPane.showMessageDialog(null, "Dato eliminado correctamente: " + dato);
        } else {
            JOptionPane.showMessageDialog(null, "El dato no se encontró en la lista");
        }
    }

    public void actualizarLista() {
        int datoBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que desea buscar en la lista:"));

        if (primero == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }

        // Buscar el nodo que contiene el dato
        NodoDC actual = primero;
        boolean encontrado = false;

        do {
            if (actual.getDato() == (datoBuscado)) {
                encontrado = true;
                break;
            }
            actual = actual.getSgt();
        } while (actual != primero);

        if (encontrado) {
            int nodoAnterior = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor con el que desea actualizar los nodo anterior: "));
            int nodoSiguiente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor con el que desea actualizar los nodo siguiente: "));

            // Actualizar los valores de los nodos anterior y posterior al nodo encontrado
            actual.getAnt().setDato(nodoAnterior);
            actual.getSgt().setDato(nodoSiguiente);

            JOptionPane.showMessageDialog(null, "Valores actualizados correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El valor no se encontró en la lista.");
        }
    }

    public void ActualizarOrden() {
        int datoBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que desea buscar en la lista:"));

        if (primero == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }

        //Buscar el nodo que contiene el dato
        NodoDC actual = primero;
        boolean encontrado = false;

        do {
            if (actual.getDato() == (datoBuscado)) {
                encontrado = true;
                break;
            }
            actual = actual.getSgt();
        } while (actual != primero);

        if (encontrado) {

            // NodoDobleCircular temporal = actu
            int datoAnterior = actual.getAnt().getDato();
            int datoSiguiente = actual.getSgt().getDato();

            if (actual.getDato() < datoSiguiente) {
                int temporal = actual.getDato();
                actual.setDato(datoSiguiente);
                actual.getSgt().setDato(temporal);

            }

            if (actual.getDato() < datoAnterior) {
                int temporal = actual.getDato();
                actual.setDato(datoAnterior);
                actual.getAnt().setDato(temporal);
            }

            JOptionPane.showMessageDialog(null, "Valores actualizados correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El valor no se encontró en la lista.");
        }

    }

    public void buscarDato() {
        int datoBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que desea buscar en la lista:"));

        if (primero == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }

        //Buscar el nodo que contiene el dato
        NodoDC actual = primero;
        boolean encontrado = false;

        do {
            if (actual.getDato() == (datoBuscado)) {
                encontrado = true;
                break;
            }
            actual = actual.getSgt();
        } while (actual != primero);

        if (encontrado) {
            JOptionPane.showMessageDialog(null, "El dato se encuentra en la lista! ");
        } else {
            JOptionPane.showMessageDialog(null, "El dato No se encuentra en la lista! ");
        }

        if (encontrado) {
            showNodoSiguienteYAnterior(datoBuscado);
        }

    }

    public void showNodoSiguienteYAnterior(int datoBuscado) {

        //Buscar el nodo que contiene el dato
        NodoDC actual = primero;
        boolean encontrado = false;
        int contadorDeDato = 0;
        
        
        int dato = 0;
        do {
            if (actual.getDato() == (datoBuscado)) {
                dato = actual.getDato();
                encontrado = true;
                contadorDeDato++;
            }
            actual = actual.getSgt();
        } while (actual != primero);

        int datoAnterior = actual.getAnt().getDato();
        int datoSiguiente = actual.getSgt().getDato();

        

    }

}
