package EXAMEN_MIO;

import java.util.Arrays;
import java.util.Scanner;
//DECIR DIMENSION ENTRE 0 Y 10
//INDICAR CADA VALOR DEL ARRAY
//BUSCAR POSICION
//BUSCAR MAXIMO
//CALCULAR MEDIA
//PRIMERO TIENE QUE INDICIAR ARRAY Y YA DESPUES SE PODRAN USAR LAS DEMAS OPCIONES


public class E1_MEJOR_HECHO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int opcion=0;
        int opcion2=0;
        //int dimension=solicitar_dimension();
        //double [] array=inicializar(dimension);
        // buscar_posicion(array);
        //buscas_maximo(array);
        //imprimir(array);
        //calcular_media(array);

        int dimension=solicitar_dimension();
        do {

        System.out.println("0. Salir");
        System.out.println("1. Inicializar");
        System.out.println("2. Imprimir el valor maximo y su posicion");
        System.out.println("4. Mostrar media");
        System.out.println("5. Imprimir array");
        System.out.println("Esperando opcion...");
        opcion= sc.nextInt();

        if (opcion == 1){

                    double [] array=inicializar(dimension);
                    do {

                    System.out.println("0. Salir");
                    System.out.println("1. Inicializar");
                    System.out.println("2. Imprimir el valor maximo y su posicion");
                    System.out.println("4. Mostrar media");
                    System.out.println("5. Imprimir array");
                    System.out.println("Esperando opcion...");
                    opcion2= sc.nextInt();


                    if (opcion2 == 0){
                        System.out.println("Gracias por usar el programa");
                    }

                    else if (opcion2 == 1){
                        inicializar(dimension);
                    }

                    else if (opcion2 == 2){
                        buscas_maximo(array);
                    }

                    else if (opcion2 == 4){
                        calcular_media(array);
                    }
                    else if (opcion2 == 5) {
                        imprimir(array);
                    }

                    }while (opcion2!=0);
            System.exit(1);


        }

        else if (opcion == 0){
            System.out.println("Gracias por usar el programa");
        }

        else {
            System.out.println("Primero debes inicializar el array");
        }
    }while (opcion!=0);




    }



    private static void calcular_media(double [] array){
        double media = 0;
        for (int i=0; i < array.length; i++) {
            media = media + array[i];
        }
        media = media / array.length;

        System.out.println("LA MEDIA ES "+media);
    }

    private static void imprimir(double [] array){
        System.out.println(Arrays.toString(array));
    }

    private static void buscas_maximo(double[] array){
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
            System.out.println("El numero mayor es "+mayor+" esta en la posicion "+posicion);
        }

    }

    private static void buscar_posicion(double[] array){
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

        double valor=0;
        double [] array=new double[dimension];
        for (int i=0;i<array.length;i++){
            System.out.println("Dime el valor para "+numero_ordinal(i));
            valor=sc.nextDouble();
            array[i]=valor;
        }

        return array;
    }

    private static Ordinales numero_ordinal(int i){
        Ordinales numero=Ordinales.primero;
        switch (i){
            case 0: numero=Ordinales.primero;break;
            case 1: numero =Ordinales.segundo;break;
            case 2: numero =Ordinales.tercero;break;
            case 3: numero =Ordinales.cuarto;break;
            case 4: numero =Ordinales.quinto;break;
            case 5: numero =Ordinales.sexto;break;
            case 6: numero =Ordinales.septimo;break;
            case 7: numero =Ordinales.octavo;break;
            case 8: numero =Ordinales.noveno;break;
            case 10: numero =Ordinales.decimo;break;
        }
        return numero;
    }



    private static int solicitar_dimension(){
        Scanner sc=new Scanner(System.in);
        int dimension=0;
        do {


        System.out.println("Dime la dimension, tiene que ser mayor a 0 y menor o igual 10");
        dimension=sc.nextInt();
        if (dimension <=0 || dimension > 10){
            System.out.println("Error, numero indicado elevado");
        }
        else {
            System.out.println("Ok, entonces tu numero es "+dimension);
        }
    }while (dimension <=0 || dimension > 10);

        return dimension;

}
}
