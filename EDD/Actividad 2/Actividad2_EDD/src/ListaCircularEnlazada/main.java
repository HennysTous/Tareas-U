/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCircularEnlazada;

/**
 *
 * @author Felipe Romero
 */
public class main {
    
    public static void main (String[] args){
        listaCircular lc = new listaCircular();
        System.out.println("lista circular");
        lc.ingresarnodo(1);
        lc.ingresarnodo(2);
        lc.ingresarnodo(3);
        lc.ingresarnodo(4);
        lc.ingresarnodo(5);
        
        
        lc.verlista();
    }
    
}
