package Libreria;

import java.util.Scanner;

public class COSITAS6 {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO, POR FAVOR ESCOGE UNA OPCION");
        System.out.println("1 - AREA DEL CIRCULO");
        System.out.println("2 - AREA DEL TRIANGULO");
        System.out.println("3 - AREA DEL CUADRADO");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1: {
                System.out.println("Por favor dime el radio del circulo");
                double radio = sc.nextDouble();
                System.out.println("El area del circulo es "+circulo(radio));
                break;
            }

            case 2: {
                System.out.println("Por favor dime la base del triangulo");
                double base = sc.nextDouble();
                System.out.println("Por favor dime la altura del triangulo");
                double altura = sc.nextDouble();
                System.out.println("El area del triangulo es "+triangulo(base, altura));

                break;
            }

            case 3:{
                System.out.println("Por favor dime el lado del cuadrado");
                double lado = sc.nextDouble();
                System.out.println("El area del cuadrado es "+cuadrado(lado));
                break;
            }


            default: {
                System.out.println("Has seleccionado un numero que no aparece en la lista");
                break;
            }
        }
    }

    public static double circulo (double radio){
        double resultado;

        resultado = Math.pow(radio,2)*Math.PI;
        return resultado;
    }

    public static double triangulo (double base, double altura){
        double resultado;
        resultado = (base * altura)/2;
        return resultado;
    }

    public static double cuadrado (double lado){
        double resultado;

        resultado = lado * lado;

        return resultado;
    }

}
