package Practicaprogramacion;

import java.util.Scanner;

public class Practicaprestamo2222 {
    public static void main(String[] args) {

        String nombre = "";
        int trabajo = 0;
        int precio_vivienda = 0;
        int dinero_pedido = 0;
        int ahorros = 0;
        int repetir = 3;

        Scanner in = new Scanner(System.in);

        System.out.println("*** SOLICITAR HIPOTECA ***");
        System.out.println("");
        System.out.println("Comenzaremos con el proceso de solicitud de hipoteca, por favor escribe tu nombre");
        nombre = in.nextLine();


        while (repetir == 3){


        System.out.println("Para comenzar necesitamos saber su estado laboral, por favor indico un numero correspondiente a su respuesta");
        System.out.println("1 - Con trabajo");
        System.out.println("2 - Sin trabajo");

        trabajo = in.nextInt();





        if (trabajo == 1){
            System.out.println("¿Cuanto dinero cuesta la vivienda?");
            precio_vivienda = in.nextInt();
            System.out.println("Vale, nos comunicas que el precio de la vivienda es de " + precio_vivienda + "€");
            System.out.println("");
            System.out.println("¿Cuanto dinero quiere solicitar?");
            dinero_pedido = in.nextInt();
            repetir = 6;

            if (dinero_pedido <= precio_vivienda * 0.80){

                System.out.println("La cantidad de dinero solicitada es de " + dinero_pedido + "€");
                System.out.println("");
                System.out.println("Por favor indique la cantidad de dinero que tiene ahorrado");
                ahorros = in.nextInt();

                if (ahorros >= precio_vivienda * 0.20){

                    System.out.println("Su cantidad de ahorros es de " + ahorros + "€");
                    System.out.println("");
                    System.out.println("*** FELICIDADES sr/sra " + nombre + " ***");
                    System.out.println("Usted cumple todo los requisitos para solicitar la hipoteca");

                }

                else if (ahorros < precio_vivienda * 0.20){
                    System.out.println("Lo sentimos, su dinero ahorrado no cumple la cantidad minima");
                }
                else {
                    System.out.println("Error, no ha introducido un valor valido");
                }


            } else if (dinero_pedido > precio_vivienda * 0.80)
                System.out.println("Lo sentimos, no podemos concederle la hipoteca");

            else {
                System.out.println("Error, no ha introducido un valor valido");
            }



        } else if (trabajo == 2) {
            System.out.println("Lo sentimos, no podemos concederle la hipoteca");
            repetir = 5;
        }

        else {
            System.out.println("Error, ha introducido un numero incorrecto");
            System.out.println("Por favor escriba 3 para volver a seleccionar una opcion");
            repetir = in.nextInt();
        }
    }



    }
}
