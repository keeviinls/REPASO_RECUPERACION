package AA__ArrayOperaciones;

import java.util.Arrays;

public class Fill {
    public static void main(String[] args) {

        //FILL SIRVE PARA RELLENAR UN ARRAY CON LOS VALORES QUE PONGAMOS DENTRO DEL ARGUMENTO
        int [] numeros = new int[6];

        //AQUI VEMOS QUE TODOS LOS NUMEROS VAN A SER 5
        Arrays.fill(numeros, 5);
        System.out.println(Arrays.toString(numeros));


        //AQUI LO QUE HACE ES DESDE ESPACIO 2, HASTA EL ESPACIO 4, LO RELLENA DE 8
        Arrays.fill(numeros, 2, 4, 8);
        System.out.println(Arrays.toString(numeros));
    }
}
