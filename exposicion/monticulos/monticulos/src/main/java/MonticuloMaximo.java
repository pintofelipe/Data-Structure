
import javax.swing.JOptionPane;

public class MonticuloMaximo {
    private Nodo[] monticulo;
    private int tamaño;
    private int tamañoMaximo;

    // Constructor para inicializar un montículo vacío con una capacidad máxima dada
    public MonticuloMaximo(int tamañoMaximo) {
        this.tamañoMaximo = tamañoMaximo;
        this.tamaño = 0;
        this.monticulo = new Nodo[this.tamañoMaximo + 1];
        this.monticulo[0] = new Nodo(Integer.MAX_VALUE); // Valor centinela
    }

    // Retorna la posición del padre
    private int padre(int pos) {
        return pos / 2;
    }

    // Retorna la posición del hijo izquierdo
    private int hijoIzquierdo(int pos) {
        return (2 * pos);
    }

    // Retorna la posición del hijo derecho
    private int hijoDerecho(int pos) {
        return (2 * pos) + 1;
    }

    // Retorna verdadero si el nodo dado es una hoja
    private boolean esHoja(int pos) {
        return pos > (tamaño / 2) && pos <= tamaño;
    }

    // Función para intercambiar dos nodos del montículo
    private void intercambiar(int fpos, int spos) {
        Nodo tmp;
        tmp = monticulo[fpos];
        monticulo[fpos] = monticulo[spos];
        monticulo[spos] = tmp;
    }

    // Función para reorganizar el montículo desde la posición dada
    private void maxHeapify(int pos) {
        if (esHoja(pos)) {
            return;
        }

        if (monticulo[pos].valor < monticulo[hijoIzquierdo(pos)].valor ||
            monticulo[pos].valor < monticulo[hijoDerecho(pos)].valor) {

            if (monticulo[hijoIzquierdo(pos)].valor > monticulo[hijoDerecho(pos)].valor) {
                intercambiar(pos, hijoIzquierdo(pos));
                maxHeapify(hijoIzquierdo(pos));
            } else {
                intercambiar(pos, hijoDerecho(pos));
                maxHeapify(hijoDerecho(pos));
            }
        }
    }

    // Función para insertar un nodo en el montículo
    public void insertar(int elemento) {
        if (tamaño >= tamañoMaximo) {
            return;
        }
        Nodo nuevoNodo = new Nodo(elemento);
        monticulo[++tamaño] = nuevoNodo;

        int actual = tamaño;
        while (monticulo[actual].valor > monticulo[padre(actual)].valor) {
            intercambiar(actual, padre(actual));
            actual = padre(actual);
        }
    }

    // Función para imprimir el contenido del montículo
    public void imprimir() {
        for (int i = 1; i <= tamaño / 2; i++) {
            JOptionPane.showConfirmDialog(null, " PADRE : " + monticulo[i] +
                    " HIJO IZQUIERDO : " + monticulo[2 * i] +
                    " HIJO DERECHO :" + monticulo[2 * i + 1]);
            System.out.println();
        }
    }

    // Función para eliminar y retornar el elemento máximo del montículo
    public Nodo extraerMax() {
        Nodo extraido = monticulo[1];
        monticulo[1] = monticulo[tamaño--];
        maxHeapify(1);
        return extraido;
    }

    public static void main(String[] args) {
        System.out.println("El Montículo Máximo es ");
        MonticuloMaximo monticuloMaximo = new MonticuloMaximo(15);
        monticuloMaximo.insertar(5);
        monticuloMaximo.insertar(3);
        monticuloMaximo.insertar(17);
        monticuloMaximo.insertar(10);
        monticuloMaximo.insertar(84);
        monticuloMaximo.insertar(19);
        monticuloMaximo.insertar(6);
        monticuloMaximo.insertar(22);
        monticuloMaximo.insertar(9);

        monticuloMaximo.imprimir();
        System.out.println("El valor máximo es " + monticuloMaximo.extraerMax().valor);
    }
}
