package apre18;
//import java.util.Scanner;

public class Apre18 {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
     * A se denota por B y se obtiene cambiando sus filas por columnas (o
     * viceversa). 1 0 4 1 0 6 A=0 5 0 B=0 5 0 9 0-3 4 0-9
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);

            }
        }

//////////////////////////////////////////
        System.out.println("----MATRIZ---");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");

        }
        System.out.println("----MATRIZ TRASPUESTA---");
//////////////////////////////////////////
        int[][] matrizt = new int[4][4];

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                matrizt[i][j] = matriz[j][i];

            }
        }

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {

                System.out.print(matrizt[i][j] + " ");
            }
            System.out.println(" ");

        }
    }
}
