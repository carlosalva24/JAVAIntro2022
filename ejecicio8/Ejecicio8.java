package ejecicio8;

import java.util.Scanner;

public class Ejecicio8 {

    /*
 EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se 
pedirá de nuevo hasta que la nota sea correcta.    
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //System.out.println("Ingresa una nota:"); 
        int nota = 11;

        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese una nota:");
            nota = leer.nextInt();

        }
    }

}
