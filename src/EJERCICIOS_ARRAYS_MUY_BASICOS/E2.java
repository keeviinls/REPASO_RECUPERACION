package EJERCICIOS_ARRAYS_MUY_BASICOS;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] array=new int[2][2];
        array[0][0]=1;
        array[0][1]=2;
        array[1][0]=3;
        array[1][1]=4;

        System.out.print("["+array [0][0]+"]");
        System.out.println("["+array [0][1]+"]");
        System.out.print("["+array [1][0]+"]");
        System.out.println("["+array [1][1]+"]");


        int [][] array_2={{1,2,3,10},{4,5,6,7},{20,13,14,15}};
        System.out.println("==========================================");
        System.out.println(array_2[2][0]);


        System.out.println("Dime el numero de filas");
        int filas= sc.nextInt();
        System.out.println("Dime el numero de columnas");
        int columnas=sc.nextInt();


        int [][] array_3=new int[filas][columnas];
        for (int i=0;i<array_3.length;i++){

            for (int j=0;j<array_3[i].length;j++){
                System.out.println("DIME UN NUMERO");
                array_3[i][j]=sc.nextInt();

            }
        }

        //IMPRIMIRLO

        for (int i=0;i<array_3.length;i++){
            System.out.println("");
            for (int j=0;j<array_3[i].length;j++){
                System.out.print("["+array_3[i][j]+"]");
            }
        }


    }
}
