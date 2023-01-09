package AA__ArrayBiblioteca;

public class MinimoValorArray {
    public static void main(String[] args) {
        int[] valores = {10, 20, 5, 1, 7, 30, 4};

        int menor = valores[0];

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        System.out.println("El número menor es el " + menor);
    }
}
