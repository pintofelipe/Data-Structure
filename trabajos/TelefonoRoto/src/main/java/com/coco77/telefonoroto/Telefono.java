package com.coco77.telefonoroto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Telefono {
    NodoPrincipal cab = null;
    ArrayList<String> array = new ArrayList<>();
    
    public void validarInformacion(){
        int sizeArray = array.size();
        int countWordCorrect = 0;
        boolean infoVery = false;
        String word;
        
        if(sizeArray==0){
            inicioLista();
            
        }else{
            for (int i = 0; i < sizeArray; i++) {
                word = JOptionPane.showInputDialog("Ingresa la palabra "+(i+1)+" que se informo: ");
                JOptionPane.showMessageDialog(null, array.get(i));
                if(array.get(i).equalsIgnoreCase(word)){
                    countWordCorrect++;
                }else{
                    JOptionPane.showMessageDialog(null, "te equivocaste la palabra correcta era "+array.get(i));
                    int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si quieres continuar\n o 2 para finalizar"));
                    if(number==2){
                        break;
                    }else if(number==1){
                        countWordCorrect++;
                    }
                }
            }
            
            if(countWordCorrect==sizeArray){
            JOptionPane.showMessageDialog(null, "Pudes continuar todas las palabras son correctas... ");

                inicioLista();
            }else{
                JOptionPane.showMessageDialog(null, "Te equivocate juego finalizado tu puntuación es de "+countWordCorrect);
            }
            
        }
    }
    
    
    
    public void inicioLista(){
        String word = JOptionPane.showInputDialog("Ingresa la  palabra: ");
        array.add(word);
        
        NodoPrincipal nuevo = new NodoPrincipal();
        nuevo.setAnt(null);
        nuevo.setSgt(null);
        nuevo.setWord(word);
        
        if(cab==null){
            cab = nuevo;
            
        }else{
            nuevo.setSgt(cab);
            cab.setAnt(nuevo);
            cab=nuevo;
        }
        
        
    }
    
    
    public void consultarLista(){
        NodoPrincipal tem = cab;
        
        if(tem==null){
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
        }else{
            array.add(tem.getWord());
            tem = tem.getSgt();
        }
     
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
    
    
}
