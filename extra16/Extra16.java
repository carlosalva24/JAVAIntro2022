package extra16;

import java.util.Scanner;

public class Extra16 {

    /**
     * Diseñe una función que pida el nombre y la edad de N personas e imprima
     * los datos de las personas ingresadas por teclado e indique si son mayores
     * o menores de edad. Después de cada persona, el programa debe preguntarle
     * al usuario si quiere seguir mostrando personas y frenar cuando el usuario
     * ingrese la palabra “No”
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese  la cantidad de personas : ");
        int cantidad = leer.nextInt();

        int[] edad = new int[cantidad];
        String[] nombre = new String[cantidad];
        cargar(cantidad, edad, nombre);
        mostrando(cantidad, edad, nombre);
    }

    public static void cargar(int cantidad, int[] edad, String[] nombre) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= cantidad - 1; i++) {
            System.out.println("Ingrese  el nombre de la persona : ");
            nombre[i] = leer.next();
            System.out.print("Ingrese  la edad de la persona : ");
            edad[i] = leer.nextInt();

            if (edad[i] > 18) {
                System.out.println("la persona es mayor de edad");
            } else {
                System.out.println("la persona es menor de edad");
            }
        }

    }

    public static void mostrando(int cantidad, int[] edad, String[] nombre) {
        Scanner leer = new Scanner(System.in);
        int i = 0;
                String pregu;
                boolean pr=true;
        //for (int i = 0; i <= cantidad - 1; i++) 
        do{
            System.out.println("El nombre de la persona es : " + nombre[i]);

            System.out.println("La edad de la persona es: " + edad[i]);
            if (edad[i] > 18) {
                System.out.println("la persona es mayor de edad");
            } else {
                System.out.println("la persona es menor de edad");
            }
            
            System.out.println("quiere seguir mostrando personas si/no"+i);
             pregu = leer.next();
             //System.out.println(pregu);
             //System.out.println(pregu.equalsIgnoreCase("no"));
            /*if (d=="no") {
                break;
            }*/
            i=i+1;
            
             //System.out.println((pregu=="no"));
             pr=pregu.equalsIgnoreCase("no");
               System.out.println(pr);           
             //boolean pr=pregu=="no";
        }while (!pr && (i <= cantidad-1));
        /*do {
           
            System.out.println("ingrese el numero: ");
            numero = leer.nextInt();
        } while (!(numero == multi));
        */
    }
}
