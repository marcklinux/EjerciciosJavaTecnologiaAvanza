
package ejercicios;

import java.util.Scanner;

/*
llenar un arreglo de 10 elementos de tipo float e imprimirlos en orden
*/
public class ArregloOrdenado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float arreglo[] = new float[10];
        float temporal=0;
        
        for(int i=0;i<arreglo.length;i++){
            System.out.print("digite un elemnto en la posicion ["+i+"] :");
            arreglo[i]=teclado.nextFloat();
        }
        
        for(int i=0; i<arreglo.length;i++){
            for(int j=1;j<(arreglo.length-1);j++){
                if(arreglo[j-1] > arreglo[j]){
                    temporal = arreglo[j-1];
                    arreglo[j-1]=arreglo[j];
                    arreglo[j]=temporal;
                }
            }
        }
        
        System.out.println("");
        
        for(int i = 0;i<arreglo.length;i++){
            System.out.print("[" +arreglo[i] + "]");
        }
        
            
       
        
       
        
        
        
    }
}
