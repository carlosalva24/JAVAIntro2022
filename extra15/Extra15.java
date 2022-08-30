package extra15;

import java.util.Scanner;

public class Extra15 {

    /*
15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main. 
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String salir = "N";
        String YN = "Y";
        System.out.println("Ingrese  dos números enteros positivos : ");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        do {
            System.out.println("Ingrese  número entero positivo: ");
            System.out.println("MENU ");
            System.out.println("1. Sumar ");
            System.out.println("2. Restar ");
            System.out.println("3. Multiplicar ");
            System.out.println("4. Dividir ");
            System.out.println("5. Salir ");
            System.out.println("Elija opción: \n"/*+salir !="N"*/);
            //System.out.println(salir);
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    int suma = suma(numero1, numero2);
                    System.out.println("la Suma es: " + suma);
                    break;
                case 2:
                    int resta = resta( numero1,  numero2) ;
                    System.out.println("la resta es: " + resta);
                    break;
                case 3:
                    int multi = multi( numero1,  numero2);
                    System.out.println("la multiplicacion es: " + multi);
                    break;
                case 4:
                    double divi = divi( numero1,  numero2);
                    System.out.println("la divicion es: " + divi);
                    break;
                case 5:
                    System.out.println("¿Está seguro que \n" + "desea salir del programa (S/N)?");
                    salir = leer.next();
                    salir=salir.toUpperCase();
                    // System.out.println(salir);
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
        } while (!salir.equals("S"));

    }

    public static int suma(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    public static int resta(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
    }

    public static int multi(int numero1, int numero2) {
        int multi = numero1 * numero2;
        return multi;
    }

    public static double divi(int numero1, int numero2) {
        double divi = numero1 / numero2;
        return divi;
    }
}
