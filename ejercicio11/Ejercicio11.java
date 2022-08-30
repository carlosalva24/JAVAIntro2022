
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    /*
EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada 
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se 
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las 
vocales acentuadas) se mantienen sin cambios.
pagina 31
 //// a e i o u
//// @ # $ % *   
 Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.   
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese caracteres por teclado terminada en punto: ");
        String caracteresingresado = leer.next();
        String resultado = "";
        resultado = codifica(caracteresingresado, resultado);
        System.out.println("  El texto codificado es " + resultado);
    }

    public static String codifica(String caracteresingresado, String resultado) {
        caracteresingresado = caracteresingresado.toLowerCase();
        int cantidad = caracteresingresado.length();
        //char letra='h';
        String resultado1 = "";
        for (int i = 0; i <= cantidad - 1; i++) {
            String letra;
            String letra2 = "a";
            letra = caracteresingresado.substring(i, i + 1);
            // System.out.println("   "+letra); 
            //.substring(int i, int i);
            //  System.out.println("   "+letra); 
            switch (letra) {
                case "a":
                    letra2 = "@";
                    break;
                case "e":
                    letra2 = "#";
                    break;
                case "i":
                    letra2 = "$";
                    break;
                case "o":
                    letra2 = "%";
                    break;
                case "u":
                    letra2 = "*";
                    System.out.println(letra2);
                    break;
                default:
                    letra2 = caracteresingresado.substring(i, i + 1);
            }
            resultado1 = resultado1.concat(letra2);
            //resultado=caracteresingresado.replace(letra, letra2);          
            //   System.out.println(resultado1) ;  
        }
        // resultado=caracteresingresado;
        return resultado1;
    }
//pagina 39 caracteres

    /*int num1=5;
     int num2=7;
     System.out.println("la suma de ambos es: "+ sumar(num1,num2));     
     int retorno=sumar(num1,num2);
     System.out.println("la suma de ambos es: "+ retorno);     
    }
     public static int sumar(int num1, int num2) {
     int suma;
     suma=num1+num2;
     return suma;
     } 
     */
}
    

