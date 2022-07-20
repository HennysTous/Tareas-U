/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDobleEnlazada;

/**
 *
 * @author tf2he
 */
public class Nodo {
    private int numero;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo() {
    }

    public Nodo(int numero) {
        this.numero = numero;
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo sig) {
        this.siguiente = sig;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo ant) {
        this.anterior = ant;
    }
    
    
    
}
