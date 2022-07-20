
package matriz;




public class bidimencional {
    
    public static void main(String[] args){
          
    Object lenguaje[][] = new Object[8][5];
    
    
    //[NOMBRE, AÑO, AUTOR, DETALLES, FRAMEWORKS]
    lenguaje[0][0]="NOMBRE";
    lenguaje[0][1]="AÑO";
    lenguaje[0][2]="AUTOR";
    lenguaje[0][3]="DETALLES";
    lenguaje[0][4]="FRAMEWORKS";
    
        for(int i = 0; i < 8 ; i++){      
        System.out.print("\n");
            for(int j = 0; j < 5 ; j++){
                System.out.print(lenguaje[i][j]+"\t");
            }
        }
        
        
    
     /* 
    for(int i = 0; i < 5 ; i++){
        for(int j = 0; j < 2 ; j++){
            System.out.println("datos de la matriz");
            Object dato =  teclado.nextLine();
            lenguaje[5][2] = dato;
        }
    }   
        System.out.println("Datos de la Matrriz");        
        for(int i = 0; i < 5 ; i++){
            System.out.println("\n");
            for(int j = 0; j < 2 ; j++){
                System.out.println(lenguaje[i][j]+"\t");
            }
        }    
}
    
  */  
    
    
    
    
}
}