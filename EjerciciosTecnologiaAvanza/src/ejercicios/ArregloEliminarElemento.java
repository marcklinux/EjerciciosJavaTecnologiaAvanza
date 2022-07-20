
package ejercicios;

import java.util.Scanner;

/*
 leer un arreglo de 10 elementos numericos enteros 
con posiciones del (0 y 9) eliminar el elemento situado
en la posicion dada
*/

public class ArregloEliminarElemento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[]= new int[10];
        int posicionEliminar;
        
        for(int i=0;i<10;i++){
            System.out.println("ingresa un valor en la posicion " + (i));
            numeros[i]=teclado.nextInt();
        }
        
        for(int i=0;i<10;i++){
            System.out.println("[" + numeros[i] + "]" + " en la posicion " + i);
            
        }
        
        System.out.println("\nDigite La posicion del elemento del array a eliminar");
        posicionEliminar=teclado.nextInt();
        
        //eliminar el array
        for(int i=posicionEliminar;i<9;i++){
            numeros[i] = numeros[i+1];
        }
        
        for(int i=0;i<9;i++){
            System.out.println("[" + numeros[i] + "]" + " en la posicion " + i);
            
        }
        
        
    }
}
