//package apre21.v2;
//public class Apre21V2 {
package apre21.v2;

public class Apre21V2 {

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
        // int[][] matrizM = new int[10][10];
        // int matrizk[][];
        // matrizk = new int[10][10];

        // String cadenamat = "020706090501040308";
        // System.out.print(((int)cadenamat.length() )+ " ,");
        // cargarmatriz( cadenamat,matrizk,3);
        // vermatriz(matrizk,3);
        int l = 0;
        int m = 0;

//vermatriz(matrizk,10);
        //////////////////////////////////////////
        int orden10 = 10;
        int[][] matrizM = new int[orden10][orden10];

        String cadenamaM = "01263647050672819510111213214122672010615678879009901712876741872456977487426435327679013605679612119913548889907512417667788745142226425678984534233256741619182467974687136789932421687898906712416512";
        //System.out.println(cadenamaM + " ,");
        // System.out.println(cadenamaM.length() + " ,");
        cargarmatriz(cadenamaM, matrizM, orden10);
        vermatriz(matrizM, orden10);

//////////////////////////////////////////
        //////////////////////////////////////////
        //  System.out.println("----MATRIZ 3x3 a buscar---");
       // String cadenamaP = "360567899075142226";
       ///////////String cadenamaP = "012636111213567887";
       // String cadenamaP = "470506214122900990";
        
         String cadenamaP = "325674871367906712";
        int orden3 = 3;
        int[][] matrizP = new int[orden3][orden3];

        cargarmatriz(cadenamaP, matrizP, orden3);
        vermatriz(matrizP, 3);
//////////////////////////////////////////
  
        ///////////////////////////////////////////////////////////////////////////
        buscamatriz(matrizM, orden10, matrizP, orden3);
        /////////////////////////////////////////////////////////////////////// 

    }

    public static void cargarmatriz(String cadenamat, int matriz[][], int m) {
        int i;
        int j;
        int k;
        k = 0;
        for (i = 0; i <= m - 1; i++) {
            for (j = 0; j <= m - 1; j++) {
                matriz[i][j] = Integer.valueOf(cadenamat.substring(k, k + 2));
                //System.out.print(cadenamat.substring(k,k+2)+" ");
                //System.out.println(cadenamat.substring(k,k+2));
                //System.out.print(((k)+"."+(k+1)+";"));
                k = k + 2;
            }
        }
    }
////////////////////////////////////////////////////////////////////////////////

    public static void vermatriz(int matriz[][], int m) {
        int i;
        int j;
        System.out.println("----MATRIZ " + m + "x" + m + "---");
        for (i = 0; i <= m - 1; i++) {
            for (j = 0; j <= m - 1; j++) {
                if (matriz[i][j] < 10) {
                    System.out.print(" ");
                }
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println(" ");
        }
    }

    public static void buscamatriz(int matrizM[][], int orden10, int matrizP[][], int orden3) {
        int l = 0;
        int m = 0;
        int o = 0;
        int p = 0;
        boolean enc = false;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                if (o < matrizP.length && p < matrizM.length) {

                    if ((matrizM[i][j] == matrizP[o][p]) && (matrizM[i][j + 1] == matrizP[o][p + 1]) /*&& (matrizM[i + 2][j] == matrizP[o + 2][p])*/) {
                        if (enc == false) {
                            enc = true;
                            l = i;
                            m = j;

                        }
                        System.out.print(ANSI_RED);
                        if (matrizP[o][p + 1] < 10) {
                            System.out.print(matrizP[o][p] + "  " + matrizP[o][p + 1] + " " + matrizP[o][p + 2]);
                        } else {
                            System.out.print(matrizP[o][p] + " " + matrizP[o][p + 1] + " " + matrizP[o][p + 2]);
                        }
                        System.out.print(ANSI_RESET);
                        System.out.print(" " + matrizM[i][j + 3] + " " + matrizM[i][j + 4] + " " + matrizM[i][j + 5]);
                        p++;
                        if (p == 1) {
                            o++;
                            p = 0;
                        }
                        if (o == 3) {
                            o = 0;
                        }
                        break;
                    } else {
                        if (matrizM[i][j] < 10) {
                            System.out.print(" ");
                        }
                        System.out.print(matrizM[i][j] + " ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println(" la matriz P empieza en[" + l + "][" + m + "]");

    }

}
