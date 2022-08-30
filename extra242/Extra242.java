package extra242;

import java.util.Scanner;

public class Extra242 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int unnumero;
        String resultado;
        System.out.print("Ingrese un número : ");
        unnumero = leer.nextInt();
        resultado = funcionfibonacci(unnumero);
        System.out.println(" Fibonacci es: " + resultado);
    }

    public static String funcionfibonacci(int unnumero) {
        int a = 1;
        int b = 1;
        int c = 0;
        String retorno = "0,";
        while (a < unnumero + 1) {
            System.out.print(a + ",");
            retorno = retorno + a + ",";
            c = a + b;
            a = b;
            b = c;

        }

        System.out.println("");
        
        return retorno;
    }
}
