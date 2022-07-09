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
public class ListaEnlazada {

    private Nodo primero;

    private int espacio;

    public ListaEnlazada() {
        espacio = 0;
        primero = new Nodo();
    }

    public int getEspacio() {
        return espacio;
    }

    public boolean añadirValor(Object valor) {

        Nodo ultimoNodo = getultimoNodo();
        if (valor != null && ultimoNodo != null) {
            ultimoNodo.setNodo(new Nodo(valor));
            espacio++;
            return true;
        } else {
            return false;
        }
    }

    private Nodo getultimoNodo() {
        Nodo ultimoNodo = null;
        if (primero != null) {
            ultimoNodo = primero;
            while (ultimoNodo.getNodo() != null) {

                ultimoNodo = ultimoNodo.getNodo();
            }

        }
        return ultimoNodo;
    }

    public Object getValor(int posicion) {
        Nodo ultimoNodo = null;

        int contador = 0;
        Object valor = null;
        if (primero != null) {
            ultimoNodo = primero;
            do {
                ultimoNodo = ultimoNodo.getNodo();
                if (contador == posicion) {
                    valor = ultimoNodo.getValor();
                    break;
                } else {
                    contador++;
                }
            } while (ultimoNodo.getNodo() != null);
        }
        return valor;
    }
}
