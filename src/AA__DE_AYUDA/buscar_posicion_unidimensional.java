package AA__DE_AYUDA;

import java.util.Arrays;
import java.util.Scanner;

public class buscar_posicion_unidimensional {
    public static void main(String[] args) {
        //ESTO ES SOLO PARA DARLE VALORES AL ARRAY//
        int dimension = 5;
        Scanner sc=new Scanner(System.in);

        double valor=0;
        double [] array=new double[dimension];
        for (int i=0;i<array.length;i++){
            System.out.println("Dime el valor para "+i);
            valor=sc.nextDouble();
            array[i]=valor;
        }
        System.out.println("El array quedaria "+ Arrays.toString(array));

        ////////////////////////////////////////////////////////////////////////////
        //APARTIR DE AQUI BUSCAMOS POSICION///
        double buscas=0;
        int posicion = -1;
        System.out.println("Dime el numero que quieres buscar ");
        buscas=sc.nextDouble();
        for (int i=0;i<array.length;i++){
            if (array[i]==buscas){
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
