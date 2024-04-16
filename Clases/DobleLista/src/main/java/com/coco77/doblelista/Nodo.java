
package com.coco77.doblelista;


public class Nodo {
    
    private Nodo stg;
    private Nodo ant;
    private String nombre;

    /**
     * @return the stg
     */
    public Nodo getStg() {
        return stg;
    }

    /**
     * @param stg the stg to set
     */
    public void setStg(Nodo stg) {
        this.stg = stg;
    }

    /**
     * @return the ant
     */
    public Nodo getAnt() {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    
}
