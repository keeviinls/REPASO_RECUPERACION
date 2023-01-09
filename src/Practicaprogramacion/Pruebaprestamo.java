package Practicaprogramacion;

import java.util.Scanner;

public class Pruebaprestamo {
    public static void main(String[] args) {

        String nombre = "";
        int trabajo = 0;
        int precio_vivienda = 0;
        int dinero_pedido = 0;
        int ahorros = 0;
        int repetir = 3;

        Scanner in = new Scanner(System.in);


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
                    repetir=8;
                }


                else if (trabajo == 2) {
                    System.out.println("Lo sentimos, no podemos concederle el prestamo");
                    repetir=5;
                }

                else {
                    System.out.println("Error, ha introducido un numero incorrecto");
                    System.out.println("Por favor escribe 3 si deseas repetir");
                    repetir = in.nextInt();

                }




    }

}


    }

