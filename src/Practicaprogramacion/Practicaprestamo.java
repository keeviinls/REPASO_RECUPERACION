package Practicaprogramacion;

import java.util.Scanner;

public class Practicaprestamo {
    public static void main(String[] args) {

        String nombre = "";
        int trabajo = 0;
        int precio_vivienda = 0;
        int dinero_pedido = 0;
        int ahorros = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("*** HACER PRESTAMO ***");
        System.out.println("");
        System.out.println("Comenzaremos con el proceso de prestamo, por favor escribe tu nombre");
        nombre = in.nextLine();



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

            if (dinero_pedido <= precio_vivienda * 0.80){

                System.out.println("La cantidad de dinero solicitada es de " + dinero_pedido + "€");
                System.out.println("");
                System.out.println("Por favor indique la cantidad de dinero que tiene ahorrado");
                ahorros = in.nextInt();

                if (ahorros >= precio_vivienda * 0.20){

                    System.out.println("Su cantidad de ahorros es de " + ahorros + "€");
                    System.out.println("");
                    System.out.println("Felicidades, cumple todos los requisitos para solicitar el prestamo");

                }

                else if (ahorros < precio_vivienda * 0.20){
                    System.out.println("Lo sentimos, su dinero ahorrado no cumple la cantidad minima");
                }
                else {
                    System.out.println("Error, por favor indique nuevamente la cantidad");
                }


            } else if (dinero_pedido > precio_vivienda * 0.80)
                System.out.println("Lo sentimos, no podemos concederle el prestamo");

            else {
                System.out.println("Error, por favor indique nuevamente la cantidad solicitada");
            }



        } else if (trabajo == 2) {
            System.out.println("Lo sentimos, no podemos concederle el prestamo");
        }

        else {
            System.out.println("Error, ha introducido un numero incorrecto");
        }




    }
}
