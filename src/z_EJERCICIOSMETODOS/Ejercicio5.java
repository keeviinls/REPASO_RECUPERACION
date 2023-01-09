package z_EJERCICIOSMETODOS;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Introduzcame la moneda a cambiar");

        Scanner sc = new Scanner(System.in);
        double dinero_a_cambiar=sc.nextDouble();

        System.out.println("a que moneda quieres cambiar");
        String moneda_a_cambiar = sc.next().toUpperCase();
        convesor(dinero_a_cambiar,moneda_a_cambiar);   //esto es un metodo
    }

    private static void convesor(double dinero_a_cambiar, String moneda_a_cambiar) {

        final double DOLAR=1.25;   //LAS CONSTANTES VAN SIEMPRE EN MAYUSCULAS
        final double LIBRA=0.86;
        final double YENES=129.852;
        double resultado=0;


        switch (moneda_a_cambiar){

            case "DOLAR": resultado=dinero_a_cambiar*DOLAR;break;

            case "LIBRA": resultado=dinero_a_cambiar*LIBRA;break;

            case "YENES": resultado=dinero_a_cambiar*YENES;break;
        }

        System.out.println("La cantidad "+dinero_a_cambiar+" en "+ moneda_a_cambiar+" es "+resultado);
    }
}
