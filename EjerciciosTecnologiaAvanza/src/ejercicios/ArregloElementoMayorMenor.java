
package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
hallar el mayor y el menor elemento de un arreglo
de N elementos
*/

public class ArregloElementoMayorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[];
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos para su arreglo"));
        arreglo= new int[nElementos];
        
        for(int i=0;i<arreglo.length;i++){
            System.out.print("Digite un elemento en la posicion ["+i+"] :");
            arreglo[i]=teclado.nextInt();
        }
        
        int mayorElemento = arreglo[0];
        int menorElemento = arreglo[0];
        
        for(int i=0;i<arreglo.length;i++){
            if(mayorElemento < arreglo[i] ){
                mayorElemento = arreglo[i];
            }
            if(menorElemento > arreglo[i]){
                menorElemento = arreglo[i];
            }
        }
        
        System.out.println("");
        System.out.println("el elemento mayor es: " + mayorElemento);
        System.out.println("el elemento menor es: " + menorElemento);
    }
}
