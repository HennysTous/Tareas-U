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
        Iterator<ClienteCola> itr = ColaCliente.iterator();
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
                    

                    while (itr.hasNext()) {
                        ClienteCola obj = itr.next();
                        if (obj.getIndice() == tonum) {
                            ColaCliente.remove(obj);
                           
                            break;
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
                    

                    while (itr.hasNext()) {
                        ClienteCola obj = itr.next();
                        if (obj.getName().equalsIgnoreCase(elemento)) {
                            System.out.println("El cliente "+elemento+" esta en la posicion " +obj.getIndice());
                           
                            break;
                        }
                    }
                case 8:
                    if(ColaCliente.isEmpty() == true){
                    System.out.println("La cola esta vacia");
                    
                    }else{
                    System.out.println("La cola no esta vacia");
                    System.out.println(ColaCliente);
                    
                    }
                    break;
                case 7:
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
                    int id = sc.nextInt();  
                    while (itr.hasNext()) {
                        ClienteCola obj = itr.next();
                        if (obj.getIndice()==id) {
                            System.out.println("El cliente que se encuentra en la posicion "+id+" se llama "+obj.getName());
                           
                            break;
                        }
                    }
                case 9:
                    System.out.println("Ingrese el indice inicial a eliminar");
                    int ind1 =sc.nextInt();
                    System.out.println("Ingrese el indice final a eliminar");
                    int ind2 =sc.nextInt();
                    Predicate<ClienteCola> condition = n->n.getIndice()>=ind1 && n.getIndice()<=ind2;
                    ColaCliente.removeIf(condition);
                    break;
                case 10:
                    
                    ColaCliente.clear();
                    System.out.println("La cola ha sido vaciada");
                    break;
                    
                case 11:
                    System.exit(0);
                    break;
            }

        }

    }

}
