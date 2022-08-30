package apre07;
import java.util.Scanner;
public class Apre07 {
    /*7. Crear un programa que pida una frase y si esa frase es igual a “eureka”
    el programa pondrá un mensaje de Correcto,     sino mostrará un mensaje de Incorrecto. 
    Nota: investigar la función equals() en Java. 
     
    equals(String str) Sirve para comparar si dos cadenas son iguales. 
    Devuelve true si son iguales y false si no. */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase : ");
        String frase = leer.next();
        String frase2 = "eureka";
        if (frase.equals(frase2) == true) {
            System.out.println(" la frase es igual a “eureka”");
        } else {
            System.out.println("frase es NO esigual a “eureka”");
        }

    }

}
