/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.coco77.hospital;

/**
 *
 * @author 57312
 */
class NodoArbol {
    Usuario usuario;
    NodoArbol izquierdo, derecho;

    public NodoArbol(Usuario usuario) {
        this.usuario = usuario;
        this.izquierdo = this.derecho = null;
    }
}
