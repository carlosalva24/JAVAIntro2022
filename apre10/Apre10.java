package apre10;
import java.util.Scanner;
public class Apre10 {

    /*10. Escriba un programa en el cual se ingrese un valor límite positivo,
    y a continuación solicite números al usuario hasta que la suma de los números 
    introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo: ");
        int valor = leer.nextInt();
        int suma = 0;
        while (suma <= valor) {
            System.out.println("Ingrese un número: ");
            int numero = leer.nextInt();
            suma = suma + numero;

        }

    }

}
