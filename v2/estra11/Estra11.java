package estra11;

import java.util.Scanner;

public class Estra11 {
    /**
     * Escribir un programa que lea un número entero y devuelva el número de
     * dígitos que componen ese número. Por ejemplo, si introducimos el número
     * 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos
     * matemáticamente utilizando el operador de división. Nota: recordar que
     * las variables de tipo entero truncan los números o resultados.
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese el numero a contar: ");
    int digitos= leer.nextInt();
        
int ndigitos=digitos;
    int conta = 1;
            while (ndigitos >= 10) {
                ndigitos = ndigitos / 10;
                conta = conta + 1;
            }
     System.out.println("el numero: "+digitos+" tiene "+conta+" digitos");
   
    }

}
