package ejercicios;

import java.util.Scanner;

/*
crear un programa que guarde 10 nombres de personas 
con sus dichas altura, luego indicar la mayor y menor altura
con sus dichos nombres
 */
public class ArregloAlturas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombres[] = new String[5];
        float alturas[] = new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("ingresa el nombre la persona N° " + (i + 1));
            nombres[i] = teclado.next();
            System.out.println("ingresa la altura de la persona N° " + (i + 1));
            alturas[i] = teclado.nextFloat();
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre:" + "[" + nombres[i] + "]" + " Altura:" + "[" + alturas[i] + "]");

        }

        float mayor = alturas[0];
        float menor = alturas[0];

        String mayorNombre = nombres[0];
        String menorNombre = nombres[0];

        for (int i = 0; i < 5; i++) {
            if (mayor < alturas[i]) {
                mayor = alturas[i];
                mayorNombre = nombres[i];

            }
            if (menor > alturas[i]) {
                menor = alturas[i];
                menorNombre = nombres[i];
            }
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("la persona con mayor estatura es " + mayorNombre + " y su estatura es " + mayor);
        System.out.println("la persona con menor estatura es " + menorNombre + " y su estatura es " + menor);
    }
}
