package ejercicios;

import java.util.Scanner;

/*
crear un arreglo de 10 elementos enteros y contar los elementos
negativos,positivos, pares e impares
 */
public class ArregloPositivosParesImpares {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[] = new int[10];
        int negativos = 0;
        int positivos = 0;
        int pares = 0;
       int impares = 0;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("digite un numero entero en la posicion :" + i);
            arreglo[i] = teclado.nextInt();

            if (arreglo[i] <= 0) {
                negativos++;
            } else if (arreglo[i] > 0) {
                positivos++;
            }

        }
        
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]%2!=0){
                impares++;
            }else{
                pares++;
            }
        }
        System.out.println("total de numeros pares :" + pares);
        System.out.println("total de numeros impares :" + impares);
        System.out.println("total de numeros positivos :" + positivos);
        System.out.println("total de numeros negativos :" + negativos);
    }
}
