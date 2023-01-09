package AA__ARRAYS_DE_CLASE;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEjercicio12_Eliminar_Valor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array_inicial = {5,46,3,9};
        int [] array_final = new int[3];
        System.out.println(Arrays.toString(array_inicial));
        System.out.println("Indique el número que quiere borrar");
        int item = sc.nextInt();
        int posicion = Arrays.binarySearch(array_inicial,item);

        if (posicion<0){
            System.out.println("El elemento no esta en el array. No se puede eliminar nada");

        }
        else {

            int cositas = array_inicial.length - (posicion+ 1);
            System.arraycopy(array_inicial, 0, array_final, 0, posicion);
            System.arraycopy(array_inicial, posicion + 1, array_final, posicion, cositas);

            System.out.println("Elemento borrado");
            System.out.println("el array actualizado es "+Arrays.toString(array_final));

        }
    }
}
