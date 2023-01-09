package z_EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do {


        System.out.println("Escribe un numero y saldra el nombre del mes correspondiente");
        numero = sc.nextInt();
        switch (numero){
            case 1:
                System.out.println("Enero");break;
            case 2:
                System.out.println("Febrero");break;
            case 3:
                System.out.println("Marzo");break;
            case 4:
                System.out.println("Abril");break;
            default:
                System.out.println("Error numero no introducido");break;
        }
    }while (numero > 4 || numero <= 0);

    }
}
