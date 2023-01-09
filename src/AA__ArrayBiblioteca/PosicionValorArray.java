package AA__ArrayBiblioteca;

import java.util.Scanner;

public class PosicionValorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] valores = {10,20,5,1};
        int buscas = 0;
        int posicion = -1;
        System.out.println("Escribe un numero");
        buscas = sc.nextInt();
        for (int i=0;i<valores.length;i++){
            if (valores[i]==buscas){
                posicion=i;
            }
        }
        if (posicion==-1){
            System.out.println("No se encontro el numero");
        }
        else {
            System.out.println("El numero "+buscas+" esta en la posicion "+posicion);
        }


    }
}
