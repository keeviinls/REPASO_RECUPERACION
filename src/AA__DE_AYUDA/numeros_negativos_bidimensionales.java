package AA__DE_AYUDA;

public class numeros_negativos_bidimensionales {
    public static void main(String[] args) {
        int[][] array = {{-1,-2,-6}, {3,-4,-8}};
        System.out.println("ESOS NUMEROS NEGATIVOS SON");
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++){
                if (array[i][j]<0){
                    System.out.println(array[i][j]);
            }

            }
        }
    }
}
