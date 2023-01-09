package AA__ARRAYS_DE_CLASE;

public class Arrayejercicio8_clonarArray {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
        int [] listanumeros2 = new int[4];

        System.out.println("Array numeros "+ java.util.Arrays.toString(numeros));
        listanumeros2 = numeros.clone();
        System.out.println("Array listnumeros "+ java.util.Arrays.toString(listanumeros2));



    }
}
