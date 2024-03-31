
package com.coco.partial1;

/**
 Esta clase va ir agregando compras y va formando una lista simple
 */
public class Shopping {
    
    Visit inicio;

    public Shopping() {
        
        inicio = null;
    }
    
    
    public void enterPerson(String name,String document, String sexo, String fechaNacimiento,int lugarAVisitar){
        
        Visit visita = new Visit(name, document, sexo, fechaNacimiento, lugarAVisitar, null);

    
        if(inicio==null){
            inicio = visita; // agrego a una nueva persona
        }else{
            Visit temporal = inicio;
            
            while(temporal.getDireccion() != null){ // si la dirreccion es null, entonces no hay más personas y temporal se ubica en la ultima posción
                temporal = temporal.getDireccion(); // me sirve para moverme en nodos
            }
            
            temporal.setDireccion(visita); // se queda en la ultima posción

        }
        
        
        
        
    
    }
    
    
    
    
    
}
