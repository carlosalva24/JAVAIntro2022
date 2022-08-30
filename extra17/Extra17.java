package extra17;

import java.util.Scanner;

public class Extra17 {

    /**
     * Crea una aplicación que nos pida un número por teclado y con una función
     * se lo pasamos por parámetro para que nos indique si es o no un número
     * primo, debe devolver true si es primo, sino false. Un número primo es
     * aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
     * primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo. ¿Qué
     * son los números primos? Básicamente, un número primo es un número natural
     * que tiene solo dos divisores o factores: 1 y el mismo número. Es decir,
     * es primo aquel número que se puede dividir por uno y por el mismo número.
     * El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos
     * son: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,
     * 67, 71, 73, 79, 83, 89 y 97.
     */
    public static void main(String[] args) {
        {
            Scanner leer = new Scanner(System.in);
           // int numeroingresado;
            boolean respuesta;
            System.out.print("Ingrese el numero : ");
            //numeroingresado = 1;
            //umeroingresado = Integer.parseInt(bufEntrada.readLine());
            int numeroingresado = leer.nextInt();
            respuesta = esprimo(numeroingresado);
            if (respuesta) {
                System.out.println(" el numero ingresado " + numeroingresado + " es numero primo? "+respuesta);
            } else {
                System.out.println(" el numero ingresado " + numeroingresado + " es numero primo? "+respuesta);
            }
        }
    }

    public static boolean esprimo(int numeroparafuncion) {
        int contador;
        boolean retorno;
        int sumador;
        contador = 0;
        sumador = 1;
        while (sumador <= numeroparafuncion) {
            //System.out.println(sumador + " " + (numeroparafuncion % sumador == 0));
            if (numeroparafuncion % sumador == 0) {
                contador = contador + 1;
            }
            sumador = sumador + 1;
        }
        retorno = false;
        if (contador == 2) {
            retorno = true;
        }
        return retorno;
    }

}
