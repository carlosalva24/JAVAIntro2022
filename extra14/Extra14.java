package extra14;

import java.util.Scanner;

public class Extra14 {

    /**
     * Se dispone de un conjunto de N familias, cada una de las cuales tiene una
     * M cantidad de hijos. Escriba un programa que pida la cantidad de familias
     * y para cada familia la cantidad de hijos para averiguar la media de edad
     * de los hijos de todas las familias.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese  cantidad de familias : ");
        int n = leer.nextInt();
        int suma = 0;
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Ingrese  la cantidad de hijos de la " + (i+1) + "° familia : ");
            int hijo = leer.nextInt();
            suma = suma + hijo;
            
        }
        double media=suma/n;
        
        System.out.println("la media de edad de los hijos de todas las familias es: "+media);
    }

}
