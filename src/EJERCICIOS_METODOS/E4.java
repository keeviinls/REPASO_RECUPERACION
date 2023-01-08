package EJERCICIOS_METODOS;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String opcion="";
        do {


        System.out.println("Bienvenido, selecciona alguna de las siguientes opciones");
        System.out.println("Circulo");
        System.out.println("Triangulo");
        System.out.println("Cuadrado");
        opcion=sc.next().toLowerCase();

            switch (opcion){

            case "cuadrado":
                System.out.println("HAS SELECCIONADO CUADRADO");
                cuadrado();break;


            case "circulo":
                System.out.println("HAS SELECCIONADO CIRCULO");
                System.out.println("El resultado es "+circulo());break;

            case "triangulo":
                System.out.println("HAS SELECCIONADO TRIANGULO");
                System.out.println("El resultado es "+triangulo());break;

            default:
                System.out.println("Error has seleccionado una opcion incorrecta, por favor vuelve a intentarlo");break;
        }
    }while (opcion != "cuadrado" || opcion != "triangulo" || opcion != "circulo");

    }

    private static double triangulo() {
        Scanner sc=new Scanner(System.in);
        double base, altura, resultado=0;
        System.out.println("Dime la base");
        base=sc.nextDouble();
        System.out.println("Dime la altura");
        altura= sc.nextDouble();

        resultado=(base*altura)/2;
        return resultado;
    }

    private static void cuadrado(){
        Scanner sc=new Scanner(System.in);
        double lado=0;
        double resultado=0;
        System.out.println("Dime el tamaño del lado");
        lado=sc.nextDouble();
        resultado=lado*lado;
        System.out.println("El resultado es "+resultado);
    }

    private static double circulo(){
        Scanner sc=new Scanner(System.in);
        double radio=0;
        double resultado=0;
        System.out.println("Dime el tamaño del radio");
        radio=sc.nextDouble();

        resultado=(radio*radio)*Math.PI;

        return resultado;

    }
}
