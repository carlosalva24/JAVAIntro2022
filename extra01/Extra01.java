package extra01;

/**
 *
 * @author CABEZON
 */
public class Extra01 {

    /**
     * 1. Realizar un programa que rellene dos vectores al mismo tiempo, con 5
     * valores aleatorios y los muestre por pantalla.
     */
    public static void main(String[] args) {
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        for (int i = 0; i < 5; i++) {
            vector1[i] = (int) (Math.random() * 10);
            vector2[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(vector1[i] + ",");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector2[i] + ",");
        }
    }

}
