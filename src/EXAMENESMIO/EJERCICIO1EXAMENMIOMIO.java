package EXAMENESMIO;

import java.util.Arrays;
import java.util.Scanner;

public class EJERCICIO1EXAMENMIOMIO {
    public static void main(String[] args) {
        String texto = "";
        texto = llamada_usuario(texto);
        System.out.println("EL TEXTO QUE ME HAS ESCRITO ES     "+texto);
        String [] array_string = llamada_array_string(texto);
        System.out.println("EL ARRAY STIRNG ES     "+Arrays.toString(array_string));
        int [] array_entero = llamadac(array_string);
        System.out.println("EL ARRAY TRANSFORMADO A ENTERO ES    "+Arrays.toString(array_entero));
        int sumatorio = llamadad(array_entero);
        System.out.println("El sumatorio del array "+Arrays.toString(array_entero)+ "es    "+sumatorio);
    }


    public static int llamadad (int [] array_entero){
        int resultado = 0;
        for (int i = 0; i<array_entero.length;i++){

            resultado = resultado+array_entero[i];
        }


        return resultado;
    }



    //CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC//
    public static int [] llamadac (String [] array_string){

        int [] array_entero = new int[array_string.length];

        for (int i=0;i<array_string.length;i++){
            array_entero [i] = Integer.parseInt(array_string[i]);
        }
        return array_entero;
    }




    //BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB//

    public static String [] llamada_array_string (String texto){
        String [] array_string = texto.split(",");
        return array_string;
    }

    //AAAAAAAAAAAAAAAAAAAAAAA//
    public static String llamada_usuario(String texto){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un texto de numeros enteros separado por comas");
        texto = sc.next();


        return texto;
    }
}
