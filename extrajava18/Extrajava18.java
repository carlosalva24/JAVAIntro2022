package extrajava18;

import java.util.Scanner;

public class Extrajava18 {

    /**
     * Realizar un algoritmo que calcule la suma de todos los elementos de un
     * vector de tamaño N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño N : ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        cargarv(n, vector);
        int suma = 0;
        suma=sumarv(n, vector);
        System.out.println(" la suma de todos los elementos de un vector: " + suma);
    }

    public static void cargarv(int n, int[] vector) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Ingrese  el numero: ");
            vector[i] = leer.nextInt();
        }

    }

    public static int sumarv(int n, int[] vector) {
        int suma = 0;
        for (int i = 0; i <= n - 1; i++) {
            suma = suma + vector[i];
        }
        return suma;
    }
}
