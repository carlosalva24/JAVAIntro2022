package extra08;

import java.util.Scanner;

public class Extra08 {

    /**
     * Escriba un programa que lea números enteros. Si el número es múltiplo de
     * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
     * cantidad de números pares y la cantidad de números impares. Al igual que
     * en el ejercicio anterior los números negativos no deben sumarse. Nota:
     * recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero = 1;
        int i = 0;
        int par = 0;
        int imp = 0;
        do {
            System.out.print("ingrese el numero: ");
            numero = leer.nextInt();

            if ((numero!=5)) {
                i = i + 1;;
            }
            if ((numero % 2 == 0)&&(numero>0)&&(numero!=5)) {
                par = par + 1;
            }
            if (!(numero % 2 == 0)&&(numero>0)&&(numero!=5)) {
                imp = imp + 1;
            }

        } while (!(numero % 5 == 0));
        System.out.println("ingreso: " + i + "numeros");
        System.out.println("ingreso: " + par + "numeros pares");
        System.out.println("ingreso: " + imp + "numeros impares");
    }

}
