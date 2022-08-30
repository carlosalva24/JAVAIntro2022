package extra10;

import java.util.Scanner;

public class Extra10 {

    /**
     * Realice un programa para que el usuario adivine el resultado de una
     * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
     * El programa debe indicar al usuario si su respuesta es o no correcta. En
     * caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
     * su respuesta nuevamente. Para realizar este ejercicio investigue como
     * utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroale1 = (int) (Math.random() * 10);
        int numeroale2 = (int) (Math.random() * 10);
        int multi = numeroale1 * numeroale2;
        int numero = 0;
         System.out.println(multi);
        do {
           
            System.out.println("ingrese el numero: ");
            numero = leer.nextInt();
        } while (!(numero == multi));
        System.out.println("Acertooo!!");
    }

}
