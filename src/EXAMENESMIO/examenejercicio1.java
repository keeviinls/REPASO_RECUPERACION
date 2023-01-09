package EXAMENESMIO;
import java.util.Arrays;
import java.util.Scanner;

public class examenejercicio1  {

    public static void main(String[] args) {
        String texto="";
        texto=solicitar_usuario(texto); //LLAMADA METODO
        String [] array_string = convertir_array_string(texto);       //LLAMADA METODO       //ponemos ""texto"" pq es lo q le entra
        System.out.println(Arrays.toString(array_string));
        int[] array_enteros= convertir_array_enteros(array_string);   //LLAMADA METODO
        int sumatorio= suma_enteros(array_enteros);   //LLAMADA METODO
        System.out.println("el resultado de la suma de los elementos del array"+Arrays.toString(array_enteros)+" es "+sumatorio);


    }


    //D//
    private static int suma_enteros(int[] array_entero) {
        int resultado=0;
        for (int i=0;i<array_entero.length;i++){
            resultado=resultado+array_entero[i];
        }
        return resultado;
    }


    //C//
    private static int[] convertir_array_enteros(String[] array_string) {
        int[] array_resultante = new int[array_string.length];
        for (int i=0;i<array_string.length;i++){

            array_resultante[i]=Integer.parseInt(array_string[i]);


        }



        return array_resultante;

    }

    //B//
    private static String[] convertir_array_string(String texto) {
        String [] array_string = texto.split(","); //aqui hemos puesto ";" para probar solo, en verdad hayq ue poner ","
        //split permite buscar el caracter o varios concreto y separarlos en distintos Strings que se meten en un array. En este caso sirve para la coma
        return array_string;
    }

    //A//
    private static String solicitar_usuario(String texto) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzcame un texto compuesto por números y separado por, ");
        texto= sc.next();
        return texto;

    }




}

