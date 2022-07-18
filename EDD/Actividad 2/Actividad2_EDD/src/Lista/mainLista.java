/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tf2he
 */
public class mainLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;
        ListaOBJ lista = new ListaOBJ();
        List<ListaOBJ> listaSimple = new ArrayList<ListaOBJ>();

        listaSimple.add(0, new ListaOBJ("Sisas"));
        
        while (true) {
            
            
            opt = sc.nextInt();

            switch (opt) {
                case 1: 
                    System.out.println("Ingrese el nombre del cliente");                                 
                    listaSimple.add(new ListaOBJ(sc.next()));

                    System.out.println("Nueva pila: ");
                    System.out.println(listaSimple);
                    break;
                    
                case 2:
                    
                    
                default:
                    break;

            }
        }

    }

}
