package apre11;

import java.util.Scanner;

public class Apre11 {

    /*11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú
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
                    int suma=numero1+numero2;
                    System.out.println("la Suma es: "+suma);
                    break;
                case 2:
                    int resta=numero1-numero2;
                    System.out.println("la resta es: "+resta);
                    break;
                case 3:
                    int multi=numero1*numero2;
                    System.out.println("la multiplicacion es: "+multi);                    
                    break;
                case 4:
                     float divi=numero1/numero2;
                     System.out.println("la divicion es: "+divi); 
                    break;
                case 5:
                    System.out.println("¿Está seguro que \n" + "desea salir del programa (S/N)?");
                    salir = leer.next();
                   // System.out.println(salir);
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
        } while (!salir.equals("S"));
    }

}
