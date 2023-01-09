package EXAMENESMIO;

import java.util.Arrays;
import java.util.Scanner;

public class EJERCICIO2EXAMEN_MIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
        System.out.println("BIENVENIDO");
        System.out.println("Selecciona cualquiera de las siguientes opciones");
        System.out.println("1 - Calcular sumatorio");
        System.out.println("2 - Invertir Array");
        System.out.println("3 - Salir");
        opcion = sc.nextInt();


        switch (opcion){

            case 1: {
                sumatorio();break;
            }

            case 2: {
                invertir();break;
            }

            case 3: {
                System.out.println("Adios y gracias por usar el programa");break;
            }

            default:{
                System.out.println("Has seleccionado una opcion erronea");break;
            }
        }

    }
        while (opcion!=3);
    }


    public static void invertir (){
        Scanner sc = new Scanner(System.in);
        int dimension = 0;
        double[] array;
        System.out.println("DIME EL TAMAÑO DEL ARRAY");
        dimension = sc.nextInt();
        array = new double[dimension];
        for (int i=0;i<array.length;i++){
            System.out.println("Dime el valor de  "+i);
            array[i]= sc.nextDouble();
        }

        System.out.println("El array quedaria  "+ Arrays.toString(array));
        double [] array_invertido = new double[dimension];
        for (int i=0;i<array.length;i++){
            array_invertido [i] = array.length-i;

        }

        System.out.println("El array invertido es "+Arrays.toString(array_invertido));

    }




    //AAAAAAAAAAAAAAAAAAAAAAAAAAAA//
    public static void sumatorio (){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int resultado = 0;

        do {
            System.out.println("ESCRIBE UN NUMERO ENTERO POSITIVO");
            numero = sc.nextInt();

            for (int i=0;i<=numero;i++){
                resultado=resultado+i;
            }
        }

        while (numero<0);
        System.out.println("El sumatorio de "+numero+ " es "+resultado);




    }
}
