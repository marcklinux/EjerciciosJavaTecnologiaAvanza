
package ejercicios;

import java.util.Scanner;

/*crear una aplicacion que te pide un numero, si el numero es negativo
pues terminar el bucle y mostrar la suma de todos los numero ingresados
*/
public class NegativoBucle {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        int suma=0;
        
        do{
             System.out.println("ingresa un numero");
        numero = teclado.nextInt();
        
        if(numero > 0){
          
             suma = suma + numero;
        } 
        
       
        
            
        
        }while(numero > 0);
        
        System.out.println("la suma de los numeros Positivos es:" + suma);
       
        }
        
        
        
        
    
}
