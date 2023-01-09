package AA__EXAMEN_RECUPERACION;

import java.util.Arrays;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        int numero=solicitud_numero();
        double []array_completo=array(numero);
        double mayor=maximo(array_completo);
        imprimir(array_completo);


    }

    private static void imprimir(double[] array_completo){

        double resultado=0;
        double contador=0;

        for (int i=0;i<array_completo.length;i++){
            resultado=resultado+array_completo[i];

        }

        System.out.println("El resultado sumando todos los numeros es "+resultado);
    }

    private static double maximo(double[] array_completo){
        double maximo=0;

        for (int i=1;i<array_completo.length;i++){
            if (array_completo[i]>maximo){
                maximo=array_completo[i];
            }
        }


        System.out.println("El numero mayor es el "+maximo);

        return maximo;
    }

    private static double[] array(int numero){
        Scanner sc=new Scanner(System.in);

        double[]array=new double[numero];
        double numero_decimal=0;
        for (int i=0;i<array.length;i++){
            System.out.println("Dime un numero para "+i);
            numero_decimal=sc.nextDouble();
            array[i]=numero_decimal;
        }
        System.out.println("Ok entonces tu array es "+ Arrays.toString(array));

        return array;
    }




    private static int solicitud_numero(){
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
        return numero;
    }
}
