package AA__DE_AYUDA;

import java.util.Scanner;

public class sumatorio_con_y_sin_ARRAY {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arrayenteros = {1, 2, 3, 4, 5};
        int resultado = 0;
        for (int i = 0; i < arrayenteros.length; i++) {
            System.out.print(arrayenteros[i] + "+");
            resultado = resultado + arrayenteros[i];
        }
        System.out.println("=" + resultado);
///////////////////////////////////////////////////////////////////////////////
// /////////////////////////SUMATORIO SIN ARRAY////////////////////////////////
        int numero2 = 0;
        int resultado2 = 0;


            System.out.println("Dime un numero entero positivo");
            numero2 = sc.nextInt();
        System.out.print("Sumatorio ("+numero2+") = ");
        for (int i=0;i<=numero2;i++){
            resultado2=resultado2+i;
            System.out.print(""+i+ "+" );
        }
        System.out.println(" = "+resultado2);
    }
}
