package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    /*  EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando 
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del 
segundo, sino informe que no lo son  
     */
    public static void main(String[] args) {
        /*   String nombre="Mariano";
        int edad = 29;
        mostrarInfo ( nombre, edad);*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero: ");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int numero2 = leer.nextInt();

        EsMultiplo(numero1, numero2);
    }

    /* public static void mostrarInfo (String nombre, int edad){
         System.out.print("Enombre del usuario es: "+nombre+" y su edad :"+ edad);*/
    public static void EsMultiplo(int numero1, int numero2) {

        if ((numero2 % numero1) == 0) {

            System.out.println("el primer numero ES múltiplo del segundo");
        } else {
            System.out.println("el primer numero NO es múltiplo del segundo");
        }

    }
}
