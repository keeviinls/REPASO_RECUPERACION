package AA__DE_AYUDA;

import java.util.Arrays;
import java.util.Scanner;

public class inicializar_unidimensional {
    public static void main(String[] args) {
        int dimension = 5;
        Scanner sc=new Scanner(System.in);

        double valor=0;
        double [] array=new double[dimension];
        for (int i=0;i<array.length;i++){
            System.out.println("Dime el valor para "+i);
            valor=sc.nextDouble();
            array[i]=valor;
        }
        System.out.println("El array quedaria "+ Arrays.toString(array));

        //return array;
    }
}
