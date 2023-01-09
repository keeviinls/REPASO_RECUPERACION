package EXAMENESMIO;

import java.util.Scanner;

public class examenejercicio2 {
    public static void main(String[] args) {
       int opcion;

        do {
        System.out.println("Funcionalidades ejercicio 2");
        System.out.println("1. calcular sumatorio");
        System.out.println("2. invertir array");
        System.out.println("3. salir");

        System.out.println("Introduzca un elemento");
        Scanner sc = new Scanner(System.in);
        opcion= sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Que numero quieres el sumatorio");
                    int numero = sc.nextInt();

                    int sumatorio = metodo1(numero);
                    System.out.println("el sumatorio de "+numero+ " es "+sumatorio);
                    break;
                case 2:


                    break;
                case 3:
                    System.out.println("Gracias por utilizar el programa.");break;

            }

        }while (opcion!=3);
    }

    private static int metodo1(int numero) {
        int resultado=0;
        for (int i=1;i<=numero;i++){
            resultado=resultado+i;

        }

        return resultado;
    }
}
