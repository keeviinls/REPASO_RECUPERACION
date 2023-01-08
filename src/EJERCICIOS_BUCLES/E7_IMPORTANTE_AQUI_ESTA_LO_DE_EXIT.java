package EJERCICIOS_BUCLES;

import java.util.Scanner;

public class E7_IMPORTANTE_AQUI_ESTA_LO_DE_EXIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b= 2;
        int c=3;
        int d=4;

        int e,f,g,h=0;
        int i=0;

        do {
            i++;
                    System.out.println("Dime el primer numero");
                    e = sc.nextInt();
                    System.out.println("Dime el segundo numero");
                    f = sc.nextInt();
                    System.out.println("Dime el tercer numero");
                    g = sc.nextInt();
                    System.out.println("Dime el cuarto numero");
                    h = sc.nextInt();

                    if (a == e && b == f && c == g && d == h) {
                        System.out.println("PUERTA ABIERTA");
                        System.exit(1); //IMPORTANTE COMO USAR ESO//
                    } else {
                        System.out.println("CONTRASEÑA INCORRECTA");
                    }
        }while (i<4);

    }
}
