
package Entrenar;

import java.util.Scanner;

/*
 Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá 
 tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la 
 suma de todas las ventas.
*/

public class Suma_ventas {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner en = new Scanner(System.in);
        int numero_ventas, suma_ventas = 0;
        
        System.out.println("Digita el número de ventas");
        numero_ventas = en.nextInt();
        
        int almacena_venta[] = new int [numero_ventas];
        for(int i = 0; i < numero_ventas;) {
            System.out.println("Venta número " + (i+1));
            almacena_venta[i] = en.nextInt();
            suma_ventas += almacena_venta[i];
            i++;
        }
        int i = 0;
        while(i < numero_ventas) {
            System.out.println("Venta número " + (i+1));
            almacena_venta[i] = en.nextInt();
            suma_ventas += almacena_venta[i];
            i++;
        }
        
        System.out.println("Fueron " + numero_ventas + " ventas");
        System.out.println("La suma total de ellas es " + suma_ventas);
    }
    
}
