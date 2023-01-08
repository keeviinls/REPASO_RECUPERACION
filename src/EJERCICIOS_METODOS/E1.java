package EJERCICIOS_METODOS;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        System.out.println("Dime un numero");
        numero=sc.nextInt();
        metodo(numero);

    }

    private static void metodo(int numero){

        if (numero%2==0){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }

    }
}
