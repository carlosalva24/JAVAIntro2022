package apre01;

import java.util.Scanner;

public class Apre01 {

    /*1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero: ");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int numero2 = leer.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
    }

}
