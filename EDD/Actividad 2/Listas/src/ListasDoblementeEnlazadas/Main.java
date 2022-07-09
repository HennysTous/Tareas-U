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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        ListaDoble ld = new ListaDoble();
        
        System.out.println("Insertamos 4-50");
        ld.insertar(4, 50);
        ld.listar();
        System.out.println("Insertamos 0-10");
        ld.insertar(0, 10);
        ld.listar();
        System.out.println("Insertamos 2-30");
        ld.insertar(2, 30);
        ld.listar();
        System.out.println("Insertamos 3-40");
        ld.insertar(3, 40);
        ld.listar();
        System.out.println("Insertamos 1-20");
        ld.insertar(1, 20);
        ld.listar();
    }
    
}
