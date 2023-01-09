package AA_EXAMEN_2021_MIO_BIEN_HECHO;

import java.util.Arrays;
import java.util.Scanner;

public class E1_BIEN_HECHO {
    public static void main(String[] args) {
        String texto=solicitud();
        String[]array=array(texto);
        int[] array_int=array_enteros(array);
        suma(array_int);
    }

    private static void suma(int[]array_int){
        int resultado=0;
        for (int i=0;i<array_int.length;i++){
            resultado=resultado+array_int[i];
        }

        System.out.println("La suma en total es "+resultado);
    }

    private static int[] array_enteros(String [] array){
        int [] array_int = new int[array.length];
        for (int i=0;i<array_int.length;i++){
            array_int[i]=Integer.parseInt(array[i]);
        }

        System.out.println("El array de enteros quedaria "+Arrays.toString(array_int));

        return array_int;
    }

    private static String[] array(String texto){
        String [] array=texto.split(";");
        System.out.println("El array de String quedaria "+ Arrays.toString(array));
        return array;
    }



    private static String solicitud(){
        Scanner sc=new Scanner(System.in);
        String texto="";
        System.out.println("Dime un texto separados por punto y comas");
        texto= sc.next();
        return texto;
    }
}
