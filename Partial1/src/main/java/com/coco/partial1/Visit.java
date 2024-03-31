
package com.coco.partial1;
/**
 * @author pinto 77
 */
public class Visit  extends Person{
    private int LugarAVisitar;
    private Visit direccion;

    public Visit( String nombre, String documento, String sexo, String FechaDeNacimiento, int lugarAVisitar, Visit direccion) {
        super(nombre, documento, sexo, FechaDeNacimiento);
        this.LugarAVisitar = LugarAVisitar;
        this.direccion = direccion;
    }

    public int getLugarAVisitar() {
        return LugarAVisitar;
    }

    public void setLugarAVisitar(int LugarAVisitar) {
        this.LugarAVisitar = LugarAVisitar;
    }

    public Visit getDireccion() {
        return direccion;
    }

    public void setDireccion(Visit direccion) {
        this.direccion = direccion;
    }

   
    
    
  

  
    
    
    

    
}
