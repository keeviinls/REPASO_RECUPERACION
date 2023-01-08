package EJERCICIOS_METODOS;

import java.util.Arrays;
import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimension=0;
        System.out.println("Dime la dimension del array");
        dimension=sc.nextInt();
        String [] array = new String[dimension];
        for (int i=0;i<array.length;i++){
            String letra="";
            System.out.println("Dime la letra");
            letra=sc.next();
            array[i]= letra;
        }
        System.out.println(Arrays.toString(array));


    }
}
