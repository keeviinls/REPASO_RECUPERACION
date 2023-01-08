package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

public class E7y8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota3 = 0, nota2  = 0;

        do {


            System.out.println("Dime la primera nota");
            nota1 = sc.nextDouble();
        }while (nota1 < 0);

        do {


            System.out.println("Dime la segunda nota");
            nota2 = sc.nextDouble();
        }while (nota2 < 0);

        do {


            System.out.println("Dime la tercera nota");
            nota3 = sc.nextDouble();
        }while (nota3 < 0);

        System.out.println("Tus notas son  "+nota1+ " -- " +nota2+ " -- "+nota3);
        double resultado = 0;
        resultado = (nota1+nota2+nota3)/3;
        System.out.println("La media total es de "+resultado);

        if (resultado >= 0 && resultado < 5 ){
            System.out.println("SUSPENSO");
        }

        else if (resultado >= 5 && resultado < 6 ){
            System.out.println("SUFICIENTE");
        }

        else if (resultado >= 6 && resultado < 7 ){
            System.out.println("BIEN");
        }

        else if (resultado >= 7 && resultado <=9 ){
            System.out.println("NOTABLE");
        }
        else if (resultado >= 9 && resultado < 11 ){
            System.out.println("SOBRESALIENTE");
        }

        else {
            System.out.println("ERROR DAR LA NOTA");
        }
        

    }


}
