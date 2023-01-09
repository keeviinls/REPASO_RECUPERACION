package z_EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

public class E5_CalcPotencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  base, exponente=0;
        System.out.println("Dime la base");
        base= sc.nextDouble();
        System.out.println("Dime un exponente");
        exponente= sc.nextDouble();
        System.out.println("Entonces la potencia es");
        System.out.println(" "+exponente);
        System.out.println(base);
        operacion(base,exponente);


    }

    public static void operacion (double base, double exponente){

        double resultado=0;
        resultado=Math.pow(base,exponente);
        System.out.println("El resultado es "+resultado);


    }
}
