package EXAMEN;

import java.util.Arrays;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        int dimension=solicitar_dimension();
        int [] array_completado=inicializar(dimension);
        imprimir_multiplos(array_completado);
        numeros_negativos(array_completado);
        comprobar_capicua(array_completado);

    }

    private static void comprobar_capicua(int[]array_completado){
        int[]array_inverso=new int[array_completado.length];
        System.out.println("El array es "+Arrays.toString(array_completado));
        int i=0;
        for (int j=array_completado.length-1;j>=0;j--){
            array_inverso[i]=array_completado[j];
            i++;
        }
        System.out.println("El array invertido ahora mismo es "+Arrays.toString(array_inverso));
        if (Arrays.equals(array_completado,array_inverso)){
            System.out.println("Es capicua");
        }

        else {
            System.out.println("No es capicua");
        }
    }


    private static void numeros_negativos(int[]array_completado){
        int contador=0;
        for (int i=0;i<array_completado.length;i++){
            if (array_completado[i]<0){
                contador++;
            }
        }

        System.out.println("La cantidad de numeros negativos es "+contador);
    }

    private static void imprimir_multiplos(int [] array_completado){
        for (int i=0;i<array_completado.length;i++){
            if (array_completado[i]%3==0 && array_completado[i]%5==0){
                System.out.println("\u001B[31m"+array_completado[i]+"\u001B[0m");
            }
        }
    }


    private static int[] inicializar(int dimension){
        final int MAX=200;
        final int MIN=-200;
        int[] array=new int[dimension];
        for (int i=0;i<array.length;i++){
            array[i]=(int) (Math.random()*((MAX-MIN)+1))+MIN;
        }

        System.out.println("El array quedaria "+ Arrays.toString(array));
        return array;
    }



    private static int solicitar_dimension(){
        Scanner sc=new Scanner(System.in);
        int dimension=0;
        do {


        System.out.println("Dime el tamaño de dimension que tendra el array, recuerda que debe ser mayor a 0");
        dimension=sc.nextInt();
        if (dimension <= 0){
            System.out.println("Introduzca una dimension correcta");
        }
        else {

        }
    }while (dimension <= 0);
        return dimension;
    }
}
