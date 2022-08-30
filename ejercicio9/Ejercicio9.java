package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    /* EJERCICIO 9 pagina 27
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el 
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int contador = 0;
        int suma = 0;

        do {
            contador++;

            //   System.out.println("Ingrese una nota:"+contador);
            System.out.println("Ingrese un numero:");
            numero = leer.nextInt();
            if (numero > 0) {
                suma = suma + numero;
            }
            if (numero == 0) {
                break;
            }

        } while (contador <= 19);
        System.out.println("la suma es:" + suma);

    }

}
