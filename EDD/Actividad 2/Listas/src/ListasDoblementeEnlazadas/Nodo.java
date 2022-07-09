/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasDoblementeEnlazadas;

/**
 *
 * @author tf2he
 */
public class Nodo {
    
    private int elemento1,elemento2;
    private Nodo anterior,siguiente;
    
    public Nodo (int ele1, int ele2, Nodo sig, Nodo ant){
    
    elemento1 = ele1;
    elemento2=ele2;
    siguiente=sig;
    anterior=ant;
    
    
    }

    public int getElemento1() {
        return elemento1;
    }

    public void setElemento1(int ele1) {
        this.elemento1 = ele1;
    }

    public int getElemento2() {
        return elemento2;
    }

    public void setElemento2(int ele2) {
        this.elemento2 = ele2;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo ant) {
        this.anterior = ant;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo sig) {
        this.siguiente = sig;
    }
    
    
}
