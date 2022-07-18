
package ejercicios;

import java.util.Scanner;

/*
cargar un arreglo de n elementos, imprimir el menor y 
un mensaje si se repite dentro del arreglo
*/

public class ArregloMenorSeRepite {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[];
        int nElementos;
        int menorElemento;
        int seRepite=0;
        
        System.out.println("cuantos elementos tendra tu arreglo");
        nElementos= teclado.nextInt();
        arreglo=new int[nElementos];
        
        for(int i =0;i<arreglo.length;i++){
            System.out.println("ingresar un valor en la posicion " + (i+1));
            arreglo[i]= teclado.nextInt();
            
            
        }
        
        menorElemento = arreglo[0];
        for(int i = 0; i<arreglo.length;i++){
            if(menorElemento > arreglo[i]){
                menorElemento = arreglo[i];
                
            }
        }
        
        
        System.out.println("");
        System.out.println("el menor elemento es " + menorElemento);
        
       for(int i=0;i<arreglo.length;i++){
           if(menorElemento == arreglo[i]){
               seRepite++;
           }
           if(seRepite > 1){
               System.out.println("el valor se repite");
           }
       }
       
      
        
    }
}
