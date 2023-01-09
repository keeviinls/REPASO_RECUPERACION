package TutorialesBasicos;

import java.util.Scanner;

public class Tutorial17_2 {
    public static void main(String[] args) {

        String usuario = "", password = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu nombre de usuario: ");
        usuario = entrada.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        password = entrada.nextLine();

        if (usuario.equals("ernesto") && password.equals("123456")){

            System.out.println("Bienvenido Ernesto, un gusto volver a verte ");
        }

        else {
            System.out.println("Nombre de usuario o contraseña incorrectos");
        }

    }
}
