/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author tf2he
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        
        lista.añadirValor("Hennys");
        lista.añadirValor("Sebastian");
        lista.añadirValor("Tous");
        lista.añadirValor("De");
        lista.añadirValor("Avila");
        
        System.out.println("...Estamos imprimiendo la lista...");
        for(int i =0; i<lista.getEspacio();i++){
            System.out.println(lista.getValor(i));
        
        }
        
    }
    
}
