package examen_mio_mio;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int dimension=solicitar_dimension();
        int[] array=inicializar(dimension);
        imprimir_multiplos(array);
        numeros_negativos(array);
        comprobar_capicua(array);
    }
    private static void comprobar_capicua(int[]array){
        int[] array_invertido= new int[array.length];

        // int j= array.length;
        int i=0;
        System.out.println("El array  es"+Arrays.toString(array));
        for (int j=array.length-1;j>=0;j--){
            array_invertido[i]=array[j];
            i++;

        }
        System.out.println("El array invertido es"+Arrays.toString(array_invertido));
        if (Arrays.equals(array,array_invertido)){
            System.out.println("Es capicua");
        }
        else{
            System.out.println("No es capicúa");
        }
    }


    private static void numeros_negativos(int[]array){
        int contador=0;
        for (int i=0;i<array.length;i++){
            if (array[i]<0){
                contador++;
            }
        }

        System.out.println("la cantidad de numeros negativos es "+contador);
    }

    private static void imprimir_multiplos(int[]array){
        for (int i=0;i<array.length;i++){
            if ((array[i]%3==0) && (array[i]%3==0)){
                System.out.println("\u001B[31m"+array[i]+"\u001B[0m");
            }
        }
    }


    private static int[] inicializar(int dimension){
        int max=200;
        int min=-200;

        int [] array=new int[dimension];
        for (int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*((max-min)+1))+min;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    private static int solicitar_dimension(){
        Scanner sc=new Scanner(System.in);
        int dimension=0;
        do {


        System.out.println("Dime la dimension, debe ser mayor a 0");
        dimension= sc.nextInt();

        if (dimension <= 0){
            System.out.println("numero erroneo");
        }
        else {
            System.out.println("Tu numero es "+dimension);
        }
    }while (dimension<=0);
        return dimension;
    }
}

