package AA__ArrayOperaciones;

import java.util.Arrays;

public class arraycopy {
    public static void main(String[] args) {

        //CON ARRAYCOPY PODEMOS COPIAR EL CONTENIDO DE UN ARRAY, PERO AQUI DEBEMOS TENER RESERVADO OS ESPACIOS ANTES DE COPIARLO

        int [] numeros = {22,11,44,33,55};

        // CREAMOS EL NUEVO ARRAY / DENTRO DE ARRAYCOPY PONEMOS EL NOMBRE DEL ARRAY QUE QUEREMOS COPIAR, DESDE DONDE,
        //DESDE DONDE COMIENZA EN EL NUEVO, HASTA DONDE VA A RELLENAR DEL NUEVO
        int [] nuevoarray = new int[5];
        System.arraycopy(numeros, 0, nuevoarray, 0, 5);
        Arrays.sort(nuevoarray);  //ESTO ESTA PUESTO SOLO PA PROBAR, CONFIRMAMOS QUE LO ORDENA BIEN
        System.out.println(Arrays.toString(nuevoarray));

        //AQUI VEMOS QUE LO COPIARA HASTA LA POSICION 4, APARTIR DE AHI LO Q FALTE SE RELLENARA DE 0

        int [] nuevoarray2 = new int[5];
        System.arraycopy(numeros, 0, nuevoarray2, 0, 4);
        System.out.println(Arrays.toString(nuevoarray2));
    }
}
