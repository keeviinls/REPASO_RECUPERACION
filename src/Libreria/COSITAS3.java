package Libreria;

import java.util.Scanner;

public class COSITAS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Introduzca un numero por favor");
        numero = sc.nextInt();
        System.out.println("El numero que has introducido es "+numero);
        System.out.println(resultado(numero));

    }


    public static String resultado (int numero){

        String solucion = "";

        if (numero % 2 == 0 ){
            solucion = "El numero introducido es par";
        }

        else {
            solucion = "El numero introducido es impar";
        }


        return solucion;
    }
}
