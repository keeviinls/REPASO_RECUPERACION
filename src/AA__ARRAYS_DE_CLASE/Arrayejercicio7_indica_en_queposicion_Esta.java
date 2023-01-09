package AA__ARRAYS_DE_CLASE;

import java.util.Scanner;

public class Arrayejercicio7_indica_en_queposicion_Esta {
    public static void main(String[] args) {

        String[] lista = {"Messi","Cristiano","Neymar","Pedri","Haaland"};

        //Si iniciamos a 0 no funciona, en el caso de que el usuario metiese un nombre que no sale,
        // sacara que el usuario esta en la posicion 0 porque no esta. Debe ser negativo.
        Scanner sc = new Scanner(System.in);
        int posicion=-1;
        String busca;
        System.out.println("¿Que nombre quieres buscar ");
        busca = sc.next();
        posicion = buscar (lista, busca);
        imprimir(posicion);

    }

    private static void imprimir(int posicion) {
        System.out.println("Esta en la posicion  "+posicion);
    }

    private static int buscar(String[] lista, String busca) {

        int posicion=-1;
        for (int i = 0; i<lista.length; i++){

            if (busca.equals(lista[i])){
                posicion= i;
            }

        }
        return posicion;

    }
}
