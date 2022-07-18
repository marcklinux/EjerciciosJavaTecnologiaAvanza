
package ejercicios;

import java.util.Scanner;

/*
Desarrollar un programa que permita cargar 5 nombres de personas y sus edades
respectivas.luego de realizar la carga por teclado de todos los datos imprimir
los nombres de las personas mayores de edad(mayores o iguales de 18 años)
*/
public class ArreglosMayoresEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edades[] = new int[5];
        String nombres[] = new String[5];
       
        
        for(int i = 0;i<5;i++){
            System.out.println("");
            
            System.out.println("ingresar el nombre de la persona N°" + (i+1));
            nombres[i]=teclado.next();
            
           
            
            System.out.println("ingresar la edad de la persona N° " + (i+1));
            edades[i]=teclado.nextInt();
            
          
            
            
        }
        
        
        for(int i=0;i<5;i++){
            if(edades[i] >= 18){
                
                
                System.out.println("\nla persona en la posicion " + (i+1) + " de nombre " + nombres[i] + " es mayor de edad");
            }
        }
        
    }
}
