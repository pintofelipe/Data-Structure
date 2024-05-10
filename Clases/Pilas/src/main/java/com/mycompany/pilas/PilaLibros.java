package com.mycompany.pilas;

import javax.swing.JOptionPane;

public class PilaLibros {
    private Nodo frente;
    private int maxSize;
    private int size;

    public PilaLibros(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.frente = null;
    }

    public void agregarLibro( String name,String id, double money) {
        
        if (isFull()) {
            JOptionPane.showMessageDialog(null, "Las cantidad maxima de personas ya esta completa.  intenta más tarde!");
            return;
        }

        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setName(name);
        nuevoNodo.setId(id);
        nuevoNodo.setMoney(money);

        if (isEmpty()) {
            frente = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(frente);
            frente = nuevoNodo;
        }
        size++;
    }

    public void retirarLibro() {
        if (!isEmpty()) {
            frente = frente.getSiguiente();
            size--;
        } else {
            JOptionPane.showMessageDialog(null, "No hay transaciones .");
        }
    }

    public boolean isEmpty() {
        return (frente == null);
    }

    public boolean isFull() {
        return (size == maxSize);
    }

    public void mostrarPila() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "El banco esta vacio.");
        } else {
            StringBuilder sb = new StringBuilder("Cantidas de personas en el banco :\n");
            Nodo actual = frente;
            int contador = 1;
            while (actual != null) {
                sb.append(contador).append(". ").append(actual.getName()).append(" cantidad de = ").append(actual.getMoney()).append("\n");
                actual = actual.getSiguiente();
                contador++;
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    public String obtenerLibroEnFrente() {
        if (!isEmpty()) {
            return frente.getId();
        } else {
            return "No hay trasaciones";
        }
    }

    public int getSize() {
        return size;
    }
}