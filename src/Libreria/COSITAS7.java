package Libreria;

import java.util.Scanner;

public class COSITAS7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion="";
        double euros = 0;
        System.out.println("Buenas tardes, por favor introduce la cantidad de euros.");
        euros = sc.nextDouble();
        System.out.println("Ahora selecciona cualquiera de las siguientes opciones");
        System.out.println("LIBRAS");
        System.out.println("DOLARES");
        System.out.println("YENES");
        opcion = sc.next();  //CON SC.NEXTLINE NO FUNCIONA
        opcion=opcion.toLowerCase();

        switch (opcion) {
            case "libras":{
                System.out.println("HAS SELECCIONADO LA OPCION DE LIBRAS");
                System.out.println(+euros+" euros" + " pasado a libras es "+libras(euros));
                break;
            }

            case "dolares":{
                System.out.println("HAS SELECCIONADO LA OPCION DE DOLARES");
                System.out.println(+euros+ "pasado a libras es "+dolares(euros));
                break;
            }

            case "yenes":{
                System.out.println("HAS SELECCIONADO LA OPCION DE YENES");
                System.out.println(+euros+ "pasado a libras es "+yenes(euros));
                break;
            }

            default:{
                System.out.println("SELECCIONASTE MAL");break;
            }
        }
    }

    public static double libras(double euros){

        double libras = 0.86;
        double resultado = 0;

        resultado = euros * libras;

        return resultado;
    }

    public static double dolares(double euros){

        double dolares = 1.28611;
        double resultado = 0;

        resultado = euros * dolares;


        return resultado;
    }

    public static double yenes(double euros){

        double yenes = 129.852;
        double resultado = 0;

        resultado = euros * yenes;


        return resultado;
    }
}
