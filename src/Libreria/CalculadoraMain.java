package Libreria;

import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = 0;
        int valor2=0;

        System.out.println("Escribe el VALOR1");
        valor1 = sc.nextInt();
        System.out.println("Escribe el VALOR2");
        valor2 = sc.nextInt();

        Calculadora valores = new Calculadora(valor1, valor2);
        System.out.println("Calculando resultado");
        valores.Imprimir();
    }
}
