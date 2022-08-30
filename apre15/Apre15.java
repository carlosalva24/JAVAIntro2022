package apre15;

public class Apre15 {

    /**
     * 15. Realizar un algoritmo que rellene un vector con los 100 primeros
     * números enteros y los muestre por pantalla en orden descendente.
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
       for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
        }
       for (int i = 0; i < 100; i++) {
            System.out.println(vector[i]);
        }

    }

}
