package Sort_methods;

public class Bubble_sort {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] datos = new int[10];
        datos[0] = 3;
        datos[1] = 9;
        datos[2] = 8;
        datos[3] = 6;
        datos[4] = 2;
        datos[5] = 1;
        datos[6] = 7;
        datos[7] = 4;
        datos[8] = 18;
        datos[9] = 5;
        int aux;
        for(int i = 0; i < datos.length; i++) {
            for(int j = i+1; j < datos.length; j++) {   
                if(datos[j] < datos[i]) {
                    aux = datos[i];
                    datos[i] = datos[j];
                    datos[j] = aux;
                    //System.out.println(datos[i]);
                    //System.out.println(datos[j]);
                }
            }
            System.out.println(datos[i]);
        }
        
    }
    
}
