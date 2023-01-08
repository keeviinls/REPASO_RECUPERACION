package EXAMEN_MIO;

import java.util.Arrays;
import java.util.Scanner;
//INICIALIZAR ARRAY CON VALORRES ALEATORIOS
//INDICAR NUMEROS NEGATIVOS
//INDICAR MULTIPLOS DE 5 Y 3
//VERIFICAR SI ES CAPICUA

public class E3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dimension=solicitar_dimension();
        int opcion=0;
        do {


        System.out.println("Selecciona una de las siguientes opciones");
        System.out.println("0. salir");
        System.out.println("1. Inicializar array aleatoriamente");
        System.out.println("2. Comprobar si es multiplo de 3 y 5 a la vez");
        System.out.println("3. Indicar la cantidad de numeros negativos");
        System.out.println("4. Verificar si es capicua");
        opcion= sc.nextInt();

        if (opcion==0){
            System.out.println("GRACIAS POR USAR EL PROGRAMA");
        }
        else if (opcion == 1){
            int opcion2=0;
            int [] array=inicializar(dimension);
            do {


            System.out.println("Selecciona una de las siguientes opciones");
            System.out.println("0. salir");
            System.out.println("1. Inicializar array aleatoriamente");
            System.out.println("2. Comprobar si es multiplo de 3 y 5 a la vez");
            System.out.println("3. Indicar la cantidad de numeros negativos");
            System.out.println("4. Verificar si es capicua");
            opcion2= sc.nextInt();
            if (opcion2==0){
                System.out.println("Gracias por usar el programa");
                System.exit(1);
            }
            else if (opcion2==1) {
                inicializar(dimension);
            }
            else if (opcion2==2) {
                imprimir_multiplos(array);
            }
            else if (opcion2==3) {
                numeros_negativos(array);
            }
            else if (opcion2==4) {
                verificar_capicua(array);
            }
            else {
                System.out.println("ERROR");
            }
        }while (opcion2!=0);
        }
        else {
            System.out.println("Primero debes inicializar el array");
        }
    }while (opcion!=0);



    }
    private static void verificar_capicua(int[] array) {
        System.out.println("Ahora mismo el array esta asi " + Arrays.toString(array));
        int[] array_invertido = new int[array.length];
        int i = 0;
        for (int j = array.length - 1; j >= 0; j--) {
            array_invertido[i] = array[j];
            i++;

        }

        System.out.println("El array invertido quedaria "+Arrays.toString(array_invertido));

        if (Arrays.equals(array,array_invertido)){
            System.out.println("Es capicua");
        }
        else {
            System.out.println("No es capicua");
        }

    }

   // private static void cositas(int [] array){
     //   for (int i=0;i<array.length;i++) {
        //    System.out.println(array[i]);
       // }
        //}

    private static void numeros_negativos(int[] array){
        int contador=0;
        for (int i=0;i<array.length;i++){
            if (array[i]<0){
                contador ++;
            }
        }

        System.out.println("La cantidad de numeros negativos son "+contador);
    }

    private static void imprimir_multiplos(int [] array){
        for (int i=0;i<array.length;i++){
            if ((array[i]%3==0) && (array[i]%3==0)  ){
                System.out.println("\u001B[31m"+array[i]+"\u001B[0m");
            }
        }
    }

    private static int [] inicializar (int dimension){
        int max=200;
        int min=-200;
        int operacion=0;
        int [] array= new int[dimension];
        for (int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*((max-min)+1))+min;
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

