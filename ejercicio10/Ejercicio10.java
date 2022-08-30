package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    /*
   Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **  
    
   pagina 29 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 1;

        do {
            //System.out.println("Ingrese un numero:");
            int numero = leer.nextInt();

            if (numero >= 1 && numero <= 20) {
                String letra = "";
                for (int i = 1; i <= numero; i++) {
                    letra = letra + "*";
                }
                System.out.println(numero + letra);
                contador++;
            } else {
                System.out.println("el mumero deb estar entre1 y 20");
            }

        } while (contador <= 4);

    }

}
