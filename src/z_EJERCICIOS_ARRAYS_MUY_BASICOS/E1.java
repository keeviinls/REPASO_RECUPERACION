package z_EJERCICIOS_ARRAYS_MUY_BASICOS;

import java.util.Arrays;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [] array=new int[5];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;

        System.out.println("Este es el primer array "+ Arrays.toString(array));

        int [] array_2={100,200,300,400};
        System.out.println("Este es el segundo array "+Arrays.toString(array_2));

        int [] array_3=new int[5];
        int numero=0;

        for (int i=0;i<array_3.length;i++){
            System.out.println("Dime el numero para el hueco "+i);
            numero= sc.nextInt();
            array_3[i]=numero;
        }

        System.out.println("Este es el segundo array "+Arrays.toString(array_3));

    }
}
