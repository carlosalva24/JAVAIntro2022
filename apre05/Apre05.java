package apre05;
import java.util.Scanner;
import java.lang.Math;
/*5. Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
public class Apre05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        int numero = leer.nextInt();
        int doble = numero * numero;
        int triple = numero * numero * numero;
        double raiz = Math.sqrt(numero);
        System.out.println("el doble es  : " + doble + ", el triple es  : " + triple + ", la raíz cuadrada es  : " + raiz);

    }

}
