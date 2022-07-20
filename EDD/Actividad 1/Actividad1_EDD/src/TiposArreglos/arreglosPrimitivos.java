
package TiposArreglos;


public class arreglosPrimitivos {
    
    public static void main(String[] args){
        
    int[] edad = new int[5];
    long[] año= new long[5];
    float[] estatura = new float[5];
    double[] distancia = new double[5];
    char[] sexo = new char[5];
    String[] nombre = new String[5];
    
        System.out.println("arreglo de tipo entero");
    edad[0]=5;
    edad[1]=25;
    edad[2]=1;
    edad[3]=12;
    edad[4]=5;
     
    for(int i=0 ; i<5 ; i++){
        System.out.println("elemento "+i+" = "+edad[i]);
        
    }
    
    //.......................................................
    System.out.println(".................................");
    System.out.println("arreglo de tipo entero largo");
    año[0]=1992;
    año[1]=2005;
    año[2]=1993;
    año[3]=1995;
    año[4]=1996;
     
    for(int i=0 ; i<5 ; i++){
        System.out.println("elemento "+i+" = "+año[i]);
    }
    
    //.......................................................
    System.out.println(".................................");
    System.out.println("arreglo de tipo flotante");
    estatura[0]=(float) 19.92;
    estatura[1]=(float) 20.05;
    estatura[2]=(float) 19.93;
    estatura[3]=(float) 19.95;
    estatura[4]=(float) 19.96;
     
    for(int i=0 ; i<5 ; i++){
        System.out.println("elemento "+i+" = "+estatura[i]);
    }
    
    //.......................................................
    System.out.println(".................................");
    System.out.println("arreglo de tipo desimal largo");
    
    distancia[0]=19.924555454;
    distancia[1]=20.0505050505;
    distancia[2]=19.93939393939;
    distancia[3]=19.959595959595;
    distancia[4]=19.969696969696;
     
    for(int i=0 ; i<5 ; i++){
        System.out.println("elemento "+i+" = "+distancia[i]);
    }
    
      //.......................................................
    System.out.println(".................................");
    System.out.println("arreglo de tipo texto char");
    
    sexo[0]='M'; //masculino
    sexo[1]='F'; //femenino
    sexo[2]='B'; //bixesual
    sexo[3]='T'; //trans
    sexo[4]='p'; //pansexual
     
    for(int i=0 ; i<5 ; i++){
        System.out.println("elemento "+i+" = "+sexo[i]);
    }
    
      //.......................................................
    System.out.println(".................................");
    System.out.println("arreglo de tipo texto String");
    
    nombre[0]="luis"; 
    nombre[1]="lina"; 
    nombre[2]="luisa"; 
    nombre[3]="lorenso"; 
    nombre[4]="loraine"; 
     
    for(int i=0 ; i<5 ; i++){
        System.out.println("elemento "+i+" = "+nombre[i]);
    }
    }
    
}
