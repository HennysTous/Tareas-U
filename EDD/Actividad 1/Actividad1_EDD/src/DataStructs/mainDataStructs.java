/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructs;

import java.util.Scanner;

/**
 *
 * @author tf2he
 */
public class mainDataStructs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dataStructs = {"Listas", "Colas", "Pilas", "Mapas", "Conjuntos"};
        String[] caracteristicas = new String[5];
        for (int i = 0; i < caracteristicas.length; i++) {
            System.out.println("Ingrese el dato numero " + (i + 1) + " por teclado de caracteristicaS: ");
            caracteristicas[i] = sc.nextLine();

        }
        
        for (int i = 0; i <caracteristicas.length; i++) {

            System.out.println(dataStructs[i] + " | son | " + caracteristicas[i]);

        }

    }

}
