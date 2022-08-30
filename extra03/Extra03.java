package extra03;

import java.util.Scanner;

/**
 *
 * @author CABEZON
 */
public class Extra03 {

    /**
     * Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por
     * teclado) y almacenar en uno de ellos nombres de personas como cadenas. En
     * el segundo vector se debe almacenar la longitud de cada uno de los
     * nombres (para ello puedes usar la función Longitud() de PseInt). Mostrar
     * por pantalla cada uno de los nombres junto con su longitud.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño N del vector: ");
        int n = leer.nextInt();

        String[] nombres = new String[n];
        int[] longitud = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombres de la persona: ");
            nombres[i] = leer.next();
            longitud[i] = (nombres[i].length());
        }

        System.out.println("Los nombres de las personas");
        for (int i = 0; i < n; i++) {
            System.out.print(nombres[i] + ","+longitud[i]);
           System.out.println("");
        }

    }

}
