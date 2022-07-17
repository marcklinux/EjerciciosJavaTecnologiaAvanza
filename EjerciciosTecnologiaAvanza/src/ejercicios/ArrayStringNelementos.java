
package ejercicios;

import java.util.Scanner;

/*
crear un array de tipo string de 20 elementos y mostrar por pantallas
el elemento con mayor letras
*/
public class ArrayStringNelementos {
    
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
       String palabras[]= new String[5];
       String palabraMayor="";
       int posicion = 0;
       int nletras = 0;
       
       
       for(int i =0;i<palabras.length;i++){
           System.out.println("escribir una palabra");
           palabras[i]=teclado.nextLine();           
         
           
           
       }
       
       nletras = palabras[0].length();
       for(int i = 0;i<palabras.length;i++){
          
            
            if(nletras < palabras[i].length()){
                
                palabraMayor = palabras[i];
                nletras = palabras[i].length();
                posicion = i;
            }else if(nletras > palabras[i].length()){
                palabraMayor = palabras[0];
                nletras = palabras[0].length();
                posicion = 0;
                
            }
           
       }
        
        System.out.println("");
        System.out.println("la palabra con mayor cantidad de letras es " + palabraMayor + " en la posicion " +posicion + " y tiene " + nletras + " letras");
 
        
        
        
    }
}
