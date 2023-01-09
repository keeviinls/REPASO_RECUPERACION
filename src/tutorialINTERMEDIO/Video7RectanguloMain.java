package tutorialINTERMEDIO;

import java.util.Scanner;

public class Video7RectanguloMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el valor de la base: ");
        int base = sc.nextInt();

        System.out.println("Dame el valor de la altura ");
        int altura = sc.nextInt();

        Video7Rectangulo mensajero = new Video7Rectangulo(base, altura);

       mensajero.Imprimir();

    }
}
