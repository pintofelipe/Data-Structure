package com.coco77.telefonoroto;
import javax.swing.JOptionPane;

public class Telefono2 {

    NodoPrincipal cab = null;
    NodoPrincipal ultimo = null;

    public void inputInformation() {
        if (cab == null) {
            String word = JOptionPane.showInputDialog("Ingrese la Nueva Información ");
            addNode(word);
        } else {
            if (very()) {
                String word = JOptionPane.showInputDialog("Ingrese la Nueva Información ");
                addNode(word);
            } else {
                JOptionPane.showMessageDialog(null, "juego finalizado... ");
            }
        }
    }

    private void addNode(String word) {
        NodoPrincipal nuevo = new NodoPrincipal();
        nuevo.setAnt(null);
        nuevo.setSgt(null);
        nuevo.setWord(word);

        if (cab == null) {
            cab = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSgt(cab);
            cab.setAnt(nuevo);
            cab = nuevo;
        }
    }

    private boolean very() {
        NodoPrincipal tem = ultimo;
        int countWordCorrect = 0;
        int totalWord = 0;

        while (tem != null) {
            totalWord++;
            String word = JOptionPane.showInputDialog("Ingresa la palabra " + totalWord + ": ");

            if (tem.getWord().equalsIgnoreCase(word)) {
                countWordCorrect++;
            } else {
                JOptionPane.showMessageDialog(null, "Te equivocaste, la palabra correcta era " + tem.getWord());
                int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si quieres continuar o 2 para finalizar"));
                if (number == 2) {
                    return false;
                } else if (number == 1) {
                    countWordCorrect++;
                }
            }

            tem = tem.getAnt();
        }

        if (countWordCorrect == totalWord) {
            JOptionPane.showMessageDialog(null, "Puedes continuar, todas las palabras son correctas.");
            return true;
        }

        return false;
    }
}