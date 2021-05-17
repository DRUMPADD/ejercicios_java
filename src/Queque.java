
import java.util.Scanner;


public class Queque {
    int queque[];
    int tamanio = 0;
    public Queque() {
        this.queque = new int[this.tamanio];
    }
    
    public boolean empty() {
        return this.tamanio == 0;
    }
    
    public void push(int dato) {
        this.queque[this.tamanio] = dato;
        this.tamanio++;
    }
    
    public void pop() {
        if(empty()) {
            System.out.println("La pila está vacía");
        } else {
            int eliminar;
            eliminar = this.queque[0];
            this.tamanio--;
        }
    }
    
    public void print() {
        for(int i = this.tamanio - 1; i > -1; i++) {
            System.out.println(this.queque[i]);
        }
    }
    
    public int front() {
        return this.queque[0];
    }
    
    public int size() {
        return this.tamanio;
    }
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Queque cola = new Queque();
        
        System.out.println(cola.empty());
        cola.push(3);
    }
    
}
