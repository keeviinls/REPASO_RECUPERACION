package AA__ArrayOperaciones;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int [] numeros={1,2,3,4};
        int [] numeros2={1,2,3,4};
        int [] numeros3={5,6,7};
        int [] numeros4={1,2,3,4};

        //EQUALS SIRVE PARA COMPARAR ARRAYS,VEMOS QUE RESPONDE SOLAMENTE CON TRUE O FALSE
        //EN ARRAYS NO PODEMOS USAR "=="

        //VEMOS QUE SI QUEREMOS COMPARAR 3 ARRAYS NO VA A DEJAR
        //System.out.println("Son iguales el numero1 y numero 2 y numero 4??");
        //System.out.println(Arrays.equals(numeros, numeros2,numeros4));

        System.out.println("Son iguales el numero1 y numero 2 ??");
        System.out.println(Arrays.equals(numeros, numeros2));

        System.out.println("Son iguales el numero1 y numero3 ??");
        System.out.println(Arrays.equals(numeros, numeros3));
    }
}
