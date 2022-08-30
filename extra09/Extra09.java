package extra09;

import java.util.Scanner;

public class Extra09 {

    /**
     * Simular la división usando solamente restas. Dados dos números enteros
     * mayores que uno, realizar un algoritmo que calcule el cociente y el
     * residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
     * obtener un resultado menor que el divisor, este resultado es el residuo,
     * y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13: 50
     * – 13 = 37 una resta realizada 37 – 13 = 24 dos restas realizadas 24 – 13
     * = 11 tres restas realizadas dado que 11 es menor que 13, entonces: el
     * residuo es 11 y el cociente es 3. ¿Aún no lo entendiste? Recomendamos
     * googlear división con restas sucesivas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /* System.out.print("ingrese 1° de 2° número entero mayor que uno: ");
                    int numero1 = leer.nextInt();
        System.out.print("ingrese 2° de 2° número entero mayor que uno: ");
                    int numero2 = leer.nextInt();
         */
        {
            //   BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            int resta;
            int resultado;
            System.out.print("Ingrese el 1° número: ");
            // numero1 = Integer.parseInt(bufEntrada.readLine());
            int numero1 = leer.nextInt();
            System.out.print("Ingrese el 2° número: ");
            //numero2 = Integer.parseInt(bufEntrada.readLine());
            int numero2 = leer.nextInt();
            resultado = numero1;
            resta = 0;
            System.out.println(" dividendo " + numero1 + " divisor " + numero2);
            if (numero1 >= numero2 && numero2 != 0) {
                //restassucesivas(numero1,numero2,resta,resultado);
                resultado = numero1;
                while (resultado >= numero2) {
                    resultado = resultado - numero2;
                    resta = resta + 1;
                    System.out.println(" menos " + numero2 + " resto " + resultado + " cociente " + resta);
                    System.out.println(" el resto " + resultado + " y el cociente es " + resta);
                }
            } else {
                System.out.println("  el primer numero debe se mayor que el segundo y el segundo distinto de cero ");
            }
        }
    
/*
    public static void restassucesivas(String numero1, double numero2, double resta, double resultado) {
        resultado = numero1;
        while (resultado >= numero2) {
            resultado = resultado - numero2;
            resta = resta + 1;
            System.out.println(" menos " + numero2 + " resto " + resultado + " cociente " + resta);
        }
    }*/

}

}
