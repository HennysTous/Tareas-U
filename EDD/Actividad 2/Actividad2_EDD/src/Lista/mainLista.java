/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

        while (true) {

            
            
            System.out.println("Para agregar un nombre a la lista, presione 1");
            System.out.println("Para saber si la lista esta vacia, presione 2");
            System.out.println("Para saber contar los elementos de la lista, presione 3");
            System.out.println("Para buscar un nombre, presione 4");
            System.out.println("Para obtener el indice de un nombre, presione 5");
            System.out.println("Para obtener el nombre en un indice, presione 6");
            System.out.println("Para agregar un nombre al inicio de la lista, presione 7");
            System.out.println("Para agregar un nombre al final de la lista, presione 8");
            System.out.println("Para agregar un nombre en cualquier parte de la lista, presione 9");
            System.out.println("Para eliminar el primer nombre de la lista, presione 10");
            System.out.println("Para eliminar el ultimo nombre de la lista, presione 11");
            System.out.println("Para eliminar cualquier nombre de la lista, presione 12");
            System.out.println("Para agregar varios nombres a la lista, presione 13");
            System.out.println("Para eliminar varios nombres de la lista, presione 14");
            System.out.println("Para vaciar la lista, presione 15");
            System.out.println("Para ordenar la lista ascendentemente, presione 16");
            System.out.println("Para ordenar la lista descendentemente, presione 17");
            System.out.println("Para desordenar la lista, presione 18");
            
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    //Solo Agregar
                    System.out.println("Ingrese el nombre");
                    listaSimple.add(new ListaOBJ(sc.next()));

                    System.out.println("Nueva lista: ");
                    System.out.println(listaSimple);
                    break;

                case 2:
                    //Punto 12 y 16
                    if (listaSimple.isEmpty() == true) {
                        System.out.println("La lista esta vacia");

                    } else {
                        System.out.println("La lista no esta vacia");
                        System.out.println(listaSimple);

                    }
                    break;
                case 3:
                    //Punto 11
                    System.out.println("El tamaño de la lista es " + listaSimple.size());
                    break;
                case 4:
                    //Punto 13
                    System.out.println("Ingrese el indice a buscar");
                    Object obj1 = listaSimple.get(sc.nextInt());

                    System.out.println(obj1);
                    break;

                case 5:
                    //Punto 14
                    System.out.println("Ingrese el nombre que desea mostrar");
                    String elemento = sc.next();
                    Iterator<ListaOBJ> itr = listaSimple.iterator();
                    while (itr.hasNext()) {
                        ListaOBJ obj = itr.next();
                        if (obj.getNombre().equalsIgnoreCase(elemento)) {
                            System.out.println("El nombre " + elemento + " esta en la posicion " + listaSimple.indexOf(elemento));

                        }
                    }
                    break;

                case 6:
                    //Punto 15
                    System.out.println("Ingrese el indice del nombre que desea mostrar");
                    int id = sc.nextInt();

                    System.out.println("El nombre que se encuentra en la posicion " + id + " es " + listaSimple.get(id));

                    break;
                case 7:
                    //Punto 17
                    System.out.println("Ingrese el nombre que desea agregar en el inicio");
                    listaSimple.add(0, new ListaOBJ(sc.next()));

                    System.out.println("Nueva lista: ");
                    System.out.println(listaSimple);
                    break;

                case 8:
                    //Punto 18
                    System.out.println("Ingrese el nombre que desea agregar al final");
                    int ultimoindi = listaSimple.size() - 1;
                    listaSimple.add(ultimoindi, new ListaOBJ(sc.next()));

                    System.out.println("Nueva lista: ");
                    System.out.println(listaSimple);
                    break;

                case 9:
                    //Punto 19 y 20
                    System.out.println("Ingrese el nombre que desea agregar en la lista");
                    String nombre = sc.next();
                    System.out.println("Ingrese el indice en el que desea agregar en el nombre");
                    int indi = sc.nextInt();
                    listaSimple.add(indi, new ListaOBJ(nombre));

                    System.out.println("Nueva lista: ");
                    System.out.println(listaSimple);
                    break;

                case 10:
                    //Punto 21
                    listaSimple.remove(0);
                    System.out.println("Nueva lista: ");
                    System.out.println(listaSimple);
                    break;
                case 11:
                    //Punto 22
                    listaSimple.remove((listaSimple.size() - 1));
                    System.out.println("Nueva lista: ");
                    System.out.println(listaSimple);
                    break;

                case 12:
                    //Punto 23 y 24
                    System.out.println(listaSimple);
                    System.out.println("Ingrese el indice del nombre a eliminar");
                    listaSimple.remove(sc.nextInt());

                    System.out.println("Nueva lista: ");
                    System.out.println(listaSimple);
                    break;

                case 13:
                    //Punto 25
                    List<ListaOBJ> listanueva = new ArrayList<ListaOBJ>();
                    while (true) {
                        System.out.println(listanueva);
                        System.out.println("Desea añadir otro cliente? Si o No?");
                        String elec = sc.next();
                        if (elec.equalsIgnoreCase("si")) {
                            System.out.println("Ingrese el nuevo nombre");
                            listanueva.add(new ListaOBJ(sc.next()));
                        } else {
                            break;
                        }
                    }
                    System.out.println("En cual indice desea agregar el/los nombres nuevos?");
                    listaSimple.addAll(sc.nextInt(), listanueva);

                    System.out.println("Nueva lista: ");
                    System.out.println(listaSimple);
                    break;

                case 14:
                    //Punto 26
                    System.out.println(listaSimple);
                    System.out.println("Ingrese el indice inicial a eliminar");
                    int ind1 = sc.nextInt();
                    System.out.println("Ingrese el indice final a eliminar");
                    int ind2 = sc.nextInt();

                    List<ListaOBJ> listaelim = listaSimple.subList(ind1, ind2);
                    listaSimple.removeAll(listaelim);
                    break;
                case 15:
                    //Punto 27
                    listaSimple.clear();
                    System.out.println("La lista ha sido limpiada");
                    
                    System.out.println("Nueva lista: ");
                    System.out.println(listaSimple);
                    break;
                    
                case 16:
                    //Punto 28
                    listaSimple.sort((object1, object2) -> object1.getNombre().compareTo(object2.getNombre()));
                    System.out.println("Nueva lista ordenada ascendentemente: ");
                    System.out.println(listaSimple);
                    break;
                    
                case 17:
                    //Punto 29
                    listaSimple.sort((object1, object2) -> object2.getNombre().compareTo(object1.getNombre()));
                    System.out.println("Nueva lista ordenada descendentemente: ");
                    System.out.println(listaSimple);
                    break;
                case 18:
                    //Punto 30
                    Collections.shuffle(listaSimple);
                    System.out.println("Nueva lista desordenada: ");
                    System.out.println(listaSimple);
                    break;
                default:
                    break;

            }
        }

    }

}
