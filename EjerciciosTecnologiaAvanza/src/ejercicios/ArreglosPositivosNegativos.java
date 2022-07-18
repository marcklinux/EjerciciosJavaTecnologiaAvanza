
package ejercicios;

import java.util.Scanner;

/*
crear un arreglo de N elementos y dado a ese arreglo
separar los elementos postivos y negativos en diferentes
arreglos
*/
public class ArreglosPositivosNegativos {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int arreglo[];
        int nElementos;
        int positivos[];
        int negativos[];
        int contadorPositivos =0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        
        System.out.println("Cuantos elementos tendra tu arreglo");
        nElementos = teclado.nextInt();
        
        arreglo=new int[nElementos];
        
        for(int i=0;i<arreglo.length;i++){
            System.out.println("ingresar un valor en la posicion " + (i+1));
            arreglo[i]=teclado.nextInt();
            
            if(arreglo[i]>0){
                contadorPositivos++;
            }else if(arreglo[i]<0){
                contadorNegativos++;
            }else{
                contadorCeros++;
            }
            
        }
        
        System.out.println("");
        
        positivos = new int[contadorPositivos];
        negativos = new int[contadorNegativos];
        
        contadorPositivos = 0;
        contadorNegativos = 0;
        
        for(int i= 0; i< arreglo.length;i++){
        if(arreglo[i]>0){
            positivos[contadorPositivos] = arreglo[i];
            contadorPositivos++;
        }else if(arreglo[i]<0){
            negativos[contadorNegativos] = arreglo[i];
            contadorNegativos++;
        }
    }
        
        System.out.println("");
        
        //imprimimos el arreglo de positivos
        System.out.println("");
        System.out.println("El arreglo de positivos es");
        for(int i = 0;i<positivos.length;i++){
            System.out.print("[" + positivos[i] + "]");
        }
        //imprimimos el arreglo de negativos
        System.out.println("");
        System.out.println("el arreglo de negativos es");
         for(int i = 0;i<negativos.length;i++){
            System.out.print("[" + negativos[i] + "]");
        }
         System.out.println("");
        System.out.println("la cantidad de ceros es " + contadorCeros);
       
}
}
