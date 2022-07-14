/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;

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
        ArrayDeque<ClientePila> PilaCliente = new ArrayDeque<ClientePila>();

        while (true) {
            System.out.println("\n Por favor, elija una opcion \n");
            System.out.println("Para insertar un cliente nuevo, ingrese 1 \n");
            System.out.println("Para eliminar el primer cliente, presione 2 \n");
            System.out.println("Para eliminar el ultimo cliente, presione 3  \n");
            System.out.println("Para contar la cantidad de clientes, ingrese 4 \n");
            System.out.println("Para buscar un cliente por su nombre, ingrese 5 \n");
            System.out.println("Para buscar un cliente por su indice, ingrese 6 \n");
            System.out.println("Para verificar si la pila esta vacia, ingrese 7 \n");
            System.out.println("Para mostrar los clientes desde el primero hasta el ultimo, ingrese 8\n");
            System.out.println("Para mostrar los clientes desde el ultimo hasta el primero, ingrese 9\n");
            System.out.println("Para borrar todos los clientes, ingrese 10\n");
            System.out.println("Para agregar varios clientes, ingrese 11\n");
            System.out.println("Para eliminar varios clientes, ingrese 12\n");
            System.out.println("Para verificar si un cliente esta en la lista, ingrese 13\n");
            System.out.println("Para salir del sistema, ingrese 14 \n");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente");
                    indice++;
                    cp.setIndice(indice);
                    PilaCliente.add(new ClientePila(sc.next(), cp.getIndice()));

                    System.out.println("Nueva pila: ");
                    System.out.println(PilaCliente);
                    break;
                case 2:
                    Object primcli = PilaCliente.removeFirst();
                    System.out.println("Primer cliente eliminado " + primcli.toString());
                    System.out.println("Nueva pila: ");
                    System.out.println(PilaCliente);
                    break;

                case 3:
                    Object ulticli = PilaCliente.removeLast();
                    System.out.println("Ultimo cliente eliminado " + ulticli.toString());
                    System.out.println("Nueva pila: ");
                    System.out.println(PilaCliente);
                    break;

                case 4:
                    System.out.println("El tamaño de la pila es " + PilaCliente.size());
                    break;

                case 5:
                    System.out.println("Ingrese el nombre del cliente que desea mostrar");
                    String elemento = sc.next();
                    Iterator<ClientePila> itr = PilaCliente.iterator();
                    while (itr.hasNext()) {
                        ClientePila obj = itr.next();
                        if (obj.getNombre().equalsIgnoreCase(elemento)) {
                            System.out.println("El cliente " + elemento + " esta en la posicion " + obj.getIndice());

                        }
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el indice del cliente que desea mostrar");
                    int id = sc.nextInt();
                    Iterator<ClientePila> itr2 = PilaCliente.iterator();
                    while (itr2.hasNext()) {
                        ClientePila obj = itr2.next();
                        if (obj.getIndice() == id) {
                            System.out.println("El cliente que se encuentra en la posicion " + id + " se llama " + obj.getNombre());

                        }
                    }
                    break;
                case 7:
                    if (PilaCliente.isEmpty() == true) {
                        System.out.println("La pila esta vacia");

                    } else {
                        System.out.println("La pila no esta vacia");
                        System.out.println(PilaCliente);

                    }
                    break;

                case 8:
                    System.out.println("Esta es la pila de clientes del primero al ultimo");
                    Iterator<ClientePila> itr3 = PilaCliente.iterator();
                    while (itr3.hasNext()) {
                        System.out.println(itr3.next());
                    }

                    break;

                case 9:
                    System.out.println("Esta es la pila de clientes del ultimo al primero");
                    Iterator<ClientePila> ditr = PilaCliente.descendingIterator();
                    while (ditr.hasNext()) {
                        System.out.println(ditr.next());
                    }

                    break;
                case 10:
                    PilaCliente.clear();
                    System.out.println("La pila ha sido vaciada");
                    break;

                case 11:

                    ArrayDeque<ClientePila> nuevapila = new ArrayDeque<ClientePila>();
                    indice++;
                    cp.setIndice(indice);
                    nuevapila.add(new ClientePila("Rigoberto", cp.getIndice()));
                    indice++;
                    cp.setIndice(indice);
                    nuevapila.add(new ClientePila("Eugenio", cp.getIndice()));
                    indice++;
                    cp.setIndice(indice);
                    nuevapila.add(new ClientePila("Calmando", cp.getIndice()));

                    PilaCliente.addAll(nuevapila);

                    System.out.println("Nueva pila: ");
                    System.out.println(PilaCliente);
                    break;

                case 12:
                    System.out.println("Ingrese el indice inicial a eliminar");
                    int ind1 = sc.nextInt();
                    System.out.println("Ingrese el indice final a eliminar");
                    int ind2 = sc.nextInt();
                    Predicate<ClientePila> condition = n -> n.getIndice() >= ind1 && n.getIndice() <= ind2;
                    PilaCliente.removeIf(condition);
                    break;

                case 13:
                    System.out.println("Ingrese el nombre del cliente que desea verificar");
                    String nom = sc.next();
                    Iterator<ClientePila> itr4 = PilaCliente.iterator();
                    while (itr4.hasNext()) {
                        ClientePila obj = itr4.next();
                        if (obj.getNombre().equalsIgnoreCase(nom)) {
                            System.out.println("El cliente " + nom + " si esta en la pila");

                        }
                    }
                    break;
                case 14:
                    System.exit(0);
                    break;

            }

        }
    }

}
