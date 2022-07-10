/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author tf2he
 */
public class mainCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opt;
        int tno;

        ClienteCola cc = new ClienteCola();
        Queue<ClienteCola> ColaCliente = new LinkedList<ClienteCola>();

        System.out.println(ColaCliente);

        while (true) {

            System.out.println("Por favor, elija una opcion \n");
            System.out.println("Para insertar un cliente nuevo, ingrese 1 \n");
            System.out.println("Para ver cual cliente esta en frente, ingrese 2 \n");
            System.out.println("Para sacar a un cliente, ingrese 3 \n");
            System.out.println("Para contar la cantidad de clientes, ingrese 4 \n");
            System.out.println("Para salir del sistema, ingrese 5.");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente");
                    ColaCliente.add(new ClienteCola(sc.next(), ColaCliente.size() + 1));
                    System.out.println("Nueva cola: ");
                    System.out.println(ColaCliente);

                case 2:
                    System.out.println(ColaCliente.peek());
                    
                case 3:

            }

            if (opt == 2) {
                System.out.println(ColaCliente.peek());
            }

            if (opt == 3) {
                System.out.println("Enter token num to delete");
                int to_num = sc.nextInt();
                Iterator<ClienteCola> itr = ColaCliente.iterator();

                while (itr.hasNext()) {
                    ClienteCola obj = itr.next();
                    if (obj.getIndice() == to_num) {
                        ColaCliente.remove(obj);
                        break;
                    }
                }
            }

            if (opt == 4) {
                System.out.println("Number of students in the queue is: " + ColaCliente.size());
                System.out.println(ColaCliente);
            }

            if (opt == 5) {
                System.exit(0);
            }

        }

    }
}
