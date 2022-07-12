/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author tf2he
 */
public class ClientePila {
    
    private String nombre;
    private int indice;

    public ClientePila() {
    }

    public ClientePila(String nombre, int indice) {
        this.nombre = nombre;
        this.indice = indice;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "\n ClientePila{" + "nombre=" + nombre + ", indice=" + indice + '}';
    }
    
    
    
}
