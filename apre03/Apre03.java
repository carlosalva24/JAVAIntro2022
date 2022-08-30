
package apre03;
import java.util.Scanner;

public class Apre03 {
    /**
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas 
* y después toda en minúsculas. 
* Nota: investigar la función toUpperCase() y toLowerCase() en Java. 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.next();
        frase = frase.toUpperCase();
        System.out.println(frase);

        frase = frase.toLowerCase();
        System.out.println(frase);
        /**
         * toLowerCase() Retorna la cadena en minúsculas toUpperCase() Retorna
         * la cadena en mayúsculas
         */
    }

}
