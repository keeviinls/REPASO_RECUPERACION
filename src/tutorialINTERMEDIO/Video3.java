package tutorialINTERMEDIO;

import java.util.Scanner;

public class Video3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = "", palabraInvertida = "";
        int longitud_palabra = 0;

        System.out.println("Escribe una palabra o frase: ");
        palabra = sc.nextLine();

        longitud_palabra = palabra.length();

        while (longitud_palabra != 0){

                palabraInvertida += palabra.substring(longitud_palabra -1, longitud_palabra);
                longitud_palabra --;
        }

        System.out.println("Palabra invertida "+palabraInvertida);

    }
}
