package examen_mio_mio;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion=0;
        int opcion2=0;
        int dimension=solicitar_dimension();
        //double[] array=inicializar(dimension);
        //imprimir(array);
        //buscar_posicion(array);
        //double[] buscar_maximo=buscar_maximo(array);
        //calcular_media(array);
        //imprimir_resultado(buscar_maximo);
        do {


        System.out.println("0. Salir");
        System.out.println("1. Inicializar");
        System.out.println("2. Imprimir el valor maximo y su posicion");
        System.out.println("4. Mostrar media");
        System.out.println("5. Imprimir array");
        System.out.println("Esperando opcion...");
        opcion= sc.nextInt();
        if (opcion == 0){
            System.out.println("Gracias por usar el programa");
        }

        else if (opcion==1){
            double[] array=inicializar(dimension);
            do {


            System.out.println("0. Salir");
            System.out.println("1. Inicializar");
            System.out.println("2. Imprimir el valor maximo y su posicion");
            System.out.println("4. Mostrar media");
            System.out.println("5. Imprimir array");
            System.out.println("Esperando opcion...");
            opcion2= sc.nextInt();
            switch (opcion2){
                case 0:
                    System.out.println("Gracias por usar el programa");System.exit(1);break;
                case 1:inicializar(dimension);break;
                case 2:double[] buscar_maximo=buscar_maximo(array);
                    imprimir_resultado(buscar_maximo);break;
                case 4:    calcular_media(array);break;
                case 5:imprimir(array);
                default:
                    System.out.println("Error");
            }
        }while (opcion2!=0);
        }

        else {
            System.out.println("Debes inicializar el array primero");
        }
    }while (opcion !=0);
    }

    private static void calcular_media(double[] array){
        double media = 0;
        for (int i=0; i < array.length; i++) {
            media = media + array[i];
        }
        media = media / array.length;

        System.out.println("LA MEDIA ES "+media);
    }
    private static void imprimir_resultado (double[] buscar_maximo){
        for (int i=0;i<buscar_maximo.length-1;i++){

            System.out.print("El maximo es "+buscar_maximo[i]);
        }

        for (int i=1;i<buscar_maximo.length;i++){
            System.out.println(" y se encuentra en la posicion "+buscar_maximo[i]);

        }
    }

    private static void imprimir(double[]array){
        System.out.println("El array es "+Arrays.toString(array));
    }

    private static double []buscar_maximo (double[] array){
        Scanner sc=new Scanner(System.in);
        double mayor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }

        int posicion = -1;
        for (int i=0;i<array.length;i++){
            if (array[i]==mayor){
                posicion=i;
            }
        }
        if (posicion==-1){
            System.out.println("No se encontro el numero");
        }
        else {
            System.out.println("");
        }

        double[] array_mayor={mayor,posicion};
        System.out.println("EL ARRAY DEL MAYOR Y SU POSICIO ES  "+Arrays.toString(array_mayor));
        return array_mayor;
    }

    private static void buscar_posicion(double[]array){
        Scanner sc=new Scanner(System.in);

        double buscas=0;
        int posicion = -1;
        System.out.println("Dime el numero que quieres buscar ");
        buscas=sc.nextDouble();
        for (int i=0;i<array.length;i++){
            if (array[i]==buscas){
                posicion=i;
            }
        }
        if (posicion==-1){
            System.out.println("No se encontro el numero");
        }
        else {
            System.out.println("El numero "+buscas+" esta en la posicion "+posicion);
        }
    }

    private static double[] inicializar(int dimension){
        Scanner sc=new Scanner(System.in);

        double[] array=new double[dimension];
        for (int i=0;i<array.length;i++){
            System.out.println("Dime el valor para "+i);
            double valor= sc.nextDouble();
            array[i]=valor;
        }

        return array;
    }

    private static int solicitar_dimension(){
        Scanner sc=new Scanner(System.in);
        int numero=0;
        do {


        System.out.println("Dime un numero entre el 0 y el 10");
        numero=sc.nextInt();

        if (numero <1 || numero >10){
            System.out.println("Numero erroneo");
        }
        else {
            System.out.println("Ok, tu numero es "+numero);
        }
    }while (numero <1 || numero >10);
        return numero;
    }
}
