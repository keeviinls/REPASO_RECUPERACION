package Practicaprogramacion;

import java.util.Scanner;

public class Circuloconnumeros {
    public static void main(String[] args) {

        double radio = 0;
        double resultado = 0;
        int operacion = 0;


        Scanner in = new Scanner(System.in);

        System.out.println("*** CALCULOS CIRCULO ***");
        System.out.println("");
        System.out.println("1 - Calculo perimetro");
        System.out.println("2 - Calculo area");
        System.out.println("3 - Calculo volumen");
        System.out.println("");
        System.out.println("Por favor indica un numero correspondiente a la operacion que desea hacer");
        operacion = in.nextInt();



        if (operacion == 1){

            System.out.println("Calcular perimetro del circulo");
            System.out.println("");

            System.out.println("Escribe el tamaño del radio");
            radio = in.nextFloat();
            resultado = 2 * (Math.PI * radio);

            System.out.println("El resultado del perimetro es : " + resultado + "m");

        }

        else if (operacion == 2) {

            System.out.println("Calcular area del circulo");
            System.out.println("");

            System.out.println("Escribe el tamaño del radio");
            radio = in.nextFloat();
            resultado = Math.PI * Math.pow(radio, 2);

            System.out.println("El resultado del area es : " + resultado + "²");

        }

        else if (operacion == 3) {

            System.out.println("Calcular volumen del circulo");
            System.out.println("");

            System.out.println("Escribe el tamaño del radio");
            radio = in.nextFloat();
            resultado = ((Math.PI * Math.pow(radio, 3)) * 4) / 3;


            System.out.println("El resultado del volumen es : " + resultado + "³");

        }

        else {
            System.out.println("Error,por favor escribe un numero del 1 al 3");
        }
    }
}
