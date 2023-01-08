package EXAMEN_2021;

import java.util.Arrays;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
do {


        System.out.println("1. Calcular sumatorio");
        System.out.println("2. Invertir Array");
        System.out.println("3. Salir");
        opcion=sc.nextInt();
        if (opcion==1){
            calcular();
        }
        else if (opcion==2) {

            System.out.println("Dime el tamaño del array");
            int tamaño = sc.nextInt();
            double[] array = new double[tamaño];
            for (int i = 0; i < array.length; i++) {
                System.out.println("Dime un valor");
                array[i] = sc.nextDouble();
            }

            invertir(array);

        } else if (opcion==3) {
            System.out.println("Gracias por usar el programa");
        }
        else {
            System.out.println("Error, has seleccionado una opcion que no aparece");
        }
    }while (opcion!=3);

    }

    private static void invertir(double [] array) {

        double[] array_invertido = new double[array.length];
        int i=0;
        System.out.println("El array es " + Arrays.toString(array));

        for (int j=array.length-1;j>=0;j--){
            array_invertido[i] = array[j];
            i++;
        }

        System.out.println("El array invertido es "+Arrays.toString(array_invertido));
    }


    private static void calcular(){
        Scanner sc = new Scanner(System.in);
        int numero=0;
        int contador=0;
        int resultado=0;
        System.out.println("Dime un numero entero positivo");
        numero=sc.nextInt();

        for (int i=0;i<numero;i++){
            contador++;
            resultado=resultado+contador;
        }


        System.out.println("El resultado es  " +resultado);
    }
}
