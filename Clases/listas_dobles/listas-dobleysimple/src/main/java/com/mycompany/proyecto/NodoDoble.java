package com.mycompany.proyecto;


public class NodoDoble {

    
    public NodoDoble getSgt() {
        return sgt;
    }

    
    public void setSgt(NodoDoble sgt) {
        this.sgt = sgt;
    }

   
    public NodoDoble getAnt() {
        return ant;
    }

    
    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }

    
    public int getDato() {
        return dato;
    }

    
    public void setDato(int dato) {
        this.dato = dato;
    }
    
       private NodoDoble sgt;
       private NodoDoble ant;     
       private int dato;
    
}
