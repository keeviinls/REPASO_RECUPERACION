package EJERCICIOS_METODOS;

import java.util.Arrays;
import java.util.Scanner;

public class E3_IMPORTANTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra="";
        System.out.println("DIME LA PALABRA");
        palabra= sc.next();

        System.out.println("LONGITUD DEL STRING "+palabra.length());
        System.out.println("INICIAL DEL STRING "+palabra.charAt(0));
        System.out.println("ULTIMA LETRA "+palabra.charAt(palabra.length()-1));
        System.out.println("QUITAR ESPACIOS "+palabra.trim());
        System.out.println("EN MAYUSCULAS "+palabra.toUpperCase());
        System.out.println("EN MINUSCULAS "+palabra.toLowerCase());
        System.out.println("REEMPLAZAR UNA LETRA POR OTRA");
        System.out.println("LETRA A REEMPLAZAR");
        char letra_arremplazar=sc.next().charAt(0);
        System.out.println("LETRA NUEVA");
        char letra_nueva=sc.next().charAt(0);
        String nueva_palabra="";
        nueva_palabra=palabra.replace(letra_arremplazar,letra_nueva);
        System.out.println("Quedaria "+nueva_palabra);
        System.out.println("ES VACIO ");
       // if (esvacio(palabra)){System.out.println("La palabra esta vacio");}
        //else {System.out.println("La palabra no esta vacia");
        //EL METODO SERIA
        //boolean resultado=false;
        //resultado=palabra.isEmpty();
        //return resultado;
        System.out.println("PASAR A UN ARRAY DE CHAR");
        char [] array;
        array=palabra.toCharArray();
        System.out.println(Arrays.toString(array));
    }



    }

