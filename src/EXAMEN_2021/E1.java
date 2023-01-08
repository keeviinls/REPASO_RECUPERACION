package EXAMEN_2021;

import java.util.Arrays;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        String texto="";
        texto=texto();
        System.out.println("EL TEXTO QUE ME HAS ESCRITO ES "+texto);
        String [] array_string=llamada_array_string(texto);
        System.out.println("EL ARRAY STRING ES "+ Arrays.toString(array_string));
        int [] array_int=llamada_c(array_string);
        System.out.println("El array en INT es "+Arrays.toString(array_int));
        int suma_total=suma(array_int);
        System.out.println("El sumatorio de los arrays es "+suma_total);

    }

    private static int suma(int[] array_int){
        System.out.println("=========================================================");

        int suma=0;
        int contador=0;

        for (int i=0;i<array_int.length;i++){
            suma=suma+array_int[i];
        }
        return suma;
    }

    private static int [] llamada_c(String[] array_string){
        System.out.println("=========================================================");

        int [] array_int = new int[array_string.length];
        for (int i=0;i<array_string.length;i++){
            array_int[i]=Integer.parseInt(array_string[i]);
        }

        return array_int;
    }

    private static String [] llamada_array_string(String texto){
        System.out.println("=========================================================");
        String [] array_string=texto.split(",");
        return array_string;
    }

    private static String texto(){
        Scanner sc=new Scanner(System.in);
        String texto="";
        System.out.println("=========================================================");

        System.out.println("Dime una serie de numeros pero deben estar separados por comas");
        texto= sc.next();
        return texto;
    }
}
