package apre19;

public class Apre19 {

    /**
     * Realice un programa que compruebe si una matriz dada es anti simétrica.
     * Se dice que una matriz A es anti simétrica cuando ésta es igual a su
     * propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica
     * si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
     * obtiene cambiando sus filas por columnas (o viceversa matriz mstriz
     * transpuesta 0-2 4 0 2-4 2 0 2 -2 0-2 -4-2 0 4 2 0 En este caso la matriz
     * es anti simétrica.
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        /*  for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }*/
        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;

//////////////////////////////////////////
        System.out.println("----MATRIZ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
//////////////////////////////////////////
        int[][] matrizt = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizt[j][i] = matriz[i][j];

            }
        }
        System.out.println("----MATRIZ TRANSPUESTA---");
//////////////////////////////////////////
        //matrizt[2][2] = -1;
        //     matrizt[0][1] = -1;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(matrizt[j][i] + " ");
            }
            System.out.println(" ");

        }
        System.out.println("----e---a---");
//////////////////////////////////////////
        boolean atisi = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // System.out.println( matriz[i][j]+ " " + matrizt[j][i]);
                if (matriz[i][j] == -matrizt[i][j]) {
                    atisi = true;

                } else {
                    atisi = false;
                    break;
                }
            }
        }
        if (atisi) {
            System.out.println("----La MATRIZ es anti simétrica---");
        } else {
            System.out.println("----La MATRIZ NO es anti simétrica---");
        }
    }
}
