package apre16;

import java.util.Scanner;

public class Apre16 {

    /**
     * 16. Realizar un algoritmo que rellene un vector de tamaño N con valores
     * aleatorios y le pida al usuario un numero a buscar en el vector. El
     * programa mostrará donde se encuentra el numero y si se encuentra repetido
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño N del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
         for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
        System.out.print("Ingrese el numero abuscar : ");
        int buscar = leer.nextInt();
        int encontro = -1;
        for (int i = 0; i < n; i++) {
            if (vector[i] == buscar) {
                encontro = i+1;
            }
        }
        if (encontro == -1) {
            System.out.println("el valor buscado NO SE ENCONTRO");
        } else {
            System.out.println("el valor buscado esta en posicion: " + encontro);
        }
    }
}
