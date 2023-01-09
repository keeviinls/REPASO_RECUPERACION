package AA_EXAMEN_2021_MIO_BIEN_HECHO;

import java.util.Arrays;
import java.util.Scanner;

public class E2_BIEN_HECHO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion= 0;

        do {
        System.out.println("1- Calcular sumatorio");
        System.out.println("2- Invertir Array");
        System.out.println("3- Salir");
        opcion=sc.nextInt();
        if (opcion == 1){
            sumatorio();
        }

        else if (opcion==2) {
            invertir_array();
        }

        else if (opcion==3) {
            System.out.println("Gracias por usar el programa");
        }

        else {
            System.out.println("Error");
        }

    }while (opcion!=3);

}

private static void invertir_array(){
        int tamaño=0;
         double valor=0;
    System.out.println("Dime el tamaño del array");
    Scanner sc=new Scanner(System.in);
    tamaño= sc.nextInt();
    double [] array=new double[tamaño];
    for (int i=0;i<array.length;i++){
        System.out.println("Dime el valor de "+i);
        valor= sc.nextDouble();
        array[i]=valor;
    }

    System.out.println("OK, tu array normal es "+ Arrays.toString(array));

    double [] array_inverso=new double[array.length];

        for (int i=0;i<array.length;i++){
            array_inverso[i]=array[array.length-1-i];
        }

    System.out.println("El array inverso quedaria "+Arrays.toString(array_inverso));
    }


    private static void sumatorio (){
        Scanner sc=new Scanner(System.in);
        int numero=0;
        int resultado=0;
        do {

        System.out.println("Dime un numero entero positivo");
        numero=sc.nextInt();
        if (numero <0){
            System.out.println("Error, has seleccionado un numero negativo");
        }
        else {
            System.out.print("Sumatorio ("+numero+") = ");
            for (int i=0;i<=numero;i++){
                resultado=resultado+i;
                System.out.print(""+i+ "+" );
            }
            System.out.println(" = "+resultado);
        }

        }
        while (numero<0);
    }
}
