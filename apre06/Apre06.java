package apre06;
import java.util.Scanner;

public class Apre06 {
/**6
Crear un programa que dado un numero determine si es par o impar. 
 */  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        int numero = leer.nextInt();
        if ((numero % 2) == 0) {

            System.out.println("el primer numero ES PAR");
        } else {
            System.out.println("el primer numero NO ES PAR");
        }

    }

}
