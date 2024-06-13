package com.coco77.hospital;


class ArbolBinarioBusqueda {
    private NodoArbol raiz;

    public void insertar(Usuario usuario) {
        raiz = insertarRecursivo(raiz, usuario);
    }

    private NodoArbol insertarRecursivo(NodoArbol raiz, Usuario usuario) {
        if (raiz == null) {
            raiz = new NodoArbol(usuario);
            return raiz;
        }

        if (usuario.getEdad() > raiz.usuario.getEdad()) {
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, usuario);
        } else {
            raiz.derecho = insertarRecursivo(raiz.derecho, usuario);
        }

        return raiz;
    }

    public void imprimirArbolDescendente() {
        imprimirRecursivoDescendente(raiz);
    }

    private void imprimirRecursivoDescendente(NodoArbol raiz) {
        if (raiz != null) {
            imprimirRecursivoDescendente(raiz.izquierdo);
            System.out.println(raiz.usuario.getNombre() + " - Edad: " + raiz.usuario.getEdad());
            imprimirRecursivoDescendente(raiz.derecho);
        }
    }
}
