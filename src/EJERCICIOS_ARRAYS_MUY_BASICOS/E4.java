package EJERCICIOS_ARRAYS_MUY_BASICOS;

import java.util.Arrays;

public class E4 {
    public static void main(String[] args) {
        int [] array = {5,6,1,2};
        System.out.println(Arrays.toString(array));
        System.out.println("AHORA LO ORDENAREMOS");
        Arrays.sort(array);
        System.out.println("ORDENADO SE VERIA "+Arrays.toString(array));

        String [] nombres={"Zoro", "Kevin", "Messi"};
        System.out.println(Arrays.toString(nombres));
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));
    }
}
