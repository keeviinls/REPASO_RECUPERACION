package z_EJERCICIOS_ARRAYS_MUY_BASICOS;

import java.util.Arrays;

public class E5 {
    public static void main(String[] args) {
        int [] array1={1,2,3,4,5};
        int [] array2={1,2,3,4,5};
        int [] array3={6,7,8,9,10};

        System.out.println("Es igual el array 1 y el array 2?");
        System.out.println(Arrays.equals(array1,array2));
        System.out.println("Es igual el array 1 y el array 3?");
        System.out.println(Arrays.equals(array1,array3));

        System.out.println("===================================================");

        int [] numeros1 ={1,2,3,4};
        int [] numeros2 ={1,2,3,4};

        if (Arrays.equals(numeros1,numeros2)){
            System.out.println("Son iguales");
        }

        else {
            System.out.println("No son iguales");
        }
    }


    }

