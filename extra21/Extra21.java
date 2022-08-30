package extra21;

import java.util.Scanner;

public class Extra21 {

    /**
     * Los profesores del curso de programación de Egg necesitan llevar un
     * registro de las notas adquiridas por sus 10 alumnos para luego obtener
     * una cantidad de aprobados y desaprobados. Durante el periodo de cursado
     * cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por
     * parciales. Las ponderaciones de cada nota son: Primer trabajo práctico
     * evaluativo 10% Segundo trabajo práctico evaluativo 15% Primer Integrador
     * 25% Segundo integrador 50% Una vez cargadas las notas, se calcula el
     * promedio y se guarda en el arreglo. Al final del programa los profesores
     * necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
     * teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
     * igual al 7 de sus notas del curso.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int alumnos = 10;
        int notaspr = 5;
        double[][] array = new double[alumnos][notaspr];

        cargararray(alumnos, notaspr, array);
        imprimaarray(alumnos, notaspr, array);
    }

    public static void cargararray(int alumnos, int notaspr, double[][] array) {
        double suma;
        double prom;

        
        for (int i = 0; i <= alumnos - 1; i++) {
            suma = 0;
            for (int j = 0; j <= notaspr - 2; j++) {

                if (j == 0) {
                    array[i][j] = ((int) (Math.random() * 10));
                }
                if (j == 1) {
                    array[i][j] = ((int) (Math.random() * 10));
                }
                if (j == 2) {
                    array[i][j] = ((int) (Math.random() * 10));
                }
                if (j == 3) {
                    array[i][j] = ((int) (Math.random() * 10));
                }

                suma = suma + array[i][j];
            }
            //array[i][notaspr-1] =suma ;
            prom = suma / 4;
            array[i][notaspr - 1] = prom;

        }
        int sumaapro = 0;
        
        for (int i = 0; i <= alumnos - 1; i++) {
            if (array[i][notaspr - 1]>= 7) {
                 sumaapro =  sumaapro +1;
            }
        }
        int desapro = alumnos - sumaapro;
         System.out.print(" la cantidad de aprobados :"+sumaapro+" y desaprobados: " + desapro);
    }

    public static void imprimaarray(int alumnos, int notaspr, double[][] array) {
        System.out.println(" NOTAS");

        for (int i = 0; i <= alumnos - 1; i++) {

            System.out.print(" ALUMNO " + (i + 1) + ": ");
            for (int j = 0; j <= notaspr - 1; j++) {
                System.out.print(/*"array[" + (i + 1) + "][" + (j + 1) + "]:" +*/array[i][j] + " ");

            }
            System.out.println(" ");
        }
    }
}
