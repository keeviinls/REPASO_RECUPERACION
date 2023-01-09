package AA__EXAMEN_RECUPERACION;

import java.util.Arrays;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        cuenta_negativos();
        calcular_media();
    }

    private static void calcular_media(){
        Scanner sc=new Scanner(System.in);
        int numero=0;
        do {


            System.out.println("Dime un numero entero");
            numero= sc.nextInt();
            if (numero <=0){
                System.out.println("Lo sentimos, vuelve a intentarlo");
            }
            else {
                System.out.println("OK, entonces tu numero es "+numero);
            }
        }while (numero<=0);

        double [] numeros_decimales=new double[numero];
        double numero_decimal=0;
        for (int i=0;i<numeros_decimales.length;i++){
            System.out.println("Dime un numero para "+i);
            numero_decimal=sc.nextDouble();
            numeros_decimales[i]=numero_decimal;
        }
        System.out.println("Ok entonces tu array es "+ Arrays.toString(numeros_decimales));

        double media = 0;
        for (int j=0; j < numeros_decimales.length; j++) {
            media = media + numeros_decimales[j];
        }
        media = media / numeros_decimales.length;

        System.out.println("LA MEDIA ES "+media);
    }




    private static void cuenta_negativos(){
        Scanner sc=new Scanner(System.in);
        int numero=0;
        do {


            System.out.println("Dime un numero entero");
            numero= sc.nextInt();
            if (numero <=0){
                System.out.println("Lo sentimos, vuelve a intentarlo");
            }
            else {
                System.out.println("OK, entonces tu numero es "+numero);
            }
        }while (numero<=0);

        int[]array=new int[numero];
        for (int i=0;i<array.length;i++){
            System.out.println("Dime un numero para el hueco "+i);
            array[i]= sc.nextInt();
        }

        System.out.println("La serie de numeros entonces es "+ Arrays.toString(array));

        int contador=0;
        for (int j=0;j<array.length;j++){
            if (array[j]<0){
                contador++;
            }
        }
        System.out.println("La cantidad de números negativos es "+contador);

    }
}
