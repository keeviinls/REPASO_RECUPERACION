package EXAMEN;

import java.util.Arrays;
import java.util.Scanner;
//ME FALTA USAR EL ENUMERADO Y QUE EN EL PRIMER MENU PUEDA SALIR PULSANDO 0
//TAMBIEN MEJORAR EL IMPRIMIR MAXIMO
public class E1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

        //System.out.println(dimension);

        //buscar_posicion(incializacion);
        //buscar_maximo(incializacion);
        //imprimir(incializacion);
        //calcular_media(incializacion);

        int dimension=solicitar_dimesion();
        int opcion=0;
        int opcion2=0;
        do {


        System.out.println("Selecciona una de las siguientes opciones");
        System.out.println("0. Salir");
        System.out.println("1. Inicializar");
        System.out.println("2. Imprimir el valor maximo y su posicion");
        System.out.println("3. Mostrar media");
        System.out.println("5. Imprimir el array");
        System.out.println("Esperando opcion...");
        opcion= sc.nextInt();

        if (opcion == 1){
            float [] incializacion=inicializar(dimension);
            do {


            System.out.println("Selecciona una de las siguientes opciones");
            System.out.println("0. Salir");
            System.out.println("1. Inicializar");
            System.out.println("2. Imprimir el valor maximo y su posicion");
            System.out.println("3. Mostrar media");
            System.out.println("5. Imprimir el array");
            System.out.println("Esperando opcion...");
            opcion2= sc.nextInt();

            if (opcion2 == 1){
                inicializar(dimension);
            }

            else if (opcion2 == 2){
                buscar_maximo(incializacion);
            }

            else if (opcion2 == 3){
                calcular_media(incializacion);
            }
            else if (opcion2 == 5) {
                imprimir(incializacion);
            }
            else if (opcion2 == 0) {
                System.out.println("GRACIAS POR USAR EL PROGRAMA");
            }

            else {
                System.out.println("LIADA");
            }
        }while (opcion2!=0);


        }
        else if (opcion == 0) {
            System.out.println("GRACIAS POR USAR EL PROGRAMA");
        }
        else {
            System.out.println("Tienes que inicializar el array primero antes de hacer otras operaciones");
        }
    }while (opcion != 1 );


    }

    private static void imprimir_resultado(float buscar_maximo){
        System.out.println(buscar_maximo);
    }

    private static void calcular_media(float[]incializacion){
        float media=0;

        for (int i=0;i<incializacion.length;i++){
            media=media+incializacion[i];
        }
        media=media/incializacion.length;
        System.out.println("La media es "+media);

    }

    private static void imprimir(float [] incializacion){
        System.out.println(Arrays.toString(incializacion));
    }
    private static void buscar_maximo(float [] incializacion){
        Scanner sc = new Scanner(System.in);
        float mayor=incializacion[0];
        float posicion=0;

        for (int i=1;i<incializacion.length;i++){
            if (incializacion[i]>mayor){
                mayor=incializacion[i];
            }
        }

        System.out.println("El numero mayor es el "+mayor);
        for (int i=0;i<incializacion.length;i++){
            if (incializacion[i]==mayor){
                posicion=i;
            }
        }

        if (posicion==-1){
            System.out.println("No se encontro el numero");
        }
        else {
            System.out.println("El numero mayor es el "+mayor+" esta en la posicion "+posicion);
        }

    }



    private static void buscar_posicion(float [] incializacion){
        Scanner sc = new Scanner(System.in);

        float buscas=0;
        int posicion=-1;

        System.out.println("Escribe el numero que buscas");
        buscas=sc.nextFloat();

        for (int i=0;i<incializacion.length;i++){
            if (incializacion[i]==buscas){
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



    private static float [] inicializar(int dimension){
        float valor=0;
        Scanner sc = new Scanner(System.in);

        float [] array=new float[dimension];
        for (int i=0;i<array.length;i++){
            System.out.println("Dime un valor para "+i);
            valor= sc.nextFloat();
            array[i]=valor;
        }

        return array;
    }



    private static int solicitar_dimesion(){
        int dimension=0;
        Scanner sc = new Scanner(System.in);
        do {


        System.out.println("Dime la dimension, recuerda que debe ser mayor a 0 y menor a 10");
        dimension=sc.nextInt();
        if (dimension > 0 && dimension <= 10){
            System.out.println("");
        }
        else {
            System.out.println("Error, has elegido un numero que no esta dentro del rango, por favor vuelve a intentarlo");
        }
    }while (dimension <= 0 || dimension > 10);
        return dimension;
    }
}


