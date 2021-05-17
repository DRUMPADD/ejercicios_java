
import java.util.Scanner;


public class bucle_teclearCero {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        
        int n, suma = 0;
        
        System.out.println("Digite número");
        n = ent.nextInt();
        
        while(n != 0) {
            suma += n;
            
            System.out.println("Digite otro número");
            n = ent.nextInt();
        }
        
        System.out.println("Suma total es " + suma);
    }
    
}
