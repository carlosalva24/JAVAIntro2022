package apre17;

import java.util.Scanner;

public class Apre17 {

    /*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos).   
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño N del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[100];
        int[] sumad = new int[100];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " del vector: ");
            vector[i] = leer.nextInt();
        }
        int ndigitos = 1;

        for (int i = 0; i < n; i++) {
            ndigitos = vector[i];
            int conta = 1;
            while (ndigitos >= 10) {
                ndigitos = ndigitos / 10;
                conta = conta + 1;
            }
            // System.out.println("  " + conta +"  "+vector[i]+" "); 
            switch (conta) {
                case 1:
                    sumad[1] = sumad[1] + 1;
                    break;
                case 2:
                    sumad[2] = sumad[2] + 1;
                    break;
                case 3:
                    sumad[3] = sumad[3] + 1;
                    break;
                case 4:
                    sumad[4] = sumad[4] + 1;
                    break;
                case 5:
                    sumad[5] = sumad[5] + 1;
                    break;
                /*    default:
                    System.out.println("OPCION INVALIDA");
                    break;
                 */
            }

        }
        System.out.println("Los  números son de: " + sumad[1] + " de 1 dígito, " + sumad[2] + "de 2 dígitos," 
                + sumad[3] + "de 3 dígitos," + sumad[4] + "de 4 dígitos," + sumad[5] + "de 5 dígitos");

    }

}
