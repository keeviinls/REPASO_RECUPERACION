package z_EJERCICIOSMETODOS;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {
        String palabra=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la palabra con la que quieres trabajar");
        palabra=sc.next();

        System.out.println("Menu de funcionalidades");
        System.out.println("1- Calcula la longitud de la palabra");
        System.out.println("2- Mostrar la inicial de la palabra");
        System.out.println("3- Mostrar la ultima letra de la palabra");
        System.out.println("4- Quitar espacios si hubiere de la palabra");
        System.out.println("5- Mostrar la palabra en mayusculas");
        System.out.println("6- Mosrar la palabra en minuscula");
        System.out.println("7- Reemplazar una letra por otra");
        System.out.println("8- Indicar si el String esta vacio");
        System.out.println("9- Pasarlo a un arrary de char ");

        System.out.println("Por favor introduzca la accion que desea realizar");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1: System.out.println("La  longitud de"+palabra+ "es" +longitud_string(palabra));
                    break;
            case 2: System.out.println("La inicial de"+palabra+ "es" +inicial_string(palabra));
                break;
            case 3:
                System.out.println("La final de " +palabra+"es" +final_string(palabra));
                break;
            case 4:
                System.out.println("La palabra quitandole espacios es" +quitar_espacios(palabra));
                break;
            case 5:
                System.out.println("La palabra en mayusculas es" +mayuscula(palabra));
                break;
            case 6:
                minusculas(palabra);
                break;
            case 7:
                System.out.println("Dime la letra a reemplazar");
                char letra_areemplazar= sc.next().charAt(0);

                System.out.println("Dime la letra nueva");
                char letra_nueva= sc.next().charAt(0);
                System.out.println("La palabra tras reemplazar"  +letra_areemplazar+ "por" +letra_nueva+"es "+remplazo(palabra,letra_areemplazar,letra_nueva));
                break;
            case 8:

                if (esvacio(palabra)){System.out.println("La palabra esta vacio");}

                else {
                    System.out.println("La palabra no esta vacia");
                }
                break;
            case 9:
                char[] array = pasaraarraychar(palabra);
                System.out.println(Arrays.toString(array));
                break;
            default: System.out.println("No has introducido una accion valida"); break;
        }
    }


    // CUALQUIERA DE LAS DOS VALE, ELLA LO HACE DE LAS 2 FORMAS

    //ESTE ES FUNCION (ESTE SI METO ALGO ME LO DEVUELVE)
    public static int longitud_string(String palabra){
        int resultado=0;
        resultado=palabra.length();
        return resultado;
    }

    //ESTE ES PROCEDIMIENTO (SIMPLEMENTE ME DA ALGO)
    public static void longitud_string_2(String palabra)  {

        System.out.println("la longitud de "+palabra+ " es de " +palabra.length());

    }
    //ESTE ES FUNCION (ESTE SI METO ALGO ME LO DEVUELVE)
    public static char inicial_string(String palabra){
        char inicial;
        inicial=palabra.charAt(0);
        return inicial;
    }

    public static void inicial_string2(String palabra){

        System.out.println("La inicial de la palabra" +palabra+ "es " +palabra.charAt(0));


    }

    public static char final_string(String palabra){
        char ultima;
        ultima=palabra.charAt(palabra.length()-1); //esto te saca el ultimo caracter
                return ultima;
    }

    public static String quitar_espacios(String palabra){
        String pal="";
        pal=palabra.trim();
        return pal;
    }

    public static void quitar_espacios2(String palabra){
        System.out.println("La palabra libre de espacios es " +palabra.trim());
    }

    public static String mayuscula(String palabra){
        String resultado;
        resultado=palabra.toUpperCase();
        return resultado;
    }

    public static void minusculas(String palabra){
        System.out.println("La palara en minusculas es "+palabra.toLowerCase());
    }

    public static String remplazo(String palabra, char letra_aremplazar, char letra_nueva){
        String palabra_resultante = null;
        palabra_resultante = palabra.replace(letra_aremplazar, letra_nueva);
        return palabra_resultante;
    }

    public static boolean esvacio(String palabra){
        boolean resultado=false;
        resultado=palabra.isEmpty();
        return resultado;
    }

    public static char [] pasaraarraychar(String palabra){
        char[] array;
        array=palabra.toCharArray();
        return array;
    }
}
