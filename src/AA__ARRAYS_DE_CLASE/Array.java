package AA__ARRAYS_DE_CLASE;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        //array bidimensional (2x2)

        //primera forma
        int[][] array_1 = new int[2][2];
        array_1[0][0]=6;
        array_1[0][1]=8;
        array_1[0][1]=1;
        array_1[1][1]=5;

        for (int i=0; i<array_1.length;i++);


        //segunda forma
        int[][] array_2 = {{1,2}, {3,4}};

        //tercera forma
        Scanner sc = new Scanner(System.in);
        int[][] array_3 = new int[2][2];

        for (int i=0;i<array_3.length;i++){
            for (int j=0;j< array_3.length;j++){
                System.out.println("Introduce un numero");
                array_3[i][j]= sc.nextInt();

            }



        }

    }

}
