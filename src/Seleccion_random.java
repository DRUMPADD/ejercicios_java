
public class Seleccion_random {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] nombres = new String[6];
        
        nombres[0] = "Alexis";
        nombres[1] = "Alvaro";
        nombres[2] = "Carlos";
        nombres[3] = "Christopher";
        nombres[4] = "Erick";
        nombres[5] = "Jairo";
        
        
        int seleccion = 0;
        seleccion = (int) (Math.random()*nombres.length);
        System.out.println(nombres[seleccion]);
    }
    
}
