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

    private Nodo ini;
    private Nodo fin;

    public ListaDobleEnlazada(int[] lista) {
        System.out.println("Lista enlazada doble");

        this.ini = null;
        this.fin = null;

        for (int n : lista) {

            Nodo nuevo = new Nodo(n);

            if (this.ini == null) {
                this.ini = nuevo;
                this.fin = nuevo;

            } else {
                nuevo.setAnterior(this.fin);
                this.fin.setSiguiente(nuevo);
                this.fin = nuevo;

            }

        }

    }

    public void imprimirLista() {
        System.out.println("Recorre lista hacia adelante");
		Nodo pNodo = this.ini;
		while ( pNodo != null ) {
			System.out.println(pNodo.getNumero());
			pNodo = pNodo.getSiguiente();
		} 

    }
    
    
    public void imprimirListaReverso(){
    System.out.println("Recorre lista hacia atras");
		Nodo pNodo = this.fin;
		while ( pNodo != null ) {
			System.out.println(pNodo.getNumero());
			pNodo = pNodo.getAnterior();
		} 
    
    
    }

}
