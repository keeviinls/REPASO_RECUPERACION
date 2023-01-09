package AA__DE_AYUDA;

public class media_unidimensional {
    public static void main(String[] args) {
        int array[] = {100,14,23,24,21,22};
        double media = 0;
        for (int i=0; i < array.length; i++) {
            media = media + array[i];
        }
        media = media / array.length;

        System.out.println("LA MEDIA ES "+media);
    }
}
