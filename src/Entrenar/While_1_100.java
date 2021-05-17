
package Entrenar;

/*
Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
*/

public class While_1_100 {

    public static void main(String[] args) {
        // TODO code application logic here
        int iterador = 0;
        
        /*while(iterador <= 100) {
            System.out.println(iterador);
            iterador++;
        }*/
        
        /*for(iterador = 1; iterador <= 100; iterador++) {
            System.out.println(iterador);
        }*/
        
        do {
            iterador++;
            System.out.println(iterador);
        }while(iterador < 100);
        
    }
}
