package AA__ARRAYS_DE_CLASE;

public class ArrayEjercicio10_Copy {
    public static void main(String[] args) {
        int[] arrayorigen = {1, 2, 3, 4, 5};

        int[] arraydestino1 = new int[5];
        System.arraycopy(arrayorigen, 0, arraydestino1, 0, 5);
        System.out.println(java.util.Arrays.toString(arraydestino1));


        int[] arraydestino2 = new int[5];
        System.arraycopy(arrayorigen, 0, arraydestino2, 0, 4);
        System.out.println(java.util.Arrays.toString(arraydestino2));
    }
}