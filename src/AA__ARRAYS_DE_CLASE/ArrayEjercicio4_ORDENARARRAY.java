package AA__ARRAYS_DE_CLASE;

public class ArrayEjercicio4_ORDENARARRAY {
    public static void main(String[] args) {
        int [] numeros ={121,12,1,55};
        java.util.Arrays.sort(numeros);
        System.out.println("Array de numeros ordenados"+ java.util.Arrays.toString(numeros));


        String [] nombres = {"Sofia", "Elena", "Marta", "Alberto"};
        java.util.Arrays.sort(nombres);
        System.out.println("Array de strings ordenados"+ java.util.Arrays.toString(nombres));
    }
}
