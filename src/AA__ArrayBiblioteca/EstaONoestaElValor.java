package AA__ArrayBiblioteca;

import java.util.Arrays;
import java.util.Scanner;

public class EstaONoestaElValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] valores = {10,20,5,1};
        Arrays.sort(valores);  //LO ORDENAMOS YA QUE SI NO LO HACEMOS DETECTARA QUE POR EJEMPLO EL 20 ESTA EN LA POSICION -1,
        //ESTO ES POR ALGO DE BINARIOS QUE NO LEE BIEN NO SEQ, ASI QUE DEBEMOS ORDENARLO
        System.out.println("Dime que numero buscas");
        int buscas;
        buscas = sc.nextInt();
        if (Arrays.binarySearch(valores,buscas) >= 0){
            System.out.println("El numero si esta en el array");
        }

        else {
            System.out.println("El numero no se encuentra en el array");
        }




    }
}
