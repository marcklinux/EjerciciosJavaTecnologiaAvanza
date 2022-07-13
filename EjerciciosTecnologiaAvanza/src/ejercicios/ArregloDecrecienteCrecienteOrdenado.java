package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
cargar un arreglo de nElementos y verificar 
posteriormente si el mismo esta en forma creciente
decreciente o desordenada----No se permiten
numeros negativos,solo positivos
 */
public class ArregloDecrecienteCrecienteOrdenado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int arreglo[];
        int nElementos;
        boolean creciente = false;
        boolean decreciente = false;
        boolean esNegativo = false;

        nElementos
                = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos para el array"));
        
        if(nElementos <= 0){
          System.out.println("\nNo existe un array con tamaño negativo");
            System.exit(0);
        }
        
        arreglo = new int[nElementos];
        
        do{
            System.out.println("");
            for(int i= 0;i<arreglo.length;i++){
                System.out.println("Digite un elemento en la posicion : " + i);
                arreglo[i]= teclado.nextInt();
            }
            
            for(int i=0;i< arreglo.length;i++){
                if(arreglo[i] < 0){
                    esNegativo = true;
                    break;
                } else{
                    esNegativo = false;
                }
            }
            
            if(esNegativo == true){
                System.out.println("\nPor Favor vuelva a digitar ya que su array contiene negativos");
            }
        }while(esNegativo == true);
        
        //comprobamos si el arreglo esta de forma creciente o decreciente
        
        for(int i=0;i<(nElementos -1);i++){
            if(arreglo[i] < arreglo[i+1]){
                creciente = true;
            } else if(arreglo[i] > arreglo[i+1]){
                decreciente = true;
            }
        }
        
        if(creciente == true && decreciente == false){
            System.out.println("\nEl arreglo es de forma creciente");
        }
        else if(creciente == false &&decreciente == true ){
            System.out.println("\nEl arreglo es de forma decreciente");
        }
        else if(creciente == true && decreciente == true){
            System.out.println("\nEl arreglo es de forma desordenada");
        }else{
            System.out.println("\nLos elementos del arreglo son iguales");
        }
    }
}
