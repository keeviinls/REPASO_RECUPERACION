package examen_mio_mio;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        String[][] edificio=inicializar();
        imprimir(edificio);
        buscar_vecino(edificio);
    }

    private static void buscar_vecino(String[][] edificio){

        Scanner sc=new Scanner(System.in);

        System.out.println("Dime el nombre que buscas ");
        String nombre= sc.next();

        int numero_vecino=0;
        for (int i=0;i< edificio.length;i++){
            for (int j=0;j<edificio[i].length;j++) {

                if (edificio[i][j].equals(nombre.toUpperCase()))
                {
                    numero_vecino++;
                }

            }
        }
        if (numero_vecino==0){
            System.out.println("No hay vecinos con ese nombre");

        }
        else {

            System.out.println("El número de vecinos llamad@s "+nombre+" es de "+numero_vecino);
        }

    }



    private static void imprimir(String[][] edificio){
        for (int i=0;i<edificio.length;i++){
            System.out.println("");
            for (int j=0;j<edificio[i].length;j++){
                System.out.println("El nombre del propietario del PISO "+i+" de la PUERTA "+j+ "  es  "+edificio[i][j]);
            }
        }
    }

    private static String[][] inicializar(){
        Scanner sc=new Scanner(System.in);
        String [][] edificio=new String[3][2];
        String nombre="";
        for (int i=0;i<edificio.length;i++){
            for (int j=0;j<edificio[i].length;j++){
                System.out.println("Dime el nombre del PISO "+i+"  de la PUERTA "+j);
                nombre= sc.next().toUpperCase();
                edificio[i][j]=nombre;
            }
        }

        return edificio;
    }
}
