package AA__ARRAYS_DE_CLASE;

import java.util.Arrays;

public class ArrayEjercicio6_UsoDe__FILL {
    public static void main(String[] args) {

        int [] numeros = new int[6];


        Arrays.fill(numeros, 5);
        System.out.println(Arrays.toString(numeros));



        Arrays.fill(numeros, 2, 4, 8);   //fromindex : cuando empieza  tolindex : cuando acaba  val: que numero
        System.out.println(Arrays.toString(numeros));
    }

}
