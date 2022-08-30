package apre21;

public class Apre21 {

    /**
     * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y
     * la matriz P de 3x3, se solicita escribir un programa en el cual se
     * compruebe si la matriz P está contenida dentro de la matriz M. Para ello
     * se debe verificar si entre todas las submatrices de 3x3 que se pueden
     * formar en la matriz M, desplazándose por filas o columnas, existe al
     * menos una que coincida con la matriz P. En ese caso, el programa debe
     * indicar la fila y la columna de la matriz M en la cual empieza el primer
     * elemento de la submatriz P. Ejemplo:
     */
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int l=0;
        int m=0;
        matrizM[0][0] = 1;
        matrizM[0][1] = 26;
        matrizM[0][2] = 36;
        matrizM[0][3] = 47;
        matrizM[0][4] = 5;
        matrizM[0][5] = 6;
        matrizM[0][6] = 72;
        matrizM[0][7] = 81;
        matrizM[0][8] = 95;
        matrizM[0][9] = 10;

        matrizM[1][0] = 11;
        matrizM[1][1] = 12;
        matrizM[1][2] = 13;
        matrizM[1][3] = 21;
        matrizM[1][4] = 41;
        matrizM[1][5] = 22;
        matrizM[1][6] = 67;
        matrizM[1][7] = 20;
        matrizM[1][8] = 10;
        matrizM[1][9] = 61;

        matrizM[2][0] = 56;
        matrizM[2][1] = 78;
        matrizM[2][2] = 87;
        matrizM[2][3] = 90;
        matrizM[2][4] = 9;
        matrizM[2][5] = 90;
        matrizM[2][6] = 17;
        matrizM[2][7] = 12;
        matrizM[2][8] = 87;
        matrizM[2][9] = 67;

        matrizM[3][0] = 41;
        matrizM[3][1] = 87;
        matrizM[3][2] = 24;
        matrizM[3][3] = 56;
        matrizM[3][4] = 97;
        matrizM[3][5] = 74;
        matrizM[3][6] = 87;
        matrizM[3][7] = 42;
        matrizM[3][8] = 64;
        matrizM[3][9] = 35;

        matrizM[4][0] = 32;
        matrizM[4][1] = 76;
        matrizM[4][2] = 79;
        matrizM[4][3] = 1;
        matrizM[4][4] = 36;///////////
        matrizM[4][5] = 5;///////////
        matrizM[4][6] = 67;/////////
        matrizM[4][7] = 96;
        matrizM[4][8] = 12;
        matrizM[4][9] = 11;

        matrizM[5][0] = 99;
        matrizM[5][1] = 13;
        matrizM[5][2] = 54;
        matrizM[5][3] = 88;
        matrizM[5][4] = 89;/////
        matrizM[5][5] = 90;////
        matrizM[5][6] = 75;////
        matrizM[5][7] = 12;
        matrizM[5][8] = 41;
        matrizM[5][9] = 76;

        matrizM[6][0] = 67;
        matrizM[6][1] = 78;
        matrizM[6][2] = 87;
        matrizM[6][3] = 45;
        matrizM[6][4] = 14;////
        matrizM[6][5] = 22;////
        matrizM[6][6] = 26;////
        matrizM[6][7] = 42;
        matrizM[6][8] = 56;
        matrizM[6][9] = 78;

        matrizM[7][0] = 98;
        matrizM[7][1] = 45;
        matrizM[7][2] = 34;
        matrizM[7][3] = 23;
        matrizM[7][4] = 32;
        matrizM[7][5] = 56;
        matrizM[7][6] = 74;
        matrizM[7][7] = 16;
        matrizM[7][8] = 19;
        matrizM[7][9] = 18;

        matrizM[8][0] = 24;
        matrizM[8][1] = 67;
        matrizM[8][2] = 97;
        matrizM[8][3] = 46;
        matrizM[8][4] = 87;
        matrizM[8][5] = 13;
        matrizM[8][6] = 67;
        matrizM[8][7] = 89;
        matrizM[8][8] = 93;
        matrizM[8][9] = 24;

