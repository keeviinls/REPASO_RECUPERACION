package AA__ARRAYS_DE_CLASE;

public class ArrayEjercicio9_CopyOf {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
        System.out.println("Array numeros " +java.util.Arrays.toString(numeros));

        int [] listanumeros2 = java.util.Arrays.copyOf(numeros, numeros.length);
        System.out.println("Array lista numeros2 "+java.util.Arrays.toString(listanumeros2));

        int [] listanumeros3 = java.util.Arrays.copyOf(numeros, 3);
        System.out.println("Array lista numeros3 "+java.util.Arrays.toString(listanumeros3));

        int [] listanumeros4 = java.util.Arrays.copyOfRange(numeros, 0, numeros.length-1);
        System.out.println("Array lista numeros4 "+java.util.Arrays.toString(listanumeros4));


    }
}
