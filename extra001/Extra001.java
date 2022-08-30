package extra001;
import java.util.Scanner;
public class Extra001 {
    /**
     1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el  tiempo en minutos: ");
        int m = leer.nextInt();
        float convertd=m/1440;
        float converth=m/60;
                System.out.print("los minutos a dias : "+convertd+" y horas "+(converth-convertd*24));
    }
    
}
