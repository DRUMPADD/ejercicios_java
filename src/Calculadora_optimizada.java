
import java.util.Scanner;


public class Calculadora_optimizada {
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
        char signo;
        
        System.out.println("Digita el primer valor");
        operando1 = en.nextInt();
        System.out.println("Digita el primer valor");
        operando2 = en.nextInt();
        
        System.out.println("Digita el signo");
        signo = en.next().charAt(0);
        
        switch(signo) {
            case '+':
                System.out.println("Resultado: " + (operando1 + operando2));
                break;
            case '-':
                System.out.println("Resultado: " + (operando1 - operando2));
                break;
            case '*':
                System.out.println("Resultado: " + (operando1 * operando2));
                break;
            case '/':
                if(operando2 != 0) {
                    System.out.println("Resultado: " + (double)(operando1 / operando2));
                } else {
                    System.out.println("Resultado: 0");
                }
                break;
            case '^':
                System.out.println("Resultado: " + (int) Math.pow(operando1, operando2));
                break;
            case '%':
                if(operando2 != 0) {
                    System.out.println("Resultado: " + (operando1 % operando2));
                } else {
                    System.out.println("Resultado: 0");
                }
                break;
            default:
                System.out.println("Símbolo no encontrado");
                break;
        }
    }
}
