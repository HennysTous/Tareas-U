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
        int indice = 0;

        ClienteCola cc = new ClienteCola();
        Queue<ClienteCola> ColaCliente = new LinkedList<ClienteCola>();

        System.out.println(ColaCliente);

        while (true) {

            System.out.println("Por favor, elija una opcion \n");
            System.out.println("Para insertar un cliente nuevo, ingrese 1 \n");
            System.out.println("Para ver cual cliente esta en frente, ingrese 2 \n");
            System.out.println("Para sacar a un cliente, ingrese 3 \n");
            System.out.println("Para contar la cantidad de clientes, ingrese 4 \n");
            System.out.println("Para verificar si un cliente esta en la cola, ingrese 5 \n");
            System.out.println("Para salir del sistema, ingrese 6.");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente");
                    indice++;
                    ColaCliente.add(new ClienteCola(sc.next(), indice));

                    System.out.println("Nueva cola: ");
                    System.out.println(ColaCliente);
                    break;

                case 2:
                    System.out.println(ColaCliente.peek());
                    break;

                case 3:
                    System.out.println("Ingrese el indice de cliente que desea borrar");
                    int tonum = sc.nextInt();
                    Iterator<ClienteCola> itr = ColaCliente.iterator();

                    while (itr.hasNext()) {
                        ClienteCola obj = itr.next();
                        if (obj.getIndice() == tonum) {
                            ColaCliente.remove(obj);
                            indice--;
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("El numero de clientes total es: " + ColaCliente.size());
                    System.out.println(ColaCliente);
                    break;

                case 5:
                    System.out.println("Ingrese el nombre del cliente que desea mostrar");
                    String elemento = sc.next();
                    if(ColaCliente.contains(elemento)){
                    System.out.println()
                    
                    }

                case 6:
                    break;
            }

        }

    }

}
