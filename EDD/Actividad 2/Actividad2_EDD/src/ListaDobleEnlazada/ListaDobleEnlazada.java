/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDobleEnlazada;

/**
 *
 * @author tf2he
 */
public class ListaDobleEnlazada {

    private Nodo primero;
    private Nodo ultimo;

    private int numElem;

    public ListaDobleEnlazada() {
        this.primero = null;
        this.ultimo = null;
        this.numElem = 0;
    }

    void insertar(int num) {

        Nodo nuevo = new Nodo(num, null, null);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;

        }
        else if (primero.getSig()==null){
         //orden ascendente puntero primero
        if (primero.getnum()<elem1){
            primero.setSig(nuevo);
        }else{
            nuevo.setSig(primero);
            primero=nuevo;
        }
        //orden descendente puntero último
        if ( ultimo.getElemento2()>elem2){
            ultimo.setAnt(nuevo);
            
        }else{
            nuevo.setAnt(ultimo);
            ultimo=nuevo;
        }
    }

    }

}
