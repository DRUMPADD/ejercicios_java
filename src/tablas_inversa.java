
import java.util.Scanner;


public class tablas_inversa {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entr = new Scanner(System.in);
        
        short columna, fila;
        
        System.out.println("Digita el número de columnas");
        columna = entr.nextShort();
        
        System.out.println("Digita el número de filas");
        fila = entr.nextShort();
        
        
        int [][] tabla = new int [columna][fila];
        
        for(int col = 0; col < columna; col++) {
            for(int fil = 0; fil < fila; fil++) {
                System.out.println("Posición: [" + col + "][" + fil +"]");
                tabla[col][fil] = entr.nextInt();
            }
        }
        
        System.out.println("Tabla normal");
        int [][] tabla_inversa = new int [columna][fila];
        for(int col = 0; col < columna; col++) {
            for(int fil = 0; fil < fila; fil++) {
                System.out.print(tabla[col][fil] + " ");
                tabla_inversa[fil][col] = tabla[fil][col];
            }
            System.out.println();
        }
        
        int suma = 0;
        
        System.out.println("Tabla inversa");
        for(int col = 0; col < columna; col++) {
            for(int fil = 0; fil < fila; fil++) {
                System.out.print(tabla_inversa[fil][col] + " ");
                suma = tabla[col][fil] + tabla_inversa[fil][col];
            }
            System.out.println();
        }
    }
    
}
