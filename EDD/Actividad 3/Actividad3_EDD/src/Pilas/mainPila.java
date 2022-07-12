/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author tf2he
 */
public class mainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opt;
        int indice = 0;

        ClientePila cp = new ClientePila();
        ArrayDeque<ClientePila> ColaCliente = new ArrayDeque<ClientePila>();
        System.out.println(ColaCliente);

        while (true) {
            System.out.println("Por favor, elija una opcion \n");
            System.out.println("Para insertar un cliente nuevo, ingrese 1 \n");
            System.out.println("Para ver cual cliente esta en frente, ingrese 2 \n");
            System.out.println("Para sacar a un cliente, ingrese 3 \n");
            System.out.println("Para contar la cantidad de clientes, ingrese 4 \n");
            System.out.println("Para verificar si el nombre de un cliente esta en la cola, ingrese 5 \n");
            System.out.println("Para buscar un cliente por su indice, ingrese 6 \n");
            System.out.println("Para verificar si la cola esta vacia, ingrese 7 \n");
            System.out.println("Para ingresar nuevos clientes, ingrese 8\n");
            System.out.println("Para borrar varios clientes, ingrese 9\n");
            System.out.println("Para borrar todos los clientes, ingrese 10\n");
            System.out.println("Para salir del sistema, ingrese 11.");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:

            }

        }
    }

}
