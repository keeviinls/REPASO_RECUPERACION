package Practicaprogramacion;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {

        double radio = 0;
        double resultado = 0;
        String operacion = "";


        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de circulos");
        System.out.println("");
        System.out.println("Si escribes area, realizara la operacion de Area ");
        System.out.println("Si escribes perimetro , realizara la operacion de Perimetro");

        operacion = in.nextLine();


        if (operacion == "area" ){

            System.out.println("Calcular area del circulo");
            System.out.println("");
            System.out.println("");

            System.out.println("Escribe el tamaño del radio");
            radio = in.nextFloat();
            resultado = Math.PI * Math.pow(radio, 2);

            System.out.println("El resultado del area es : " + resultado);
        }

        else if (operacion == "perimetro") {

            System.out.println("Calcular perimetro del circulo");
            System.out.println("");
            System.out.println("");

            System.out.println("Escribe el tamaño del radio");
            radio = in.nextFloat();
            resultado = 2 * (Math.PI * radio);

            System.out.println("El resultado del area es : " + resultado);

        }


    }
}
