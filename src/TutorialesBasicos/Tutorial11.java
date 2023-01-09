package TutorialesBasicos;

import java.util.Scanner;

public class Tutorial11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num_uno = 0, num_dos = 0, resultado = 0;
        int parametro = 0;

        System.out.println("Dime un numero para num_uno");
        num_uno = in.nextInt();

        System.out.println("Dime un numero para num_dos");
        num_dos = in.nextInt();

        System.out.println("Dime un numero del 1 al 4");
        parametro = in.nextInt();

        switch (parametro){

            case 1: resultado = num_uno + num_dos;
                System.out.println("El resultado de la suma es " + resultado);
                break;

            case 2: resultado = num_uno - num_dos;
                System.out.println("El resultado de la resta es " + resultado);
                break;

            case 3: resultado = num_uno * num_dos;
                System.out.println("El resultado de la multiplicacion es " + resultado);
                break;

            case 4: resultado = num_uno / num_dos;
                System.out.println("El resultado de la division es " + resultado);
                break;

            default:
                System.out.println("Error, la opcion no existe");
                break;

        }

    }
}
