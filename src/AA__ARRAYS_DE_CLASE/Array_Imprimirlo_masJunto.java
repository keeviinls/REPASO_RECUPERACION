package AA__ARRAYS_DE_CLASE;

import java.util.Arrays;

public class Array_Imprimirlo_masJunto {
    public static void main(String[] args) {
        int [] notas={1,2,3,4,5};
        System.out.println(Arrays.toString(notas));

        for (int i=0;i<notas.length;i++){
            if (i==0){
                System.out.print("[");
            } else if (i!= notas.length-1) {
                System.out.print(notas[i]+",");
            } else if (i== notas.length-1) {
                System.out.print(notas[i]+"]");
            }
        }
    }
}
