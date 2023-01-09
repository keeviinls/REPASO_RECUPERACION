package Practicaprogramacion;

import java.util.Scanner;

public class Perimetroirculo {
    public static void main(String[] args) {
        double radio = 0;
        double resultado = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Calcular perimetro del circulo");
        System.out.println("");
        System.out.println("");

        System.out.println("Escribe el tamaño del radio");
        radio = in.nextFloat();
        resultado = 2 * (Math.PI * radio);

        System.out.println("El resultado del area es : " + resultado);
    }
}
