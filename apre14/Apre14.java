package apre14;
import java.util.Scanner;
public class Apre14 {
    /*Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €    
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros: ");
        float cantidad = leer.nextFloat();
        System.out.print("Ingrese  la moneda a converir: ");
        String moneda = leer.next();
        convierta(cantidad, moneda);
    }
    public static void convierta(float cantidad, String moneda) {
        /* * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €    
         */ 
        float convertir = 0;
        switch (moneda) {
            case "dolares":
                convertir = (float) (cantidad *1.28611);                
                    break;
            case "yenes":
                convertir = (float) (cantidad *129.852); 
                break;
            case "libras":
                convertir = (float) (cantidad *0.86);
                break;
            default:
            System.out.print("Ingreso una moneda no valida ");
        }
        
        System.out.println("el cambio de "+cantidad+"€ es: "+convertir+moneda );
             
    }
}
