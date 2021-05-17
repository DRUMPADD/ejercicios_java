package Entrenar;
import java.util.Scanner;

public class Dias_semana {
    public static void main(String[] args) {
        
        Scanner en = new Scanner(System.in);
        short elegir_dia;
        
        System.out.println("Digita el día el día de la semana");
        elegir_dia = en.nextShort();
        
        switch(elegir_dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es ningún día de la semana");
                break;
        }
    }
}
