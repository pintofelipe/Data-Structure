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
    
    
    
 public void finalLista(String nombre) {
    Nodo nuevo = new Nodo();
    nuevo.setNombre(nombre);

    if (cab == null) {
        cab = nuevo;
    } else {
        Nodo temp = cab;
        while (temp.getStg() != null) {
            temp = temp.getStg();
        }
        temp.setStg(nuevo);
        nuevo.setAnt(temp);
    }
}

            
   public void adelantarNodo(String nombreExistente, String nombreNuevo) {
    Nodo nuevo = new Nodo();
    nuevo.setNombre(nombreNuevo);

    if (cab == null) {
        JOptionPane.showMessageDialog(null, "La lista está vacía");
    } else {
        Nodo temp = cab;
        while (temp != null) {
            if (temp.getNombre().equals(nombreExistente)) {
                Nodo siguiente = temp.getStg();
                nuevo.setStg(siguiente);
                nuevo.setAnt(temp);
                temp.setStg(nuevo);
                if (siguiente != null) {
                    siguiente.setAnt(nuevo);
                }
                return; // Salir del método después de realizar la inserción
            }
            temp = temp.getStg();
        }
        JOptionPane.showMessageDialog(null, "No se encontró el nodo con el nombre especificado");
    }
}

   
   
          
}
