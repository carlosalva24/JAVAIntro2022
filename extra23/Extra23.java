package extra23;

import java.util.Scanner;

public class Extra23 {

    /**
     * onstruya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres
     * y, a medida que el usuario las va ingresando, construya una “sopa de
     * letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se
     * ubicarán todas en orden horizontal en una fila que será seleccionada de
     * manera aleatoria. Una vez concluida la ubicación de las palabras, rellene
     * los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente
     * imprima por pantalla la sopa de letras creada. Nota: Para resolver el
     * ejercicio deberá investigar cómo se utilizan las siguientes funciones de
     * Java substring(), Length() y Math.random().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String palabra = "";

        String[] palabras = new String[20];

        int i = 0;
        do {
            System.out.print(" ingrese la " + (i + 1) + "° palabra(de 5): ");
            palabras[i] = cargarpalabra(palabra);
            i = i + 1;
            //System.out.println(i);
        } while (i <= 4);

        System.out.println(" debe ingresar entre 3 y 5 carqacterres");

        String[][] sopa = new String[20][20];
        int n = 20;
        int m = 20;
        inicializosopa(n, m, sopa);
        cargarsopa(n, m, sopa, palabras);

        mostrarmatriz(n, m, sopa);

    }

    public static String cargarpalabra(String palabra) {
        Scanner leer = new Scanner(System.in);
        boolean verdad;
        do {
            //System.out.print(" ingrese la palabra: ");
            palabra = leer.next();

            if (palabra.length() >= 3 && palabra.length() <= 5) {

                verdad = false;
            } else {
                System.out.println(" debe ingresar entre 3 y 5 carqacterres");
                verdad = true;
            }
        } while (verdad);

        return palabra;
    }

    public static void inicializosopa(int n, int m, String[][] sopa) {

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {

                sopa[i][j] = Integer.toString(((int) (Math.random() * 10)));
            }

        }

    }

    public static void cargarsopa(int n, int m, String[][] sopa, String[] palabras) {

        int i = 0;
       int o = 0;
        int l = 0;
        for (int p = 0; p <= 4; p++) {
            i = (int) (Math.random() * 10);
            o = (int) (Math.random() * 10);
            int k = 0;
            for (int j = 0; j <= m - 1; j++) {

                if (k < palabras[p].length()) {

                    sopa[i][o+k] = palabras[p].substring(k, k + 1);
                    k = k + 1;
                }
            }

            l = l + 1;
        }

    }

    public static void mostrarmatriz(int n, int m, String[][] sopa) {

        for (int i = 0; i <= n - 1; i++) {

            for (int j = 0; j <= m - 1; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("  ");

        }

    }
}
