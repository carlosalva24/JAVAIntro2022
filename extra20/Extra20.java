package extra20;

public class Extra20 {

    /**
     * Crear una función rellene un vector con números aleatorios, pasándole un
     * arreglo por parámetro. Después haremos otra función o procedimiento que
     * imprima el vector.
     */
    public static void main(String[] args) {
        int n = 10;
        int[] vector = new int[n];
        cargarv(n, vector);
        imprimav(n, vector);
    }

    public static void cargarv(int n, int[] vector) {
        for (int i = 0; i <= n - 1; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void imprimav(int n, int[] vector) {
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("vertor[" + (i+1) + "]:" + vector[i]);

        }
    }
}
