package AA__DE_AYUDA;

import java.util.Scanner;

//ESTE MENU HACE QUE PRIMERO TIENES QUE PULSAR INICIALIZAR O SALIR, CUANDO YA LE HAS DADO A INCIALIZAR PUEDES HACER LO QUE QUIERAS
//PARA SALIR TIENES QUE PULSAR 0
public class Menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int opcion=0;
        int opcion2=0;
        do {

            System.out.println("0. Salir");
            System.out.println("1. Inicializar");
            System.out.println("2. Imprimir el valor maximo y su posicion");
            System.out.println("4. Mostrar media");
            System.out.println("5. Imprimir array");
            System.out.println("Esperando opcion...");
            opcion= sc.nextInt();

            if (opcion == 1){

                do {

                    System.out.println("0. Salir");
                    System.out.println("1. Inicializar");
                    System.out.println("2. Imprimir el valor maximo y su posicion");
                    System.out.println("4. Mostrar media");
                    System.out.println("5. Imprimir array");
                    System.out.println("Esperando opcion...");
                    opcion2= sc.nextInt();


                    if (opcion2 == 0){
                        System.out.println("Gracias por usar el programa");
                    }

                    else if (opcion2 == 1){

                    }

                    else if (opcion2 == 2){

                    }

                    else if (opcion2 == 4){

                    }
                    else if (opcion2 == 5) {

                    }

                }while (opcion2!=0);
                System.exit(1);


            }

            else if (opcion == 0){
                System.out.println("Gracias por usar el programa");
            }

            else {
                System.out.println("Primero debes inicializar el array");
            }
        }while (opcion!=0);
    }
}
