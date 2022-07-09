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
public class Nodo {

    private Object valor;
    private Nodo nodo;
    public Nodo() {
        valor = null;
        Nodo nodo = null;
    }

    public Nodo(Object valor) {
        this();
        this.valor = valor;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }

}
