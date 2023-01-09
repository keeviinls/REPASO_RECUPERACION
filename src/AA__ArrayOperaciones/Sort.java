package AA__ArrayOperaciones;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int [] numeros ={121,12,1,55};

        //CON SORT PODEMOS ORDENAR EL CONTENIDO DE MANERA ASCENDENTE
        // EN NUMEROS LO ORDENEDA DE MENOR A MAYOR Y EN LETRAS LO ORDENA ALFABETICAMENTE
        Arrays.sort(numeros);
        System.out.println("SI LO ORDENAMOS SERIA ASI "+Arrays.toString(numeros));
        //SI QUEREMOS ORDENARLO DE MAYOR A MENOR SERIA ALGO ASI
        for (int i=numeros.length;i>0;i--){
            System.out.println(numeros[i-1]);
        }

        String [] nombres ={"Zoro", "Messi", "Alberto", "Daniel"};
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));
        //SI QUEREMOS ORDENARLO ALFABETICAMENTE PERO AL REVES, OSEA DE Z-A, SERIA ALGO ASI
        for (int i=nombres.length;i>0;i--){
            System.out.println(nombres[i-1]);
        }
    }
}
