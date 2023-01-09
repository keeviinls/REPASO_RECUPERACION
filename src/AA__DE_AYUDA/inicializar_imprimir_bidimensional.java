package AA__DE_AYUDA;

import java.util.Scanner;

public class inicializar_imprimir_bidimensional {
    public static void main(String[] args) {
        String [][] edificio=new String[3][2];
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        for (int i = 0; i < edificio.length; i++) {
            for (int j = 0; j < edificio[i].length; j++) {
                            System.out.println("Dime el nombre del piso "+i+ " con la letra "+j);
                            edificio[i][j] = sc.next().toUpperCase();
                    }
        }

        for (int i=0;i<edificio.length;i++){
            System.out.println(" ");
            for (int j=0;j<edificio[i].length;j++){
                System.out.println("En el piso" +i+ " CON LA PUERTA "+j+ "VIVE EL VECINO "+edificio[i][j]);
            }
        }
    }
}





