package AA__ArrayBiblioteca;

public class MaximoValorArray {
    public static void main(String[] args) {
        int[] valores = {10, 20, 5, 1, 7, 30, 4};

        int mayor = valores[0];

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > mayor) {
                mayor = valores[i];
            }
        }

        System.out.println("El número mayor es el " + mayor);

    }
}
