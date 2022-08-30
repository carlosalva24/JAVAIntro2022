package apre02;

import java.util.Scanner;

public class Apre02 {

    /**
     * 2. Escribir un programa que pida tu nombre, lo guarde en una variable y
     * lo muestre por pantalla.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("Su nombre es: " + nombre);

    }

}
