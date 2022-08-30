package apre04;
import java.util.Scanner;
/**
 Dada una cantidad de grados centígrados se debe mostrar 
 * su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5). 
 */
public class Apre04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de grados centígrados : ");
        double gradosc = leer.nextDouble();
        double gradosf = 32 + (9 * gradosc / 5);
        System.out.println("su equivalente en grados Fahrenheit es : " + gradosf + "°");

    }

}
