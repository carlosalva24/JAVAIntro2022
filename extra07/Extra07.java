package extra07;

import java.util.Scanner;

public class Extra07 {

    /**
     * . Realice un programa que calcule y visualice el valor máximo, el valor
     * mínimo y el promedio de n números (n>0). El valor de n se solicitará al
     * principio del programa y los números serán introducidos por el usuario.
     * Realice dos versiones del programa, una usando el bucle “while” y otra
     * con el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese la cantidad de numeros: ");
        int n = leer.nextInt();
        int i = 1;
        int suma = 0;
        int may = 0;
        int men = 100;
        /* while (i <= n) {
            System.out.print("ingrese el " + i + "° numero: ");
            int numero = leer.nextInt();
            if (numero>may)
                may=numero;
            if (numero<men)   
                men=numero;
            suma = numero + suma;
            i = i + 1;
        }*/
        
        do {
            System.out.print("ingrese el " + i + "° numero: ");
            int numero = leer.nextInt();
            if (numero > may) {
                may = numero;
            }
            if (numero < men) {
                men = numero;
            }
            suma = numero + suma;
            i = i + 1;
        }while (i <= n);

        float prom = suma / n;
        System.out.println("El mayor es:" + may);
        System.out.println("El menor es:" + men);
        System.out.println("la suma es:" + suma);
        System.out.println("El promedio es:" + prom);
    }

}
