package extra05;

import java.util.Scanner;

public class Extra05 {

    /**
     * Una obra social tiene tres clases de socios: o Los socios tipo ‘A’ abonan
     * una cuota mayor, pero tienen un 50% de descuento en todos los tipos de
     * tratamientos. o Los socios tipo ‘B’ abonan una cuota moderada y tienen un
     * 35% de descuento para los mismos tratamientos que los socios del tipo A.
     * o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos
     * sobre dichos tratamientos.
     *
     * o Solicite una letra (carácter) que representa la clase de un socio, y
     * luego un valor real que represente el costo del tratamiento (previo al
     * descuento) y determine el importe en efectivo a pagar por dicho socio.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese una letra (carácter): ");
        String letra = leer.next();
        System.out.print("ingrese el valor real del costo del tratamiento: ");
        float tratamiento = leer.nextFloat();
        letra = letra.toUpperCase();
        float valorfinal = tratamiento;
        switch (letra) {
            case "A":
                System.out.println("EL VALOR DE LA CUOTA DE SoCIO CLASE " + letra
                        + " LE CORRESPONDE PAGAR LA CUOTA MAS " + (tratamiento - tratamiento * 0.50));
                break;
            case "B":
                System.out.println("EL VALOR DE LA CUOTA DE SoCIO CLASE " + letra
                        + " LE CORRESPONDE PAGAR LA CUOTA MAS " + (tratamiento - tratamiento * 0.35));

                break;
            case "C":
                System.out.println("EL VALOR DE LA CUOTA DE SoCIO CLASE " + letra
                        + " LE CORRESPONDE PAGAR LA CUOTA MAS " + tratamiento);
                break;
            default:
                System.out.println("SOCIO NO VALIDO");
                break;

        }
    }

}
