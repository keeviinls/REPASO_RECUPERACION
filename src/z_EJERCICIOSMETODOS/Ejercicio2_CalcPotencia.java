package z_EJERCICIOSMETODOS;

import java.util.Scanner;

public class Ejercicio2_CalcPotencia {
    public static void main(String[] args) {
        //declarar, variables
        int base,exponente=0;
        
        //solicitar los datos y asignarselos a las variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base");
        base = sc.nextInt();
        System.out.println("Introduzca el exponente");
        exponente = sc.nextInt();
        
        double resultado = calcularPotencia(base,exponente);
        System.out.println("La potencia es "+resultado);
    }

    private static double calcularPotencia(int base, int exponente) {

        double resultado=0;

        resultado = Math.pow(base,exponente);

        return resultado;

    }
}
