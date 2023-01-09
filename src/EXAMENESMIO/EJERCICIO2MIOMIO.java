package EXAMENESMIO;

import java.util.Arrays;
import java.util.Scanner;

public class EJERCICIO2MIOMIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;





        System.out.println("BIENVENIDO, POR FAVOR ELIGE UNA DE LAS SIGUIENTES OPCIONES");
            do {
        System.out.println("1 - CALCULAR SUMATORIO");
        System.out.println("2 - INVERTIR ARRAY");
        System.out.println("3 - SALIR");
        opcion = sc.nextInt();

        switch (opcion) {

            case 1: {
                System.out.println("SUMATORIO PAPA");
                sumatorio();
                break;
            }

            case 2: {
                System.out.println("INVERTIR ARRAY PAPA");
                invertir();
                break;
            }

            case 3: {
                System.out.println("Muchas gracias por usar el programa");
                break;
            }

            default: {
                System.out.println("Has seleccionado un numero incorrecto, por favor vuelve a intentarlo");
                break;
            }
        }
    }
        while (opcion != 3);
    }


    public static void invertir(){
        Scanner sc = new Scanner(System.in);
        int tamaño = 0;
        System.out.println("DIME EL TAMAÑO DEL ARRAY");
        tamaño = sc.nextInt();
        double [] array = new double[tamaño];

        for (int i = 0;i<array.length;i++){
            System.out.println("Dime el valor del numero "+i);
            array [i] = sc.nextDouble();
        }

        System.out.println("El array seria "+ Arrays.toString(array));

        double [] array_invertido = new double[tamaño];
        for (int i=0;i<array.length;i++){
            array_invertido [i]= array.length-i;
        }

        System.out.println("El array invertido quedaria "+Arrays.toString(array_invertido));



    }

    public static void sumatorio (){
        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        int numero = 0;
        System.out.println("Por favor escribe un numero");
        numero = sc.nextInt();

        for (int i = 0;i<=numero;i++){
            resultado = resultado + i;
            System.out.print("+" +i);

        }
        System.out.println("");
        System.out.println("El resultado del sumatorio es "+resultado);
    }
}
