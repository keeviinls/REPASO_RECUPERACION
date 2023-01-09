package AA__DE_AYUDA;

import java.util.Arrays;

public class Imprimir_mutiplos_y_sacar_numeros_negativos {
    public static void main(String[] args) {
        int max=200;
        int min=-200;
        int operacion=0;
        int [] array= new int[7];
        for (int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*((max-min)+1))+min;
        }

        System.out.println("El array quedaria "+ Arrays.toString(array));
////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////

        for (int i=0;i<array.length;i++){
            if ((array[i]%3==0) && (array[i]%3==0)  ){
                System.out.println("\u001B[31m"+array[i]+"\u001B[0m");
            }
        }

        ////////////////////////////////////////////////////////////////////////////////
        /////SACAR NUMEROS NEGATIVOS Y SABER CUANTOS SON// ///////////////////////S
        int contador=0;
        for (int i=0;i<array.length;i++){
            if (array[i]<0){
                contador ++;
            }
        }

        System.out.println("La cantidad de numeros negativos son "+contador);
        ///////////////////////////////////////////////////////////////////////////////
        ////////SABER CUALES SON ///////////////////////////////////////
        System.out.println("ESOS NUMEROS NEGATIVOS SON");
        for (int i=0;i<array.length;i++) {
            if (array[i]<0){
                System.out.println(array[i]);
            }
        }
        }
    }

