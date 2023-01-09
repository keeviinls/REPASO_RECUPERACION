package TutorialesBasicos;

import java.util.Scanner;

public class Tutorial9y10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int tiempo = 0;
        int clave = 0;

        System.out.println("¿Cual es tu nombre?");
        nombre = in.nextLine();


        System.out.println("¿Cuantos años de servicio tienes?");
        tiempo = in.nextInt();

        System.out.println("¿Cual es la clave de tu departamento?");
        clave = in.nextInt();

        if (clave == 1) {

            if (tiempo == 1){
                System.out.println(nombre + " tiene derecho a 6 dias de vacaciones ");
            }
            else if (tiempo >=2 && tiempo <=6 ) {
                System.out.println(nombre + " tiene derecho a 14 dias de vacaciones");
            } else if (tiempo >=7) {
                System.out.println(nombre + " tiene derecho a 20 dias de vacaciones");
            }

        }

        else if (clave == 2) {

            if (tiempo == 1){
                System.out.println(nombre + " tiene derecho a 7 dias de vacaciones ");
            }
            else if (tiempo >=2 && tiempo <=6 ) {
                System.out.println(nombre + " tiene derecho a 15 dias de vacaciones");
            } else if (tiempo >=7) {
                System.out.println(nombre + " tiene derecho a 22 dias de vacaciones");
            }

        }

        else if (clave == 3) {

            if (tiempo == 1){
                System.out.println(nombre + " tiene derecho a 10 dias de vacaciones ");
            }
            else if (tiempo >=2 && tiempo <=6 ) {
                System.out.println(nombre + " tiene derecho a 20 dias de vacaciones");
            } else if (tiempo >=7) {
                System.out.println(nombre + " tiene derecho a 30 dias de vacaciones");
            }

        }

        else {
            System.out.println("Error, la clave que has puesto no esta en nuestro servicios");

        }


    }
}
