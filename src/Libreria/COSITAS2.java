package Libreria;

import java.util.Scanner;

public class COSITAS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        String opciones = "";
        System.out.println("Hola buenas, elige una opcion de las 3 para saber que quieres recibir");
        System.out.println(menu(opciones));
        numero = sc.nextInt();
        System.out.println("Has seleccionado la opcion    "+numero);
        System.out.println(seleccion(numero));

    }

    public static String menu (String opciones) {

        System.out.println("1 - RECIBIR LOS BUENOS DIAS");
        System.out.println("2 - RECIBIR LAS BUENAS TARDES");
        System.out.println("3 - RECIBIR LAS BUENAS NOCHES");
        return opciones;
    }


    public static long seleccion (int numero) {


        switch ((int) numero){
            case 1 : {System.out.println("HAS ESCOGIDO LA OPCION DE BUENOS DIAS");break;}
            case 2 : {System.out.println("HAS ESCOGIDO LA OPCION DE BUENAS TARDES");break;}
            case 3 : {System.out.println("HAS ESCOGIDO LA OPCION DE BUENAS NOCHES");break;}
            default: System.out.println("LA CAGASTE PA");break;
        }

        return numero;
    }


}


