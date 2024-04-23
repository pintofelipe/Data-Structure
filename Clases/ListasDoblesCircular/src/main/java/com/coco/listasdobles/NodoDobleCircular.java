package com.coco.listasdobles;

import javax.swing.JOptionPane;

public class NodoDobleCircular {

    NodoDC primero;
    NodoDC ultimo;

    public NodoDobleCircular() {
        primero = null;
        ultimo = null;
    }

    public void inicio(String dato) {
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

    public void eliminarDato(String dato) {

        if (primero == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }

        // Buscar el nodo que contiene el dato
        NodoDC actual = primero;
        boolean encontrado = false;

        do {
            if (actual.getDato().equals(dato)) {
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
    
    
    public void actualizarLista(){
        
    }

}
