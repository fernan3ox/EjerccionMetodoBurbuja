/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerccionmetodoburbuja;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernandito
 */
public class EjerccionMetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int N;
        N=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de Tamaño del Array"));
        int [] arreglo = new int [N];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor en la posicion:"+i));
        }
        
        MetodoBurbuja(arreglo);
        
        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));
        
        
    }
    private static void MetodoBurbuja(int arreglos[]){
        
        for (int i = 1; i < arreglos.length ; i++) {
            for (int j = 0; j < arreglos.length-1; j++) {
                if (arreglos[j] > arreglos[j+1]) {
                    int aux=arreglos[j];
                    arreglos[j]=arreglos[j+1];
                    arreglos[j+1]=aux;
                    
                }
            }
        }
        
        
    }
}
