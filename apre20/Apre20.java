package apre20;

import java.util.Scanner;

public class Apre20 {

    /**
     * 0. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1
     * al 9 donde la suma de sus filas, sus columnas y sus diagonales son
     * idénticas. Crear un programa que permita introducir un cuadrado por
     * teclado y determine si este cuadrado es mágico o no. El programa deberá
     * comprobar que los números introducidos son correctos, es decir, están
     * entre el 1 y el 9.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        /* for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               System.out.println(" Ingrese el elemnto ("+i+","+j+"): 1");  
                matriz[i][j] = leer.nextInt();
                                       
            }
        }*/
        matriz[0][0] = 2;
        matriz[0][1] = 7;
        matriz[0][2] = 6;
        matriz[1][0] = 9;
        matriz[1][1] = 5;
        matriz[1][2] = 1;
        matriz[2][0] = 4;
        matriz[2][1] = 3;
        matriz[2][2] = 8;

        System.out.println("----MATRIZ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("----suma de filas---");
        int[] sumaf = new int[3];

        for (int i = 0; i < 3; i++) {
            sumaf[i] = 0;
            for (int j = 0; j < 3; j++) {

                sumaf[i] = sumaf[i] + matriz[i][j];
            }
            System.out.println("fila" + i + " " + sumaf[i]);
        }
        System.out.println("----suma de columnas---");
        int[] sumac = new int[3];

        for (int j = 0; j < 3; j++) {
            sumac[j] = 0;
            for (int i = 0; i < 3; i++) {

                sumac[j] = sumac[j] + matriz[i][j];
            }
            System.out.println("col" + j + " " + sumac[j]);
        }
        System.out.println("----suma de diagonales---");
        int[] sumad = new int[3];
        sumad[0] = 0;
        for (int i = 0; i < 3; i++) {

            sumad[0] = sumad[0] + matriz[i][i];
            System.out.print(matriz[i][i] + " + ");
        }
        System.out.println(" = " + sumad[0]);

        sumad[1] = 0;
        int j = 2;
        for (int i = 0; i < 3; i++) {

            sumad[1] = sumad[1] + matriz[i][j - i];
            System.out.print(matriz[i][j - i] + " + ");
        }
        System.out.println(" = " + sumad[1]);

        System.out.println("----comparo las sumas---");
        if (sumaf[0] == sumac[0] && sumac[0] == sumad[0]) {
            System.out.println("matriz de datos enteros es mágica ");

        } else {  System.out.println("matriz de datos enteros NO es mágica ");
        }

    }

}
