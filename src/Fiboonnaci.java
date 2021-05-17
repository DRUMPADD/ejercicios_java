
public class Fiboonnaci {
    
    
    int fiboo(int n) {
        if(n == 0 || n == 1) return 1;
        return fiboo(n - 1) + fiboo(n - 2);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Fiboonnaci f = new Fiboonnaci();
        int a = 0, b = 1,c = 1;
        
        
        for(int i = 0; i < 6; i++) {
            System.out.println(b);
            
            c = a + b;
            a = b;
            b = c;
        }
        
        System.out.println(f.fiboo(5));
    }
    
}
