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
import java.util.function.Predicate;

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

        System.out.println(ColaCliente + "\n");

        while (true) {

            System.out.println("Por favor, elija una opcion \n");
            System.out.println("Para insertar un cliente nuevo, ingrese 1 \n");
            System.out.println("Para ver cual cliente esta en frente, ingrese 2 \n");
            System.out.println("Para sacar a un cliente, ingrese 3 \n");
            System.out.println("Para contar la cantidad de clientes, ingrese 4 \n");
            System.out.println("Para buscar un cliente por su nombre, ingrese 5 \n");
            System.out.println("Para buscar un cliente por su indice, ingrese 6 \n");
            System.out.println("Para verificar si la cola esta vacia, ingrese 7 \n");
            System.out.println("Para ingresar nuevos clientes, ingrese 8\n");
            System.out.println("Para borrar varios clientes, ingrese 9\n");
            System.out.println("Para borrar el primer cliente, ingrese 10\n");
            System.out.println("Para borrar todos los clientes, ingrese 11\n");
            System.out.println("Para verificar si un cliente esta en la cola, ingrese 12\n");
            System.out.println("Para salir del sistema, ingrese 13.");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente");
                    indice++;
                    cc.setIndice(indice);
                    ColaCliente.add(new ClienteCola(sc.next(), cc.getIndice()));

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

                        }
                    }
                    System.out.println("Nueva cola: ");
                    System.out.println(ColaCliente);
                    break;
                case 4:
                    System.out.println("El numero de clientes total es: " + ColaCliente.size());
                    System.out.println(ColaCliente);
                    break;

                case 5:
                    System.out.println("Ingrese el nombre del cliente que desea mostrar");
                    String elemento = sc.next();
                    Iterator<ClienteCola> itr2 = ColaCliente.iterator();
                    while (itr2.hasNext()) {
                        ClienteCola obj = itr2.next();
                        if (obj.getName().equalsIgnoreCase(elemento)) {
                            System.out.println("El cliente " + elemento + " esta en la posicion " + obj.getIndice());

                        }
                    }
                    break;
                case 7:
                    if (ColaCliente.isEmpty() == true) {
                        System.out.println("La cola esta vacia");

                    } else {
                        System.out.println("La cola no esta vacia");
                        System.out.println(ColaCliente);

                    }
                    break;
                case 8:
                    Queue<ClienteCola> nuevacola = new LinkedList<ClienteCola>();
                    indice++;
                    cc.setIndice(indice);

                    nuevacola.add(new ClienteCola("Rigoberto", cc.getIndice()));
                    indice++;
                    cc.setIndice(indice);

                    nuevacola.add(new ClienteCola("Eugenio", cc.getIndice()));
                    indice++;
                    cc.setIndice(indice);

                    nuevacola.add(new ClienteCola("Calmando", cc.getIndice()));

                    ColaCliente.addAll(nuevacola);

                    System.out.println("Nueva cola: ");
                    System.out.println(ColaCliente);
                    break;
                case 6:
                    System.out.println("Ingrese el indice del cliente que desea mostrar");
                    Iterator<ClienteCola> itr3 = ColaCliente.iterator();
                    int id = sc.nextInt();
                    while (itr3.hasNext()) {
                        ClienteCola obj = itr3.next();
                        if (obj.getIndice() == id) {
                            System.out.println("El cliente que se encuentra en la posicion " + id + " se llama " + obj.getName());

                        }
                    }
                    break;
                case 9:
                    System.out.println("Ingrese el indice inicial a eliminar");
                    int ind1 = sc.nextInt();
                    System.out.println("Ingrese el indice final a eliminar");
                    int ind2 = sc.nextInt();
                    Predicate<ClienteCola> condition = n -> n.getIndice() >= ind1 && n.getIndice() <= ind2;
                    ColaCliente.removeIf(condition);
                    break;
                case 10:
                    ColaCliente.poll();
                    System.out.println("Primer cliente eliminado");
                    System.out.println("Nueva cola: ");
                    System.out.println(ColaCliente);
                    break;

                case 11:
                    ColaCliente.clear();
                    System.out.println("La cola ha sido vaciada");
                    break;
                case 12:
                    System.out.println("Ingrese el nombre del cliente que desea verificar");
                    String nom = sc.next();
                    Iterator<ClienteCola> itr4 = ColaCliente.iterator();
                    while (itr4.hasNext()) {
                        ClienteCola obj = itr4.next();
                        if (obj.getName().equalsIgnoreCase(nom)) {
                            System.out.println("El cliente " + nom + " si esta en la cola");

                        }
                    }
                    break;

                case 13:
                    System.exit(0);
                    break;
            }

        }

    }

}
