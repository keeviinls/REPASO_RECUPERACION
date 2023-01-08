package EXAMEN_MIO;
//EL ARRAY ES DE [3][2], PEDIR NOMBRE DE CADA CASA PERO PERSONALIZADO “Dime nombre del PRIMERO A”
//USO DE ENUMERADO
//IMPRIMIRLO EN ORDEN USANDO ENUMERADO
//CUOTAS_COMUNIDAD
//BUSCAR VECINO Y DECIR CUANTOS HAY CON MISMO NOMBRE

import java.util.Scanner;

public class E2_MEJOR_HECHO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String [][] edificio=inicializar();
        imprimir(edificio);
        cuotas_comunidad();
        char opcion;
        System.out.println("Quieres saber si hay vecinos que se llaman igual? S/N");
        opcion=sc.next().toUpperCase().charAt(0);
        if (opcion == 'S'){
            buscar_vecino(edificio);

        }
        else {
            System.out.println("TU TE LO PIERDES");
        }
    }

    private static void buscar_vecino(String [][] edificio){
        Scanner sc=new Scanner(System.in);
        int numero_vecino=0;
        System.out.println("Dime que vecino quieres buscar");
        String nombre_vecino= sc.next().toUpperCase();
        for (int i=0;i<edificio.length;i++){
            for (int j=0;j<edificio[i].length;j++){
                if (edificio[i][j].equals(nombre_vecino.toUpperCase())){
                    numero_vecino++;
                }
            }
        }

        if (numero_vecino==0){
            System.out.println("No hay vecinos con ese nombre");
        }

        else {
            System.out.println("El numero de vecions llamado@s "+nombre_vecino+" es de "+numero_vecino);
        }
    }

    private static void cuotas_comunidad(){
        final double PRIMERA=50.25;
        final double SEGUNDA=78.15;
        final double TERCERO=96.4;

        double resultado=0;
        resultado=(PRIMERA*2)+(SEGUNDA*2)+(TERCERO*2);
        System.out.println("En total deben pagar "+resultado);
    }


    private static void imprimir (String [][] edificio){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<edificio.length;i++){
            System.out.println(" ");
            for (int j=0;j<edificio[i].length;j++){
                if (i == 0) {
                    switch (j) {
                        case 0:
                            System.out.println("Dime del propietario del " + Ordinales.primero + "A es " +edificio[i][j] );
                            break;

                        case 1:
                            System.out.println("Dime del propietario del " + Ordinales.primero + "B es " +edificio[i][j]);
                            break;
                    }
                }

                if (i == 1) {
                    switch (j) {
                        case 0:
                            System.out.println("Dime del propietario del " + Ordinales.segundo + "A es " +edificio[i][j] );
                            break;

                        case 1:
                            System.out.println("Dime del propietario del " + Ordinales.segundo + "B es " +edificio[i][j]);
                            break;
                    }
                }

                if (i == 2) {
                    switch (j) {
                        case 0:
                            System.out.println("Dime del propietario del " + Ordinales.tercero + "A es " +edificio[i][j] );
                            break;

                        case 1:
                            System.out.println("Dime del propietario del " + Ordinales.tercero + "B es " +edificio[i][j]);
                            break;
                    }
                }
            }
        }
    }



    private static String [][] inicializar() {
        String [][] edificio=new String[3][2];
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        for (int i = 0; i < edificio.length; i++) {
            for (int j = 0; j < edificio[i].length; j++) {

                if (i == 0) {
                    switch (j) {
                        case 0:
                            System.out.println("Dime el nombre del " + Ordinales.primero + " A");
                            edificio[i][j] = sc.next().toUpperCase();
                            break;

                        case 1:
                            System.out.println("Dime el nombre del " + Ordinales.primero + " B");
                            edificio[i][j] = sc.next().toUpperCase();
                            break;
                    }
                }

                if (i == 1) {
                    switch (j) {
                        case 0:
                            System.out.println("Dime el nombre del " + Ordinales.segundo + " A");
                            edificio[i][j] = sc.next().toUpperCase();
                            break;

                        case 1:
                            System.out.println("Dime el nombre del " + Ordinales.segundo + " B");
                            edificio[i][j] = sc.next().toUpperCase();
                            break;
                    }
                }

                if (i == 2) {
                    switch (j) {
                        case 0:
                            System.out.println("Dime el nombre del " + Ordinales.tercero + " A");
                            edificio[i][j] = sc.next().toUpperCase();
                            break;

                        case 1:
                            System.out.println("Dime el nombre del " + Ordinales.tercero + " B");
                            edificio[i][j] = sc.next().toUpperCase();
                            break;
                    }
                }
            }

        }
        return edificio;
    }
}

