
package ejercicios;

import java.util.Scanner;

/*
invertir un arreglo de N elementos
*/

public class ArregloInvertido {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[];
        int nElementos;
        
        System.out.println("cuantos elementos tendra tu arreglo");
        nElementos = teclado.nextInt();
        
        arreglo = new int[nElementos];
        
        for(int i=0;i<arreglo.length;i++){
            System.out.println("ingresa el valor en el arreglo en la posicion " + (i+1));
            arreglo[i]=teclado.nextInt();
        }
        
        System.out.println("");
        System.out.println("El arreglo es");
        for(int i=0;i<arreglo.length;i++){
            System.out.print("[" + arreglo[i] + "]");
        }
        
        System.out.println("");
        
        //invertimos el arreglo
        int auxiliar[]= new int[arreglo.length];
        
        for(int i = arreglo.length-1,j=0;i>=0;i--,j++){
            auxiliar[j] = arreglo[i];
        }
        
        System.out.println("El arreglo invertido es");
        for(int i=0;i<auxiliar.length;i++){
            System.out.print("[" + auxiliar[i] + "]");
        }
    }
}
