package extra002;

import java.util.Scanner;

public class Extra002 {

    /**
     3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
     * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
     * la función equals() de la clase String.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una letra : ");
        String letra = leer.next();
        letra = letra.toUpperCase();

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("se detecto  una vocal");
        }else{
            System.out.println("No se deteco una vocal");
        }
   
        /*switch (letra) {
                case "A":
                    System.out.println("se detecto  una vocal");
                    break;
                case "E":
                    System.out.println("se detecto  una vocal");
                    break;
                case "I":
                    System.out.println("se detecto  una vocal");
                    break;
                case "O":
                    System.out.println("se detecto  una vocal");
                    break;
                case "U":
                    System.out.println("se detecto  una vocal");
                    break;
                   default:
                    System.out.println("No se deteco una vocal");
                    break;
                
            }
         */

    }

}
