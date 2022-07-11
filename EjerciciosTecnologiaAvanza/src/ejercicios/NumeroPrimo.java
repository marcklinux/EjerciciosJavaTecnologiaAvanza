
package ejercicios;

import java.util.Scanner;


public class NumeroPrimo {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         
         int numero;
         int contador=0;
         
         System.out.println("Digite un numero: ");
         numero = teclado.nextInt();
         
         for(int i= 1; i <= numero;i++){
             if(numero % i == 0){
                 contador++;
             }
         }
         
         if(contador == 2){
             System.out.println("El numero es primo");
         }else{
             System.out.println("El numero no es primo");
         }
    }
}
