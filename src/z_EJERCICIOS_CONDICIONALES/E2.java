package z_EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia = "";
        do {
        System.out.println("Dime el dia de la semana, si quieres salir deberas escribir la palabra salir");
        dia = sc.next();
        dia=dia.toLowerCase();



            switch (dia) {
                case "lunes":
                    System.out.println("Matematicas");
                    break;
                case "martes":
                    System.out.println("Lengua");
                    break;
                case "miercoles":
                    System.out.println("Ingles");
                    break;
                default:
                    System.out.println("Error papa");
                    break;
            }
        } while (dia != "salir");


    }
}
