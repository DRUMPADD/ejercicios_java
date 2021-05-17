
import java.util.Scanner;

public class bucle_teclearNegativo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        
        int n, suma = 0, cont = 0;
        
        System.out.println("Teclear un número que no sea negativo");
        n = ent.nextInt();
        
        while(n >= 0) {
            suma += n;
            cont += 1;
            
            System.out.println("Digita otro número");
            n = ent.nextInt();
        }
        
        final float media = (float) suma / cont;
        
        System.out.println("Suma: " + suma);
        System.out.println("Cantidad: " + cont);
        System.out.println("LA media es igual a " + media);
    }
    
}
