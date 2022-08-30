package extra06;

import java.util.Scanner;

public class Extra06 {

    /**
     * Leer la altura de N personas y determinar el promedio de estaturas que se
     * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese la cantidad de personas: ");
        int n = leer.nextInt();
        int debajo = 0;
        int total = 0;
        for (int i = 1; i < n + 1; i++) {
            System.out.print("ingrese la " + i + "persona: ");
            float medida = leer.nextFloat();

            if (medida < 1.60) {
                debajo = debajo + 1;
            }
            total = total + 1;
        }
        System.out.print(" de un total " + total + ", miden por debajo de 1.60 mts " + debajo + " personas");

    }
}
