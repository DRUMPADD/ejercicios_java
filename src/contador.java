
import java.util.Scanner;


public class contador {

    public static void main(String[] args) {
        // TODO code application logic here
        //Programa Java que muestre los números desde 1 hasta N 
        
        Scanner en = new Scanner(System.in);
        short n, i = 1;
        
        System.out.println("Digite el valor de n");
        n = en.nextShort();
        
        //for(int i = 1; i <= n; i++) {
        //    System.out.println(i);
        //}
        while(i <= n) {
            System.out.println(i);
            i++;
        }
    }
    
}
