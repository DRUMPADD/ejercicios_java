
package Entrenar;

import java.util.Scanner;

/*
 Realiza una aplicación que nos calcule una ecuación de segundo grado. 
 Debes pedir las variables a, b y c por teclado y comprobar antes que el 
 discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa el 
 método sqlrt de Math. Te recomiendo que uses mensajes de traza.

*/

public class Ecuacion_2do_grado {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner en = new Scanner(System.in);
        int a, b, c, discriminante = 0;
        double x1 = 0, x2 = 0;
        System.out.println("Digita el valor de a");
        a = en.nextInt();
        System.out.println("Digita el valor de b");
        b = en.nextInt();
        System.out.println("Digita el valor de c");
        c = en.nextInt(); 
        discriminante = (int) (Math.pow(b, 2) - (4*a*c));
        
        if (discriminante != 0) {
            x1 = (-b + Math.sqrt(discriminante))/ 2*a;
            x2 = (-b - Math.sqrt(discriminante))/ 2*a;
        } else {
            System.out.println("No tiene solución");
        }
        System.out.println("Resultado x1 = " + x1);
        System.out.println("Resultado x2 = " + x2);
    }  
}
