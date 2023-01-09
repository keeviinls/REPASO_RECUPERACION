package AA__DE_AYUDA;

import java.util.Scanner;

public class ES_PRIMO_O_NO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Dime un numero");
        num = sc.nextInt();

        boolean es_primo=esPrimo(num);
    }

    public static boolean esPrimo(int num) {
        boolean primo= true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;

            }
        }
        if (primo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        return primo;
    }
}
