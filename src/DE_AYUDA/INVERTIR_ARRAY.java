package DE_AYUDA;

import java.util.Arrays;
import java.util.Scanner;

public class INVERTIR_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array;
        int dimension = 0;
        System.out.println("Introduzca la dimensión del array");
        dimension = sc.nextInt();   //INDICAMOS EL TAMAÑO DE LA DIMENSION,   IMAGINEMOS QUE ES 5
        array= new double[dimension];  //DECIMOS QUE AHORA ARRAY ES IGUAL AL TAMAÑO DE LA DIMENSION QUE DIJIMOS, SERIA COMO DECIR   ARRAY = NEW DOUBLE [5];
        for (int i=0;i<array.length;i++){   //HACEMOS EL BUCLE DONDE I= 0; TIENE QUE SER MENOR A 5 Y SUMA DE 1 EN 1

            System.out.println("Introduzca el valor"+i);     //LE DECIMOS QUE INTRODUZCA EL VALOR DE "I", RECORDEMOS QUE I ES BASICAMENTE CADA HUECO DEL ARRAY
            array[i]= sc.nextDouble();   // LA "I" VALDRA LO QUE ESCRIBAMOS NOSOTROS
        }

        System.out.println("el array sin invertir es"+ Arrays.toString(array));        //LE DECIMOS QUE IMPRIMA EL ARRAY NORMAL
        double[] array_invertido=new double[dimension];    //CREAMOS OTRO ARRAY QUE SE LLAMA INVERTIDO Y SU DIMENSION SERA COMO LA DIMENSION QUE ESCRBIMOS ANTES, RECORDEMOS Q ES 5
        for (int i=0;i<array.length;i++){    //NUEVAMENTE UN BUCLE DONDE I=0;  I TIENE QUE SER MENOR QUE "ARRAY"; Y QUE I SUMA DE 1 EN 1

            array_invertido[i]=array[array.length-1-i];    //LA "I" DE ARRAYINVERTIDO ES IGUAL A ARRAY.LENGTH -1 -I

        }
        System.out.println("el array invertido es"+ Arrays.toString(array_invertido));   //IMPRIMIMOS
    }
}