        matrizM[9][0] = 21;
        matrizM[9][1] = 68;
        matrizM[9][2] = 78;
        matrizM[9][3] = 98;
        matrizM[9][4] = 90;
        matrizM[9][5] = 67;
        matrizM[9][6] = 12;
        matrizM[9][7] = 41;
        matrizM[9][8] = 65;
        matrizM[9][9] = 12;

        //////////////////////////////////////////
        System.out.println("----MATRIZ 10x10---");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println(" ");
        }
//////////////////////////////////////////
        int[][] matrizP = new int[3][3];
        matrizP[0][0] = 36;
        matrizP[0][1] = 5;
        matrizP[0][2] = 67;

        matrizP[1][0] = 89;
        matrizP[1][1] = 90;
        matrizP[1][2] = 75;

        matrizP[2][0] = 14;
        matrizP[2][1] = 22;
        matrizP[2][2] = 26;
        //////////////////////////////////////////
        System.out.println("----MATRIZ 3x3 a buscar---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizP[i][j] + " ");
            }
            System.out.println(" ");
        }
//////////////////////////////////////////
        /*      System.out.println("----MATRIZ 10x10---");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((matrizM[i][j] == matrizP[0][0]) && (matrizM[i][j + 1] == matrizP[0][0 + 1])) {
                    // System.out.println("----sen encontro en "+i+" "+j);
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            System.out.print(matrizP[k][l] + " en " + (i + k) + " " + (j + l) + ",");
                            // System.out.print(matrizP[i][j] + " ");
                        }
                        System.out.println(" ");
                    }
                }
            }
        }
         */
        /////////////////////////////////////////////////    
        /*  System.out.println("----MATRIZ---");
        boolean enc = false;
        int k = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //for (int k = 0; k < 3; k++) 
                {
                    for (int l = 0; l < 3; l++) {
                        if ((matrizM[i][j] == matrizP[k][k]) || (matrizM[i][j] == matrizP[k][k + 1]) || (matrizM[i][j] == matrizP[k][k + 2])
                                || (matrizM[i][j] == matrizP[k + 1][k]) || (matrizM[i][j] == matrizP[k + 1][k + 1]) || (matrizM[i][j] == matrizP[k + 1][k + 2])
                                || (matrizM[i][j] == matrizP[k + 2][k]) || (matrizM[i][j] == matrizP[k + 2][k + 1]) || (matrizM[i][j] == matrizP[k + 2][k + 2])) {
                            System.out.print(ANSI_RED);
                            break;
                        } else {
                            System.out.print(ANSI_RESET);
                            break;
                        }
                    }
                }
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println(" ");
        }*/
      //  System.out.println("----MATRIZ---");
        boolean enc = false;
        int k = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-3; j++) {
                {
                   /* System.out.print(matrizM[i][j] + "-" + matrizM[i][j + 1] + "-" + matrizM[i][j + 2]);

                    System.out.print(ANSI_RED);
                    System.out.println(matrizP[k][0] + "-" + matrizP[k][k + 1] + "-" + matrizP[k][k + 2]);
                    System.out.print(ANSI_RESET);*/

                    if ((matrizM[i][j] == matrizP[0][0]) && (matrizM[i][j + 1] == matrizP[0][1]) && (matrizM[i][j + 2] == matrizP[0][2])) {
                       //System.out.print(ANSI_RED);
                        
                      //System.out.print(matrizM[i][j]);
                        l=i;
                        m=j;
                        //new String[20][20]
                        break;
                    } else {
                       // System.out.print(ANSI_RESET);
                      //  break;
                    }

                }

            }
          //  System.out.println(" ");
        }
          System.out.println(" la matriz P empieza en["+l+"]["+m+"]"); 
    }
}
 /* En ese caso, el programa debe indicar la fila y la columna de la matriz M en la cual empieza el primer
     * elemento de la submatriz P.*/