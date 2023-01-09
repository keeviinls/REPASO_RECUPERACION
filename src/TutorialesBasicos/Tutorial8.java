package TutorialesBasicos;

import java.util.Scanner;

public class Tutorial8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nombre = "";
        int num_uno = 0, num_dos = 0, resultado = 0;

        System.out.println("¿Cual es tu nombre?");
        nombre = in.nextLine();

        System.out.println("Dame el primer valor para tu suma:");
        num_uno = in.nextInt();

        System.out.println("Dame el segundo valor para tu suma:");
        num_dos = in.nextInt();

        resultado = num_uno + num_dos;

        System.out.println("Hola " + nombre + ", vemos que quieres sumar " + num_uno+ " + " + num_dos);
        System.out.println("El resultado de tu suma es " + resultado);
    }
}
