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
public class ListaDoble {

    private Nodo prim, ulti;
    private int nElem;

    public ListaDoble() {
        ulti = null;
        prim = null;
        nElem = 0;

    }

    public void insertar(int ele1, int ele2) {
        Nodo nodo = new Nodo(ele1, ele2, null, null);

        if (prim == null) {
            prim = nodo;
            ulti = nodo;
        } else if (prim.getSiguiente() == null) {
            if (prim.getElemento1() < ele1) {
                prim.setSiguiente(nodo);
            } else {
                nodo.setSiguiente(prim);
                prim = nodo;
            }
            if (ulti.getElemento2() > ele2) {
                ulti.setAnterior(nodo);
            } else {
                nodo.setAnterior(ulti);
                ulti = nodo;
            }
        } else {

            Nodo act = prim;
            if (prim.getElemento1() > ele1) {

                nodo.setSiguiente(prim);
                prim = nodo;

            } else {
                while (act.getSiguiente() != null) {
                    if (act.getSiguiente().getElemento1() > ele1) {

                        nodo.setSiguiente(act.getSiguiente());
                        act.setSiguiente(nodo);
                        act = nodo.getSiguiente();

                    } else {
                        act = act.getSiguiente();

                    }

                }
                if (act.getSiguiente() == null && act.getElemento1() < ele1) {
                    act.setSiguiente(nodo);
                }
            }
            act = ulti;
            if (ulti.getElemento2() < ele2) {
                nodo.setAnterior(ulti);
                ulti = nodo;

            } else {
                while (act.getAnterior() != null) {
                    if (act.getAnterior().getElemento2() < ele2) {
                        nodo.setAnterior(act.getAnterior());
                        act.setAnterior(nodo);
                        act = nodo.getAnterior();

                    } else {
                        act = act.getAnterior();
                    }

                }
                if (act.getAnterior() == null && act.getElemento2() > ele2) {
                    act.setAnterior(nodo);
                }
            }
        }
    }

    public void listar() {
        Nodo act = prim;
        System.out.println("Listar desde primero");
        while (act.getSiguiente() != null) {
            System.out.println(act.getElemento1() + "--" + act.getElemento2());
            act = act.getSiguiente();

        }
        System.out.println(act.getElemento1() + "--" + act.getElemento2());
        act = ulti;
        System.out.println("Listar desde ultimo");
        while (act.getAnterior() != null) {
            System.out.println(act.getElemento1() + "--" + act.getElemento2());
            act = act.getAnterior();
        }
        System.out.println(act.getElemento1() + "--" + act.getElemento2());
    }
}
