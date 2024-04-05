package com.coco77.doblelista;

import java.time.temporal.Temporal;
import javax.swing.JOptionPane;

public class OperacionesDobles {

    Nodo cab = null;

    public void inicioLista(String nombre) {

        Nodo nuevo = new Nodo();
        
        nuevo.setAnt(null);
        nuevo.setStg(null);
        nuevo.setNombre(nombre);

        if (cab == null) {
            cab = nuevo;

        } else {
            nuevo.setStg(cab);
            cab.setAnt(nuevo);
            cab = nuevo;
        }

    }

    public void consultarLista() {
        Nodo tem = cab;

        if (cab == null) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {

            while (tem != null) {
                JOptionPane.showMessageDialog(null, "Los valores son: " + tem.getNombre());
                tem = tem.getStg();

            }
        }
    }
}
