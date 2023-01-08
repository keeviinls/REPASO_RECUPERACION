package EJERCICIOS_BUCLES;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        System.out.println("Dime un numero y te mostraremos su tabla de multiplicar");
        numero=sc.nextInt();

        for (int i=0;i<=10;i++){
            int resultado=0;
            resultado=numero*i;
            System.out.println("El resultado es "+resultado);
        }
    }
}
