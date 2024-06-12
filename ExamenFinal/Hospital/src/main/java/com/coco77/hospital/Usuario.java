
package com.coco77.hospital;

public class Usuario {
    String documento, tipoCliente, nombre, correo, telefono;
    int edad, estrato;

    public Usuario(String documento, String tipoCliente, String nombre, String correo, String telefono, int edad, int estrato) {
        this.documento = documento;
        this.tipoCliente = tipoCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.estrato = estrato;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }
    
}
