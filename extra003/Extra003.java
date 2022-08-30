package extra003;


public class Extra003 {

    /**
     2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        
int A=2;
int B=7;
int C=5;
int D=9;
System.out.println("A : "+A);
System.out.println("B : "+B);
System.out.println("C : "+C);
System.out.println("D : "+D);

//System.out.println("B : "+A);
int aux = B;
B=C;
C=A;
A=D;
D=aux;
//C aux;

/*
b de c
1-auxB
c de a
2C=A
a de d
A=D
d de b
2-auxB
*/
System.out.println("ahora A tiene: "+A);
System.out.println("ahora B tiene: "+B);
System.out.println("ahora C tiene: "+C);
System.out.println("ahora D tiene: "+D);

    }
    
}
