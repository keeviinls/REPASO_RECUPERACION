package Libreria;

import java.util.Arrays;
import java.util.Scanner;

public class COSITAS5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        char letra_arremplazar;
        char letra_nueva;
        System.out.println("Por favor escribe una palabra");
        palabra = sc.nextLine();
        System.out.println("LA LONGITUD DE LA PALABRA ES "+Longitud(palabra));
        System.out.println("LA INICIAL DE LA PALABRA ES "+Inicial(palabra));
        System.out.println("LA ULTIMA LETRA DE LA PALABRA ES "+ultima(palabra));
        System.out.println("QUITAR ESPACIOS DE LA PALABRA ES "+quitar(palabra));
        System.out.println("EN MAYUSCULA LA PALABRA ES "+mayuscula(palabra));
        System.out.println("EN MINUSCULA LA PALABRA ES "+minuscula(palabra));
        System.out.println("===============================");
        System.out.println("Dime que letra de la palabra quieres reemplazar");
        letra_arremplazar = sc.next().charAt(0);
        System.out.println("Dime que letra nueva quieres");
        letra_nueva = sc.next().charAt(0);
        System.out.println("La letra "+letra_arremplazar+" se cambiara por la letra "+letra_nueva+" por lo que la nueva palabra quedaria "+reemplazar(palabra, letra_arremplazar, letra_nueva));
        System.out.println("========================================================");
        System.out.println("AHORA INDICAREMOS SI LA PALABRA ESTA VACIA O NO");
        if (vacio(palabra)){
            System.out.println("La palabra esta vacia");
        }
        else {
            System.out.println("La palabra no esta vacia");
        }
        System.out.println("===================================");
        System.out.println("AHORA PASAREMOS LA PALABRA QUE ESCRIBISTE EN UN ARRAY DE CHAR");
        char[] array = arraydechar(palabra);
        System.out.println(Arrays.toString(array));
    }



    public static int Longitud (String palabra){

        int resultado;
        resultado = palabra.length();
        return resultado;
    }

    public static String Inicial (String palabra){

        String resultado;
        resultado = String.valueOf(palabra.charAt(0));
        return resultado;
    }

    public static char ultima(String palabra){
        char ultima;
        ultima=palabra.charAt(palabra.length()-1); //esto te saca el ultimo caracter
        return ultima;
    }

    public static String quitar(String palabra){
        String quitar = "";
        quitar=palabra.trim();
        return quitar;
    }

    public static String mayuscula(String palabra){
        String resultado = "";
        resultado=palabra.toUpperCase();
        return resultado;
    }

    private static String minuscula(String palabra) {
        String resultado = "";
        resultado=palabra.toLowerCase();
        return resultado;
    }

    private static String reemplazar(String palabra, char letra_arremplazar, char letra_nueva){
        String resultado = "";
        resultado = palabra.replace(letra_arremplazar,letra_nueva);
        return resultado;
    }

    private static boolean vacio(String palabra){
        boolean resultado;
        resultado=palabra.isEmpty();
        return resultado;

    }

    private static char [] arraydechar(String palabra){

        char [] palabraenarray;
        palabraenarray=palabra.toCharArray();
        return palabraenarray;
    }


}
