package ListaCircularEnlazada;

public class listaCircular {

    nodo primero;
    nodo ultimo;

    public listaCircular() {
        primero = null;
        ultimo = null;
    }

    public void ingresarnodo(int num) {
        nodo nodoNuevo = new nodo();
        nodoNuevo.numero = num;
        if (primero == null) {
            primero = nodoNuevo;
            ultimo = primero;
            primero.siguiente = ultimo;
        } else {
            ultimo.siguiente = nodoNuevo;
            nodoNuevo.siguiente = primero;
            ultimo = nodoNuevo;
        }
    }

    public void verlista() {
        nodo actual;
        actual = primero;

        while (actual != null) {
            System.out.println("" + actual.numero);
            actual = actual.siguiente;
            System.out.println("" + actual.numero);
            actual = actual.siguiente;
            
            if (actual == primero) {

                break;
            }

        }

    }
}
