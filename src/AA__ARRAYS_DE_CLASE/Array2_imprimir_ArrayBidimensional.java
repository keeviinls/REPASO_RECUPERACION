package AA__ARRAYS_DE_CLASE;

import java.util.Scanner;

public class Array2_imprimir_ArrayBidimensional {

    public static void main(String[] args) {

        //array bidimensional (2x3)

        //primera forma
        int[][] array_1 = new int[2][3];
        array_1[0][0]=6;
        array_1[0][1]=8;
        array_1[0][2]=1;
        array_1[1][1]=5;
        array_1[1][1]=9;
        array_1[1][2]=5;
        System.out.println(array_1[0][0]);

        //segunda forma
        int[][] array_2 = {{1,2,6}, {3,4,8}};
        System.out.println(array_2[0][1]);


        //tercera forma
        Scanner sc = new Scanner(System.in);
        int[][] array_4 = new int[2][3];
        for (int i=0;i<array_4.length;i++){
            for (int j=0;j< array_4[i].length;j++){
                System.out.println("Introduce un numero");
                array_4[i][j]= sc.nextInt();
            }
        }

        //imprimir los arrays que hemos creado

        for (int i = 0;i<array_4.length;i++){
            System.out.println(" ");
            for (int j = 0;j<array_4[i].length;j++){
                System.out.print("["+array_4[i][j]+ "]");

            }

        }


        }
    }


