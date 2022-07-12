
package ejercicios;

import java.util.Scanner;

/*
calcular el promedio de dos arreglos de 10 elementos
e indica el promedio mayor
*/
public class ArregloPromedioMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float arreglo1[]=new float[10];
        float arreglo2[]=new float[10];
        float suma1=0;
        float suma2=0;
        float promedio1;
        float promedio2;
        
        for(int i= 0; i< arreglo1.length;i++){
            System.out.println("Ingresar un numero en la posicion ["+i+"]  del arreglo 1" );
            arreglo1[i]=teclado.nextFloat();
            suma1 = suma1 + arreglo1[i];
        }
        
         System.out.println("");
        
        for(int i= 0; i< arreglo1.length;i++){
            System.out.println("Arreglo 1 " + arreglo1[i] );
            
        }
        
        System.out.println("");
        promedio1 = suma1/10;
        System.out.println("el promedio del arreglo 1 es " + promedio1 );
        
        System.out.println("");
        
        for(int i= 0; i< arreglo2.length;i++){
            System.out.println("Ingresar un numero en la posicion ["+i+"]  del arreglo 2" );
            arreglo2[i]=teclado.nextFloat();
            suma2 = suma2 + arreglo2[i];
        }
        
         System.out.println("");
        
         for(int i= 0; i< arreglo2.length;i++){
            System.out.println("Arreglo 2 " + arreglo2[i] );
            
        }
        
        System.out.println("");
        promedio2 = suma2/10;
        System.out.println("el promedio del arreglo 2 es " + promedio2 );
        
       
       
         System.out.println("");
         
         if(promedio1 > promedio2){
             System.out.println("el promedio mayor es es del arreglo 1: " + promedio1 );
         }else if(promedio2 > promedio1){
             System.out.println("el promedio mayor es es del arreglo 2: " + promedio2 ); 
             
         }
        
    }
}
