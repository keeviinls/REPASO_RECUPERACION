package AA__ArrayOperaciones;

import java.util.Arrays;

public class Clone {
    public static void main(String[] args) {

        //CLONE LO QUE HACE ES CLONAR EL CONTENIDO DE UN ARRAY Y PONERSELO A OTRO ARRAY
        int [] numeros = {1,2,3,4,5};
        int [] otrosnumeros = {6,7,8,9,10};

        System.out.println("Los numeros normales son "+ Arrays.toString(numeros));
        otrosnumeros = numeros.clone();
        System.out.println("Ahora los otros numeros son "+Arrays.toString(otrosnumeros));
    }
}
