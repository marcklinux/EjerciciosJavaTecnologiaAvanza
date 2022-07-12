
package ejercicios;

import java.util.Scanner;

/*
llenar un arreglo de 5 elementos e imprimirlos en orden
*/


public class Arreglos {
    public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);
      int arreglo[]= new int[5];
      
      
      //llenamos el arreglo
      for(int i= 0; i< arreglo.length;i++){
          
          System.out.print("Digite un elemento en la posicion ["+i+"] :");
          arreglo[i]=teclado.nextInt();
      }
      
      System.out.println("");
      //imprimimos el arreglo
      for(int i=0; i< arreglo.length;i++){
          
          System.out.print("[" + arreglo[i] + "]");
      }
      
      
      
        
        
    }
}
