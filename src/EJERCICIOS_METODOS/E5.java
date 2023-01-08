package EJERCICIOS_METODOS;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double dinero=0;
        double resultado=0;
        String opcion="";

        System.out.println("Cuanto dinero quieres cambiar?");
        dinero= sc.nextDouble();
        System.out.println("Ok, entonces quieres cambiar "+dinero+"€");
        System.out.println("=========================================================");
        System.out.println("Bienvenido, selecciona alguna de las siguientes opciones");
        System.out.println("Libras");
        System.out.println("Dolares");
        System.out.println("Yenes");
        opcion=sc.next().toLowerCase();

        switch (opcion){
            case "libras":
                System.out.println("HAS SELECICONADO LIBRAS");
                libras(dinero,resultado);break;
            case "yenes":
                System.out.println("HAS SELECCIONADO YENES");
                yenes(dinero,resultado);break;
            case "dolares":
                System.out.println("HAS SELECCIONADO DOLARES");
                dolares(dinero,resultado);break;
            default:
                System.out.println("Error");
        }
    }


    private static void libras(double dinero, double resultado){
        resultado=dinero*0.86;
        System.out.println("Al cambio son "+resultado);
    }

    private static void dolares(double dinero, double resultado){
        resultado=dinero*1.28611;
        System.out.println("Al cambio son "+resultado);
    }

    private static void yenes(double dinero, double resultado){
        resultado=dinero*129.852;
        System.out.println("Al cambio son "+resultado);
    }
}
