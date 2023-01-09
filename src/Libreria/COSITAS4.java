package Libreria;

import java.util.Scanner;

public class COSITAS4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = 0;
        double exponente = 0;
        System.out.println("Introduce el valor de BASE");
        base = sc.nextInt();
        System.out.println("Introduce el valor de EXPONENTE");
        exponente = sc.nextInt();
        //System.out.println(resultado(base, exponente));

        //OTRA OPCION TAMBIEN ES CREAR UNA VARIABLE "RESULTADO" Y DECIR QUE ES EL METODO

        double resultado = resultado(base,exponente);
        System.out.println("el resultado es "+ resultado);


    }

    public static double resultado (double base, double exponente){

        double resultado = 0;

        resultado = Math.pow(base, exponente);


        return resultado;
    }

}
