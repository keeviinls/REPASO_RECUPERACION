package EXAMENESMIO;

import java.util.Arrays;
import java.util.Scanner;

public class EJERCICIO1EXAMEN_MIO {
    public static void main(String[] args) {
        String texto = "";    //CREAMOS UN STRING
        texto=llamada(texto);   //AL STRING CREADO LE DAMOS EL VALOR DEL METODO A
        String [] array_string = convertirB(texto);     //CREAMOS UN ARRAY DE STRING Y LE DAMOS EL VALOR DEL METODO B
        System.out.println(Arrays.toString(array_string));   //IMPRIMIMOS EN PANTALLA EL METODO B
        int [] arrayentero = convertir_enteros(array_string);           //CREAMOS UN NUEVO ARRAY PERO ESTA VEZ DEBE SER DE INT, LE DAMOS EL VALOR DEL METODO C
        int sumatorio = suma(arrayentero);        //CREAMOS UN INT PARA GUARDAR EL METODO D
        System.out.println("El resultao de la suma del array   "+Arrays.toString(arrayentero)+ "   es   "+sumatorio);

    }


    //DDDDDDDDDDDDDDDD//

    public static int suma (int [] arrayentero){

        int resultado=0;   //CREAMOS UNA VARIBALE DONDE GUARADREMOS EL RESULTADO

        for (int i=0;i<arrayentero.length;i++){        //NUEVAMENTE UN FOR COMO SIEMPRE

            resultado=resultado+arrayentero[i];          //EL RESULTADO VA A SER IGUAL A EL MISMO + CADA NUMERO QUE LO COMPONE
        }

        return resultado;
    }


    //CCCCCCCCCCCCCCCCCCC//

    public static int [] convertir_enteros(String[] array_string){

        int [] array_entero = new int[array_string.length];   //CREAMOS UN ARRAY INT DONDE SU CONTENIDO "[]", SERA EL ARRAY DE STRING
        for (int i=0;i<array_string.length;i++){     //HACEMOS EL FOR NUEVAMENTE, COMO SIEMPRE
            array_entero [i]=Integer.parseInt(array_string[i]);    // AL ARRAY INT LE DAMOS EL VALOR DEL ARRAY STRING, PARA EN EL ARRAY INT SU VALOR [I] VA A CAMBIAR COMO CON INTEGER.PARSEINT
            //A LA [I] DEL ARRAY STRING
        }

        return array_entero;
    }







    //BBBBBBBBBBBBB//

    public static String[] convertirB(String texto) {

        String [] array_string = texto.split(",");       //CREAMOS UN ARRAY DE STRING Y LE DECIMOS QUE SEPARE EL TEXTO POR COMAS
        return array_string;
    }



    //AAAAAAAAAAAAAAAAAAAAAAA//
    public static String llamada (String texto){
        //FACIL, SOLAMENTE PEDIMOS AL USUARIO QUE ESCRIBA EL CONTENIDO
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un texto, debe ser de nuemros enteros seperado por comas");
        texto = sc.next();

        return texto;
    }
}
