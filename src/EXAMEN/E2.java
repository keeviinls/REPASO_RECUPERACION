package EXAMEN;

import java.util.Arrays;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [][] edificio = new String[3][2];
        inicializar(edificio);
        imprimir(edificio);

        double presupuesto_total=cuotas_comunidad();
        System.out.println("La comunidad paga en total "+presupuesto_total);
        System.out.println("Deseas saber si hay un vecino en la comunidad?");
        char respuesta=sc.next().toLowerCase().charAt(0);
        if (respuesta=='s'){
            buscar_vecino(edificio);
        }
        else {
            System.out.println("Tu te lo pierdes");
        }

    }
    private static double cuotas_comunidad(){
        final double CUOTA_PRIMERO=50.25;
        final double CUOTA_SEGUNDO=78.15;
        final double CUOTA_TERCERO=96.4;
        double prespuesto=0;
        prespuesto=2*CUOTA_PRIMERO+2*CUOTA_SEGUNDO+2*CUOTA_TERCERO;
        return prespuesto;
    }



    private static void buscar_vecino(String[][] edificio){
        Scanner sc = new Scanner(System.in);

        String buscas="";
        int numero_vecinos=0;

        System.out.println("Dime el nombre");
        buscas=sc.nextLine();
       for (int i=0;i<edificio.length;i++){
           for (int j=0;j<edificio[i].length;j++){
               if (edificio[i][j].equals(buscas.toLowerCase())){
                   numero_vecinos++;
               }
           }
       }
       if (numero_vecinos==0){
           System.out.println("No hay vecinos con ese nombre");
       }

       else {
           System.out.println("El numero de vecinos llamado "+buscas+" es de "+numero_vecinos);
       }


    }

    private static void imprimir (String [][] edificio){
        System.out.println("=======================================");
        for (int i=0;i<3;i++){
            System.out.println("");
            for (int j=0;j<2;j++){
                System.out.println("El nombre del propietario del "+Ordinales.primero+"  " +j+" es "+edificio[i][j]);
            }
        }
    }

    private static String[][] inicializar(String [][] edificio){
        Scanner sc = new Scanner(System.in);
        String nombre="";

        for (int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                System.out.println("Dime el nombre para el piso " +Ordinales.primero+ " con la letra "+j);
                nombre=sc.nextLine();
                edificio[i][j]=nombre;
            }
        }
        return edificio;
    }
}
