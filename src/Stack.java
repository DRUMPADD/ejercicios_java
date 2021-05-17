
import java.util.Scanner;


public class Stack {
    int dato[];
    int tamanio;
    int tope = 0;
    public Stack(int tamanio) {
        this.dato = new int [tamanio];
        this.tamanio = tamanio;
    }
    
    public boolean isEmpty() {
        return this.tope == 0;
    }
    
    public void push(int dato) {
        if (this.tope <= tamanio) {
            this.dato[this.tope] = dato;
            this.tope++;
        } else {
            System.out.println("La pila está llena");
        }
    }
    
    public void pop() {
        if(this.tope == 0) {
            System.out.println("La pila está vacía");
        } else {
            int elemento = 0;
            elemento = this.dato[this.tope - 1];
            this.tope--;
        }
    }
    
    public void print() {
        for(int i = this.tope - 1; i > -1; i--) {
            System.out.println(this.dato[i]);
        }
    }
    
    public int top() {
        return this.dato[this.tope];
    }
    
    public int size() {
        return this.tope;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanio;
        
        System.out.println("Digita el tamaño de la pila");
        tamanio = entrada.nextInt();
        
        Stack pila = new Stack(tamanio);
        
        int arreglo[] = new int[tamanio];
        
        for(int i = 0; i < tamanio; i++) {
            System.out.println("Dato número " + (i+1));
            arreglo[i] = entrada.nextInt();
            pila.push(arreglo[i]);
        }
        
        pila.print();
        System.out.println("\nEl tamaño de la pila es de " + pila.size());
        
        pila.pop();
        pila.pop();
        pila.print();
        System.out.println("\nEl tamaño de la pila es de " + pila.size());
        
        System.out.println(pila.isEmpty());
    }
    
}
