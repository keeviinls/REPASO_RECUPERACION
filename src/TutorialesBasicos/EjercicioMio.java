package TutorialesBasicos;

import java.util.Scanner;

public class EjercicioMio {
    public static void main(String[] args) {

        int numeros [][] = new int[2][3];
        int contador = 1;
        Scanner nota = new Scanner(System.in);

        for (int j = 0; j< numeros.length; j++){

            for (int i = 0; i< numeros[j].length; i++){

                System.out.println("Por favor dame el valor #" + (contador++));
                numeros[j][i] = nota.nextInt();
            }
        }

        for (int j = 0; j< numeros.length; j++){

            for (int i = 0; i< numeros[j].length; i++){

                System.out.print("[" + numeros [j][i] + "]");
            }

            System.out.println("");
        }







    }
}
