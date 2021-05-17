
import java.util.Scanner;


public class Calculadora {
    /*
    Crea una aplicación llamada Calculadora, nos pedirá 2 operandos (int) y 
    un signo aritmético (String), según este último se realizara la operación correspondiente. 
    Al final mostrara el resultado en un cuadro de dialogo.
    Los signos aritméticos disponibles son:

    +: suma los dos operandos.
    -: resta los operandos.
    *: multiplica los operandos.
    /: divide los operandos, este debe dar un resultado con decimales (double)
    ^:  1º operando como base y 2º como exponente.
    %:  módulo, resto de la división entre operando1 y operando2
    */
    
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int operando1, operando2;
        int resultado = 0;
        double resultado2 = 0;
        char signo;
        
        System.out.println("Digita el primer valor");
        operando1 = en.nextInt();
        System.out.println("Digita el primer valor");
        operando2 = en.nextInt();
        
        System.out.println("Digita el signo");
        signo = en.next().charAt(0);
        
        if(signo == '+') {
            resultado = operando1 + operando2;
        } else if(signo == '-') {
            resultado = operando1 - operando2;
        } else if(signo == '*') {
            resultado = operando1 * operando2;
        } else if(signo == '/') {
            if(operando2 != 0) {
                resultado2 = operando1 / operando2;
                System.out.println("El resultado es " + resultado2);
            } else {
                resultado = 0;
            }
        } else if(signo == '^') {
            int n = operando1;
            for(int i = 2; i <= operando2; i++) {
                operando1 *= n;
                resultado = operando1;
            }
        } else if(signo == '%') {
            if(operando2 != 0) {
                resultado = operando1 % operando2;
            } else {
                resultado = 0;
            }
        } else {
            System.out.println("Debe digitar alguno de los símbolos anteriores");
        }
        System.out.println("El resultado es " + resultado);
    }
}
