package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    /*EJERCICIO 5
Define una variable de tipo boolean, double y char. 
Guarda información en ellas a través del Scanner. */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un boolean");
        boolean bandera = leer.nextBoolean();
        System.out.println("ingrese un double");
        double doble = leer.nextDouble();
        System.out.println("ingrese un char");
        char letra = leer.next().charAt(0);
    }

}
