
package ventas;


import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;


public class arregloVenta {
    public static void main(String[] args){
        
        int sumaventa= 0;
        int promedio=0;
        int ventaMayor = 0;
        int ventamenor = 9999999;
        int aux = 0;
        int vv = 0;
        Random r = new Random();
        int cont_pares = 0, cont_impar=0;
        
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("ventas a registrar"));
        
        int venta[] = new int[a]; //arreglo de venta
        
        for(int i=0; i<a; i++){
            venta[i] = (int) (Math.random() * 1000 + 1);        //agregar los valore de forma aleatoria
            System.out.println("venta ["+i+"]: $ "+venta[i]);
            
       
            
           sumaventa =sumaventa + venta[i]; //funcion para la suma total de ventas
           promedio = sumaventa / a;        //funcion para el promedio de las ventas 
           
            
           if(venta[i]>ventaMayor){         //funcion para la venta mayor 
               ventaMayor = venta[i];
           }
           else if(venta[i]<ventamenor){    //funcion para la venta menor
              ventamenor = venta[i]; 
           }
           
           if(venta[i]% 2==0){   //contador de numero pares
               cont_pares++;
           }
           else{
               cont_impar++;      //contador de numero impares
           }
        }
        
        System.out.println("\nCantidad de ventas: "+venta.length);
        System.out.println("suma de ventas: $ "+sumaventa);
        System.out.println("promedio de ventas: $"+promedio);
        System.out.println("venta meyor: $ "+ventaMayor);
        System.out.println("venta menor: $ "+ventamenor);
        
        //ordenar el arreglo de mayor a menor ASCENDENTE
            System.out.println("\nventas de mayor a menor: ");
            for(int i=0; i<venta.length; i++){    
            for(int j=i+1; j<venta.length; j++){
              if(venta[i]<venta[j]){                  
                  aux = venta[i];
                  venta[i] = venta[j];
                  venta[j] = aux;
              }  
            }
        }
        for(int i= 0;i<venta.length; i++){
            System.out.println(venta[i]);
        }
        
        //ordenar el arreglo de menor a mayor DESCENDENTE
        System.out.println("\nventas de menor a la mayor");  
        Arrays.sort(venta);
           for(int des : venta){
               System.out.print(""+des+"\n"); 
            }  
           
       for(int i = 0; i < venta.length; i++){          //desordenar el arreglo 
        int desorden = r.nextInt(venta.length);
        int temp = venta[i];
        venta[i]= venta[desorden];
        venta[desorden]= temp;
        }
        System.out.println("\nventas desordenadas"+Arrays.toString(venta));
         
        
        //funcion para numeros pares e impares 
        int par[] = new int[cont_pares];
        int impar[] = new int [cont_impar];
        
        cont_pares=0;
        cont_impar=0;
        
        for(int i =0; i<a; i++){
            if(venta[i] % 2 == 0 ){    //si es par 
                par[cont_pares]=venta[i];
                cont_pares++;
            }
            else{
                impar[cont_impar]=venta[i];  //si es impar 
                cont_impar++;
            }
        }
         System.out.println("\n numeros pares: ");
         for(int i =0; i < cont_pares ; i++){
             System.out.println(par[i]);
         }
         System.out.println("\n numeros impares: ");
         for(int i =0; i < cont_impar ; i++){
             System.out.println(impar[i]);
         }
         
         
           
    }
    
}
