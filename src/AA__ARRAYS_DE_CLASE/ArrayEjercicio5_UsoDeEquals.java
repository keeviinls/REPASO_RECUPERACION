package AA__ARRAYS_DE_CLASE;

import java.util.Arrays;

public class ArrayEjercicio5_UsoDeEquals {

    public static void main(String[] args) {
        int [] numeros1 ={121,12,1,55};
        int [] numeros2 ={121,12,1,55};
        int [] numeros3 ={12,1,55};

        System.out.println("¿son iguales numero1 y numero 2 " + Arrays.equals(numeros1,numeros2));
        System.out.println("¿son iguales numero1 y numero 3 " + Arrays.equals(numeros1,numeros3));
    }








}
