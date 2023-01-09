package TutorialesBasicos;

import java.util.Scanner;

public class TutorialSwitch {
    public static void main(String[] args) {
        int num_uno = 0, num_dos = 0, resultado = 0;
        int parametro = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica con que numeros quieres usar, empezaremos por elegir el numero uno");
        num_uno = sc.nextInt();
        System.out.println("Ahora elegiremos el segundo numero");
        num_dos = sc.nextInt();
        System.out.println("Indica con un numero que deseas hacer");
        parametro = sc.nextInt();


        switch (parametro){

            case 1: resultado = num_uno + num_dos;
                System.out.println("El resultado de la suma es "+resultado);
                break;

            case 2: resultado = num_uno - num_dos;
                System.out.println("El resultado de la resta es "+resultado);
                break;

            case 3: resultado = num_uno * num_dos;
                System.out.println("El resultado de la multiplicacion es "+resultado);
                break;

            case 4: resultado = num_uno / num_dos;
                System.out.println("El resultado de la divisiones "+resultado);
                break;

            default:
                System.out.println("error, la opcion no existe");break;


        }
    }
}
