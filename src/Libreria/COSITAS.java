package Libreria;

import java.util.Scanner;

public class COSITAS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numero2 = 0;

        System.out.println("ESCRIBE EL PRIMER NUMERO");
        numero = sc.nextInt();
        System.out.println("ESCRIBE EL SEGUNDO NUMERO");
        numero2 = sc.nextInt();
        System.out.println("El resultado de "+numero+ " mas " +numero2+ " da un total de "+suma(numero, numero2));

    }

    public static int suma (int numero, int numero2){

        int resultado = 0;
        resultado = numero + numero2;

        return resultado;
    }
}

