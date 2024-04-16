package com.mycompany.proyecto;

import javax.swing.JOptionPane;

public class Proyecto {

    NodoDoble iniciodoble;
    NodoSimple iniciosimple;

    Proyecto() {
        iniciodoble = null;
        iniciosimple = null;
    }

    public void crearsimple(int dato) {
        NodoSimple nuevosimple = new NodoSimple();
        nuevosimple.setDato(dato);
        nuevosimple.setSgt(null);
        if (iniciosimple == null) {
            iniciosimple = nuevosimple;
        } else {
            nuevosimple.setSgt(iniciosimple.getSgt());
            iniciosimple = nuevosimple;
        }
    }

    public void creardoble(int dato) {
        NodoDoble nuevodoble = new NodoDoble();
        nuevodoble.setDato(dato);
        nuevodoble.setSgt(null);
        nuevodoble.setAnt(null);
        if (iniciodoble == null) {
            iniciodoble = nuevodoble;
        } else {
            nuevodoble.setSgt(iniciodoble);
            iniciodoble.setAnt(nuevodoble);
            iniciodoble = nuevodoble;
        }
    }

    public void buscar(int bus) {
        NodoDoble temporal = iniciodoble;
        boolean encontrado = false;

        while (temporal != null) {
            if (temporal.getDato() == bus) {
                encontrado = true;

                if (temporal.getAnt() == null) {
                    JOptionPane.showMessageDialog(null, "No hay nada atrás");
                } else {
                    JOptionPane.showMessageDialog(null, "Adelante está: " + temporal.getAnt().getDato());
                }

                if (temporal.getSgt() == null) {
                    JOptionPane.showMessageDialog(null, "No hay nada adelante");
                } else {
                    JOptionPane.showMessageDialog(null, "Atras está: " + temporal.getSgt().getDato());
                }

                break; // Terminar el bucle una vez que se ha encontrado el dato
            }
            temporal = temporal.getSgt();
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Número no encontrado");
        }
    }

    public void intercambiarDatos(int dato) {
        NodoDoble temporal = iniciodoble;

        // Buscar el nodo que contiene el dato
        while (temporal != null && temporal.getDato() != dato) {
            temporal = temporal.getSgt();
        }

        // Si no se encontró el dato, mostrar un mensaje y salir
        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Dato no encontrado en la lista.");
            return;
        }

        // Obtener los nodos anterior y posterior
        NodoDoble nodoAnterior = temporal.getAnt();
        NodoDoble nodoPosterior = temporal.getSgt();

        // Verificar que ambos nodos existan para poder realizar el intercambio
        if (nodoAnterior != null && nodoPosterior != null) {
            // Intercambiar los datos entre los nodos anterior y posterior
            int tempDato = nodoAnterior.getDato();
            nodoAnterior.setDato(nodoPosterior.getDato());
            nodoPosterior.setDato(tempDato);

            JOptionPane.showMessageDialog(null, "Se han intercambiado los datos de los nodos adyacentes al dato: " + dato);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede realizar el intercambio porque el dato está al principio o al final de la lista.");
        }
    }

    public void buscarSimple(int bus) {
        NodoSimple temporal = iniciosimple;
        boolean encontrado = false;

        while (temporal != null) {
            JOptionPane.showConfirmDialog(null, "numero siguiente: " + temporal.getDato());

            if (temporal.getDato() == bus) {
                encontrado = true;
                if (temporal.getSgt() != null) {
                    JOptionPane.showMessageDialog(null, "El siguiente es: " + temporal.getSgt().getDato());
                } else {
                    JOptionPane.showMessageDialog(null, "No hay siguiente");
                }
                break;
            }
            temporal = temporal.getSgt();
        }

    }
    
    public String mostrarListaDoble() {
    // Creamos un StringBuilder para construir la representación en cadena de la lista
    StringBuilder sb = new StringBuilder();

    // Inicializamos un nodo temporal para recorrer la lista desde el inicio
    NodoDoble temporal = iniciodoble;

    // Recorremos la lista desde el inicio hasta el final
    while (temporal != null) {
        // Agregamos el dato del nodo actual al StringBuilder, seguido de una flecha para indicar el enlace
        sb.append(temporal.getDato()).append(" <-> ");

        // Avanzamos al siguiente nodo en la lista
        temporal = temporal.getSgt();
    }

    // Eliminamos la última flecha "<-> " del StringBuilder
    if (sb.length() > 0) {
        sb.setLength(sb.length() - 4);
    }

    // Devolvemos la representación en cadena de la lista
    return sb.toString();
}


}
