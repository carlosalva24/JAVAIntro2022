package extra2;

import java.util.Scanner;

public class Extra2 {

    /**
     * Realizar un programa que rellene un vector de tamaño N, con valores
     * ingresados por el usuario y muestre por pantalla el promedio de la suma
     * de todos los valores ingresados.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño N del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int suma = 0;
        int cant = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " del vector: ");
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
            cant = cant+1;
        }
        double prom = suma / cant;
        System.out.print("el promedio es: "+ prom+ " de "+n+" elementos ");
    }

}
