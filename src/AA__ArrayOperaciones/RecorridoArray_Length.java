package AA__ArrayOperaciones;

public class RecorridoArray_Length {
    public static void main(String[] args) {
        int [] edades2 = {245,2231,10,40,21};
        //VEMOS QUE SI USAMOS LENGTH, NOS MUESTRA CUAL ES EL TAMAÑO,
        System.out.println(edades2.length);

        for (int i=0;i<edades2.length;i++){
            edades2[i]=i;
        }

        //USAMOS LENGTH PQ INDICA LA LONGITUD CON LA QUE HA SIDO CREADO.
        System.out.println("Bucle incremental");
        for (int j=0;j<edades2.length;j++){
            System.out.println(edades2[j]);
        }

        System.out.println("Bucle decremental");
        for (int k=edades2.length;k>0;k--){
            System.out.println(edades2[k-1]);   //TENEMOS QUE PONER -1, SI NO NO FUNCIONA
        }

        System.out.println("Bucle each");   //ESTE POR DEFECTO ES INCREMENTAL
        for (int elemento: edades2){
            System.out.println(elemento);
        }

    }
}
