package AA__ArrayOperaciones;

import java.util.Arrays;

public class Copyof__CopyofRange {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
        System.out.println("Los numeros son "+ Arrays.toString(numeros));

        //COPYOF BASICAMENTE COPIA EL CONTENIDO DE UN ARRAY.

        int [] numeros2 = Arrays.copyOf(numeros,numeros.length);
        System.out.println("Los NUMEROS2 son "+ Arrays.toString(numeros2));

        //AQUI VEMOS QUE SI AÑADIMOS UN NUMERO, NOS IMPRIMIRA SOLAMENTE LOS 3 PRIMEROS ESPACIOS
        int [] numero3 = Arrays.copyOf(numeros, 3);
        System.out.println("Los NUMEROS3 son "+Arrays.toString(numero3));

        //CON COPY OF RANGE INDICAMOS EL RANGO QUE QUEREMOS COPIAR
        //VEMOS QUE AQUI HEMOS COPIADO DESDE EL ESPACIO 0 HASTA EL ESPACIO FINAL PERO RESTANDOLE 1, OSEA HASTA EL ESPACIO 4

        int [] numero4 = Arrays.copyOfRange(numeros, 0, numeros.length-1);
        System.out.println("Los NUMEROS4 son "+Arrays.toString(numero4));

        //AQUI HEMOS COPIADO DESDE EL ESPACIO 1 HASTA EL FINAL PERO RESTANDOLE 2, OSEA HASTA EL ESPACIO 3


        int [] numero5 = Arrays.copyOfRange(numeros, 1, numeros.length-2);
        System.out.println("Los NUMEROS5 son "+Arrays.toString(numero5));
    }
}
