class Nodo {
    int valor;

    public Nodo(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return Integer.toString(valor);
    }
}