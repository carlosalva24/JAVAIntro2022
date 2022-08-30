package extra22;

import java.util.Scanner;

public class Extra22 {

    /**
     * Realizar un programa que rellene una matriz de tamaño NxM con valores
     * aleatorios y muestre la suma de sus elementos
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print(" ingrese N: ");
        int n = leer.nextInt();
        System.out.print(" ingrese M: ");
        int m = leer.nextInt();
        int[][] matriz = new int[n][m];
        cargarmatriz(n, m, matriz);
        mostrarmatriz(n, m, matriz);

    }

    public static void cargarmatriz(int n, int m, int[][] matriz) {

        for (int i = 0; i <= n - 1; i++) {

            for (int j = 0; j <= m - 1; j++) {

                matriz[i][j] = ((int) (Math.random() * 10));
            }

        }

    }

    public static void mostrarmatriz(int n, int m, int[][] matriz) {
        int suma = 0;
        for (int i = 0; i <= n - 1; i++) {

            for (int j = 0; j <= m - 1; j++) {

                System.out.print(matriz[i][j] + " ");
                suma = suma + matriz[i][j];
            }
            System.out.println("  ");

        }

        System.out.println(" la suma de sus elementos es: " + suma);
    }
}
