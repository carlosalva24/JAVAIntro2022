package extra19;

import java.util.Scanner;

public class Extra19 {

    /**
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales
     * (la comparación deberá detenerse en cuanto se detecte alguna diferencia
     * entre los elementos).
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
         System.out.print(" ingrese N: ");
        System.out.println("Ingrese el tamaño N de los vectores : ");
        int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        cargarv(n, vector1, "1");
        cargarv(n, vector2, "2");
        boolean comp = comparav(n, vector1, vector2);
        System.out.println(" los vectores son iguales?: " + comp);
    }

    public static void cargarv(int n, int[] vector, String num) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Ingrese  el numerodel vertor" + num + ": ");
            vector[i] = leer.nextInt();
        }

    }

    public static boolean comparav(int n, int[] vector1, int[] vector2) {
        boolean compara = true;

        for (int i = 0; i <= n - 1; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println(vector1[i] + "  " + vector2[i]);
                compara = false;
                break;

            }
        }
        return compara;
    }

}
