package AA__ARRAYS_DE_CLASE;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEjercicio11_MiManera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        int [] array1 = {1,2,3,4};
        int [] array1simulado = new int[5];
        System.out.println("el array es" +Arrays.toString(array1));
        array1simulado = Arrays.copyOf(array1,array1.length+1);
        System.out.println("el arraysimulado  es"+Arrays.toString(array1simulado));
        System.out.println("¿quieres intentar nuevoelemento ");

        opcion = sc.next().toLowerCase().charAt(0);

        if (opcion=='s'){
            System.out.println("dime numero");
            int valornuevo = sc.nextInt();
            array1simulado[array1simulado.length-1]=valornuevo;
            System.out.println("el array es "+Arrays.toString(array1simulado));
        }

        else {
            System.out.println("pues nada");
        }
    }
}
