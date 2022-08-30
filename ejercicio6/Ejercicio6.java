package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    /*
    EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o 
alguno de ellos es mayor a 25.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingresa un numero");
        int num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos nomeros son mayores a 25");
        } else {
            if (num1 > 25) {
                System.out.println("en mumero 1 es  mayor a 25");
            } else {
                System.out.println("en mumero 2 es  mayor a 25");
            }
        }
    }

}
