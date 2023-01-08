package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas = 0;
        System.out.println("Dime cuantas horas has trabajado");
        horas = sc.nextInt();

        if (horas >= 1 && horas <=40){
            int resultado=0;
            resultado=horas*12;
            System.out.println("Has ganado un total de "+resultado+ " EUROS");
        }

        else if (horas >=41){
            int resultado=0;
            int horasextra=0;
            int resultado2=0;
            resultado=40*12;
            horasextra=horas-40;
            resultado2=horasextra*16;
            resultado2=resultado+resultado2;
            System.out.println("horas normales son "+resultado);
            System.out.println("HORAS EXTRAS SON "+horasextra);
            System.out.println("En total has ganado "+resultado2);


        }
    }
}
