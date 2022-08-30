package apre12;

import java.util.Scanner;

public class Apre12 {

    /*12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: 
tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String FDE = "&&&&&";//final de los envíos 
        int correcta = 0;
        int incorrecta = 0;
        String primer = "X";
        String último = "O";
        String cadena;
        System.out.println("Dispositivo RS232 \n" + "Ingrese las cadenas  \n" + "Ingrese “&&&&&” para el final de los envíos ");
        do {
            cadena = leer.next();
            /*Las cadenas deben llegar con un formato fijo: 
tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas,   */

            if ((cadena.length() == 5) && (cadena.startsWith(primer)) && (cadena.endsWith(último))) {
                correcta++;

            } else {
                if (!cadena.equals(FDE)) {
                    incorrecta++;
                }

            }

        } while (!cadena.equals(FDE));
        System.out.println("la cantidad de lecturas correctas son: " + correcta + " incorrectas son: " + incorrecta);

    }

}
