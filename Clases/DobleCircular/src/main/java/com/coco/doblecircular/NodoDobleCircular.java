package com.coco.doblecircular;

import javax.swing.JOptionPane;

public class NodoDobleCircular {
    NodoDC primero;
    NodoDC ultimo;

    public NodoDobleCircular() {
        primero = null;
        ultimo = null;
    }
    
    
    public void inicio(int age){
        NodoDC nuevo = new NodoDC();
        
        nuevo.setAge(age);
        nuevo.setAnt(nuevo);
        nuevo.setSgt(nuevo);
        
        if(primero == null){
            primero=nuevo;
            ultimo= nuevo;
        }else{
            //cada vez que se va agregando un nodo se va a ir creando uno nuevo
            nuevo.setSgt(primero);
            primero.setAnt(nuevo);
            primero=nuevo;
            primero.setAnt(ultimo);
            ultimo.setSgt(primero);
        }
        
    }
    
    
    public void imprimirHaciaAtras(){
        NodoDC temporal = primero;
        
        do{
            JOptionPane.showMessageDialog(null, temporal.getAge());
            temporal=temporal.getSgt();
            
        }while(temporal != primero );
    }
           
    
    public void imprimirHaciaDelante(){
        if(ultimo != null){
            NodoDC temporal = ultimo;
            
            do{
                JOptionPane.showMessageDialog(null, temporal.getAge());
                temporal=temporal.getAnt();
            }while(temporal != ultimo);
        }
        
        
    }
    
    
}
