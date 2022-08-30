
package extra24;
import java.util.Scanner;
public class Extra24 {

    /**
  Realizar un programa que complete un vector con los N primeros números de la sucesión 
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes 
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula: 
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba 
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: 
https://quantdare.com/numeros-de-fibonacci
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);

                int a;
		int b;
		int i;
		String resultado;
		int unnumero;
		System.out.print("Ingrese un número : ");
		unnumero = leer.nextInt();
                            
		a = 1;
		b = 1;
		i = 1;
		resultado = funcionfibonacci(unnumero,a,b,i);
		//System.out.println(" Fibonacci es: "+resultado);
	}
public static String funcionfibonacci(int unnumero, int a, int b, int i) {
		int c=0;
		String retorno;
		retorno = "0";
		// escribir ":",i,", ",retorno 
		if (i==unnumero) {
			// //escribir i,", "
			retorno = retorno+","+a;
		} else {
			i = i+1;
			retorno = funcionfibonacci(unnumero,a,b,i);
			c = a+b;
			a = b;
			b = c;
			retorno = retorno+","+a;
			// escribir i," A" a," B" b," C" c," R",retorno
                        
			// escribir retorno
                        	//	System.out.println(retorno);
		}
                System.out.println(i+" A"+a+" B"+ b+" C"+ c+" R"+retorno);
                
                System.out.println(retorno);
		return retorno;
	}


    
}
