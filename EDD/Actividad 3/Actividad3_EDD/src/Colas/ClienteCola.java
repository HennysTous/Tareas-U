/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

/**
 *
 * @author tf2he
 */
public class ClienteCola {

    private String nombre;

    private int indice;

    ClienteCola() {

    }

    public ClienteCola(String nombre, int indice) {
        this.nombre = nombre;
        this.indice = indice;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String toString() {
        return "Student nombre: " + nombre + "  Token num: " + indice;
    }

}
