/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ListaDobleEnlazada;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author tf2he
 */
public class mainListaDoble {

    /**
     * @param args the command line arguments
     */
    //Este metodo es para llenar la lista con numeros aleatorios
    static int[] llenarNumeros(int numeros) {
        int[] arreglollenado = new int[numeros];
        for (int n = 0; n < numeros; n++) {
            arreglollenado[n] = ThreadLocalRandom.current().nextInt(0, 100000 + 1);
        }
        return arreglollenado;
    }

    public static void main(String[] args) {

        int[] arreglonumeros = llenarNumeros(10);

        ListaDobleEnlazada lde = new ListaDobleEnlazada(arreglonumeros);
        lde.imprimirLista();
        lde.imprimirListaReverso();

    }

}
