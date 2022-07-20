
package puntoe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class puntoe {
 
     public static void main(String[] args) {
        
        
        //FILA EN JAVA
       
        List<String> caracteristicaa = new ArrayList(); 
        caracteristicaa.add("one"); 
        caracteristicaa.add("two");
        caracteristicaa.add("three");
        caracteristicaa.add("four");
        caracteristicaa.add("five");
        System.out.println("lista: " + caracteristicaa);
               
        
        //PILA EN JAVA
        Stack<String> caracteristica = new Stack<>();
        caracteristica.push("Ram");
        caracteristica.push("shayam");
        caracteristica.push("sharma");
        caracteristica.push("monu");
        caracteristica.push("sonu");
        System.out.println("\npila: " + caracteristica);
        System.out.println("ultimo en entrar : " + caracteristica.peek());
        System.out.println("primero en salir : " + caracteristica.pop());
        
        
        // COLAS EN JAVA
        Queue<String> caracteristica2;
        caracteristica2= new LinkedList<>();
        caracteristica2.offer("felo");
        caracteristica2.offer("yair");
        caracteristica2.offer("lina");
        caracteristica2.offer("jose");
        caracteristica2.offer("eduar");
        
        System.out.println("\ncola: " +caracteristica2);
        System.out.println("primero en entrar: " +caracteristica2.peek());
        System.out.println("primero en salir: " +caracteristica2.poll());
        System.out.println("\n ");
        
        
        //MAPA EN JAVA 
        Map<Integer,String> caracteristica3= new HashMap<>();
        caracteristica3.put(1,"Red");
        caracteristica3.put(2, "Green");
        caracteristica3.put(3, "Blue");
        caracteristica3.put(4, "White");
        caracteristica3.put(5, "purple");
        System.out.println(caracteristica3);
        
        
        //CONJUNTO EN JAVA
        
        HashSet<String> caracteristica4 = new HashSet();
        caracteristica4.add("lunes");
        caracteristica4.add("martes");
        caracteristica4.add("miercoles");
        caracteristica4.add("jueves");
        caracteristica4.add("viernes");
        
        System.out.println("\nconjunto: "+caracteristica4);
        
    }
    
}
