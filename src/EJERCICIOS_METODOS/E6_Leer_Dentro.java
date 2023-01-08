package EJERCICIOS_METODOS;
//USUARIO INDICA EL MINIMO Y EL MAXIMO DE NUMERO QUE PUEDE TENER
//ENTRE ESE RANGO INDICARA EL TAMAÑO DEL ARRAY
//INDICARA LOS VALORES DEL ARRAY, USARA EL MISMO RANGO DE NUMEROS
//TAMBIEN INDICARA MEDIA, POSICION, ESTA O NO, COPIARLO EN OTRO ARRAY

import java.util.Arrays;
import java.util.Scanner;

public class E6_Leer_Dentro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array_completado = new int[0];
        int dimension, minimo, maximo, numeros=0;
        System.out.println("Antes de nada dime el minimo que deseas");
        minimo= sc.nextInt();
        System.out.println("Ahora dime el maximo");
        maximo=sc.nextInt();
        do {


        System.out.println("Ahora si dime el tamaño de dimension del array");
        dimension=sc.nextInt();

        if (dimension >= minimo && dimension <= maximo){
            int [] array = new int[dimension];
            System.out.println(Arrays.toString(array));
            System.out.println("Ahora que ya tenemos el array creado, introduciar unos numeros");
            System.out.println("Esos numeros tambien deben estar dentro del rango expresado anteriormente");

                for (int i=0;i<array.length;i++){
                    System.out.println("Dime el numero");
                 do {


                     numeros = sc.nextInt();
                     if (numeros >= minimo && numeros <= maximo) {

                         array[i] = numeros;
                     } else {
                         System.out.println("Error, has introducido un numero que no esta en el rango, vuelve a intentarlo");
                     }
                 }while (numeros < minimo || numeros > maximo);
        }
            System.out.println("El array quedaria "+Arrays.toString(array));
                array_completado=array;

        }
        else {
            System.out.println("Error, has introducido un numero que no esta en el rango");
        }
    }while (dimension < minimo || dimension > maximo);

        System.out.println("ENTONCES EL ARRAY FINAL QUEDARIA "+Arrays.toString(array_completado));

        int opcion=0;
        do {


        System.out.println("AHORA QUE YA TENEMOS EL ARRAY PROCEDEREMOS A HACER ALGUNA OPCION");
        System.out.println("1-VALOR MINIMO");
        System.out.println("2-valor maximo");
        System.out.println("3-media del array");
        System.out.println("4- esta o no en el array");
        System.out.println("5- posicion del numero");
        System.out.println("6- copiar array en otro array");
        System.out.println("7-salir");
        opcion=sc.nextInt();
        switch (opcion){

            case 1:
                valor_minimo(array_completado);break;
            case 2:
                valor_mayor(array_completado);break;
            case 3:
                valor_media(array_completado);break;
            case 4:
                estar(array_completado);break;
            case 5:
                posicion(array_completado);break;
            case 6:
                copiar(array_completado);break;
            default:
                System.out.println("Has seleccionado una opcion que no aparece en la lista");

        }
    }while (opcion != 7  );
        System.out.println("GRACIAS POR USAR EL PROGRAMA");

    }

    private static void copiar(int [] array_completado){
        int [] copiadelarray;

        copiadelarray=array_completado.clone();
        System.out.println("El array clonado seria "+Arrays.toString(copiadelarray));
    }

    private static void posicion(int[] array_completado){
        Scanner sc= new Scanner(System.in);
        int buscas=0;
        int posicion=-1;
        System.out.println("Dime un numero");
        buscas=sc.nextInt();
        for (int i=0;i<array_completado.length;i++){
            if (array_completado[i]==buscas){
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

    private static void estar(int[] array_completado){
        Scanner sc= new Scanner(System.in);
        Arrays.sort(array_completado);
        System.out.println("Dime que numero buscas");
        int buscas= sc.nextInt();
        if (Arrays.binarySearch(array_completado,buscas) >= 0){
            System.out.println("El numero si esta en el array");
        }

        else {
            System.out.println("El numero no se encuentra en el array");
        }
    }

    private static void valor_media(int [] array_completado){
        double media =0;

        for (int i=1;i<array_completado.length;i++){
                media=media+array_completado[i];
        }

        media=media/array_completado.length;
        System.out.println("La media es "+media);
    }



    private static void valor_mayor(int [] array_completado){
        int mayor = array_completado[0];

        for (int i=1;i<array_completado.length;i++){
            if (array_completado[i]>mayor){
                mayor=array_completado[i];
            }

        }
        System.out.println("El numero mayor es "+mayor);
    }

    private static void valor_minimo(int [] array_completado){
        int menor = array_completado[0];

        for (int i=1;i<array_completado.length;i++){
            if (array_completado[i]<menor){
                menor=array_completado[i];
            }

        }
        System.out.println("El numero menor es "+menor);
    }
}
