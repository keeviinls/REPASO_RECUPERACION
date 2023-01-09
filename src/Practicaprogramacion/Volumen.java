package Practicaprogramacion;

import java.util.Scanner;

public class Volumen {
    public static void main(String[] args) {

        double radio = 0;
        double resultado = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Calcular volumen del circulo");
        System.out.println("");
        System.out.println("");

        System.out.println("Escribe el tamaño del radio");
        radio = in.nextFloat();
        resultado = ((Math.PI * Math.pow(radio, 3)) * 4) / 3;


        System.out.println("El resultado del area es : " + resultado);
    }
}
