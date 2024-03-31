package com.coco.partial1;

/**
 * @author pinto 77 documento, nombre, fecha de nacimiento y lugar que desea
 * visitar, sexo, tenga presente que un menor de edad no puede entrar a la
 * piscina olímpica.
 */
public class Person {

    private String nombre;
    private String documento;
    private String sexo;
    private String FechaDeNacimiento;

    public Person(String nombre, String documento, String sexo, String FechaDeNacimiento) {
        this.nombre = nombre;
        this.documento = documento;
        this.sexo = sexo;
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }
    
    

}
