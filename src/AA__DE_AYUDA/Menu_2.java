package AA__DE_AYUDA;

import java.util.Scanner;

public class Menu_2 {
    public static void main(String[] args) {
        int opcion = -1;
        int dimension;
        int numero = 0;

       //  dimension = solicitar();
        //  float[] array = new float[dimension];
        Scanner sc = new Scanner(System.in);
        boolean inicializado=false;
        do {
            System.out.println("Introduzca una de las siguientes opciones");
            System.out.println("0. Salir");
            System.out.println("1. Inicializar");
            System.out.println("2. Imprimir el valor máximo y su posición");
            // System.out.println("3. Imprimir el valor mínimo y su posición");
            System.out.println("4. Mostrar media");
            System.out.println("5. Imprimir array");
            System.out.println("Esperando opción...");
            opcion = sc.nextInt();


            if (opcion != 0) {

                if (!inicializado&& opcion!=1) {

                    System.out.println("Tiene que inicializar el array primero antes de hacer otras operaciones");
                }

                else {

                    switch (opcion) {
                        case 1:

                            // //inicializar(array);
                            inicializado = true;
                            break;
                        case 2:

                            //   float[] valores_maximo = buscar_maximo(array);
                            //  imprimir_resultado(valores_maximo);


                            break;
                        case 3:

                            //   float[] valores_minimo = buscar_minimo(array);
                            //  imprimir_resultado(valores_minimo);


                            break;
                        case 4:

                            //  float media = calcular_media(array);
                            // System.out.println("la media es " + media);

                            break;
                        case 5:
                            // System.out.println(Arrays.toString(array));
                            break;

                    }


                }
            }
            else
            {
                System.out.println("Gracias por usar el programa");
            }



        } while (opcion != 0) ;



    }
    }

